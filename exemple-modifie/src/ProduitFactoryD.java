public class ProduitFactoryD extends ProduitFactory {
    public ProduitFactoryD() {}

    @Override
    protected Produit createProduit() {
        return new ProduitD();
    }
}
