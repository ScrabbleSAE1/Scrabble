public class Plateau{
  private Case [][] g; // g pour grille

  public Plateau(){
    int [][] plateau = {
      {5,1,1,2,1,1,1,5,1,1,1,2,1,1,5},
      {1,4,1,1,1,3,1,1,1,3,1,1,1,4,1},
      {1,1,4,1,1,1,2,1,2,1,1,1,4,1,1},
      {2,1,1,4,1,1,1,2,1,1,1,4,1,1,2},
      {1,1,1,1,4,1,1,1,1,1,4,1,1,1,1},
      {1,3,1,1,1,3,1,1,1,3,1,1,1,3,1},
      {1,1,2,1,1,1,2,1,2,1,1,1,2,1,1},
      {5,1,1,2,1,1,1,4,1,1,1,2,1,1,5},
      {1,1,2,1,1,1,2,1,2,1,1,1,2,1,1},
      {1,3,1,1,1,3,1,1,1,3,1,1,1,3,1},
      {1,1,1,1,4,1,1,1,1,1,4,1,1,1,1},
      {2,1,1,4,1,1,1,2,1,1,1,4,1,1,2},
      {1,1,4,1,1,1,2,1,2,1,1,1,4,1,1},
      {1,4,1,1,1,3,1,1,1,3,1,1,1,4,1},
      {5,1,1,2,1,1,1,5,1,1,1,2,1,1,5}};
  
    this.g=new Case[15][15];


    for (int i=0; i!=plateau.length;i++){
      for (int j=0; j!=plateau[i].length;j++){
        g[i][j]= new Case(plateau[i][j]);
      }
    }
  }
  


  /**
  * résultat : chaîne décrivant ce Plateau
  */
  public String toString(){
  String affichage="";
    for(int i=0;i<this.g.length;i++){
      affichage += "\n";
      for(int k=0;k<this.g.length+1;k++){affichage +="----";}
      affichage+="\n | ";
      for(int j=0;j<this.g[i].length;j++){
        char Lettre = g[i][j].getLettre();
        if(Lettre==' '){
          int couleur = g[i][j].getCouleur();
          if(couleur!=1){affichage += couleur +" | " ;}
          else{affichage+=' ' +" | ";}
        }
        else{
          affichage += Lettre +" | " ;
        }
      }
    }
  return affichage;
  }

  public static void main(String args[]){ 
    Plateau p=new Plateau();
    System.out.println(p);
  }
  
/**
* pré-requis : mot est un mot accepté par CapeloDico,
* 0 <= numLig <= 14, 0 <= numCol <= 14, sens est un élément
* de {’h’,’v’} et l’entier maximum prévu pour e est au moins 25
* résultat : retourne vrai ssi le placement de mot sur this à partir
* de la case (numLig, numCol) dans le sens donné par sens à l’aide
* des jetons de e est valide.
*/

public boolean placementValide(String mot, int numLig, int numCol,char sens, MEE e) {
  boolean placement = false;
  int k=0;
  int j=numCol;
  int i=numLig;
  int tab[] = e.tabFreq;
  boolean lettre_dispo = true;
  boolean case_vide_autour = true;
  boolean au_moins_un = false;
  if(e.estVide()){
    if(mot.length() <= 2){return placement;}
    while(k<mot.length() && e.tabFreq[k] !=0 && lettre_dispo){ 
      if (e.tabFreq[k] == 0){
        lettre_dispo = false;
        placement = false;}
      else if (k == mot.length() && lettre_dispo){placement = true;}
      k += 1;
    }
    if(sens == 'h' && numLig == 8){
      while(j<mot.length() || placement == false){
        if(j == 8){placement = true;}
        j += 1;
      }
    }
    else if(sens == 'v' && numCol == 8){
      while(i<mot.length() || placement == false){
        if(i == 8){placement = true;}
        i += 1;
      }
    }
  }
  else{
    if(sens == 'h'){//vérifie les cases à gauche et à droite de la zone
      if(j>=0 && j<=15){
        if(this.g[i][j-1].estRecouverte()){case_vide_autour = false;} //1ere case "gauche"
        if(this.g[i][j+mot.length()].estRecouverte()){case_vide_autour = false;}//dernière case "droite"
      }
    }
    else if(sens == 'v'){//vérifie les cases autour verticalement
      if(i>=0 && i<=15){
        if(this.g[i-1][j].estRecouverte()){case_vide_autour = false;} //1ere case "gauche"
        if(this.g[i+mot.length()][j].estRecouverte()){case_vide_autour = false;}//dernière case "droite"
      }
    }
    if(sens == 'h'){
      while(k<mot.length() && j<=15 && au_moins_un == false){
        if(this.g[i][j].estRecouverte()){au_moins_un = false;}
        k+=1;
        j+=1;
    }
  }
  else if(sens == 'v'){
    while(k<mot.length() && i<=15 && au_moins_un == false){
      if(this.g[i][j].estRecouverte()){au_moins_un = false;}
      k+=1;
      i+=1;
    }
  }
    k = 0;
    while(k<mot.length() && e.tabFreq[k] !=0){ 
      if (e.tabFreq[k] == 0){
        lettre_dispo = false;
        placement = false;}
      else if (k == mot.length() && lettre_dispo){placement = true;}
      k += 1;
   }
  }
  return placement;
  }

  /**
  * pré-requis : le placement de mot sur this à partir de la case
  * (numLig, numCol) dans le sens donné par sens est valide
  * résultat : retourne le nombre de points rapportés par ce placement, le
  * nombre de points de chaque jeton étant donné par le tableau nbPointsJet.
  */
  public int nbPointsPlacement(String mot, int numLig, int numCol,char sens, int[] nbPointsJet){
    int nbPoint = 0;
    while
    return nbPoint;
  }
}
