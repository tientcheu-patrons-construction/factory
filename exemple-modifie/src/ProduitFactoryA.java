public class ProduitFactoryA extends ProduitFactory {
    public ProduitFactoryA() {}
    
    @Override 
    protected Produit createProduit() {
        return new ProduitA();
    }

}