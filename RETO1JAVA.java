public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static double[] reporte(double[] listaNotas) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        
        double promedio=0, NotMx=0,NotMn=5;
        for (int i=0;i<listaNotas.length;i++){
            promedio+=listaNotas[i];
            if (listaNotas[i]>NotMx){
                NotMx=listaNotas[i];
            }
            if (listaNotas[i]<NotMn){
                NotMn=listaNotas[i];
            }
        }
        promedio=promedio/listaNotas.length;
        double[] listaFinal={promedio,NotMn,NotMx};
        return listaFinal;
        
   
    }
}