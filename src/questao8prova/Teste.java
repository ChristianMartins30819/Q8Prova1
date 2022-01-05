package questao8prova;

import java.util.Arrays;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		int i = 0;
		
		System.out.println("Digite o número de funcinários.");
		funcionario.setNumeroFuncionarios(entrada.nextInt());
		
		String[] nomes = new String[funcionario.getNumeroFuncionarios()];
		double[] salarios = new double[funcionario.getNumeroFuncionarios()];
		double[] salarioLiquido = new double[funcionario.getNumeroFuncionarios()];
		double[] bonus = new double[funcionario.getNumeroFuncionarios()];
		
		while (i < funcionario.getNumeroFuncionarios()) {
			System.out.println("Digite o nome.");
			nomes[i] = entrada.next();
			funcionario.setNome(nomes);
			System.out.println("Digite o valor do Salário.");
			salarios[i] = entrada.nextDouble();
			funcionario.setSalario(salarios);
			if(salarios[i] > 0 && salarios[i] <= 1000) {
				bonus[i] = 0.2 * salarios[i];
			}else if(salarios[i] > 1000 && salarios[i] <= 2000){
				bonus[i] = 0.1 * salarios[i];
			}else {
				bonus[i] = -0.1 * salarios[i];
			}
			salarioLiquido[i] = salarios[i] + bonus[i];
			System.out.println("O Funcionário " + nomes[i] + " possui um salário de R$" + salarios[i] + ", sendo assim, o bônus/desconto será de: R$" + bonus[i] + 
					" e o seu salário líquido será de: R$" + salarioLiquido[i]);
			i++;
		}
		/*
		for(double salario : funcionario.getSalario()) {
			System.out.println(salario);
		}
		*/
		//System.out.println(funcionario.bonus(1000));
		//System.out.println(funcionario.bonus(2000));
		//System.out.println(funcionario.bonus(3000));
		//System.out.printf(nomes[i], salarios[i]);
		//System.out.println(funcionario.getSalario());
		//System.out.println();
		//System.out.println(Arrays.toString(bonus));
		System.out.println(Arrays.toString(nomes));
		System.out.println(Arrays.toString(salarios));
		System.out.println(Arrays.toString(bonus));
		System.out.println(Arrays.toString(salarioLiquido));
	}
}
