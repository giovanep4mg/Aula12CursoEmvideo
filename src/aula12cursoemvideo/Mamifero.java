/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12cursoemvideo;

public class Mamifero extends Animal{
   // atributos 
   private String corPelo;

   
   
   // metodos implementes da classe Animal
    @Override
    void locomover() {
        System.out.println("Está correndo ...");
    }

    @Override
    void alimentar() {
        System.out.println("Está mamando ...");
    }

    @Override
    void emitirSom() {
        System.out.println("Está fazendo som de mamifero ...");
                
    }

    
    // metodos especiais 
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembro() {
        return membro;
    }

    public void setMembro(int membro) {
        this.membro = membro;
    }
   
   
}
