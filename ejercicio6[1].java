import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
	
		
		int N;
		int aux=1;
		String respuesta;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		N=entrada.nextInt();
		while (aux==1){
		
			if(N>15){System.out.println("Ingrese otro número");
		N=entrada.nextInt();
		}
		else{
			respuesta=Binario(N);
			aux=0;
			
			System.out.print("El binario de "+ N + " es " + respuesta);
		}
		}
	

	}

	public static String Binario(int n) {
		String b="";
		while(n!=0){
			int r = (int)(n%2);
			b=r+b;
			n/=2;
		}
		
		return b;
	}

}
