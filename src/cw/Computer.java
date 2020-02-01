package cw;

public abstract class Computer{
    private Integer price;
    private ComputerModel model;

    public Computer(Integer price, ComputerModel model) {
        this.price = price;
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ComputerModel getModel() {
        return model;
    }

    public void setModel(ComputerModel model) {
        this.model = model;
    }

    public abstract Double getDiscount(Integer discount);

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + model + '\'' +
                '}';
    }
}
