package es.hiberus.micarpeta.tema2;

/**
 *  Clase que modela un PERRO
 * @author MECAGOENTODO
 */
public class EjemploClasePerro2 {
    
    //atributos
    String raza;
    String color; 
    double peso; 
    int gradoObediencia; 
    
    //metodos o acciones, modifico el método pasando un parámetro al método
    void alimentar(double kilosAlimento){
        peso += kilosAlimento; 
    }
    
    void adiestrar(){
        gradoObediencia++; 
    }
}
