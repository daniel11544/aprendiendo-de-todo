public class TarjetaOro extends TarjetaCine {

    //atributos
    private String[] beneficiosDescripcion = {"Boleto Gratis", "Crispetas Gratis", "Gaseosa Gratis"};
    private boolean[] beneficiosEstado = {true, true, true};

    //constructor
    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 20);
       
    }

    //metodos
    
    
    
    public boolean redimirBeneficio(int posicionBeneficio) {
        if (beneficiosEstado[posicionBeneficio] == true) {
            beneficiosEstado[posicionBeneficio] = false;
            return true;
        } else {
            return false;
        }

    }
    //getter and setter

    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }

}
