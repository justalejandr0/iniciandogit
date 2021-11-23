public class Matriz4{
	public static void main(String[] args){
		int[][] matriz = new int[4][4];
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz[i].length;j++){
				if (i==j){
					matriz[i][j]=1;
				}else{
					matriz[i][j]=0;
				}
			}
		}
		for(int fila=0; fila<matriz.length;fila++){
			for (int col=0;col<matriz[fila].length;col++){
				int re = matriz[fila][col];
				System.out.print(re+" ");
			}
			System.out.print("\n");
		}	
	}
}