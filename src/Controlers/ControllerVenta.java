package Controlers;
import Models.Venta;
import Models.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerVenta {
    public Scanner scanner;
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Venta> ventas = new ArrayList<>();

    public ControllerVenta(Scanner scanner) {
        this.scanner = scanner;
    }

    public void crearCuentas(){
        clientes.add(new Cliente("Andres","Fernandez","60836039"));
    }

    public void realizarVenta(){
        Cliente cliente = buscarCliente();
        if (cliente != null) {
            System.out.print("Ingrese el producto: ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese el monto total: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();
            ventas.add(new Venta(cliente,producto,monto));
        }
    }

    public Cliente buscarCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nameCliente = scanner.nextLine();

            for (Cliente cliente : clientes) {
                if (cliente.getName().toUpperCase().equalsIgnoreCase(nameCliente.toUpperCase())) {
                    return cliente;
                }
            }
            System.out.println("Cliente no encontrado.");
            return null;
    }

    public void mostrarVentas()
    {
        System.out.println("Lista Ventas");
        for (int i = 0; i < ventas.size() ; i++) {
                System.out.println(String.valueOf(i+1)+".-"+ ventas.get(i).getCliente().getName()+" Monto de venta: "+ ventas.get(i).getMonto());
        }
    }
    public void mostrarClientes()
    {
        System.out.println("Lista Clientes");
        for (int i = 0; i < clientes.size() ; i++) {
            System.out.println(String.valueOf(i+1)+".-"+clientes.get(i).getName()+" "+clientes.get(i).getLastName());
        }
    }
}
