package testes;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class calculo_basico {

	public static void main(String[] args) {
		int somax = 0;
		int somaresult = 0;
		
		for (int i =0; i < 13; i++) {
			somax = somax +1;
			somaresult = somaresult + somax;
		}
		System.out.println(somaresult);
		
		System.out.println("------------------------------------------------------");
		int num1 = 1;
		int num2 = 0;
		int valorEscolhido = 1;
		String resposta = "não pertence";
		
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1); 
            
            if (num1 == valorEscolhido) {
            	resposta = "pertence";
    		}
        }
		System.out.println("o valor escolhido "+resposta+" a Fibonacce, valor escolhido "+valorEscolhido);
		System.out.println("-------------------------------------------------------");
		System.out.println("escreva uma palavra: ");
		Scanner g = new Scanner(System.in);
		String palavra = g.next();
		String palavraNova = "";
		
		for (int i = palavra.length() -1; i >= 0; i--) {
			palavraNova = palavraNova + Character.toString(palavra.charAt(i));
		}
		System.out.println(palavraNova);
	}
}
