package br.cesul.Condominium;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Condominium {

    private Double water;

    private Double maintenanceFee;

    private Double reserveFund;

    private Double otherFees;

    private int numberOfApartments;

    private LocalDate dueDate;

    public Condominium(Double water, Double maintenanceFee, Double reserveFund, Double otherFees, int numberOfApartments, LocalDate dueDate) {
        this.water = water;
        this.maintenanceFee = maintenanceFee;
        this.reserveFund = reserveFund;
        this.otherFees = otherFees;
        this.numberOfApartments = numberOfApartments;
        this.dueDate = dueDate;
    }

    public Double getFee(){
        var today = LocalDate.now();
        var diff = dueDate.until(today, ChronoUnit.DAYS);
        if(diff > 0){
            return calculeteFee(diff);
        }
            return calculeteFee();

    }

    private Double calculeteFee(long days){
        var baseFee = calculeteFee();
        return baseFee + (baseFee * 0.05) + (baseFee * 0.01 * days);
    }
    private Double calculeteFee(){
        return (water + maintenanceFee + reserveFund + otherFees) / numberOfApartments;
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getMaintenanceFee() {
        return maintenanceFee;
    }

    public void setMaintenanceFee(Double maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }

    public Double getReserveFund() {
        return reserveFund;
    }

    public void setReserveFund(Double reserveFund) {
        this.reserveFund = reserveFund;
    }

    public Double getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(Double otherFees) {
        this.otherFees = otherFees;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }
}
