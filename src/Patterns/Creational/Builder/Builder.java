package Patterns.Creational.Builder;

public class Builder {
    private int a, b;
    private Builder(SubBuilder subBuilder) {
        this.a = subBuilder.a;
        this.b = subBuilder.b;
    }
    public int getA() {return this.a;}
    public int getB() {return this.b;}

    public static class SubBuilder {
        private int a, b;
        public SubBuilder() {}
        public SubBuilder setA(int a) {
            this.a = a;
            return this;
        }
        public SubBuilder setB(int b) {
            this.b = b;
            return this;
        }
        public Builder build() {
            return new Builder(this);
        }
    }
}
