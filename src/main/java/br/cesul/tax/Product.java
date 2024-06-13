package br.cesul.tax;

public class Product extends SaleItem{
    private Double icms;

    private Double ipi;

    private Integer quantity;

    public Product(String name, Double price, Double icms, Double ipi, Integer quantity) {
        super(name, price);
        this.icms = icms;
        this.ipi = ipi;
        this.quantity = quantity;
    }

    public Double getIcms() {

        return icms;
    }

    public Double getIpi() {
        return ipi;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public Double getFinalPrice() {
        var total = quantity * getPrice();
        return total + (total * icms / 100d) + (total * ipi / 100d);
    }
}
