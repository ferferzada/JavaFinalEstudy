package br.cesul.rentalcompany;

public abstract class Contract {

    private final String name;

    private String number;

    private String car;

    private Double price;

    public Contract(String name, String number, String car, Double price) {
        this.name = name;
        this.number = number;
        this.car = car;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public String getCar() {
        return car;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCar(String car) {
        this.car = car;
    }

    abstract Number getContractFinalPrice();
}
