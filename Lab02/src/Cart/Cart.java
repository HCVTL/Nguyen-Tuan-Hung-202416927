package Cart;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public int getQty() {
        return qtyOrdered;
    }

    public void addDigitalVideoDisc (DigitalVideoDisc Disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) return;

        itemOrdered[qtyOrdered] = Disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
    }

    public void addDigitalVideoDisc (DigitalVideoDisc[] listDisc) {
        for (DigitalVideoDisc disc : listDisc) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemOrdered[qtyOrdered] = disc;
                qtyOrdered++;
            }
            else {
                System.out.println("The cart is full.");
                break;
            }
        }
    }

    public void addDigitalVideoDisc (DigitalVideoDisc d1, DigitalVideoDisc d2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = d1;
            qtyOrdered++;
            System.out.println("Add " + d1.getTitle());
        }
        else {
            System.out.println("The cart is full.");
        }

        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = d2;
            qtyOrdered++;
            System.out.println("Add " + d2.getTitle());
        }
        else {
            System.out.println("The cart is full.");
        }
    }

    public void removeDigitalVideoDisc (DigitalVideoDisc Disc) {
        int remove_id = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].equals(Disc)) {
                remove_id = i;
                break;
            }
        }

        if (remove_id == -1) {
            System.out.println("No disc");
            return;
        }

        for (int i = remove_id; i < qtyOrdered - 1; i++) {
            itemOrdered[i] = itemOrdered[i + 1];
        }

        itemOrdered[qtyOrdered - 1]  = null;
        qtyOrdered--;
        System.out.println("The disc has been removed");
    }

    public float totalCost () {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }

        return total;
    }

    public void printCart() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + " - " + itemOrdered[i].DVDtoString());
        }

        System.out.println("Total Cost: " + totalCost() + "$");
        System.out.println("********************************************");
    }

    public void searchByID(int ID) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (ID == itemOrdered[i].getID()) {
                System.out.println(itemOrdered[i].DVDtoString());
                return;
            }
        }

        System.out.println("No DVD has ID = " + ID);
    }

    public void searchByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getTitle().equals(title)) {
                System.out.println(itemOrdered[i].DVDtoString());
                return;
            }
        }

        System.out.println("No DVD has title " + title);
    }
}
