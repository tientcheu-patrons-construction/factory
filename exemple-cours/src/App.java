public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        ProduitFactory produitFactoryA = new ProduitFactoryA();
        ProduitFactory produitFactoryB = new ProduitFactoryB();
        ProduitFactory produitFactoryC = new ProduitFactoryC();
        
        Produit produit = null;
        
        //afficher un produit de type A
        produit = produitFactoryA.getProduit();
        produit.methodeProduit();
        
        //afficher un produit de type B
        produit = produitFactoryB.getProduit();
        produit.methodeProduit();
        
        //afficher un produit de type C
        produit = produitFactoryC.getProduit();
        produit.methodeProduit();
    }
}
