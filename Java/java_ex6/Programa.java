class Programa {
    public static void main(String[] args) {
        Moradia M1 = new Moradia();
        Moradia M2 = new Moradia();

        Localizacao local1 = new Localizacao();
        Localizacao local2 = new Localizacao();

        Cliente cli1 = new Cliente("Samuel", 930000000, "abc@sapo.pt");

        cli1.toString();

        local1.setPais("Portugal");
        local1.setDistrito("Porto");
        local1.setConcelho("Santo Tirso");
        local1.setLocalidade("Rebordões");
        local1.setCodigoPostal("0000-000");
        local1.setLatitude("0");
        local1.setLongitude("0");

        local1.toString();

        local2.setPais("Portugal");
        local2.setDistrito("Porto");
        local2.setConcelho("Santo Tirso");
        local2.setLocalidade("S. Martinho");
        local2.setCodigoPostal("1111-111");
        local2.setLatitude("1");
        local2.setLongitude("1");

        local2.toString();

        M1.tipologia = "T1";
        M1.numeroDeQuartos = 1;
        M1.numeroDeWC = 1;
        M1.localidade = "Santo Tirso";
        M1.precoDeCompra = 100000;
        M1.precoDeVenda = 111000;

        M1.info();

        M2.tipologia = "T2";
        M2.numeroDeQuartos = 2;
        M2.numeroDeWC = 2;
        M2.localidade = "Famalicao";
        M2.precoDeCompra = 200000;
        M2.precoDeVenda = 222000;
        
        M2.info();
        
    }
}