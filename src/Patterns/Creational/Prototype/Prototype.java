package Patterns.Creational.Prototype;

public class Prototype {
    private int a;
    public Prototype() {
    }
    private Prototype(Prototype p) {
        this.a = p.a;
    }
    public Prototype clone() {
        return new Prototype(this);
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return this.a;
    }
}
