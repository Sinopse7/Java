public class Cliente {
    private String nome;
    private int telemovel;
    private String email;

    public Cliente(String nome, int telemovel, String email) {
        this.nome = nome;
        this.telemovel = telemovel;
        this.email = email;
    }

    public Cliente() {
        this.nome = "";
        this.telemovel = 0;
        this.email = "";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelemovel() {
        return telemovel;
    }
    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    /*** 
     * método que mostra uma msg com as infos da Cliente
    */
    /*
    public void info(){
        System.out.println("\n---< Info Cliente >---\n");
        System.out.println("Nome: " + getNome());
        System.out.println("Telemovel: " + getTelemovel());
        System.out.println("Email: " + getEmail());
    }
    */

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", telemovel=" + telemovel + ", email=" + email + "]";
    }

    
}

