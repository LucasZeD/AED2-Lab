//interface / interacao / "frontend"
public class App{
    public static void main (String[] args){

        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        minhaConta.saca(1000);

        /* Nao é a melhor maneira para resolver o problema
        problema -> mostrar ao usuario se houve erro no saque
        if(!minhaConta.saca(1000)){
            System.out.println("Erro ao Sacar!")
        }
        */
        // Melhor maneira -> executar excecoes

        
        Conta cc = new Conta();
        try {
            
            for (int i = 0; i <= 15; i++) {
                cc.deposita(i + 1000);
                System.out.println("i -> "+i);
                System.out.println("Seu saldo atual: "+cc.getSaldo());
                //executa ate i==5 (6x -> i iniciando em 0)
                if (i == 5) {
                    cc = null;
                    System.out.println("i==5 -> "+i);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Nao foi possivel continuar os depositos");
        }

    }
}