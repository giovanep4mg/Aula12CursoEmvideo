/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12cursoemvideo;

/**
 *
 * @author giova
 */
public class Reptil extends Animal{
    // atributos
    private String corEscama;

    
    
    
    // metodos implements da classe Animal 
    @Override
    void locomover() {
        System.out.println("Está se rastejando ...");
    }

    @Override
    void alimentar() {
        System.out.println("Está comendo vegetais...");
    }

    @Override
    void emitirSom() {
        System.out.println("Está fazendo som de reptil...");
    }

    
    // metodos especiais 
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
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
