package cw;

import java.util.LinkedList;

public class Pc extends Computer{
    private Integer diag;

    public Pc(Integer price, ComputerModel brand, Integer diag) {
        super(price, brand);
        this.diag = diag;
    }

    public Integer getDiag() {
        return diag;
    }

    public void setDiag(Integer diag) {
        this.diag = diag;
    }

    @Override
    public Double getDiscount(Integer discount) {
        return getPrice() * 1.0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Pc) {
            if(((Pc)obj).getPrice().equals(this.getPrice()) &&
                    ((Pc)obj).getModel().equals(this.getModel()) &&
                    ((Pc)obj).getDiag().equals(this.getDiag())) {
                return true;
            }
            return false;
        }
        return false;
    }

}
