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
                System.out.println(cc.getSaldo());
                if (i == 5) {
                    cc = null;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Nao foi possivel continuar os depositos");
        }

    }
}