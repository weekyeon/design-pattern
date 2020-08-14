package exercise.concrete;

import exercise.framework.Weapon;
import exercise.framework.WeaponCreator;

public class Main {

    public static void main(String[] args) {

        Weapon weapon;
        WeaponCreator weaponCreator;

        weaponCreator = new AxCreator();
        weapon = weaponCreator.factoryMethod();
        weapon.use();

    }
}
