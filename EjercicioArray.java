import java.io.*;
import java.util.Scanner;

public class EjercicioArray{
	static Scanner cuchao = new Scanner(System.in);
	
	public static void main(String[] args){
		int[] b = rellenar();
		mostrar(b);
	}

	public static int[] rellenar(){
		int[] matriz1= new int [10];

		for (int i=0;i<matriz1.length;i++){
			System.out.println("Ingrese el numero "+(i+1));
			int a = cuchao.nextInt();
			matriz1[i]=a;
		}
		return matriz1;

	}

	public static void mostrar(int[] matriz){
		try{
			FileWriter fl= new FileWriter("./Indice.text",true);
			PrintWriter pw = new PrintWriter(fl);
			for(int fila=0; fila<matriz.length;fila++){
				pw.print("Linea "+fila+" valor "+matriz[fila]+"\n");
			}
			pw.close();
		}catch(Exception ex){
			System.out.println("Error"+ ex.getMessage());
		}
	}
}


