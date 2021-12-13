public class Case{
  private int uneCouleur;
  private char Lettre;
  /**
  * pré-requis : uneCouleur est un entier entre 1 et 5
  * action : constructeur de Case
  */
  public Case (int uneCouleur){
    this.uneCouleur=uneCouleur;
  }

  /**
  * résultat : la couleur de this, un nombre entre 1 et 5
  */
  public int getCouleur (){
      return(this.uneCouleur);
  }

  /**
  * pré-requis : cette case est recouverte
  */
  public char getLettre (){
    return this.Lettre;
  /**
  * pré-requis : let est une lettre majuscule
  */
  public void setLettre (char let){
    this.Lettre=let;
  }

  /**
  * résultat : vrai ssi la case est recouverte par une lettre
  */
  public boolean estRecouverte (){
    boolean recouverte=false;
    if(this.Lettre!=""){recouverte=true;}
    return recouverte;
  }
  public String toString (){
   return ("uneCouleur : "+ this.uneCouleur + "Lettre : "+ this.Lettre);
 }
