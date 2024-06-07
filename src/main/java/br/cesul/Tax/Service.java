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
        var total  =  getPrice() * time;
        if(category == ServiceCategory.STANDARD){
            total *= 1.03;
        }else if(category == ServiceCategory.MASTER){
            total *=1.05;
        }else{
            total *=1.1;
        }
         total += total * iss/100;
        return total ;
    }
}
