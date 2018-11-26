import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int respuesta;
	Scanner entrada=new Scanner(System.in);
	System.out.println("Ingrese un número: ");
	N=entrada.nextInt();
	respuesta=fibonacci(N);
	System.out.println("El término " + N + " de la serie fibonacci es: " + respuesta);
	}

	public static int fibonacci(int n) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int suma=0;

		for(int i=0; i<n; i++){
			if(i==0){
				suma=1;
			}else{
			suma=a+b;
			a=b;
			b=suma;
			
			}
		}
		return suma;
		
	}
}
