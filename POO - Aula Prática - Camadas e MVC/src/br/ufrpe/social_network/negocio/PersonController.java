package br.ufrpe.social_network.negocio;

import br.ufrpe.social_network.dao.PersonDAO;
import br.ufrpe.social_network.negocio.beans.Person;

public class PersonController {
    
    private PersonDAO personsRepository;
    private static PersonController instance;
    
    private PersonController() {
        // Construtor privado para implementação de singleton
    }

    public static PersonController getInstance() {
        if (instance == null) {
            instance = new PersonController();
        }
        return instance;
    }
    
    public void savePerson(Person p) {
        // TODO Método que salva pessoa no repositório
    }
    
    public Person find(long personId) {
        // TODO Retorna o objeto do tipo Person que contenha aquele ID
        return null;
    }
    
    public void update(Person newPerson) {
        //TODO Encontra no repositório obj que tenha id igual a newPerson.id e atualiza objeto 
    }
    
    public void delete(Person p) {
        // TODO apaga do repositório objeto que contenha o id igual a p.id 
    }
}
