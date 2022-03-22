import java.sql.Array;
import java.util.Date;

class Movie{
    /*
    *    Atributos
    */
    private String   nome;
    private String   tituloO;
    private Date     lancamento;
    private int      duracao;
    private String   genero;
    private String   idiomaO;
    private String   situacao;
    private Float    orcamento;
    private String[] keyWords;
    /*
    * criar um array de strings com filmes
    * {Filme, Filme, Filme, Filme, ...}
    */
    
    /*
    *   Construtor
    */
    public Movie(){
        
    }
    public Movie(String nome, String tituloO, Date lancamento, int duracao, String genero,
                String idiomaO, String situacao, Float orcamento, String[] keyWords){
        this.nome = nome;
        this.tituloO = tituloO;
        this.lancamento = lancamento;
        this.duracao = duracao;
        this.genero = genero;
        this.idiomaO = idiomaO;
        this.situacao = situacao;
        this.orcamento = orcamento;
        this.keyWords = keyWords;
    }
}

class Leitor{
    /*
    *   Le, Separa, Organiza, popula classe movies
    */
    /*
    *   Cria array local
    *   Filme = { nome tituloOriginal dataLancamento duracao genero idiomaOriginal situacao orcamento [palavrasChave]}
    *   Movie(nome, tituloOriginal, dataLancamento, duracao, genero, idiomaOriginal, situacao, orcamento, [palavrasChave])
    */
    /*
    *   Metodo "populador"
    */


}


public class TP02_Sketch {
    public static void main (String[] args){

    }
}
 