package br.ufrpe.social_network.negocio.beans;

import java.util.ArrayList;

public class Post {
	private static long nextId = 1;
	private long id;
	private String texto;
	private Person author;
	private ArrayList<Post> comments;

	public Post(String texto, Person author) {

		id = nextId;
		nextId++;
		this.texto = texto;
		this.author = author;
		this.comments = new ArrayList<Post>();
	}

	public Post() {
		this(null, null);
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public ArrayList<Post> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Post> comments) {
		this.comments = comments;
	}

	public long getId() {
		return id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void addComment(Post comment) {
		if (comment != null) {
			this.comments.add(comment);
		}
	}

	public void removeComment(Long id) {
		for (int i = 0; i < this.comments.size(); i++) {
			if (this.comments.get(i).id == id) {
				this.comments.remove(i);
			}
		}
	}

	@Override
	public String toString() {

		String resultado;

		resultado = this.author.getName() + ": " + this.texto + "\n" + "Respostas:\n";

		for (int i = 0; i < this.comments.size(); i++) {
			resultado = resultado + "\t" + this.comments.get(i) + "\n";
		}

		return resultado;
	}
}
