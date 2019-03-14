package es.hiberus.micarpeta.tema2;

/**
 * Método son acciones asociadas a una clase.
 * @author MECAGOENTODO
 */
public class EjemploCaja3 {
    
    final String MSG_FABRICA = "Fabrica comida.";
    final String MSG_DESTRUIR = "Caja destruida.";
    
    int contenido;
    
    void fabricar(){
        System.out.println(MSG_FABRICA);
    }
    
    void llenar(){
        contenido++;
    }
    
    void vaciar(){
        if(contenido>0){
            contenido--;
        }
    }
    
    void destruir(){
        System.out.println(MSG_DESTRUIR);
    }
}
