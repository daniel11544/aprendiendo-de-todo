public class Peaje {
    
    //EN ESTE ESPACIO SE ESCRIBEN LOS ATRIBUTOS DE LA CLASE Peaje
    private String filaCoches [];
    private String cochesFlyPass[];
    private boolean estadoPeaje=true;
    private int cocheEnAtencion=0;
    private int cantidadCochesAtendidos=1;
    
    //A CONTINUACIÓN, BAJO LOS ATRIBUTOS, SE ESCRIBEN LOS MÉTODOS DEFINIDOS
    //EN EL ENUNCIADO DEL PROBLEMA:

    public Peaje(String[] filaCoches) {
        this.filaCoches = filaCoches;
        this.cochesFlyPass=new String [filaCoches.length];
        
        for(int i = 0; i < cochesFlyPass.length; i++)
            cochesFlyPass[i] = " ";
        
        
        
        
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO DEL PROBLEMA
    }
    
    public void proximoCoche(){
       if(estadoPeaje==true)
        {cocheEnAtencion++;
         cantidadCochesAtendidos++;} //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(String coche:cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                coche = cocheABuscar;
            }
        }
    }
    
    public void cambiarEstadoPeaje(){
       estadoPeaje = estadoPeaje != true; //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
    }
    
    //INSERTE LOS GETTERS Y SETTERS A PARTIR DE ACÁ:
    public String[] getFilaCoches() {
        return filaCoches;
    }

    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public int getCocheEnAtencion() {
        return cocheEnAtencion;
    }

    public void setCocheEnAtencion(int cocheEnAtencion) {
        this.cocheEnAtencion = cocheEnAtencion;
    }

    public int getCantidadCochesAtendidos() {
        return cantidadCochesAtendidos;
    }

    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos) {
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }    
    
    
}