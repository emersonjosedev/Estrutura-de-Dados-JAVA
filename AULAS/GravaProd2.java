package meuPacote;
import meuPacote.Regpro;
import java.util.LinkedList;
import java.util.Queue;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class GravaProd2 {
    public static void main(String[] args) {
        String caminhoArquivo = "c:\\temp\\produto.txt";
        int codigo=0;
        String nome;
        String valors;
        double valor=0;
        int qtd = 0;
        int categoria = 0;
        Queue<Regpro> fila = new LinkedList<>();
    	//ArrayList<Regpro> listaDeProdutos = new ArrayList<>();
        // Adicione objetos Regpro à lista
    	try {
            // Crie um objeto File para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            // Crie um objeto Scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(arquivo);
            // Scanner leia = new Scanner(System.in);
            // Use um loop para ler e imprimir cada linha do arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                codigo = Integer.parseInt(linha.substring(0,2));
                nome=linha.substring(3,34);
                valors=linha.substring(36,41);
                valor=Double.parseDouble(valors);
                valor = valor /100;
                qtd=Integer.parseInt(linha.substring(43,45));
                categoria=Integer.parseInt(linha.substring(46,47));
                fila.add(new Regpro(codigo,nome,valor,qtd,categoria));
            }    	
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
      //  fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println("Depois de remover cinco elementos:");
    	
    	// Acesse os objetos na lista
        for (Regpro produto : fila){
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQtd());
            System.out.println("Categoria: " + produto.getcat());
            System.out.println();
        }
    }

}
