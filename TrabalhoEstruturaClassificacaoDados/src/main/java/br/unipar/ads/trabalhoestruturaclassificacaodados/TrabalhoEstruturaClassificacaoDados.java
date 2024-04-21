

package br.unipar.ads.trabalhoestruturaclassificacaodados;

import javax.swing.JOptionPane;


public class TrabalhoEstruturaClassificacaoDados {

    public static void main(String[] args) {
        
        String entradaVetor; 
        String[] partes;
        int opcao = -1;
        String tamanhoVetor;
         /*menu de opcoes*/
        
        Metodo ordecaoInsercao = new Metodo();
        Usuario usuario01 = new Usuario();
        
        tamanhoVetor = (JOptionPane.showInputDialog("Informe o tamanho"
                + " do vetor"));
        
        int tamanho = Integer.parseInt(tamanhoVetor);
        int[] vetor = new int[tamanho];
        
        entradaVetor = (JOptionPane.showInputDialog("Informe"
                + " os valores do tipo inteiro"));
        
        usuario01.setVetor(entradaVetor);
        
        partes = usuario01.getVetor().split(" ");
            for(int i = 0; i < partes.length; i++){
                vetor[i] = Integer.parseInt(partes[i]);
                
            }
            //opcoes
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite "
                    + "a opção para ordenar o vetor \n"
                    + "1 - ordenação por inserção \n"
                    + "2 - ordenação seleção \n"
                    + "3 - ordenação bolha \n"
                    + "0 - sair "));
 
           switch(opcao){
               case 1:
                 
                 ordecaoInsercao.ordenacaoInsercao(vetor);

                   break;
               case 2:
                   
                   ordecaoInsercao.ordenacaoSelecao(vetor);/*clone
                   cria e retorna uma copia do vetor
                   */
                   break;
               case 3:
                   ordecaoInsercao.ordenacaoBolha(vetor);
                   break;
               case 0:
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opção"
                           + "invalida");
                   
           }
        }while(opcao != 0);
    }
}
