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
        
        //al modificar el método en la clase, arrastra a los objetos esos cambios
        toby.alimentar(0.5);
        toby.adiestrar();
        
        System.out.println("Grado de obediencia de toby: " + toby.gradoObediencia);
        
        EjemploClasePerro2 linda = new EjemploClasePerro2();
        linda.alimentar(2.5);
        System.out.println("Grado de obediencia de linda: " + linda.gradoObediencia);
        
        String resultado = toby.pedirLadrar(); 
        System.out.println(resultado);
    }
    
}
