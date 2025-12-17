package mostrandodatos;

import java.util.Scanner;
public class mostrandodatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Introduce tu nombre: ");	
String nombre = sc.nextLine();	
System.out.print("Introduce tu apellido: ");
String apellido = sc.nextLine();
System.out.println("Nombre completo: " + nombre + " " + apellido);
	}
	

}
