package View;

import model.Arvore;

public class Main {
	public static void main(String[] args) {
        int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
        Arvore arvore = new Arvore();
        for (int i : vetor) {
            arvore.insert(i);
        }
        try {
        	System.out.print("pré-ordem: ");
            arvore.prefixSearch();
            System.out.println();
            System.out.print("ordem crescente: ");
            arvore.infixSearch();
            System.out.println();
            System.out.print("pós-ordem: ");
            arvore.postfixSearch();
            System.out.println();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        System.out.println();
    }

}
