package org.example;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);
        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);
        Snack chocolate = new Snack("Орешкино" ,"Белочка", 80.0, 0.4);
        Snack chips = new Snack("Русская картошка", "Сметана и лук", 80.0, 0.14);



        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(chocolate);
        products.add(chips);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);

        VendingMachine vendingMachine = new VendingMachine(products);
//        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
//        if (bottleOfWaterResult != null){
//            System.out.println("Вы купили: ");
//            System.out.println(bottleOfWaterResult.displayInfo());
//        }
//        else {
//            System.out.println("Такой бутылки с водой нет в автомате.");
//        }

        List<Snack> bigsnacks = vendingMachine.getBigSnacks(0.2);
        if (!bigsnacks.isEmpty()) {
            System.out.println(bigsnacks);
        }
        else {
            System.out.println("Такого продукта нет в автомате");
        }
    }

}
