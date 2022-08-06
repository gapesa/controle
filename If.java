package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
	   Scanner ent = new Scanner(System.in);
	   System.out.println("Informe a média: ");
	   double media = ent.nextDouble();
	   
	   if(media <=10 && media >= 7)
	      System.out.println("Aprovado!!!");
	   else
		   System.out.println("Reprovado!!");
	   
	   ent.close();
	}

}
