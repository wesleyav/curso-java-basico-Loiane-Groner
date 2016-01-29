/*
Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
package Exercicios_Aula_13;

import java.util.Scanner;


public class Exer_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe quanto você ganha por hora:");
        int hora = scan.nextInt();

        System.out.println("Informe quantas horas você trabalha por mês:");
        int mes = scan.nextInt();

        double salario = hora * mes;
        System.out.println("O seu salário mensal é de R$: " + salario);
    }
}
