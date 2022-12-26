/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12cursoemvideo;


public class Peixes extends Animal{
    // atributos 
    private String corEscama;
    private String soltarBolas;

    @Override
    void locomover() {
        System.out.println("Está nadando...");
    }

    @Override
    void alimentar() {
        System.out.println("Está comendo ....");
    }

    @Override
    void emitirSom() {
        System.out.println("Não emite som...");
    }
    public void soltarBolhas(){
        System.out.println("Está soltando bolhas...");
    
    }

    
    // metodos especiais 
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getSoltarBolas() {
        return soltarBolas;
    }

    public void setSoltarBolas(String soltarBolas) {
        this.soltarBolas = soltarBolas;
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
