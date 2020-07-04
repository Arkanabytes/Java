/*Arkanabytes*/
import java.util.Scanner;
/*Esta es para realizar ventas de productos de la tiendita*/

public class Principal{
		
		public static void main(String [] args){

			Scanner miscanner = new Scanner(System.in);
			Datos datos = new Datos();
			String proveedor, nombre, codigo, precio, existencia;
			String text;
			int op = 0;
			Productos p [] = null;
			p = new Productos[30];

		while (op!=5){
			System.out.println("Elije una opcion");
			System.out.println("1.- Generar productos");
			System.out.println("2.- listar productos");
			System.out.println("3.- Realizar venta");
			System.out.println("4.- Mostrar total de ventas");
			System.out.println("0.- Salir");

			op = miscanner.nextInt();


			switch(op){

			case 1:

				for(int i = 0; i<30; i++){
					proveedor = datos.setProveedor();
					nombre = datos.setNombre();
					codigo = datos.setCodigo();
					precio = datos.setPrecio();
					existencia = datos.setExistencia();

					p[i] = new Productos(proveedor, nombre, codigo, precio, existencia);
				}

				break;				
			
			case 2:
				System.out.println("Productos");
					for(int i = 0; i<30; i++){
						System.out.print(p[i].getProveedor() + "-" +p[i].getNombre() + "-" +p[i].getCodigo() + "-" +p[i].getPrecio() + "-" +p[i].getExistencia() + "\n");
					}
			
				break;	

			case 3:
				System.out.println("Qu� producto deseas comprar?");
					for(int i = 0; i<30; i++){
						System.out.print(p[i].getProveedor() + "-" +p[i].getNombre() + "-" +p[i].getCodigo() + "-" +p[i].getPrecio() + "-" +p[i].getExistencia() + "\n");
					}
					


			}
	}
}
}			
