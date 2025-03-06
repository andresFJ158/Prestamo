import Controlers.ControlerPrestamo;
import java.util.Scanner;

public class Main {
    public static ControlerPrestamo controllerPrestamo;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido al Simulador de Cajero Automático.");
        controllerPrestamo = new ControlerPrestamo(scanner);
        controllerPrestamo.crearCuentas();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Nuevo prestamo");
            System.out.println("2. Pagar prestamo");
            System.out.println("3. Ver prestamos");
            System.out.println("4. Ver clientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    controllerPrestamo.realizarPrestamo();
                    break;
                case 2:
                    controllerPrestamo.depositoDeuda();
                    break;
                case 3:
                    controllerPrestamo.mostrarPrestamos();
                    break;
                case 4:
                    controllerPrestamo.mostrarClientes();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}