import java.io.*;
import java.util.Scanner;

public class ArrayCarac{
	static Scanner cuchao = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Ingrese su frase: ");
		String a = cuchao.nextLine();
		char[] b = a.toCharArray();

		for (int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}

	}
}