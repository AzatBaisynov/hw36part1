package cw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Computer> computers = new LinkedList<>();

        for(int i = 0; i < 100; i++) {
            if(i < 50) computers.add(new Laptop(100 * i + 10, ComputerModel.Acer));
            else computers.add(new Pc(50 * i + 10, ComputerModel.Hp, 24));
        }

        int laptopSum = 0;
        int pcSum = 0;

        for(int i = 0; i < computers.size(); i++) {
            if(computers.get(i) instanceof Laptop) laptopSum += computers.get(i).getPrice();
            if(computers.get(i) instanceof Pc) pcSum += computers.get(i).getPrice();
        }

        System.out.println("Сумма ноутбуков: " + laptopSum);
        System.out.println("Сумма пк: " + pcSum);

        double laptopDiscountSum = 0;
        int discount = 20;
        for(Computer computer : computers) {
            if(computer instanceof Laptop) {
                laptopDiscountSum += computer.getDiscount(discount);
            }
        }

        System.out.println("Сумма ноутбуков со скидкой " + discount + ", равна " + laptopDiscountSum);

        Laptop search = new Laptop(955, ComputerModel.Acer);
        if (computers.contains(search)) {
            int searchIndex = computers.indexOf(search);
            System.out.println(computers.get(searchIndex));
        }
        System.out.println("Такого ноутбука нет");

        HashSet<Computer> list1 = new HashSet<>();
        for (int i = 0; i < computers.size(); i++) {
            list1.add(computers.get(i));
        }
        ArrayList<Computer> list2 = new ArrayList<>();
        Iterator<Computer> it = list1.iterator();
        while(it.hasNext()){
            list2.add(it.next());
            System.out.println(it.next());
        }

    }
}
