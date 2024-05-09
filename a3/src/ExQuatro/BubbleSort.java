package ExQuatro;

public class BubbleSort {
    public static void main(String[] args) {

    // declarei o vetor
    int[] vetor = new int[10];

	// adicionei números aleátorios no vetor
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = (int) (Math.random() * vetor.length);
    }

	System.out.println("\n Bubble Sort");

    // imprimi o vetor desordenado
    System.out.println("\nDesordenado: ");
    for (int i = 0; i < vetor.length; i++) {
       System.out.print(vetor[i] + " ");
    }
	
    // Bubble Sort
	int maior = 0;
	for(int i = 0; i < vetor.length; i++){   // LAÇO DE REPETIÇÃO DO TAMANHO DO vetor PARA COMPARAR TODOS OS ELEMENTOS
		for(int j = 0; j < vetor.length - 1; j++){  // REPETIÇÃO DO TAMANHO DO vetor -1 POIS O vetor ESTA COMPARANDO i + 1. SE FOSSE ATE A ULTIMA POSIÇÃO SERIA ERRO
			if(vetor[j] > vetor[j + 1]){  // COMPARANDO UM VALOR NA POSIÇÃO i E NA POSIÇÃO i + 1
				maior = vetor[j];      // ARMAZENA O MAIOR VALOR EM UMA VARIAVEL
				vetor[j] = vetor[j+1]; // SETA O VALOR MENOR NA POSIÇÃO i (QUE É O MENOR ÍNDICE)
				vetor[j+1] = maior;    // PEGA O VALOR MAIOR QUE TINHAMOS ARMAZENADO E SETA NA POSIÇÃO i + 1 (QUE É O MAIOR ÍNDICE)
			}
		}
	}

    // imprimi o vetor ordenado
    System.out.println("\n\nOrdenado: ");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    } 
        
    }
}
