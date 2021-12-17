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
          affichage += couleur +" | " ;
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
}
