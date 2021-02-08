import java.util.Arrays;

public class ExamenEjer2 {
	
	public static void main(String arg []) {
		
		int matriz[][]=new int[5][5];
		int contador=1;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j]= contador;
				contador++;
			
			}
			System.out.println(Arrays.toString(matriz[i]));
			
		}
		
	}

}
