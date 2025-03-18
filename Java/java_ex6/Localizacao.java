public class Localizacao {

    private String pais;
    private String distrito;
    private String concelho;
    private String localidade;
    private String codigoPostal;
    private String latitude;
    private String longitude;

    /***
     * CONSTRUTOR VAZIO
     */
    public Localizacao(){
        pais = "";
        distrito = "";
        concelho = "";
        localidade = "";
        codigoPostal = "";
        latitude = "";
        longitude = "";
    }

    /***
     * CONSTRUTOR
     */
    public Localizacao(String paisx, String distritox, String concelhox, String localidadex, String codigoPostalx, String latitudex, String longitudex){
        pais = paisx;
        distrito = distritox;
        concelho = concelhox;
        localidade = localidadex;
        codigoPostal = codigoPostalx;
        latitude = latitudex;
        longitude = longitudex;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String x){
        pais = x;
    }

    public String getDistrito(){
        return distrito;
    }

    public void setDistrito(String x){
        distrito = x;
    }

    public String getConcelho(){
        return concelho;
    }

    public void setConcelho(String x){
        concelho = x;
    }

    public String getLocalidade(){
        return localidade;
    }

    public void setLocalidade(String x){
        localidade = x;
    }

    public String getCodigoPostal(){
        return codigoPostal;
    }

    public void setCodigoPostal(String x){
        codigoPostal = x;
    }

    public String getLatitude(){
        return latitude;
    }

    public void setLatitude(String x){
        latitude = x;
    }

    public String getLongitude(){
        return longitude;
    }

    public void setLongitude(String x){
        longitude = x;
    }

    /*** 
     * método que mostra uma msg com as infos da Localizao
    */
    public void infoLocalizacao(){
        System.out.println("\n---< Info Localizacao >---\n");
        System.out.println("Pais: " + getPais());
        System.out.println("Distrito: " + getDistrito());
        System.out.println("Concelho: " + getConcelho());
        System.out.println("Localidade: " + getLocalidade());
        System.out.println("CodigoPostal: " + getCodigoPostal());
        System.out.println("Latitude: " + getLatitude());
        System.out.println("Longitude: " + getLongitude());
    }
}