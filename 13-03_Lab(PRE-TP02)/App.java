import java.util.Set;

class Carro{
    //final -> toda vez que for criada nao podera ser mudada
    // obrigado a ser atribuida no construtor
    private final int id;
    private String modelo;
    private double potencia;
    private double velocidade;
    public static int contador = 0;
    //CLONAR OBJETO
    public Carro clonar(){
        //clonar tambem chamra o construtor
        Carro clonado = new Carro();
        clonado.setModelo(modelo);
        clonado.setPotencia(potencia);
        clonado.setVelocidade(velocidade);
        return clonado;
    }
    /**
    *   se nao criar construtor java criará um construtor padrao
    *   Sobrecarga -> mesmo metodo, parametros diferentes

    public Carro(){
        //construtor padrao
    }
    */ 
    public Carro(){
        //construtor padrao
        contador++;
        id=contador;
    }
    public Carro(String modelo){
        this.modelo = modelo;
        this.potencia = 1.0;

        //adicionado apos
        contador++;
        id=contador;
    }
    //SETS
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPotencia(double potencia) {
        if(potencia >=1.0 && potencia <=3.0){
            this.potencia = potencia;
        }
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    //GETS
    public String getModelo() {
        return modelo;
    }
    public double getPotencia() {
        return potencia;
    }
    public double getVelocidade() {
        return velocidade;
    }
}

class Auxiliar{
    //em java nao manipula-se endereco
    public static void dobra(int numero){
        numero*=2;
    }
    public static void dobra(Carro carro){
        carro.setPotencia(carro.getPotencia()*2);
    }
}

public class App{
    //static                -> pertence a classe e nao ao objeto
    //atributo da classe    -> igual para todos os objetos
    //atributo objeto       -> pertence somente ao objeto




    //MAIN
    //somente uma classe publica, como o mesmo nome do arquivo.
    public static void main (String[] args){
        //PRIMEIRO EXMEPLO

        //todo objeto guarda enderço de memoria
            //recebe inicialmente null
        //todo tipo primitivo guarda valor
            //recebe inicialmente 0
        //chama um construtor   Carro() -> construtor
        Carro fusca = new Carro();
        //Carro fusca = new Carro("Fusquinha");
        fusca.setPotencia(-2.5);
        System.out.println(fusca.getPotencia());

        //SEGUNDO EXEMPLO

        //APONTA VALOR
        int valor = 15;
        //imprime 15, pois nao voltou nada por ser void e envia valor,
        // mas a funcao necessita de endereço de memoria
        Auxiliar.dobra(valor);

        //TERCEIRO EXEMPLO

        //APOTA ENDERECO DE MEMORIA
        Carro fusca2 = new Carro();
        fusca2.setPotencia(1.3);
        fusca2.setModelo("Fusquinha");
        Auxiliar.dobra(fusca2);

        //QUARTO EXEMPLO

        //MANEIRA ERRADA DE COPIAR OBJETO
        Carro palio;
        //ambos apontam para o mesmo lugar
        palio = fusca;
        //mudara a potencia do palio e do fusca, pois ambos apontam para o mesmo objeto
        palio.setPotencia(2.0);

        //QUINTO EXEMPLO

        //MANEIRA CORRETA DE COPIAR OBJETO
        Carro palio2;
        palio2=fusca.clonar();
        palio2.setPotencia(2.0);

        //SEXTO EXEMPLO

        //EXEMPLO CONTADOR NO CONSTRUTOR
        //chama contador pelo construtor
        System.out.println("Quantidade de carros: "+ Carro.contador);
    }
}