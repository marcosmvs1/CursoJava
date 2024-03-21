public class Geom2D {
    double perimetro;
    double calcPerimetro(){
        return 0;
    }
}
 
public class Triangulo extends Geom2D { 
    ...
    @Override
    double calcPerimetro() {
        super.perimetro = this.ladoA + this.ladoB + this.ladoC;
        return super.perimetro;
    }
    public static void main(String[] args) {
        Triangulo trian = new Triangulo(3, 25, 26);
        System.out.println("Perimetro: " + trian.calcPerimetro());
    }
} 