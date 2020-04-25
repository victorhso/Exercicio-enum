import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.Produto;
import entities.itemPedido;
import entities.enums.statusPedido;

public class App {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date birthDate  = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente (nome, email, birthDate);
		
		System.out.print("Entre com um pedido");
		System.out.print("\nStatus: ");
		statusPedido status = statusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Quantos pedidos fará?\nPedidos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.print("Entre com o #" + i + " pedido");
			System.out.print("\nNome do produto: ");
			sc.nextLine();
			String produtoNome = sc.nextLine();
			System.out.print("Preço do produto: R$");
			double valor = sc.nextDouble();
			
			Produto produto = new Produto (produtoNome, valor);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			itemPedido item = new itemPedido(quantidade, valor, produto);
			pedido.adcPedido(item);
		}
		
		System.out.println("------------------------------");
		System.out.println("Sumário pedido");
		System.out.println("------------------------------");
		System.out.println(pedido);
		
		sc.close();
	}

}
