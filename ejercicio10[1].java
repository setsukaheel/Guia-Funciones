import java.util.Scanner;

public class ejercicio10 {
	
	
	public static void main(String[] args){
		int n;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		n=entrada.nextInt();
		piramide(n);
		
		entrada.close();
		
	}
	

	public static void piramide(int N) {
		int aux=(2*N)-1;
		int j=aux;
		int i=N;
		
		String asterisco= "";
		if(N<=0){
			System.out.println("-1");
		}else{
			while (i!=0){
				while(j!=0){
					asterisco=asterisco.concat("*");
							j=j-1;
				}
				aux=aux-2;
				System.out.println(asterisco);
				asterisco="";
				i=i-1;
				j=aux;
			}
			System.out.println("0");
		}
		

	}

}
