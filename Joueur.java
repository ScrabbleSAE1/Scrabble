public class Joueur {

    private String nom;
    private MEE chevalet;
    private int score;
      
    public Joueur(String unNom){
        this.nom=unNom;
        this.chevalet=null;
        this.score=0;
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
    }
/**
* pré-requis : nbPointsJet indique le nombre de points rapportés par
* chaque jeton/lettre
* résultat : le nombre de points total sur le chevalet de ce joueur
* suggestion : bien relire la classe MEE !
*/
public int nbPointsChevalet (int[] nbPointsJet){
    return(this.chevalet.sommeValeurs(nbPointsJet));
    }

/**
* pré-requis : les éléments de s sont inférieurs à 26
* action : simule la prise de nbJetons jetons par this dans le sac s,
* dans la limite de son contenu.
*/

public void prendJetons (MEE s, int nbJetons) {
    s.transfereAleat(this.chevalet,nbJetons);
}

/**
* pré-requis : les éléments de s sont inférieurs à 26
* et nbPointsJet.length >= 26
* action : simule le coup de this : this choisit de passer son tour,
* d’échanger des jetons ou de placer un mot
* résultat : -1 si this a passé son tour, 1 si son chevalet est vide,
* et 0 sinon
*/
public int joue(Plateau p, MEE s, int[] nbPointsJet) {
    char choix=Ut.saisirCaractere();
    int resultat=0;
    if(choix=='s'){
       resultat=-1;
    }
    else if(choix=='e'){
        resultat=1;
    }
    else if(choix=='p'){
        resultat=1;
    }
    if(s.estVide()){
        resultat=0;
    }
    return resultat;
}
}

/** pré-requis : les éléments de s sont inférieurs à 26
* et nbPointsJet.length >= 26
* action : simule le placement d’un mot de this :
* a) le mot, sa position sur le plateau et sa direction, sont saisis
* au clavier
* b) vérifie si le mot est valide
* c) si le coup est valide, le mot est placé sur le plateau
* résultat : vrai ssi ce coup est valide, c’est-à-dire accepté par
* CapeloDico et satisfaisant les règles détaillées plus haut
* stratégie : utilise la méthode joueMotAux
*/
/**public boolean joueMot(Plateau p, MEE s, int[] nbPointsJet) {
}
}*/
