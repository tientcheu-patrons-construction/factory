public class ProduitFactoryC extends ProduitFactory {
    public ProduitFactoryC() {}

    @Override
    protected Produit createProduit() {
        return new ProduitC();
    }
}
