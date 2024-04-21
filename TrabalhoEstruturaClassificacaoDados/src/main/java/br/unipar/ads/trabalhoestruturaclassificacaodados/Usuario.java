
package br.unipar.ads.trabalhoestruturaclassificacaodados;


public class Usuario {
    private int escolhaMetodo;
    private String vetor;

    public Usuario(int escolhaMetodo, String vetor) {
        this.escolhaMetodo = escolhaMetodo;
        this.vetor = vetor;
    }
    
    public Usuario(){
        
    }

    public String getVetor() {
        return vetor;
    }

    public void setVetor(String vetor) {
        this.vetor = vetor;
    }

    public int getEscolhaMetodo() {
        return escolhaMetodo;
    }

    public void setEscolhaMetodo(int escolhaMetodo) {
        this.escolhaMetodo = escolhaMetodo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "esolhaMetodo=" + escolhaMetodo + ", vetor=" 
            + vetor + '}';
    }
    
}
