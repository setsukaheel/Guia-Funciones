import java.util.Scanner;

public class ejercicio8 {

	private static final int D�a = 0;

	public static void main(String[] args) {
		//Calculo salario diario de un jornal
		
		int hd=10;
		double hn=13.5;
		int fd=11;
		double fn=15.5;
		double Horas;
		String Nombre;
		String D�a;
		String Turno;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese nombre de tranajador: ");
		Nombre=entrada.nextLine();
		System.out.println("Ingrese d�a: ");
		D�a=entrada.nextLine();
		System.out.println("Ingrese turno: ");
		Turno=entrada.nextLine();
		System.out.println("Ingrese horas trabajadas: ");
		Horas=entrada.nextDouble();
		
		double Sueldo=(double) Jornal(D�a, Turno, Horas);
		
		if (Sueldo<0) {System.out.print("error");}
		else{
			System.out.println("El sueldo del trabajador " + Nombre + " del d�a " + D�a + " es " + Sueldo);
		}
		

	}

	private static Object Jornal(String d�a, String turno, double horas) {
		
		String DLaborable;
		String diurno;
		double H;
		
		switch (d�a){
		case "Laborable": ;
			if(turno.equals("Diurno")){
				horas=horas*10;	
			}
			else{
				horas=horas*13.5;
				return horas;
			}
				break;
			
		case "Festivo": ;
			if(turno.equals("Diurno")){
				horas=horas*11;
			}
			else{
				horas=horas*15.5;
				return horas;
			}
				break;

		default : return(-1);
		
		}
		return horas;
	}

}
