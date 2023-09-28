package agendaPrincipal.application;

import java.util.Scanner;
//importa funcionalidades
import recursos.agendaFunc;
import recursos.Contatos;

public class Principal {
	public static void main(String[] args) {
		 
			Scanner sc = new Scanner(System.in);
			agendaFunc agenda = new agendaFunc();
			int escolha = 0;
			
			try {
				while (escolha != 4) { //if nao funciona
					System.out.println("\nDigite: \n\n- 1 para adicionar um contato\n- 2 para buscar um contato\n- 3 para mostrar todos existentes\n- 4 para cancelar\n");
					escolha = sc.nextInt();
					
					switch(escolha) {
						case 1: 
							sc.nextLine();
							System.out.println("Nome :");
							String name = sc.nextLine();
							System.out.println("Telefone :");
							String telefone = sc.nextLine();
							System.out.println("Nascimento :");
							String nascimento = sc.nextLine();
							System.out.println("E-mail :");
							String email = sc.nextLine();
							System.out.println("Celular: ");
							String celular = sc.nextLine();
							
							Contatos contato = new Contatos(name, telefone, nascimento, email, celular);
							agenda.adicionarContato(contato);
							break;

						case 2:
							sc.nextLine();
							System.out.println("Digite o nome procurado: ");
							String nomeProcurado = sc.nextLine();
							Contatos contatoProcurado = agenda.buscarContatoPorNome(nomeProcurado);
					        if (contatoProcurado != null) {
					            System.out.println(contatoProcurado.getName() +" foi encontrado! \n\n E-mail:" + contatoProcurado.getEmail()+ "\n\n Telefone: " + contatoProcurado.getTelefone()+ "\n\n Celular: " + contatoProcurado.getCelular()+ "\n\n Aniversário: " + contatoProcurado.getNascimento());
					        } else {
					            System.out.println(nomeProcurado + " não foi encontrado" );
					        }
					        break;

						case 3: 
							agenda.mostrarTodosContatos();
					}
				}
			} finally {
				sc.close();
			}
	}

}
