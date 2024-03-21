public class Geom2D {
    protected double perimetro;

    public double calcPerimetro() {
        return 0;
    }
}

public class Triangulo extends Geom2D {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcPerimetro() {
        super.perimetro = this.ladoA + this.ladoB + this.ladoC;
        return super.perimetro;
    }

    public static void main(String[] args) {
        Triangulo trian = new Triangulo(3, 25, 26);
        System.out.println("Perimetro: " + trian.calcPerimetro());
    }
}