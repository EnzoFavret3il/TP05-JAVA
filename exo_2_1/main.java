package exo_2_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] tableau=tab(5);
		
	}
	public static int[] tab(int indice) {
		int[] tab= new int[indice];
		for(int i=0; i<indice;i++) {
			System.out.println("Inserer la valeur : "+ i );
			Scanner scan=new Scanner(System.in);
			tab[i]=scan.nextInt();
		}
		
		
		return tab;
	}

}
