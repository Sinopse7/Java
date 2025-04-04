class Main {
    public static void main(String[] args) {
    
        Professor professor = new Professor(12345, "LUIS", "SANTOS", 1999, "PROGRAMACAO");
        
        Turma turma1p = new Turma("CX12345", "PROGRAMADOR DE INFORMATICA", 2023, 2026);

        Aluno aluno1 = new Aluno("A11111", "SAMUEL", "TORRES", 2009, turma1p);
        Aluno aluno2 = new Aluno("A22222", "FREDERICO", "FONSECA", 1532, turma1p);
        Aluno aluno3 = new Aluno("A33333", "RUBEN", "ALVES", 1902, turma1p);

        System.out.println("\n---< professor >---\n");
        System.out.println(professor.toString());
        System.out.println(professor.getNomeCompleto());

        System.out.println("\n---< turma1p >---\n");
        System.out.println(turma1p.toString());
        System.out.println(turma1p.getInfoTurma());

        System.out.println("\n---< aluno1 >---\n");
        System.out.println(aluno1.toString());
        System.out.println(aluno1.getNomeCompleto());
        System.out.println(aluno1.getIdade());

        System.out.println("\n---< aluno2 >---\n");
        System.out.println(aluno2.toString());
        System.out.println(aluno2.getNomeCompleto());
        System.out.println(aluno2.getIdade());

        System.out.println("\n---< aluno3 >---\n");
        System.out.println(aluno3.toString());
        System.out.println(aluno3.getNomeCompleto());
        System.out.println(aluno3.getIdade());

    }
}
