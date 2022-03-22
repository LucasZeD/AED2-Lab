#include <stdio.h>

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

int main() { 
    //Variaveis
    int     id      = 0;
    int     horas   = 0;
    double  perHour = 0.0;
    double  salario = 0.0;

    //funcionario
    scanf("%d", &id);
    //horas trabalhadas
    scanf("%d", &horas);
    //perHora
    scanf("%lf", &perHour);
    
    //calcular salario
    salario = perHour * horas;

    //Resultado
    printf("NUMBER = %d\n", id);
    printf("SALARY = U$ %0.2f\n", salario);

    //fim
    return 0;
}