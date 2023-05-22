import java.util.Scanner;

public class Menu {
    private static final String APP_MENU =
            "\n" +
                    " ______                    \n" +
                    "|  ___ \\                   \n" +
                    "| | _ | | ____ ____  _   _ \n" +
                    "| || || |/ _  )  _ \\| | | |\n" +
                    "| || || ( (/ /| | | | |_| |\n" +
                    "|_||_||_|\\____)_| |_|\\____|\n" +
                    "                           \n";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public int displayMenu() {
        System.out.println(ANSI_PURPLE + APP_MENU + ANSI_RESET);
        System.out.println(ANSI_YELLOW +"1. Browse Catalog" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "2. Browse Premium Song Catalog" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "3. Browse Regular Song Catalog" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "4. Search Catalog by Artist" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "5. Search Catalog by Title" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "6. Search Catalog by Song ID" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "7. Add a Song to Shopping Cart" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "8. Remove a Song from Shopping Cart" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "9. View Shopping Cart" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "10. Checkout and Process Payment" + ANSI_RESET);
        System.out.println(ANSI_RED + "11. Exit" + ANSI_RESET);

        System.out.print(ANSI_PURPLE + "Enter your choice: " + ANSI_RESET);
        int choice = scanner.nextInt();

        return choice;
    }
}
