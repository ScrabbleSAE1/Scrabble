public class MEE{  

    private int [] tabFreq;
    private int nbTotEx;

    // tabFreq[i] est le nombre d’exemplaires
    // (fréquence) de l’élément i
    // nombre total d’exemplaire
    
    
    /**
    * pré-requis : max >= 0
    * action : crée un multi-ensemble vide dont les éléments seront
    * inférieurs à max
    */
    public MEE (int max){
        this.tabFreq = new int[max];
        this.nbTotEx = 0;
    }

        /**
        * pré-requis : les éléments de tab sont positifs ou nuls
        * action : crée un multi-ensemble dont le tableau de fréquences est une copie de tab
        */
        public MEE (int[] tab){
            this.tabFreq = tab;
        }
        
    /**
    * constructeur par copie
    */
    public MEE (MEE e){
         this.tabFreq=e.tabFreq;
         this.nbTotEx=e.nbTotEx;
    }
        /**
        * résultat : vrai ssi cet ensemble est vide
        */
        public boolean estVide (){
        int i=0;
        boolean Vide=true;
        while (i < this.tabFreq.length || Vide){
               if(e.tabFreq[i]!=""){
                   Vide=false;
                   i++;
        }
        return Vide;
        }
    }
          
        /**
        * pré-requis : 0 <= i < tabFreq.length
        * action : ajoute un exemplaire de i à this
        */
        public void ajoute (int i) {
            this.tabFreq[i]+=1;
        }
        /**
        * pré-requis : 0 <= i < tabFreq.length
        * action/résultat : retire un exemplaire de i de this s’il en existe, * et retourne vrai ssi cette action a pu être effectuée
        */
        public boolean retire (int i) {
        boolean retirer =false;
        if(this.tabFreq[i]==0){
           this.tabFreq[i]-=1;
            retirer=true;
        }
        return retirer;
        }
        /**
        * pré-requis : this est non vide
        * action/résultat : retire de this un exemplaire choisi aléatoirement
        * et le retourne
        */
        public int retireAleat () {
        int i=Ut.randomMinMax(0,this.tabFreq.length);
        while(this.tabFreq[i]==0){
            i=Ut.randomMinMax(0,this.tabFreq.length);
        }
        this.tabFreq[i]-=1;
        return i;
        }
        /**
        * pré-requis : 0 <= i < tabFreq.length
        * action/résultat : transfère un exemplaire de i de this vers e s’il
        * en existe, et retourne vrai ssi cette action a pu être effectuée */
        public boolean transfere (MEE e, int i) {
        boolean transferer=false;
        if(this.tabFreq[i]!=0){
           this.tabFreq.retire(i);
           e.tabFreq.ajoute(i);
        }
        return transferer;
        }
        /** pré-requis : k >= 0
        * action : tranfère k exemplaires choisis aléatoirement de this vers e * dans la limite du contenu de this
        * résultat : le nombre d’exemplaires effectivement transférés
        */
        public int transfereAleat (MEE e, int k) {
        assert k<this.nbTotEx;
        while (k>0){ 
                boolean vide=true;
                while(vide){
                      int i=random.nextIn(this.tabFreq.length);
                      if(this.java[i]=""){
                        this.tabFreq.retire(i);
                        e.tabFreq.ajoute(i);
                        vide=false;
                        }
                          k--; 
                     }
                }
             }
        /**
        * pré-requis : tabFreq.length <= v.length
        * résultat : retourne la somme des valeurs des exemplaires des
        * éléments de this, la valeur d’un exemplaire d’un élément i
        * de this étant égale à v[i]
        */
        public int sommeValeurs (int[] v){
                int somme=0;
            for(i=0;i<this.tabFreq.length;i++){
                somme=this.tabFreq[i]*v[i];
        }
            return somme;
    }
}
