import javax.swing.JOptionPane;
public class ArraySoma {
    public static void main(String[] args) {
        int tabela[][] = new int [10][10];
        int linha, coluna;
        int soma;

        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 10; coluna++) {
            tabela[linha][coluna]= Integer.parseInt(JOptionPane.showInputDialog(
                "Entre com o elemento [" + linha +"][" + coluna + "] da matriz Tabela"));
            }
        }   

        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 10; coluna++) {
            soma = tabela[linha] + tabela[coluna] 

            }
        }

        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 10; coluna++) {
            System.out.print("A soma total da Matrix 10x10 é igual a:" + soma);
        }
        System.out.println("");
    }
}

