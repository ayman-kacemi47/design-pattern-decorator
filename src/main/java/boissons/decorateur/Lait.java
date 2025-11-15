package boissons.decorateur;

import boissons.Boisson;

public class Lait extends DecorateurBoisson {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return super.cout()+5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " Au lait";
    }
}
