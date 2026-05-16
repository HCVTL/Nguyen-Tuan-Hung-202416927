package Store;

import Media.DigitalVideoDisc;
import Media.Media;

import java.util.ArrayList;

public class Store {
    public ArrayList<Media> itemInStore = new ArrayList<Media>();

    public void addMedia (Media media) {
        itemInStore.add(media);
        System.out.println("Added " + media.getTitle());
    }

    public void removeMedia(Media media) {
        if (itemInStore.contains(media)) {
            itemInStore.remove(media);
            System.out.println("Removed " + media.getTitle());
        }
    }

    public Media searchByTitle(String title) {
        for (Media m : itemInStore) {
            if (m.getTitle().equals(title)) {
                return m;
            }
        }
        return null;
    }

    public void viewStore() {
        for (Media m : itemInStore) {
            System.out.println(m.toString());
        }
    }
}
