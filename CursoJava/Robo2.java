public class Robo2 {
    String nome = "R-ATM";
    float peso = 70;
    float velocidadeMax = 5;
    float pesoCargaMax = 20;
    String tipoTracao = "esteira";
    float posicaoX = 50;
    float posicaoY = 50;
    public void move(float x, float y){
        posicaoX = x;
        posicaoY = y;
    }
    public void printStatus(){
        System.out.println("-----------Info R-ATM----------");
        System.out.println("Nome do Robô: " + nome);
        System.out.println("Peso do Robô: " + peso);
        System.out.println("Velocidade Max: " + velocidadeMax);
        System.out.println("Carga Max: " + pesoCargaMax);
        System.out.println("Tipo de Tração: " + tipoTracao);
        System.out.println("Posição X do Robô: " + posicaoX);
        System.out.println("Posição Y do Robô: " + posicaoY);
        System.out.println("-------------------------------");
    }    
    public static void main(String[] args) {
        Robo2 objRobo = new Robo2();
        objRobo.printStatus();
        objRobo.move(60, 50);
        objRobo.printStatus();
        objRobo.move(65, 55);
        objRobo.printStatus();
    }
}


