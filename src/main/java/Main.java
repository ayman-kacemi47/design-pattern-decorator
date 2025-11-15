import boissons.Boisson;
import boissons.decorateur.Chocolat;

import boissons.Espresso;
import boissons.decorateur.Lait;

public class Main {
    public static void main(String[] args) {
        Boisson b = new Espresso();
        System.out.println("prix: "+b.cout() + " desc: " +b.getDescription());
        b = new Chocolat(b);
        System.out.println("prix: "+b.cout() + " desc: " +b.getDescription());
        b = new Lait(b);
        System.out.println("prix: "+b.cout() + " desc: " +b.getDescription());

        b = new Chocolat(b);
        System.out.println("prix: "+b.cout() + " desc: " +b.getDescription());

    }
}