package org.example;

public class Snack extends Product {
    private Nutricion nutricion;
    private double nett;

    public Snack(String brand, String name, double price, double nett) {
        super(brand, name, price);
        this.nutricion = new Nutricion();
        this.nett = nett;
    }

    public Snack(String inputName, double inputPrice, double nett) {
        super(inputName, inputPrice);
        this.nutricion = new Nutricion();
        this.nett = nett;
    }

    public Snack(){
        super();
        this.nutricion = new Nutricion();
        this.nett = 0.01;
    }

    public Nutricion getNutricion() {
        return nutricion;
    }

    public void setNutricion(double protein, double fats, double carbohydrates) {
        this.nutricion = new Nutricion(protein, fats, carbohydrates);
    }

    public double getNett() {
        return nett;
    }

    @Override
    public String toString() {
        return super.displayInfo() + " вес: " + nett;
    }
}
