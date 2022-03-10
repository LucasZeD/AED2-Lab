//estrutura / "backend" 
public class Conta {
    private int     numConta;
    private double  saldo;
    private double  limite;

    public void deposita(double valor){
        saldo += valor;
    }

    /**Saca basico
    public void saca (double valor){
        if(saldo+limite >= valor){
            saldo-=valor;
            
            //evitar, pode nao ser usado pelo programador de front
            //  pode necessitar retornar outro metodo
            //return true;
        } else {
            System.out.println("Sem saldo.");
            //return false;
        }
            //?
    }
    */
    /**utiliando throw para identificar o erro
    public void saca(double valor) {
        if (this.saldo < valor) {
            throw new RuntimeException();
            //ha outros tipos de exception que podem ser melhores/fazerem mais sentido
            // para o tipo de problema apresentado
            //pode-se tambem criar um tipo de exception
        } else {
            this.saldo-=valor;      
        }       
    }
    */
    /**utilizando SaldoInsuficienteException
    */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (saldo+limite >= valor) {
            saldo-=valor;
        } else {
            
        }       
    }

    public double getSaldo(){
        return saldo;
    }

    public void setLimite(double limite){
        if(limite<0){
            this.limite=0;
        }else if (limite>3000){
            this.limite=3000;
        }
    }

    public void setConta(int numConta){
        //quando chama apenas o nome, considera metodo interno
        //this -> usado para identificar atributo da classe
        //  usado para duas variaveis com mesmo nome mas escopos diferentes
        //somente nome -> atributo interno
        this.numConta = numConta;
    }

    public int getNumConta(){
        return numConta;
    }
}