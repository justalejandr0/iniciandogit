import java.io.*;

public class ManejoArchivo2{
	public static void main(String[] args){

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try{
			archivo = new File("./prueba.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea;
			while((linea = br.readLine()) !=null){
				System.out.print(linea+" ");
			}

		}catch (Exception e){
			//Todo handle exception
			System.out.println(e.getMessage());
		} 
	}
}