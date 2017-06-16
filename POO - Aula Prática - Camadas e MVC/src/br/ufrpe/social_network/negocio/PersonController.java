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
            //comentario qualquer
        }
        return instance;
    }
    
    public void savePerson(Person p) {
    	personsRepository.Cadastro(p);
    }
    
    public Person find(long personId) {
    	Person resultado = null;
    	resultado = personsRepository.Procura(personId);

        return resultado;
    }
    
    public void update(Person newPerson) {
    	personsRepository.Atualiza(newPerson);
    }
    
    public void delete(Person p) {
    	personsRepository.Remove(p.getId());
        
    }
}
