public class Professor {

    public int numero;
    public String nomePropio;
    public String nomeApelido;
    public int anoNascimento;
    public String area;

    // construtor vazio
    public Professor() {
        numero = 0;
        nomePropio = "";
        nomeApelido = "";
        anoNascimento = 0;
        area = "";
    }

    // construtor
    public Professor(int numero, String nomePropio, String nomeApelido, int anoNascimento, String area) {
        this.numero = numero;
        this.nomePropio = nomePropio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.area = area;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNomePropio() {
        return nomePropio;
    }
    public void setNomePropio(String nomePropio) {
        this.nomePropio = nomePropio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * método que devolve o nome do Professor */
    public String getNomeCompleto() {
        return nomePropio + nomeApelido;
    }

    @Override
    public String toString() {
        return "Professor [numero=" + numero + ", nomePropio=" + nomePropio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", area=" + area + "]";
    }
}