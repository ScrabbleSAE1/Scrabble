public class Scrabble{

    private static int [] nbPointsJeton = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 8, 1, 2, 1, 1, 3, 8, 1, 1, 1, 1, 4, 10, 10, 10, 10 };
    private Joueur[] joueurs;
    private int numJoueur; // joueur courant (entre 0 et joueurs.length-1)
    private Plateau plateau;
    private MEE sac;


    public Scrabble (String [] noms){
        for(int i=0; i<joueurs.length-1;i+=1){
            this.joueurs[i]=new Joueur(noms [i]);
        }
        this.numJoueur=Ut.randomMinMax(0,joueurs.length-1);
        this.plateau=new Plateau();
        int[] lettres = {9, 2, 2, 3, 15, 2, 2, 2, 8, 1, 1, 5, 3, 6, 6, 2, 1, 6, 6, 6, 6, 2, 1, 1, 1, 1};
        this.sac=new MEE(lettres);
     }

    public String toString(){
        return("\n"+ plateau.toString() +" Joueur : "+this.numJoueur);
    }
    
    
    }
