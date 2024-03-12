public class Robo {
    String nome;
    String cor;
    float velocidadeMax;
    int nívelDeBateria;
    float pesoCargaMax;
    String tipoTração;
    public static void main(String[] args) {
        Robo obj1 = new Robo();
        obj1.nome = "R-801";
        obj1.cor = "azul";
        obj1.velocidadeMax = 10;
        obj1.nívelDeBateria = 78;
        obj1.pesoCargaMax = 5;
        obj1.tipoTração = "esteira";
        System.out.println("Meu nome:" + obj1.nome);
        System.out.println("Minha cor" + obj1.cor);
        System.out.println("Minha velocidade: " + obj1.velocidadeMax);
        System.out.println("Minha bateria" + obj1.nívelDeBateria);
        System.out.println("Meu peso: " + obj1.pesoCargaMax);
        System.out.println("Minha tração" + obj1.tipoTração);
    }
    
}
