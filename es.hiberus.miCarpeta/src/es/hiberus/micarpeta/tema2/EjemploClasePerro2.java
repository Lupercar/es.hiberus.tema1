apckage es.hiberus.micarpeta.tema2;

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
    
    //Sobrecarga de métodos, más de un método con el mismo nombre 
    //pero con distintos parámetros
    void alimentar(){
        peso += 0.5; 
    }
    
    //metodos o acciones, modifico el método pasando un parámetro al método
    void alimentar(double kilosAlimento){
        peso += kilosAlimento; 
    }
    
    void adiestrar(){
        gradoObediencia++; 
    }
}
