package br.ufrpe.social_network.negocio.beans;

import java.time.LocalDate;

public class Person {

    private static long nextId = 1;
    
    private long id;
    private String name;
    private String country;
    private LocalDate birthDate;
    
    public Person(String name, String country, LocalDate birthDate) {
        // auto-generated ID
        this.id = nextId;
        nextId++;
        
        this.name = name;
        this.country = country;
        this.birthDate = birthDate;
    }
    
    public Person() {
        this(null, null, null);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the birthDate
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }
    
    @Override
    public String toString() {
        String resultado;
        resultado = "Nome: " + this.name + "\n"+"Nascimento: "+ this.birthDate + "\nPaís: "+ this.country
        		+ "\n\n";
        
        return resultado;
    }
}
