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
  int tab[] = e.tabFreq;
  if(e.estVide()){
    if(mot.length() <= 2){return placement;}
    while(k<mot.length() || e.tabFreq[k] !=0){ 
      
    }
    if(sens == 'h' && numLig == 8){
      while(j<mot.length() || placement == false){
        j += 1;
        if(j == 8){placement = true;}
      }
    }
  }
}

