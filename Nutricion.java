package org.example;

public class Nutricion {
    private double proteins;
    private double fats;
    private double carbohydrates;

    public Nutricion(double proteins, double fats, double carbohydrates) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }
    public Nutricion(double proteins, double fats) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = 0.01;
    }
    public Nutricion(double proteins) {
        this.proteins = proteins;
        this.fats = 0.01;
        this.carbohydrates = 0.01;
    }
    public Nutricion(){
        this.proteins = 0.01;
        this.fats = 0.01;
        this.carbohydrates = 0.01;
    }

    public void setProteins(double proteins) {
        if (proteins < 0 || proteins > 100) {
            this.proteins = 0.01;
        }
        else {
            this.proteins = proteins;
        }
    }

    public double getProteins() {
        return proteins;
    }

    public void setFats(double fats) {
        if (fats < 0 ||fats > 100) {
            this.fats = 0.01;
        }
        else {
            this.fats = fats;
        }
    }

    public double getFats() {
        return fats;
    }

    public void setCarbohydrates(double carbohydrates) {
        if (carbohydrates < 0 ||carbohydrates > 100) {
            this.carbohydrates = 0.01;
        }
        else {
            this.carbohydrates = carbohydrates;
        }
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    @Override
    public String toString() {
        return "Nutricion: proteins " + proteins + ", fats " + fats + ", carbohydrates " + carbohydrates;
    }
}
