import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static final String APP_TITLE = "\n" +
            " ______    ______   __   __   ______   __       __  __   _________  ________  ______   ___   __        ___ __ __   __  __   ______    ________  ______      \n" +
            "/_____/\\  /_____/\\ /_/\\ /_/\\ /_____/\\ /_/\\     /_/\\/_/\\ /________/\\/_______/\\/_____/\\ /__/\\ /__/\\     /__//_//_/\\ /_/\\/_/\\ /_____/\\  /_______/\\/_____/\\     \n" +
            "\\:::_ \\ \\ \\::::_\\/_\\:\\ \\\\ \\ \\\\:::_ \\ \\\\:\\ \\    \\:\\ \\:\\ \\\\__.::.__\\/\\__.::._\\/\\:::_ \\ \\\\::\\_\\\\  \\ \\    \\::\\| \\| \\ \\\\:\\ \\:\\ \\\\::::_\\/_ \\__.::._\\/\\:::__\\/     \n" +
            " \\:(_) ) )_\\:\\/___/\\\\:\\ \\\\ \\ \\\\:\\ \\ \\ \\\\:\\ \\    \\:\\ \\:\\ \\  \\::\\ \\     \\::\\ \\  \\:\\ \\ \\ \\\\:. `-\\  \\ \\    \\:.      \\ \\\\:\\ \\:\\ \\\\:\\/___/\\   \\::\\ \\  \\:\\ \\  __   \n" +
            "  \\: __ `\\ \\\\::___\\/_\\:\\_/.:\\ \\\\:\\ \\ \\ \\\\:\\ \\____\\:\\ \\:\\ \\  \\::\\ \\    _\\::\\ \\__\\:\\ \\ \\ \\\\:. _    \\ \\    \\:.\\-/\\  \\ \\\\:\\ \\:\\ \\\\_::._\\:\\  _\\::\\ \\__\\:\\ \\/_/\\  \n" +
            "   \\ \\ `\\ \\ \\\\:\\____/\\\\ ..::/ / \\:\\_\\ \\ \\\\:\\/___/\\\\:\\_\\:\\ \\  \\::\\ \\  /__\\::\\__/\\\\:\\_\\ \\ \\\\. \\`-\\  \\ \\    \\. \\  \\  \\ \\\\:\\_\\:\\ \\ /____\\:\\/__\\::\\__/\\\\:\\_\\ \\ \\ \n" +
            "    \\_\\/ \\_\\/ \\_____\\/ \\___/_(   \\_____\\/ \\_____\\/ \\_____\\/   \\__\\/  \\________\\/ \\_____\\/ \\__\\/ \\__\\/     \\__\\/ \\__\\/ \\_____\\/ \\_____\\/\\________\\/ \\_____\\/ \n" +
            "                                                                                                                                                            \n";

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        System.out.println("\n==============================Welcome to Revolution Music!==============================");
        System.out.println(ANSI_CYAN + APP_TITLE + ANSI_RESET);



        // Create catalog and shopping cart objects
        MusicStore catalog = MusicStore.getInstance();
        ShoppingCart cart = new ShoppingCart();




        //regular songs
        catalog.addSong(+ 1, "Bohemian Rhapsody", "Queen", 0.99);
        catalog.addSong(2, "Stairway to Heaven", "Led Zeppelin", 0.99);
        catalog.addSong(3, "Hotel California", "Eagles", 0.99);
        catalog.addSong(4, "Imagine", "John Lennon", 0.99);
        catalog.addSong(5, "Sweet Child O' Mine", "Guns N' Roses", 0.99);
        catalog.addSong(6, "Like a Rolling Stone", "Bob Dylan", 0.99);
        catalog.addSong(7, "Billie Jean", "Michael Jackson", 0.99);
        catalog.addSong(8, "Take On Me", "a-ha", 0.99);
        catalog.addSong(9, "Back in Black", "AC/DC", 0.99);
        catalog.addSong(10, "Smoke on the Water", "Deep Purple", 0.99);
        catalog.addSong(11, "Hello", "Adele", 0.99);
        catalog.addSong(12, "Blackbird", "The Beatles", 0.99);
        catalog.addSong(13, "Thriller", "Michael Jackson", 0.99);
        catalog.addSong(14, "Another Brick In the Wall", "Pink Floyd", 0.99);
        catalog.addSong(15, "Livin' on a Prayer", "Bon Jovi", 0.99);
        catalog.addSong(16, "Every Breath You Take", "The Police", 0.99);
        catalog.addSong(17, "Tears in Heaven", "Eric Clapton", 0.99);
        catalog.addSong(18, "Jump", "Van Halen", 0.99);
        catalog.addSong(19, "Nothing Else Matters", "Metallica", 0.99);
        catalog.addSong(20, "Wonderwall", "Oasis", 0.99);

        //premium songs
        catalog.addSong(21, "Don't Stop Believin'", "Journey", 2.99);
        catalog.addSong(22, "Comfortably Numb", "Pink Floyd", 2.99);
        catalog.addSong(23, "More Than a Feeling", "Boston", 2.99);
        catalog.addSong(24, "Stuck in the Middle With You", "Stealers Wheel", 2.99);
        catalog.addSong(25, "Dream On", "Aerosmith", 2.99);
        catalog.addSong(26, "Simple Man", "Lynyrd Skynyrd", 2.99);
        catalog.addSong(27, "Hotel California (Live)", "The Eagles", 2.99);
        catalog.addSong(28, "Sweet Home Alabama", "Lynyrd Skynyrd", 2.99);
        catalog.addSong(29, "Paradise City", "Guns N' Roses", 2.99);
        catalog.addSong(30, "Summer of '69", "Bryan Adams", 2.99);
        catalog.addSong(31, "Wanted Dead or Alive", "Bon Jovi", 2.99);
        catalog.addSong(32, "Highway to Hell", "AC/DC", 2.99);
        catalog.addSong(33, "Barracuda", "Heart", 2.99);
        catalog.addSong(34, "Born to Run", "Bruce Springsteen", 2.99);
        catalog.addSong(35, "American Woman", "The Guess Who", 2.99);
        catalog.addSong(36, "Rebel Yell", "Billy Idol", 2.99);
        catalog.addSong(37, "Oh, Pretty Woman", "Roy Orbison", 2.99);
        catalog.addSong(38, "Under Pressure", "Queen & David Bowie", 2.99);
        catalog.addSong(39, "Jumpin' Jack Flash", "The Rolling Stones", 2.99);
        catalog.addSong(40, "Purple Haze", "Jimi Hendrix", 2.99);

        System.out.println("======================Your Digital Music Store======================");
        System.out.println("=================Please Select From The Menu Below==================");
        // Create menu object
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu and get user choice
            choice = menu.displayMenu();

            // Process user choice using separate methods for each option
            switch (choice) {
                case 1 -> browseCatalog(catalog);
                case 2 -> viewPremiumSongs(catalog);
                case 3 -> viewRegularSongs(catalog);
                case 4 -> searchCatalogByArtist(catalog, scanner);
                case 5 -> searchCatalogByTitle(catalog, scanner);
                case 6 -> searchCatalogById(catalog, scanner);
                case 7 -> addSongToCart(catalog, cart, scanner);
                case 8 -> removeSongFromCart(catalog,cart, scanner);
                case 9 -> viewShoppingCart(cart);
                case 10 -> processPayment(cart);
                case 11 -> System.out.println(ANSI_GREEN + "Exiting Digital Music Store...\n" + ANSI_RESET);
                default -> System.out.println(ANSI_RED + "Invalid choice. Please try again.\n" + ANSI_RESET);
            }
        } while (choice != 11);

        scanner.close();
    }

    public static void browseCatalog(MusicStore catalog) {
        catalog.getAllSongs().forEach(System.out::println);
    }

    public static void searchCatalogByArtist(MusicStore catalog, Scanner scanner) {
        System.out.println(ANSI_CYAN + "Type artist name: \n" + ANSI_RESET);
        String artistName = scanner.nextLine();
        try {
            List<Song> matchingSongs = catalog.searchByArtist(artistName);
            if (matchingSongs.isEmpty()) {
                System.out.println(ANSI_RED + "No songs found for artist: " + artistName + "\n" + ANSI_RESET);
            } else {
                // Display matching songs in catalog
                matchingSongs.forEach(System.out::println);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Invalid search term. Please try again.\n" + ANSI_RESET);
        }
    }

    public static void searchCatalogByTitle(MusicStore catalog, Scanner scanner) {
        System.out.println(ANSI_CYAN + "Type song title: \n" + ANSI_RESET);
        String titleName = scanner.nextLine();
        try {
            List<Song> matchingSongs = catalog.searchByTitle(titleName);
            if (matchingSongs.isEmpty()) {
                System.out.println(ANSI_RED + "No songs found for title: " + titleName + "\n" + ANSI_RESET);
            } else {
                // Display matching songs in catalog
                matchingSongs.forEach(System.out::println);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Invalid search term. Please try again." +
                    "\n" + ANSI_RESET);
        }
    }

    public static void searchCatalogById(MusicStore catalog, Scanner scanner) {
        System.out.println(ANSI_CYAN + "Type song ID: \n" + ANSI_RESET);
        int id = scanner.nextInt();

        try {
            Music song = catalog.searchById(id);
            if (song == null) {
                System.out.println(ANSI_RED + "No songs found for ID: " + id + "\n" + ANSI_RESET);
            } else {
                // Display matching song in catalog
                System.out.println(song);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Invalid input. Please enter a valid song ID.\n" + ANSI_RESET);
            throw new RuntimeException(e);
        }
    }

    public static void viewShoppingCart(ShoppingCart cart) {
        List<Music> cartItems = cart.getCartItems();
        if(cartItems == null || cartItems.isEmpty()) {
            System.out.println(ANSI_RED + "Your shopping cart is empty.\n" + ANSI_RESET);
            return;
        }else {
            System.out.println(ANSI_CYAN + "Your shopping cart contains the following items: \n" + ANSI_RESET);
        }
        // Display items in shopping cart
        cartItems.forEach(System.out::println);
        System.out.println(ANSI_CYAN + "Total: $" + cart.getTotal() + "\n" + ANSI_RESET);
    }

    public static void addSongToCart(MusicStore catalog, ShoppingCart cart, Scanner scanner) {
        System.out.println(ANSI_CYAN +"Type song ID: " + ANSI_RESET);
        int songId;
        try {
            songId = scanner.nextInt();
            Music selectedSong = catalog.searchById(songId);
            cart.addItem(selectedSong);
            System.out.println(ANSI_GREEN + "Great Choice! " + selectedSong.getTitle() + " added to cart.\n" + ANSI_RESET);
        } catch (InputMismatchException e) {
            System.out.println(ANSI_RED + "Invalid input. Please enter a valid song ID.\n" + ANSI_RESET);
            scanner.nextLine(); // clear input buffer
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Invalid song ID. Please enter a valid song ID.\n" + ANSI_RESET);
            scanner.nextLine(); // clear input buffer
        }
    }

    public static void removeSongFromCart(MusicStore catalog,ShoppingCart cart, Scanner scanner) {
        System.out.println(ANSI_CYAN + "Type song ID to remove from Cart: \n" + ANSI_RESET);
        int removeSongId;
        try {
            removeSongId = scanner.nextInt();
            Music removeSong = catalog.searchById(removeSongId);
            cart.removeItem(removeSong);
            System.out.println(ANSI_GREEN + removeSong.getTitle() +  " removed from cart.\n" + ANSI_RESET);
        } catch (InputMismatchException e) {
            System.out.println(ANSI_RED + "Invalid input. Please enter a valid song ID.\n" + ANSI_RESET);
            scanner.nextLine(); // clear input buffer
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Song not found in cart. Please enter a valid song ID.\n" + ANSI_RESET);
            scanner.nextLine(); // clear input buffer
        }
    }


    public static void processPayment(ShoppingCart cart) {
        PaymentProcessor processor = new CreditCardPaymentProcessor("123456789", "123");
        Checkout checkout = new Checkout(cart, processor);
        boolean paymentStatus = checkout.processCheckout();
        if (paymentStatus) {
            // Clear shopping cart if payment is successful
            cart.clear();
            System.out.println(ANSI_GREEN + "Payment successful. Thank you for shopping with us!\n" + ANSI_RESET);
        }
    }

    public static void viewPremiumSongs(MusicStore catalog) {
        System.out.println(ANSI_CYAN + "Premium Songs: \n" + ANSI_RESET);
        List<Song> premiumSongs = catalog.getPremiumSongs();
        premiumSongs.forEach(System.out::println);
    }

    public static void viewRegularSongs(MusicStore catalog) {
        System.out.println(ANSI_CYAN + "Regular Songs: \n" + ANSI_RESET );
        List<Song> regularSongs = catalog.getRegularSongs();
        regularSongs.forEach(System.out::println);
    }
}



