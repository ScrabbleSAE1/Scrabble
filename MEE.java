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
        /**
        * résultat : vrai ssi cet ensemble est vide
        */
        public boolean estVide (){
            int i=0;
            while (i < e.length || ){}
        /**
        * pré-requis : 0 <= i < tabFreq.length
        * action : ajoute un exemplaire de i à this
        */
        public void ajoute (int i) {
        /**
        * pré-requis : 0 <= i < tabFreq.length
        * action/résultat : retire un exemplaire de i de this s’il en existe, * et retourne vrai ssi cette action a pu être effectuée
        */
        public boolean retire (int i) {
        /**
        * pré-requis : this est non vide
        * action/résultat : retire de this un exemplaire choisi aléatoirement
        * et le retourne
        */
        public int retireAleat () {
        /**
        * pré-requis : 0 <= i < tabFreq.length
        * action/résultat : transfère un exemplaire de i de this vers e s’il
        * en existe, et retourne vrai ssi cette action a pu être effectuée */
        public boolean transfere (MEE e, int i) {
        /** pré-requis : k >= 0
        * action : tranfère k exemplaires choisis aléatoirement de this vers e * dans la limite du contenu de this
        * résultat : le nombre d’exemplaires effectivement transférés
        */
        public int transfereAleat (MEE e, int k) {
        }

        /**
        * pré-requis : tabFreq.length <= v.length
        * résultat : retourne la somme des valeurs des exemplaires des
        * éléments de this, la valeur d’un exemplaire d’un élément i
        * de this étant égale à v[i]
        */
        public int sommeValeurs (int[] v){

        }
    }