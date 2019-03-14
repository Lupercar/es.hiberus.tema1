package es.hiberus.micarpeta.tema2;

/**
 *  MAIN clase PERRO
 * @author MECAGOENTODO
 */
public class ProgramaClasePerro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //defino una variable de tipo Perro
        EjemploClasePerro2 toby ;
        toby= new EjemploClasePerro2(); //instancio el objeto toby
        
        toby.alimentar();
        toby.adiestrar();
        
        System.out.println("Grado de obediencia de toby: " + toby.gradoObediencia);
        
        EjemploClasePerro2 linda = new EjemploClasePerro2();
        linda.alimentar();
        System.out.println("Grado de obediencia de linda: " + linda.gradoObediencia);
    }
    
}
