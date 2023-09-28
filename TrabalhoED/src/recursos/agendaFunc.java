package recursos;

import java.util.HashMap;
import java.util.Map;

public class agendaFunc {
	private Map<String, Contatos> agenda;
	
	public agendaFunc() {
        agenda = new HashMap<>();
    }
	
	//add
	public void adicionarContato(Contatos contato) {
        agenda.put(contato.getName(), contato);
    }
	
	//mostra
	public void mostrarTodosContatos() {
        for (Contatos contato : agenda.values()) {
            System.out.println(" ");
            System.out.println("Nome: " + contato.getName());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Nascimento: " + contato.getNascimento());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Celular: " + contato.getCelular());
            System.out.println(" ");
        }
    }
	
	//busca
	public Contatos buscarContatoPorNome(String nome) {
        return agenda.get(nome);
    }
}
