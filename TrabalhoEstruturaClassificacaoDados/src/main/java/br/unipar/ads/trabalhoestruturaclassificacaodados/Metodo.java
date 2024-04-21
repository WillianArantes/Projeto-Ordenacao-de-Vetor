
package br.unipar.ads.trabalhoestruturaclassificacaodados;

import javax.swing.JOptionPane;

public class Metodo {
   
   
   public Metodo(){
       
   }
   
   public void ordenacaoInsercao(int []vetor){
       long startTime = System.nanoTime();
       int j;
        String vetorOriginal = "Vetor original: ";
        for(int i = 0; i < vetor.length; i ++){
           
           vetorOriginal += vetor[i];   
           if(i < vetor.length -1){
               vetorOriginal += " - "; 
           }
        }
       for(int i = 1; i < vetor.length; i++){//vai percorrer vetor
           int chave = vetor[i];//armazena o valor a ser comparado
           
           for(j = i - 1;( j >= 0 && vetor[j] > chave); j--){/*enquanto j
               for maior ou igual a zero e o valor do vetor na posição 
               j for maior que a chave. 
               Este loop move os elementos maiores que a chave uma posição
               à frente no vetor, para abrir espaço para inserir a chave na
               posição correta.*/
               vetor[j + 1] = vetor[j];/*desloca o valor uma posicao pra direita
               adicionando vetor[j] na posição 1.
               */
           }
           vetor[j + 1] = chave;/*quando termina o laço acima o j desce para 
           posicao 0. assim adicionando valor da chave na posição 0.*/
                  
        } 
       String msg = "Vetor ordenado por inserção: ";
       for(int i = 0; i < vetor.length; i ++){
           
           msg += vetor[i];   
           if(i < vetor.length -1){
               msg += " - "; 
           }
            JOptionPane.showMessageDialog(null,
                    vetorOriginal);
        }   JOptionPane.showMessageDialog(null, msg);
        
         long endTime = System.nanoTime();
         long durationInsercao = endTime - startTime;
   }
   public void ordenacaoSelecao(int []vetor){
        long startTime = System.nanoTime();
        int tamanho = vetor.length;
        String vetorOriginal = "Vetor original: ";
        for(int i = 0; i < vetor.length; i ++){
           
           vetorOriginal += vetor[i];   
           if(i < vetor.length -1){
               vetorOriginal += " - "; 
           }
        }

        // Percorre o vetor
        for (int i = 0; i < tamanho - 1; i++) {
            // Encontra o índice do menor elemento restante
            int indiceMenor = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Troca o menor elemento com o elemento na posição i
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }

        // Exibe o vetor ordenado
        String msg = "Vetor ordenado por seleção: ";
        for (int i = 0; i < tamanho; i++) {
            msg += vetor[i];
            if (i < tamanho - 1) {
                msg += " - ";
            }
        }
        JOptionPane.showMessageDialog(null, vetorOriginal);
        JOptionPane.showMessageDialog(null, msg);
         long endTime = System.nanoTime();
         long durationInsercao = endTime - startTime;
    }
   public void ordenacaoBolha(int []vetor){
        long startTime = System.nanoTime();
        int tamanho = vetor.length;
        String vetorOriginal = "Vetor original: ";
        for(int i = 0; i < vetor.length; i ++){
           
           vetorOriginal += vetor[i];   
           if(i < vetor.length -1){
               vetorOriginal += " - "; 
           }
        }

        // Percorre o vetor
        for (int i = 0; i < tamanho - 1; i++) {
            // Últimos i elementos já estão no lugar certo
            for (int j = 0; j < tamanho - i - 1; j++) {
                // Compara elementos adjacentes e os troca se estiverem na ordem errada
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Exibe o vetor ordenado
        String msg = "Vetor ordenado por bolha: ";
        for (int i = 0; i < tamanho; i++) {
            msg += vetor[i];
            if (i < tamanho - 1) {
                msg += " - ";
            }
        }
        JOptionPane.showMessageDialog(null, vetorOriginal);
        JOptionPane.showMessageDialog(null, msg);
        long endTime = System.nanoTime();
        long durationInsercao = endTime - startTime;
    }
   
}
