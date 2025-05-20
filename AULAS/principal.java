package meuPacote;

import java.util.Scanner;
import meuPacote.*;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("### MENU ###");
            System.out.println("1. Chamar Classe gravarProd");
            System.out.println("2. Chamar Classe gravarProd2");
            System.out.println("3. Chamar Classe gravarProd3");
            System.out.println("4. Chamar Classe arvore");
            System.out.println("0. Sair do programa");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            switch (opcao) {
                case 1:
                    System.out.println("Chamando Classe gravarProd...");
                    GravarProd.main(args);
                    break;
                case 2:
                    System.out.println("Chamando Classe gravarProd2...");
                    GravaProd2.main(args);
                    break;
                case 3:
                    System.out.println("Chamando Classe gravarProd3...");
                    GravaProd3.main(args);
                    break;
                case 4:
                    System.out.println("Chamando Classe arvore...");
                    Arvore.main(args);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
