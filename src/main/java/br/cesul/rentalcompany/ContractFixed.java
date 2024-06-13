package br.cesul.rentalcompany;

public class ContractFixed extends Contract {

    private Double kmException;

    private boolean hasSecure;

    private Double percorreKm;

    public ContractFixed(String name, String number, String car, Double price, Double kmException, boolean hasSecure, Double percorreKm) {
        super(name, number, car, price);
        this.kmException = kmException;
        this.hasSecure = hasSecure;
        this.percorreKm = percorreKm;
    }

    public Double getKmException() {
        return kmException;
    }

    public void setKmException(Double kmException) {
        this.kmException = kmException;
    }

    public boolean isHasSecure() {
        return hasSecure;
    }

    public void setHasSecure(boolean hasSecure) {
        this.hasSecure = hasSecure;
    }

    public Double getPercorreKm() {
        return percorreKm;
    }

    public void setPercorreKm(Double percorreKm) {
        this.percorreKm = percorreKm;
    }

    @Override
    Number getContractFinalPrice() {
        var total = getPrice();
        if (kmException < percorreKm) {
            total *= 0.20;
        }
        if (hasSecure) {
            total *= 0.15;
        }
        return total;
    }
}
