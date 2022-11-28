import java.util.ArrayList;

public class Solucion {
    //ESTA CLASE NO TIENE MAIN

    public static Object[] reportes(ArrayList<Estudiante> grupo) {
        //EN ESTE ESPACIO PONER SU LÓGICA

        double suma = 0;
        double avg = 0;
        double minNota = Double.MIN_VALUE;
        double maxNota = Double.MAX_VALUE;
        String estudianteMinNota = "";
        String estudianteMaxNota = "";
for (Estudiante estudiante:grupo){
            suma += estudiante.getNota();
            if (estudiante.getNota() > minNota) {
                minNota = estudiante.getNota();
                estudianteMinNota = estudiante.getNombreCompleto();
            }
            if (estudiante.getNota() < maxNota) {
                maxNota = estudiante.getNota();
                estudianteMaxNota = estudiante.getNombreCompleto();
            }
        }
        avg = suma / grupo.size();
    
        Object[]result={avg,estudianteMaxNota,minNota,estudianteMinNota,maxNota};
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Estudiante>grupo=new ArrayList<>();
    
        
        
        

    
    
    
    
    }
}

