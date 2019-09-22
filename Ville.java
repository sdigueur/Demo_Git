import java.util.List;
import java.util.Set;

public class Ville {
  private String nomVille;
  private String nomPays;
  private int nbreHabitants;
  private char categorie;

  private List<String> gouvList;
  private List<String> mairieList;
  private List<String> tahanList;

  private Set<String> gouvSet;
  private Set<String> mairieSet;
  private Set<String> tahanSet;

  public void maVille() {
    System.out.println("aaa");
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
    this.setCategorie();
  }

  public List<String> getGouvList() {
    return gouvList;
  }

  public void setGouvList(List<String> gouvList) {
    this.gouvList = gouvList;
  }

  public List<String> getMairieList() {
    return mairieList;
  }

  public void setMairieList(List<String> mairieList) {
    this.mairieList = mairieList;
  }

  public List<String> getTahanList() {
    return tahanList;
  }

  public void setTahanList(List<String> tahanList) {
    this.tahanList = tahanList;
  }

  public Set<String> getGouvSet() {
    return gouvSet;
  }

  public void setGouvSet(Set<String> gouvSet) {
    this.gouvSet = gouvSet;
  }

  public Set<String> getMairieSet() {
    return mairieSet;
  }

  public void setMairieSet(Set<String> mairieSet) {
    this.mairieSet = mairieSet;
  }

  public Set<String> getTahanSet() {
    return tahanSet;
  }

  public void setTahanSet(Set<String> tahanSet) {
    this.tahanSet = tahanSet;
  }

  public Ville(String pNom, int pNbre, String pPays)

  {
    System.out.println("Création d'une ville avec des paramètres !");
    nomVille = pNom;
    nomPays = pPays;
    nbreHabitants = pNbre;

  }

  public String getNom() {
    return nomVille;
  }

  public String getNomPays() {
    return nomPays;
  }

  public int getNbreHabitants() {
    return nbreHabitants;
  }

  public char getCategorie() {
    return categorie;
  }

  public void setNom(String pNom) {
    nomVille = pNom;
  }

  public void setPays(String pPays) {
    nomPays = pPays;
  }

  public void setNbre(int pNbre) {
    nbreHabitants = pNbre;

  }

  private void setCategorie() {

    int bornesSuperieures[] = {1000, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    int i = 0;
    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])

      i++;

    this.categorie = categories[i];
  }

  public void setNombreHabitants(int nbre) {
    nbreHabitants = nbre;
    this.setCategorie();
  }

  public String Decrietoi() {
    return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : "
        + this.nbreHabitants + " habitant(s) => elle est donc de catégorie : " + this.categorie;
  }

}
