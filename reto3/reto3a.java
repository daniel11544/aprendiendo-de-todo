public class TarjetaPlata extends TarjetaCine {

    //atributos
    private int cantidadVisitas = 0;
    private boolean elegibleOro = false;

    //constructor
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
        

    }

    //metodos
    @Override
    public double pagar(String[] cuenta) {

        cantidadVisitas++;
        if (cantidadVisitas == 5) {
            elegibleOro = true;
        }

        return super.pagar(cuenta);

    }

    //getter and setter
    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }

}
