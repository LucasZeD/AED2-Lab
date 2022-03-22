import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
// para controlar precisao do decimal
import java.text.DecimalFormat;

//SALARY
/**
Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received per hour. Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.

Don t forget to print the line's end after the result, otherwise you will receive "Presentation Error".
Don t forget the space before and after the equal signal and after the US.
Input
The input file contains 2 integer numbers and 1 value of floating point, representing the number, worked hours amount and the amount the employee receives per worked hour.

Output
Print the number and the employee's salary, according to the given example, with a blank space before and after the equal signal.
*/

public class Main {
    private static final DecimalFormat df = new DecimalFormat ("0.00");

    /**
    *Ler numero do empregado
    *   printar "NUMBER = 25"
    *Ler numero de horas trabalhadas no mes
    *Ler quantidade que ele recebeu por hora
    *   printar salario (duas decimais)
    *       "SALARY = U$ 550.00" (/n apos resultado)
    */
    public static void main (String[] args) throws IOException{
        //Leitor -> BeeCrowd
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        //Variavies
        int     id      = 0;
        int     horas   = 0;
        double  perHour = 0.0;
        double  salario = 0.0;

        //identificar funcionario
        id = Integer.parseInt(in.readLine());
        //horas trabalharadas
        horas = Integer.parseInt(in.readLine());
        //perHora
        perHour = Double.parseDouble(in.readLine());

        //calcular salario
        salario = perHour * horas;

        //Resultado
        System.out.println("NUMBER = "          + id);
        
        //Object
        //System.out.println("SALARY = U$ "       + df.format(salario));
        System.out.println("SALARY = U$ "       + String.format("%.2f", salario));

        /*Big Decimal
        BigDecimal bd = new BigDecimal(salario).setScale(2);
        double newInput = bd.doubleValue();
        System.out.println("SALARY = U$ "       + newInput);
        */
    }
}