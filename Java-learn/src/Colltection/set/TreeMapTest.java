package com.cyx.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeMapTest {

    public static void main(String[] args) {
//        TreeSet<Car> cars = new TreeSet<>();
//        cars.add(new Car("奥迪", 100000));
//        cars.add(new Car("保时捷", 150000));
//        cars.add(new Car("大众", 50000));
//        for(Car c: cars){
//            System.out.println(c);
//        }
        Comparator<Car> c = (c1, c2)->Double.compare(c1.getPrice(), c2.getPrice());
        TreeSet<Car> cars = new TreeSet<>(c);
        cars.add(new Car("奥迪", 100000));
        cars.add(new Car("保时捷", 150000));
        cars.add(new Car("大众", 50000));
        for(Car car: cars){
            System.out.println(car);
        }
    }
}
