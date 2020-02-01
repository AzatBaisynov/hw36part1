package cw;

import java.util.LinkedList;

public class Laptop extends Computer{
    public Laptop(Integer price, ComputerModel brand) {
        super(price, brand);
    }

    @Override
    public Double getDiscount(Integer discount) {
        return getPrice() - getPrice() * (discount / 100.0);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Laptop) {
            if(((Laptop)obj).getPrice().equals(this.getPrice()) &&
                    ((Laptop)obj).getModel().equals(this.getModel())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
