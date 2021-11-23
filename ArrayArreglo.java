import java.io.*;
import java.util.Scanner;

public class ArrayArreglo{
	static Scanner cuchao = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Ingrese la primera dimension de su matriz:");
		int uno = cuchao.nextInt();
		System.out.println("Ingrese la segunda dimension de su matriz:");
		int dos = cuchao.nextInt();
		int[][] matriz = new int[uno][dos];
		int[][] matriz2= rellenaArray(matriz);
		try{
			FileWriter fl= new FileWriter("./Arreglo.text",true);
			PrintWriter pw = new PrintWriter(fl);
			for(int fila=0; fila<matriz2.length;fila++){
				for (int col=0;col<matriz2[fila].length;col++){
					int re = matriz2[fila][col];
						pw.print(re+" ");
				}
				pw.print("\n");
			}
			pw.close();
		}catch(Exception ex){
			System.out.println("Error"+ ex.getMessage());
		}
	}

	public static int[][] rellenaArray(int[][] matriz1){
		for (int i=0;i<matriz1.length;i++){
			for (int j=0;j<matriz1[i].length;j++){
				int a = (int)(Math.random()*9+1);
				matriz1[i][j]=a;	
			}
		}
		return matriz1;
	}
}

