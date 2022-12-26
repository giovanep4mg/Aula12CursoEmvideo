
package aula12cursoemvideo;

public class Canguru extends Mamifero{
    
    // METODO
    public void usarBolsa(){
        System.out.println("Está usando bolsa...");
    }
    
    
    // METODO QUE VEM DA MAE 
    @Override
    void locomover() {
        System.out.println("Está pulando ...");
    }
    
    
}
