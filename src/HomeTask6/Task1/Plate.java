package HomeTask6.Task1;

import java.util.Scanner;

public class Plate {

    private static Scanner in = new Scanner(System.in);

    private int currentFood; // количество еды, которое есть на текущий момент в тарелке

    public Plate(int currentFood) {
        this.currentFood = currentFood;
    }

    public int getFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }

    public int decreaseFood(int foodCount) {
        if (currentFood >= foodCount) {
            currentFood -= foodCount;
        }
        return currentFood;
    }

    public void printInfo() {
        System.out.println("В тарелке осталось " + currentFood + " грамм еды");
    }
}
