package br.cesul.Tax;

public class Service extends SaleItem{

    private ServiceCategory category;

    private Double iss;

    private Double time;

    public Service(String name, Double price, ServiceCategory category, Double iss, Double time) {
        super(name, price);
        this.category = category;
        this.iss = iss;
        this.time = time;
    }

    public ServiceCategory getCategory() {
        return category;
    }

    public Double getIss() {
        return iss;
    }

    public Double getTime() {
        return time;
    }

    @Override
    public Double getFinalPrice() {
        var total  =  getPrice() * time * getAdicitioalFee();
         total += total * iss/100;
        return total ;
    }
    private Double getAdicitioalFee(){
        return switch (category){
            case STANDARD -> 1.03;
            case SUPERIOR -> 1.05;
            default -> 1.1;
        };
    }
}
