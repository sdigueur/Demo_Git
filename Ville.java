import java.util.List;

public class Ville {
  private String nomVille;
  private String nomPays;
  private int nbreHabitants;
  private char categorie;

  private List<String> gouvList;
  private List<String> mairieList;
  private List<String> tahanList;

  public Ville() {
    System.out.println("Création d'une ville !");
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
    this.setCategorie();
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
