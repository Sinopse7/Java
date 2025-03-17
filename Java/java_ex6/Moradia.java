public class Moradia {

    public String tipologia;
    public int numeroDeQuartos;
    public int numeroDeWC;
    public String localidade;
    public float preçoDeCompra;
    public float preçoDeVenda;
    
    /*** 
     * método que mostra uma msg com as infos da moradia
    */
    public void info(){
        System.out.println("\n---< Info Moradia >---\n");
        System.out.println("Tipologia: " + tipologia);
        System.out.println("Numero De Quartos: " + numeroDeQuartos);
        System.out.println("Numero De WC: " + numeroDeWC);
        System.out.println("Localidade: " + localidade);
        System.out.println("Preço De Compra: " + preçoDeCompra);
        System.out.println("Preço De Venda: " + preçoDeVenda);
    }
}