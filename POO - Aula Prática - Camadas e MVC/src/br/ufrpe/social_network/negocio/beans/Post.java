package br.ufrpe.social_network.negocio.beans;

import java.util.ArrayList;

public class Post {
    
    private long id;
    private String texto;
    private Person author;
    private ArrayList<Post> comments;

    public Post(String texto, Person author) {
        // TODO Implementar a mesma estratégia da classe Person para geração de ID  
        
        this.texto = texto;
        this.author = author;
        this.comments = new ArrayList<>();
    }
    
    public Post() {
        this(null, null);
    }

    public long getId() {
        return this.id;
    }
    
    
    // TODO gerar todos os métodos get/set, exceto o setId
    
    public void addComment(Post comment) {
        if (comment != null) {
            this.comments.add(comment);
        }
    }
    
    public void removeComment(Long id) {
        // TODO remover comentário da lista de comentários se ele existir. 
        // Você deve varrer a lista inteira verificando se há algum 
        // comentário com o ID informado como parâmetro e então removê-lo
    }
    
    @Override
    public String toString() {
        // TODO Implementar método toString da classe Person
        return "Coloque sua implementação aqui";
    }
}
