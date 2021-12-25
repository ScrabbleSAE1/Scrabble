public class Joueur {

    private String nom;
    private MEE chevalet;
    private int score;
      
    public Joueur(String unNom){
        this.nom=unNom;
    }
    public String toString(){
        return("nom : "+ this.nom + " chevalet : "+ this.chevalet + "score : " +this.score);
    }
    public int getScore(){
        return score;
    }
    public void ajouteScore(int nb){
       int nbMax=0;
        if(nb>nbMax){
            this.score=nbMax;
        }
        else if(nb<0){
            this.score=0;
        }
        else{ 
            this.score=nb;
        }
/**
* pré-requis : nbPointsJet indique le nombre de points rapportés par
* chaque jeton/lettre
* résultat : le nombre de points total sur le chevalet de ce joueur
* suggestion : bien relire la classe MEE !
*/
public int nbPointsChevalet (int[] nbPointsJet){
    
}
