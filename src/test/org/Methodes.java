package test.org;
import java.util.ArrayList;
import java.util.List;

public class Methodes {

    public static double calculeDuPanier(ArrayList<Item> l)
    {
        double total = 0;
        for (final Item i: l )
        {
            int div = 0;

            if ( i.getOffer() != 0) {
                div = i.getQuantity() / i.getOffer();
            }
            total += i.getQuantity()*i.getPrice() - div*i.getPrice();
        }

        return total;
    }

}
