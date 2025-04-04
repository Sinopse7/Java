public class Turma {

    private String codigo;
    private String nomeCurso;
    private int anoInicio;
    private int anoFim;

    // construtor vazio
    public Turma() {
        codigo = "";
        nomeCurso = "";
        anoInicio = 0;
        anoFim = 0;
    }
    
    // construtor
    public Turma(String codigo, String nomeCurso, int anoInicio, int anoFim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int getAnoInicio() {
        return anoInicio;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
    public int getAnoFim() {
        return anoFim;
    }
    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    /**
     * método que devolve a Informação tratada e visivelmente bem formada separada por Linhas e com a identificação em Letras Normais, e o que está na Informação dos atributos, em CAPS LOCK */
    public String getInfoTurma() {
        return  ("\n---< Info Turma >---") + 
                ("\n codigo: " + codigo) +
                ("\n nomeCurso: " + nomeCurso) +
                ("\n anoInicio: " + anoInicio) +
                ("\n anoFim: " + anoFim + "\n");
    }

    @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", anoInicio=" + anoInicio + ", anoFim="
                + anoFim + "]";
    }

}
