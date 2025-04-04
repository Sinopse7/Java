import java.util.Calendar; //package de calendario que aqui sera usado no getIdade()

public class Aluno {

    public String codigo;
    public String nomePropio;
    public String nomeApelido;
    public int anoNascimento;
    public Turma turma;

    // construtor vazio
    public Aluno() {
        codigo = "";
        nomePropio = "";
        nomeApelido = "";
        anoNascimento = 0;
    }

    // construtor
    public Aluno(String codigo, String nomePropio, String nomeApelido, int anoNascimento, Turma turma) {
        this.codigo = codigo;
        this.nomePropio = nomePropio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.turma = turma;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    /**
     * método que devolve o nome completo do Aluno */
    public String getNomeCompleto() {
        return getNomePropio() + getNomeApelido();
    }

    /**
     * método que devolve devolve a idade do Aluno */
    public int getIdade() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR); // obter o ano em que esta
        return currentYear - getAnoNascimento(); //ano atual - ano de nascimento = idade do aluno
    }

    @Override
    public String toString() {
        return "Aluno [codigo=" + codigo + ", nomePropio=" + nomePropio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", turma=" + turma + "]";
    }
}