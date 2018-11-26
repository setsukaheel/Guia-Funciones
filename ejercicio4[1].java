import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		int respuesta;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		N=entrada.nextInt();
		respuesta=Factorial(N);
		System.out.println("el Factorial de " + N + " es " + respuesta);
		int TER;
		int x=1;
		System.out.println( );
		System.out.println("Determinar Factorial de dos números a y b");
		System.out.println( );
		System.out.println("Ingrese valor de a:");
		int a=entrada.nextInt();
		System.out.println("Ingrese valor de b: ");
		int b=entrada.nextInt();
		if (a>b){
			for(int i=b;i<a-1;i++){
				TER=b+x;
				respuesta=Factorial(TER);
				System.out.println("el Factorial de " + TER + " es " + respuesta);
				x++;
			}
		}
		if (b>a){
			for (int i=a;i<b-1;i++){
				TER=a+x;
				respuesta=Factorial(TER);
				System.out.println("El factorial de " + TER + " es " + respuesta);
				x++;
			}
		}
	
	}

	public static int Factorial(int n) {
		
		int F=1;
		int i=0;
		while(i<n){
		
		F=F*(n-i);
		i++;
		
		
		}
		return F;
	}

}
