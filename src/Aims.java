public class Aims {
    public static void main(String args[]) {
        Cart cart = new Cart();

        DigitalVideoDisc d1 = new DigitalVideoDisc("Naruto", "Anime", "Hung", 90, 100f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("Tho Oi", "Drama", "Tran Thanh", 90, 50f);

        cart.addDigitalVideoDisc(d1);
        cart.addDigitalVideoDisc(d2);

        cart.printCart();

        System.out.println(cart.totalCost());

        cart.removeDigitalVideoDisc(d1);

        cart.printCart();


    }
}