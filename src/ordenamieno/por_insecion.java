package ordenamieno;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class por_insecion {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner (System.in);
		
		// 
		
		int arreglo [],elemento,pos = 0,aux=0;
		
		elemento = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad del numero de elemenos "));
		
		arreglo = new int [elemento];//le asignamos el numero de elementos de del arreglo
		
		for(int i=0;i<elemento;i++) {
			System.out.print((i+1)+"digite un numero:");
			arreglo[i] = entrada.nextInt();
		}
		//elemento por insercion
		for(int i=0;i<elemento;i++) {
			pos = i;
			aux = arreglo[i];
		}
		while((pos>0) && (arreglo[pos-1]>aux)) {//----------------------------------------------------------------
		
			arreglo[pos] = arreglo [pos-1];
			pos--;
			
		}
		arreglo[pos] = aux;
		System.out.print("orden acendiende:");
		for(int i=0;i<elemento;i++) {
			System.out.println(arreglo[i]+" ");
		}
		//ARREGLO DE FORMA DECRECIETE 
		System.out.println(" ");
		System.out.println("orden desendiente: ");
		
		for(int i=(elemento-1);i>0;i--) {
			System.out.println(arreglo[i]+" ");
			}
		System.out.println(" ");
	
		
	}

}
