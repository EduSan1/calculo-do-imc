package calculoDoImcDoJorginho;

import java.util.Scanner;// importa a biblioteca do scanner

public class CalculoDoImcDoJorginho {

	public static void main(String[] args) {
		
		System.out.println("***** IMC DO JORGINHO *****"); //imprimir o titulo na tela

		
		System.out.print("Peso do Jorginho em Kg: "); //imprime na tela a frase
		Scanner teclado = new Scanner(System.in); //scaneia o que o usuário digitou (eu acho :P)
		double p = teclado.nextDouble(); //define a variavel p como o valor que o usuario digitou
		
		System.out.print("Altura do Jorginho em metros: "); //imprime na tela a frase
		Scanner teclado1 = new Scanner(System.in); // scaneia o que o usuário digitou (eu acho :P)
		double a = teclado.nextDouble(); //define a variavel a como o valor que o usuario digitou
		
		
		
		System.out.println("--------------------------------------------------------------------");
		//barrinha pra separar só porque sim.
		
		double imc = p/(a*a); // definir a variavel imc por meio do valor da formula
		System.out.print("IMC: "); //imprime na tela a frase
		System.out.println(imc); //mostrar o imc do jorginho.
		
		System.out.print("Classificação do IMC do Jorginho: "); //Mostrar a classificação do jorginho.
		
		//possiveis resultados para o Jorge.
		
		//se o imc do Jorginho for menor que 18.5
		
		if (imc<18.5) {
				System.out.println("Magreza (tá precisando comer uns bagulho ai em Jorge)");
				System.out.print("Nivel de obesidade do Jorginho: 0");
				
			} 
		
		//se o imc do Jorginho for maior/igual a 18.5 e menor que 25
		
		else if (imc>=18.5 && imc<25) {
			System.out.println("Normal (tá tranquilo, tá favorável)");
			System.out.print("Nivel de obesidade do Jorginho: 0");

		} 	
		
		//se o imc do Jorginho for maior/igual a 25 e menor que 30
		
		else if (imc>=25 && imc<30) {
			System.out.println("Sobrepeso (Fica esperto ai heim Jorge)");
			System.out.print("Nivel de obesidade do Jorginho: I");

		} 	
		
		//se o imc do Jorginho for maior/igual a 30 e menor que 40
		
		else if (imc>=30 && imc<40) {
			System.out.println("Obesidade (ent jorge... Qual sport que tu quer começar a praticar? só de curiosidade msm)");
			System.out.print("Nivel de obesidade do Jorginho: II");

		} 
		
		//se nada disso ocorreu significa que Jorginho ta com o imc maior que 40, ent:
		
		else {
			System.out.println("Era pra comer Jorge, MAS N TANTO !!!");
			System.out.print("Nivel de obesidade do Jorginho: III");
		
		}

	}
	
}
