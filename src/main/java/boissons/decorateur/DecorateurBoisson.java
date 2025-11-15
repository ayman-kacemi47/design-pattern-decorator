package boissons.decorateur;

import boissons.Boisson;

public abstract class DecorateurBoisson extends Boisson {
    Boisson boisson;
    public double cout(){
        return boisson.cout();
    };
    public String getDescription(){
        return boisson.getDescription();
    };

    DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }


}
