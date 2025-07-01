package Patterns.Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder.SubBuilder().setA(1).setB(2).build();
        System.out.println(builder.getA());
        System.out.println(builder.getB());
    }
}
