package AIMS;

import Cart.Cart;
import Store.Store; // Hãy đảm bảo bạn đã import đúng package của Store
import Media.*;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        initSetup();

        int choice;
        do {
            showMenu();
            choice = getIntInput();

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Exiting AIMS application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("\n********************AIMS********************");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------------------");
        System.out.print("Please choose a number (0-3): ");
    }

    public static void storeMenu() {
        System.out.println("\n--- STORE OPTIONS ---");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------------------");
        System.out.print("Please choose a number (0-4): ");
    }

    public static void mediaDetailsMenu() {
        System.out.println("\n--- MEDIA DETAILS OPTIONS ---");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------------------");
        System.out.print("Please choose a number (0-2): ");
    }

    public static void cartMenu() {
        System.out.println("\n--- CART OPTIONS ---");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------------------");
        System.out.print("Please choose a number (0-5): ");
    }

    public static void viewStore() {
        int choice;
        do {
            System.out.println("\n--- ITEMS IN STORE ---");
             store.viewStore();
            storeMenu();
            choice = getIntInput();

            switch (choice) {
                case 1: // See details
                    System.out.print("Enter media title: ");
                    String title = scanner.nextLine();
                    Media media = store.searchByTitle(title);

                    if (media != null) {
                        System.out.println(media.toString());
                        handleMediaDetails(media);
                    } else {
                        System.out.println("Media not found!");
                    }
                    break;
                case 2: // Add to cart
                    System.out.print("Enter media title to add: ");
                    String addTitle = scanner.nextLine();
                    Media addMedia = store.searchByTitle(addTitle);
                    if (addMedia != null) {
                        cart.addMedia(addMedia);
                    } else {
                        System.out.println("Media not found!");
                    }
                    break;
                case 3: // Play media
                    System.out.print("Enter media title to play: ");
                    String playTitle = scanner.nextLine();
                    Media playMedia = store.searchByTitle(playTitle);
                    if (playMedia instanceof Playable) {
                        ((Playable) playMedia).play();
                    } else {
                        System.out.println("This media cannot be played or not found.");
                    }
                    break;
                case 4: // See current cart
                    cart.printCart();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }

    public static void handleMediaDetails(Media media) {
        int choice;
        do {
            mediaDetailsMenu();
            choice = getIntInput();
            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    if (media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("This media cannot be played!");
                    }
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }

    // --- LOGIC XỬ LÝ 2: UPDATE STORE ---
    public static void updateStore() {
        System.out.println("\n1. Add a media to Store");
        System.out.println("2. Remove a media from Store");
        System.out.print("Your choice: ");
        int choice = getIntInput();
        if (choice == 1) {
            // Logic nhập thông tin tạo đối tượng mới rồi store.addMedia(...)
            System.out.println("Feature dynamically adding to store is under construction.");
        } else if (choice == 2) {
            System.out.print("Enter title to remove: ");
            String title = scanner.nextLine();
            Media m = store.searchByTitle(title);
            if (m != null) {
                store.removeMedia(m);
            } else {
                System.out.println("Not found in store.");
            }
        }
    }

    public static void viewCart() {
        int choice;
        do {
            cart.printCart();
            cartMenu();
            choice = getIntInput();

            switch (choice) {
                case 1: // Filter
                    System.out.println("1. Filter by ID | 2. Filter by Title");
                    int filterType = getIntInput();
                    if (filterType == 1) {
                        System.out.print("Enter ID: ");
                        cart.searchById(getIntInput());
                    } else {
                        System.out.print("Enter Title: ");
                        cart.searchByTitle(scanner.nextLine());
                    }
                    break;
                case 2: // Sort
                    System.out.println("1. Sort by Title | 2. Sort by Cost");
                    int sortType = getIntInput();
                    if (sortType == 1) cart.sortByTitleCost();
                    else cart.sortByCostTitle();
                    break;
                case 3: // Remove
                    System.out.print("Enter title to remove from cart: ");
                    String rTitle = scanner.nextLine();
                    // Tìm kiếm object trong giỏ bằng tiêu đề và xóa
                    break;
                case 4: // Play
                    System.out.print("Enter title to play from cart: ");
                    String pTitle = scanner.nextLine();
                    // Tìm kiếm object trong giỏ và cast sang Playable
                    break;
                case 5: // Place order
                    System.out.println("An order has been successfully created!");
                    cart = new Cart(); // Làm trống giỏ hàng theo yêu cầu đề bài
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }

    private static int getIntInput() {
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    private static void initSetup() {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Naruto", "Anime", "Hung", 90, 100f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
    }
}