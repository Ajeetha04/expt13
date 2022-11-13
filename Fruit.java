/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
        import java.util.*;
import java.util.Comparator;

      


public class Fruit implements Comparator<Fruit>{
    public String name;
    public int price;
    public int quantity;

    public Fruit(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compare(Fruit a, Fruit b) {
        return a.price - b.price;
    }

    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", 20, 3));
        fruits.add(new Fruit("banana", 30, 5));
        fruits.add(new Fruit("grapefruit", 500, 20));
        fruits.add(new Fruit("orange", 50, 10));
        fruits.add(new Fruit("strawberry", 35, 10));
        fruits.add(new Fruit("grape", 15, 20));
        fruits.add(new Fruit("pineapple", 60, 2));
        fruits.add(new Fruit("greenapple", 80, 12));
        fruits.add(new Fruit("lemon", 10, 20));
        fruits.add(new Fruit("cherry", 120, 20));
        fruits.add(new Fruit("pear", 220, 8));
        fruits.add(new Fruit("blueberry", 180, 10));
        fruits.add(new Fruit("peach", 200, 15));
        fruits.add(new Fruit("watermelon", 100, 1));
        fruits.add(new Fruit("apricot", 300, 13));
        fruits.add(new Fruit("kiwi", 270, 25));
        fruits.add(new Fruit("plum", 160, 38));
        fruits.add(new Fruit("avacado", 350, 7));
        fruits.add(new Fruit("mango", 90, 4));
        fruits.add(new Fruit("pomegranate", 130, 6));

        Collections.sort(fruits, new Fruit("", 0, 0));

        for (Fruit temp : fruits) {
            System.out.println(temp.name + " " + temp.price + " " + temp.quantity);


}
    }
    
}
