public class App {
    public static void main(String[] args) throws Exception {
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Preto";
        meuCarro.modelo = "Corolla";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 250;
        
        meuCarro.liga();
        meuCarro.acelera(60);
    
        System.out.printf("A velocidade atual do veiculo e' %.2f.", meuCarro.velocidadeAtual);
    }
}
