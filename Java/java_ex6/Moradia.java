public class Moradia {

    public String tipologia;
    public int numeroDeQuartos;
    public int numeroDeWC;
    public Localizacao localizacao;
    public float precoDeCompra;
    public float precoDeVenda;

    /*** 
     * método que mostra uma msg com as infos da moradia
    */
    public void info(){
        System.out.println("\n---< Info Moradia >---\n");
        System.out.println("Tipologia: " + tipologia);
        System.out.println("Numero De Quartos: " + numeroDeQuartos);
        System.out.println("Numero De WC: " + numeroDeWC);
        System.out.println("Localidade: " + localizacao);
        System.out.println("Preço De Compra: " + precoDeCompra);
        System.out.println("Preço De Venda: " + precoDeVenda);
    }

    @Override
    public String toString() {
        return "Moradia [tipologia=" + tipologia + ", numeroDeQuartos=" + numeroDeQuartos + ", numeroDeWC=" + numeroDeWC
                + ", localidade=" + localizacao + ", precoDeCompra=" + precoDeCompra + ", precoDeVenda=" + precoDeVenda
                + "]";
    }

}