package start;

import java.util.ArrayList;
import java.util.List;

import otros.Log;
import otros.Producto;
import otros.Utiles;
import otros.BaseDatos;

/**
 * Es la clase principal, la que contiene el main.
 */
public class App {
	public static List<Producto> lstProductos = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Log.escribeLog("El usuario inicia el programa.");
		BaseDatos.creaBD();		
		
		int opcion = 0;
		do {
			mostrarMenu();
			do {
			opcion = otros.Utiles.pideDatoEntero("Opci�n: ");
			ejecutarOpcion(opcion);
			}while(Utiles.compruebaOpcionIncorrecta(opcion, 0, 11));

		} while (opcion != 0);
		String respuesta = "";
		respuesta = respuesta.concat("\n- - - - - - - - - - - - ");
		respuesta = respuesta.concat("\nSe cierra el programa");
		respuesta = respuesta.concat("\n- - - - - - - - - - - - ");
		System.out.println(respuesta);
		
		Log.escribeLog("El usuario cierra el programa.");
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			Log.escribeLog("El usuario entra en A�adir Elemento");
			opciones.AniadirElemento.aniadirElemento();
			Utiles.enterParaContinuar();
			break;
		case 2:
			Log.escribeLog("El usuario entra en Borrar Elemento");
			opciones.BorrarElemento.borrarElemento();
			Utiles.enterParaContinuar();
			break;
		case 3:
			Log.escribeLog("El usuario entra en Modificar Elemento");
			opciones.ModificarElemento.modificarElemento();
			Utiles.enterParaContinuar();
			break;
		case 4:
			opciones.CargarLista.cargarLista();
			break;
		case 5:
			Log.escribeLog("El usuario entra en Listar");
			opciones.Listar.listar();
			Utiles.enterParaContinuar();
			break;
		case 6:
			Log.escribeLog("El usuario entra en Muestra Log");
			Log.muestraLog();
			Utiles.enterParaContinuar();
			break;
		case 7:
			Log.borraLog();
			Utiles.enterParaContinuar();
			break;
		case 8:
			Log.escribeLog("El usuario restaura los datos");
			BaseDatos.restauraDatos();
			Utiles.enterParaContinuar();
			break;
		case 9:
			Log.escribeLog("El usuario sobreescribe los datos");
			BaseDatos.guardaDatos(lstProductos);	
			Utiles.enterParaContinuar();
			break;
		case 10:
			Log.escribeLog("El usuario borra los datos");
			BaseDatos.reiniciaBD();
	        System.out.println("\nSe han eliminado los datos de la Base de Datos");
			Utiles.enterParaContinuar();
			break;
		case 11:
			Log.escribeLog("El usuario imprime los datos");
			BaseDatos.imprimeDatos();
			Utiles.enterParaContinuar();
			break;
		}
	}

	private static void mostrarMenu() {
		String menu = "";
		menu = menu.concat("MEN� PRINCIPAL\n");
		menu = menu.concat("===============\n");
		menu = menu.concat("1.  A�adir elemento\n");
		menu = menu.concat("2.  Borrar elemento\n");
		menu = menu.concat("3.  Modificar elemento\n");
		menu = menu.concat("4.  Cargar Lista\n");
		menu = menu.concat("5.  Listar\n");
		menu = menu.concat("--------- LOG ---------\n");
		menu = menu.concat("6.  Ver Log\n");
		menu = menu.concat("7.  Borrar Log\n");
		menu = menu.concat("--------- BBDD --------\n");
		menu = menu.concat("8.  Restaurar Datos\n");
		menu = menu.concat("9.  Sobreescribir Datos\n");
		menu = menu.concat("10. Borrar Datos\n");
		menu = menu.concat("11. Imprimir Datos Almacenados\n");
		menu = menu.concat("-----------------------\n");
		menu = menu.concat("0. Salir");
		
		System.out.println(menu);
	}
}