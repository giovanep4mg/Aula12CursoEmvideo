/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12cursoemvideo;

/**
 *
 * @author giova
 */
public class Ave extends Animal{
    // atribustos 
    private String corPena;

    // metodo
     public void construirNinho(){
        System.out.println("Está construindo um ninho...");
    }
    
     
     // metodos implements da classe Animal
    @Override
    void locomover() {
        System.out.println("Está voando...");
    }

    @Override
    void alimentar() {
        System.out.println("Está comendo frutas..");
    }

    @Override
    void emitirSom() {
        System.out.println("Está cantando ...");
     
    }
    
    
    
   
    //metodos especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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
