package objetos;

import classes.Fornecedor;
import classes.Produto;

public class UsarProduto {

	public static void main(String[] args) {
		Fornecedor dell = new Fornecedor();
		dell.setRazaoSocial("Dell computer");
		dell.setNomeFantasia("Dell");
		dell.setCnpj("456398756246");
		System.out.println(dell.cadastro());
		
		
		Produto mouse = new Produto();
		mouse.setNome("Mouse sem Fio");
		mouse.setDescricao("Mouse sem fio recarregável");
		mouse.setPreco(54.20);
		mouse.setFornecedor(dell);
		System.out.println(mouse.cadastrar());
		System.out.println("o preço do produto é "+mouse.getPreco());
	}

}
