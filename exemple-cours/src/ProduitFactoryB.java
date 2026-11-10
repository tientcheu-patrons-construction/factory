public class ProduitFactoryB extends ProduitFactory {
    public ProduitFactoryB() {}

    @Override
    protected Produit createProduit() {
        return new ProduitB();
    }
}
