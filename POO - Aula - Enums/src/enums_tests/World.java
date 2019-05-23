package enums_tests;

import java.util.ArrayList;
import java.util.List;

import enumeracao.Planet;

public class World {
  
  private Planet myPlanet;
  private long population;
  private List<String> religion;
  private List<String> species;
  
  public World() {
    myPlanet = Planet.EARTH;
    population = 7145499333L; // mais de 7 bilhões
    religion = new ArrayList<>();
    religion.add("cristianismo");
    religion.add("budismo");
    religion.add("umbanda");
    religion.add("islamismo");
    
    species = new ArrayList<>();
    species.add("homo sapiens sapiens");
    species.add("Delphinus delphis");
    species.add("canis lupus");
    species.add("felis silvestris catus");
  }

  /**
   * @return the myPlanet
   */
  public Planet getMyPlanet() {
    return myPlanet;
  }

  /**
   * @param myPlanet the myPlanet to set
   */
  public void setMyPlanet(Planet myPlanet) {
    this.myPlanet = myPlanet;
  }

  /**
   * @return the population
   */
  public long getPopulation() {
    return population;
  }

  /**
   * @param population the population to set
   */
  public void setPopulation(long population) {
    this.population = population;
  }

  /**
   * @return the religion
   */
  public List<String> getReligion() {
    return religion;
  }

  /**
   * @param religion the religion to set
   */
  public void setReligion(List<String> religion) {
    this.religion = religion;
  }

  /**
   * @return the species
   */
  public List<String> getSpecies() {
    return species;
  }

  /**
   * @param species the species to set
   */
  public void setSpecies(List<String> species) {
    this.species = species;
  }

}
