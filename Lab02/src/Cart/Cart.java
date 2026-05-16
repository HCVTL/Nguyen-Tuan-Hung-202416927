package Cart;

import Media.DigitalVideoDisc;
import Media.Media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemOrdered.contains(media)) return;

        itemOrdered.add(media);
    }

    public void removeMedia(Media media) {
        if (itemOrdered.contains(media)) {
            itemOrdered.remove(media);
        }
    }

    public float totalCost () {
        float total = 0;
        for (Media media : itemOrdered) {
            total += media.getCost();
        }

        return total;
    }

    public void printCart() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemOrdered.get(i).toString());
        }
        System.out.println("Total Cost: " + totalCost() + "$");
        System.out.println("********************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (Media media : itemOrdered) {
            if (media.getId() == id) {
                System.out.println("Found: " + media.toString());
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No media found with ID: " + id);
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) { // Dùng equalsIgnoreCase cho linh hoạt
                System.out.println("Found: " + media.toString());
                found = true;
            }
        }
        if (!found) System.out.println("No media found with title: " + title);
    }

    public void sortByCostTitle() {
        Collections.sort(itemOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    public void sortByTitleCost() {
        Collections.sort(itemOrdered, Media.COMPARE_BY_TITLE_COST);
    }
}
