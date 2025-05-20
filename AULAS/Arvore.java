package meuPacote;

import java.util.TreeSet;

public class Arvore {
    public static void main(String[] args) {
        // Criando uma árvore ordenada (TreeSet) de objetos do tipo Regpro
        TreeSet<Regpro> arvoreRegpro = new TreeSet<>((o1, o2) -> {
            // Personalizando a comparação para ordenar por código
            if (o1.getCodigo() < o2.getCodigo()) {
                return -1;
            } else if (o1.getCodigo() > o2.getCodigo()) {
                return 1;
            } else {
                return 0;
            }
        });

        // Adicionando objetos à árvore
        arvoreRegpro.add(new Regpro(2, "Produto 2", 15.75, 15, 2));
        arvoreRegpro.add(new Regpro(1, "Produto 1", 10.5, 20, 1));
        arvoreRegpro.add(new Regpro(3, "Produto 3", 20.0, 30, 1));
        arvoreRegpro.add(new Regpro(4, "Produto 4", 18.25, 25, 3));
        arvoreRegpro.add(new Regpro(5, "Produto 5", 22.50, 10, 2));
        arvoreRegpro.add(new Regpro(6, "Produto 6", 12.99, 18, 3));
        arvoreRegpro.add(new Regpro(7, "Produto 7", 30.75, 22, 1));
        arvoreRegpro.add(new Regpro(8, "Produto 8", 27.40, 28, 2));


        // Exibindo detalhes dos produtos na árvore (ordenados por código)
        System.out.println("Detalhes dos produtos na árvore (ordenados por código):");
        for (Regpro produto : arvoreRegpro) {
            System.out.println("Código: " + produto.getCodigo() +
                               ", Descrição: " + produto.getDescricao() +
                               ", Preço: " + produto.getPreco() +
                               ", Quantidade: " + produto.getQtd() +
                               ", Categoria: " + produto.getcat());
        }
    }
}

