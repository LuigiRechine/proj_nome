package projetos_LPA.aula04;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		double horatrab, valorhora, salbruto, salliquido, inss;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantas horas foram trabalhadas? ");
		horatrab = ler.nextDouble();
		
		System.out.println("Qual é o valor da hora? ");
		valorhora = ler.nextDouble();
		
		salbruto = horatrab*valorhora;
		
		inss = salbruto*0.12;
		
		salliquido = salbruto-inss;
		
		System.out.println(" ");
		
		System.out.println("O salário bruto é " + salbruto);
		System.out.println("O desconto do INSS é " + inss);
		
		System.out.println(" ");
		
		System.out.println("Então o salário líquido é " + salliquido);
		
		ler.close();

	}

}
