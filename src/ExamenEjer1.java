import java.util.Arrays;
import java.util.Scanner;

public class ExamenEjer1 {

	public static void main(String arg []) {
		
		
		Scanner sc=new Scanner(System.in);
		int numPant=0;
		
		int num []= new int [10];
		int aleatorio=0;
		
		for(int i=0;i<num.length;i++) {
			aleatorio=(int)(Math.random()*20+1);
		
			
			num[i]=aleatorio;
		}	
		
		System.out.println(Arrays.toString(num));
		
	
		System.out.println("inserte un numero de 0-20 ");
		numPant=sc.nextInt();
		
		
		if(numPant == aleatorio) {
			System.out.println("Tu numero esta en la array " + aleatorio);
			
		}else {
			System.out.println("Tu numero no sale en la array");
		}
		
		
	}
	
}
