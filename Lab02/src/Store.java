public class Store {
    public DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[10000];
    private int inStore = 0;

    public void addDVD (DigitalVideoDisc dvd) {
        itemInStore[inStore] = dvd;
        inStore++;
        System.out.println("Added");
    }

    public void removeDVD (DigitalVideoDisc dvd) {
        int removeID = -1;
        for (int i = 0; i < inStore; i++) {
            if (itemInStore[i].equals(dvd)) {
                removeID = i;
                break;
            }
        }

        if (removeID == -1) {
            System.out.println("No DVD has title " + dvd.getTitle());
            return;
        }

        for (int i = removeID; i < inStore - 1; i++) {
            itemInStore[i] = itemInStore[i + 1];
        }

        inStore--;
        System.out.println("Removed");
    }
}
