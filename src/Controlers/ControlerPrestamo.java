package Controlers;
import Models.mdl_Prestamo;
import Models.mdl_Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlerPrestamo {
    public Scanner scanner;
    public static ArrayList<mdl_Cliente> clientes = new ArrayList<>();
    public static ArrayList<mdl_Prestamo> prestamos = new ArrayList<>();

    public ControlerPrestamo(Scanner scanner) {
        this.scanner = scanner;
    }

    public void crearCuentas(){
        clientes.add(new mdl_Cliente("Andres","Fernandez","60836039"));
    }

    public void realizarPrestamo(){
        mdl_Cliente cliente = buscarCliente();
        if (cliente != null) {
            System.out.print("Ingrese el monto a deuda: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();
            prestamos.add(new mdl_Prestamo(cliente,monto));
        }
    }
    public void depositoDeuda(){
        mdl_Cliente cliente = buscarCliente();
        if (cliente != null) {
            for(mdl_Prestamo prestamo : prestamos)
            {
                if (prestamo.getCliente() == cliente)
                {
                    System.out.print("Ingrese el monto a pagar: ");
                    double monto = scanner.nextDouble();
                    scanner.nextLine();
                    prestamo.pagarDeuda(monto);
                }
            }
        }
    }

    public mdl_Cliente buscarCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nameCliente = scanner.nextLine();

            for (mdl_Cliente cliente : clientes) {
                if (cliente.getName().toUpperCase().equalsIgnoreCase(nameCliente.toUpperCase())) {
                    return cliente;
                }
            }
            System.out.println("Cliente no encontrado.");
            return null;
    }

    public void mostrarPrestamos()
    {
        System.out.println("Lista Prestamos Activos");
        for (int i = 0; i < prestamos.size() ; i++) {
            if (prestamos.get(i).getMonto() > 0)
                System.out.println(String.valueOf(i+1)+".-"+prestamos.get(i).getCliente().getName()+" Monto a prestamo: "+prestamos.get(i).getMonto());
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
