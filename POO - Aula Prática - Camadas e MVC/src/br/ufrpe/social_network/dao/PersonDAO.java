package br.ufrpe.social_network.dao;

import java.util.ArrayList;


import br.ufrpe.social_network.negocio.beans.Person;

public class PersonDAO {

	private ArrayList<Person> person;
	private int next;
	private static PersonDAO pdao = new PersonDAO();

	private PersonDAO() {

	}

	public static PersonDAO getInstance() {
		return pdao;
	}

	public void Cadastro(Person p) {
		this.person.add(p);
	}

	public int procuraIndice(long id) {
		int indice = 0;
		boolean achou = false;

		while ((achou != true) && (indice < this.next)) {
			if (id == this.person.get(indice).getId()) {
				achou = true;
			} else {
				indice++;
			}
		}

		return indice;
	}

	public Person Procura(long id) {

		int i = this.procuraIndice(id);
		Person resultado = null;
		if (i != this.next) {
			resultado = this.person.get(i);
		}
		return resultado;
	}

	public void Remove(long id) {
		int i = this.procuraIndice(id);

		if (i != this.next) {
			this.person.remove(i);
			System.out.println("Pessoa com id \"" + "\" foi excluída");
		} else {
			System.out.println("Conta não existe");
		}
	}

	public void Atualiza(Person person) {
		int i = this.procuraIndice(person.getId());
		
		if (i != this.next) {
			this.person.get(i).setBirthDate(person.getBirthDate());
			this.person.get(i).setCountry(person.getCountry());
			this.person.get(i).setName(person.getName());
			
			System.out.println("O cadastro foi atualizado!");
		} else
			System.out.println("Conta não existe!");
	}
	/*
	 * Antes de implementar os métodos, pense bem na assinatura dos mesmos
	 */

}
