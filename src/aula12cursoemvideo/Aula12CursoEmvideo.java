
package aula12cursoemvideo;

public class Aula12CursoEmvideo {

    public static void main(String[] args) {
        
      // criando varios objetos para representar os bichos 
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixes p = new Peixes();
        Ave a = new Ave();
        Canguru can = new Canguru();
        Cachorro ca = new Cachorro();
        Tartaruga tar =new Tartaruga();
        Lobo lo = new Lobo();
        
       
        m.locomover();// << MAMIFERO
        r.locomover();// << REPTIL
        p.locomover();// << PEIXES
        a.locomover();// <<  AVE
        can.locomover();// << CANGURU
        ca.locomover();// << CACHORRO
        tar.locomover();// TARTARUGA
        
        lo.emitirSom();// som do lobo
        ca.emitirSom();//som do cachorro
        
        
       
    }
    
}
