
package aula12cursoemvideo;

public class Cachorro extends Mamifero{
    
     
    // METODOS 
    public void enterrandoOsso(){
        System.out.println("O cachorro está enterrando um osso...");
    }
    
    public void rabanarRabo(){
        System.out.println("Cachorro está  rabanando o rabo");
    }
    
    @Override
    void emitirSom() {
        System.out.println("au au auau ...");
                
    }
}
