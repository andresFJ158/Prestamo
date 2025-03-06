package Models;

public class mdl_Prestamo {
    private mdl_Cliente cliente;
    private double monto;

    public mdl_Cliente getCliente() {return cliente;}
    public void setCliente(mdl_Cliente cliente) {this.cliente = cliente;}

    public double getMonto() {return monto;}
    public void setMonto(double monto) {this.monto = monto;}

    public mdl_Prestamo(mdl_Cliente cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
    }
    public void pagarDeuda(double monto) {
        if (monto > 0 && monto <= this.monto)
        {
            this.monto = this.monto-monto;
            System.out.println("Prestamo actualizado");
        }
        else
            System.out.println("Ingrese un monto valido");
    }
}
