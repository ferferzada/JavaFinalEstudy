package br.cesul.rentalcompany;

public class ContractFree extends Contract {

    private Integer days;

    private boolean hasSecure;

    public ContractFree(String name, String number, String car, Double price, Integer days, boolean hasSecure) {
        super(name, number, car, price);
        this.days = days;
        this.hasSecure = hasSecure;
    }

    @Override

    Number getContractFinalPrice() {
        var total = getPrice() * days;
        if (hasSecure) {
            total *= 0.15;
        }
        return total;
    }
}
