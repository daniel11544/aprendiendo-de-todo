public class TarjetaCine {

    //atributos
    String idTarjeta;
    String nombreCompleto;
    String email;
    String telefono;
    int edad;
    double porcentajeDescuento;

    //constructor
    public TarjetaCine(String idTarjeta, String nombreCompleto, String email, String telefono, int edad, double porcentajeDescuento) {
        this.idTarjeta = idTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.porcentajeDescuento = porcentajeDescuento;

    }

    //metodos
    public double pagar(String[] cuenta) {

        

        int total = 0;
        for (int i = 0; i < cuenta.length; i++) {

            if ("Boleta".equals(cuenta[i])) {
                total+= 6000;
            } else if ("Combo 1 - Crispetas + Gaseosa".equals(cuenta[i])) {
                total+= 8000;
            } else if ("Combo 2 - Perro + Gaseosa".equals(cuenta[i])) {
                total+= 12000;
            }

        }
       double valor = total * (1 - porcentajeDescuento / 100);

        return valor;

    }

    //getter y setter
    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

}