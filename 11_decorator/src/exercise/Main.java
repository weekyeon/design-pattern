package exercise;

import exercise.abst.Cake;
import exercise.concrete.Chocolate;
import exercise.concrete.ConcreteCake;
import exercise.concrete.Strawberry;

public class Main {

    public static void main(String[] args) {
        // Cake
        Cake cake = new ConcreteCake();
        System.out.println(cake.baseCake());

        // Cake + Strawberry
        Cake strawberryCake = new Strawberry(cake);
        System.out.println(strawberryCake.baseCake());

        // Cake + Strawberry + Chocolate
        Cake chocolateStrawberryCake = new Chocolate(strawberryCake);
        System.out.println(chocolateStrawberryCake.baseCake());
    }

}
