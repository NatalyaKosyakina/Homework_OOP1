package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater)product).getVolume()  == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public Snack getSnack(String name){
        for (Product product : products){
            if (product instanceof Snack){
                if (product.name  == name){
                    return (Snack)product;
                }
            }
        }
        return null;
    }

    public List<Snack> getBigSnacks(double nett){
        List<Snack> snacks = new ArrayList<>();
        for (Product product : products){
            if (product instanceof Snack){
                if (((Snack)product).getNett() >= nett){
                     snacks.add((Snack)product);
                }
            }
        }
        return snacks;
    }

}
