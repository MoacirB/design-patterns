package main;

import java.util.ArrayList;

import menu.*;
import waitress.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) throws Exception {
       ArrayList<Menu> menus = new ArrayList<Menu>();

       menus.add(new PancakeHouseMenu());
       menus.add(new DinerMenu());
       menus.add(new CafeMenu());

       Waitress waitress = new Waitress(menus);
       waitress.printMenu();
    }
}
