import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MusicStoreTest {
    private MusicStore catalog;
    private ShoppingCart cart;
    private PrintStream originalOut;
    private InputStream originalIn;

    @Before
    public void setUp() {
        catalog = MusicStore.getInstance();
        cart = new ShoppingCart();
        // Regular songs
        catalog.addSong(1, "Bohemian Rhapsody", "Queen", 0.99);
        catalog.addSong(2, "Stairway to Heaven", "Led Zeppelin", 0.99);

        // Premium songs
        catalog.addSong(21, "Don't Stop Believin'", "Journey", 2.99);
        catalog.addSong(22, "Comfortably Numb", "Pink Floyd", 2.99);

        // Save original System.out and System.in
        originalOut = System.out;
        originalIn = System.in;
    }

    @After
    public void tearDown() {
        // Restore original System.out and System.in
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
   

    @Test
    public void testSwitchCase_BrowseCatalog() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Test the switch case for browsing the catalog
        Main.browseCatalog(catalog);

        String expectedOutput = "Music{id=1, title='Bohemian Rhapsody', artist='Queen', price=0.99}\r\n" +
                "Music{id=2, title='Stairway to Heaven', artist='Led Zeppelin', price=0.99}\r\n" +
                "Music{id=21, title='Don't Stop Believin'', artist='Journey', price=2.99}\r\n" +
                "Music{id=22, title='Comfortably Numb', artist='Pink Floyd', price=2.99}\r\n";
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSwitchCase_AddSongToCart() {
        String input = "1"; // Provide a valid song ID
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Scanner scanner = new Scanner(System.in);

        // Test the switch case for adding a song to the cart
        Main.addSongToCart(catalog, cart, scanner);

        String expectedOutput = "Type song ID: \r\nBohemian Rhapsody added to cart.\n\r\n";
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSwitchCase_RemoveSongFromCart() {
        // Add a song to the cart before removing it
        cart.addItem(catalog.searchById(1));

        String input = "1"; // Provide a valid song ID
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        
        Scanner scanner = new Scanner(System.in);

        // Test the switch case for removing a song from the cart
        Main.removeSongFromCart(catalog, cart, scanner);

        String expectedOutput = "Type song ID to remove from Cart: \n\r\nBohemian Rhapsody removed from cart.\n\r\n";
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}

// Write more test methods for other functionalities such as searching by title, adding/removing songs from the cart, etc.


