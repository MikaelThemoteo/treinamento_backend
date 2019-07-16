import java.util.Scanner;
public class ProdutoApp {
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.print("Digite o valor do produto: ");
		produto.setPreco(teclado.nextDouble());
		System.out.print("Digite para a porcentagem de desconto: ");
		produto.setDesconto(teclado.nextDouble());
		
		System.out.println("O valor com desconto é: " + produto.getPrecoComDesconto());
		
		teclado.close();
	}

}
