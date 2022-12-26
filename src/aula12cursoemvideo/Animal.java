/*
    Essa é classe Mãe, progenitora
  mas como é abstrata, nao vai aceitar ser instanciada, 
  vai pegar os atributos dela
 */
package aula12cursoemvideo;


public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membro;
    
   abstract void locomover();
   
   abstract void alimentar();
   
   abstract void emitirSom();
    
}
