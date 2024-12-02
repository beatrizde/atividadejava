package objetos;

import classes.Cliente;

public class UsarCliente {

	public static void main(String[] args) {
		//Vamos instanciar a Classe Cliente gerando o
		//objetos cli
		Cliente cli = new Cliente();
		cli.setNome("Rodrigo Sampaio");
		cli.setEmail("rodrigo.sp@gmail.com");
		cli.setCpf("12345678905");
		cli.setIdade(23);
				
		
		System.out.println(cli.cadastrar());

	}

}
