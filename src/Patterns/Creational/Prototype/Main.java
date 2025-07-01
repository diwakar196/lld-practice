package Patterns.Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Prototype p1 = new Prototype();
        p1.setA(2);
        Prototype p2 = p1.clone();
        System.out.println(p1.equals(p2));
        System.out.println(p1.getA());
        System.out.println(p2.getA());
    }
}