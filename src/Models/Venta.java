package Models;

public class Venta {
    private Cliente cliente;
    private String producto;
    private double monto;

    public String getProducto() {return producto;}
    public void setProducto(String producto) {this.producto = producto;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public double getMonto() {return monto;}
    public void setMonto(double monto) {this.monto = monto;}

    public Venta(Cliente cliente, String producto, double monto) {
        this.cliente = cliente;
        this.producto = producto;
        this.monto = monto;
    }
}
