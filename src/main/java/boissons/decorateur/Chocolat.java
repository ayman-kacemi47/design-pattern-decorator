package boissons.decorateur;

import boissons.Boisson;

public class Chocolat extends DecorateurBoisson {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return super.cout()+3;
    }

    @Override
    public String getDescription() {
        return  super.getDescription()+" Au Chocolat";
    }
}
