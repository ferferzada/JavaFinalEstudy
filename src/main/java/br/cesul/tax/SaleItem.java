package br.cesul.tax;

public abstract class SaleItem {

    private final String name;

    private final Double price;

    public SaleItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public abstract Double getFinalPrice();
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
