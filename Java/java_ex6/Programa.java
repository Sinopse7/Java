class Programa {

    public static void main(String[] args) {
        Moradia M1 = new Moradia();
        Moradia M2 = new Moradia();

        M1.tipologia = "T1";
        M1.numeroDeQuartos = 1;
        M1.numeroDeWC = 1;
        M1.localidade = "Santo Tirso";
        M1.preçoDeCompra = 100000;
        M1.preçoDeVenda = 175000;

        M1.info();

        M2.tipologia = "T2";
        M2.numeroDeQuartos = 2;
        M2.numeroDeWC = 2;
        M2.localidade = "Famalicao";
        M2.preçoDeCompra = 200000;
        M2.preçoDeVenda = 275000;
        
        M2.info();
        
    }
}