class Aluno {
    protected String nomeCompleto;
    protected String matricula;
    protected String rg;
    protected String cpf;
    protected Integer serie;
    protected String atividadesExtracurriculares;
    protected double notaFinal;
    protected double frequencia;
    protected Responsavel responsavel;

    public Aluno(String nomeCompleto, String matricula, String rg, String cpf, Integer serie, String atividadesExtracurriculares, double notaFinal, double frequencia, Responsavel responsavel) 
    {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.rg = rg;
        this.cpf = cpf;
        this.serie = serie;
        this.atividadesExtracurriculares = atividadesExtracurriculares;
        this.notaFinal = notaFinal;
        this.frequencia = frequencia;
        this.responsavel = responsavel;
    }

    public void processarAcao() {
        System.out.println("Processando ação para o(a) aluno(a): " + nomeCompleto);
    }

    @Override
    public String toString() {
        return "\nNome: " + nomeCompleto +
               "\nMatrícula: " + matricula +
               "\nRG: " + rg +
               "\nCPF: " + cpf +
               "\nSérie: " + serie +
               "\nAtividades Extracurriculares: " + atividadesExtracurriculares +
               "\nNota Final: " + notaFinal +
               "\nFrequência: " + frequencia +
               "\nResponsável: " + responsavel.getNomeCompleto();
    }
}

class Responsavel {
    private String nomeCompleto;
    private String rg;
    private String cpf;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public Responsavel(String nomeCompleto, String rg, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
    }
}

class Matricula extends Aluno {
    public Matricula(String nomeCompleto, String matricula, String rg, String cpf, Integer serie, String atividadesExtracurriculares, double notaFinal, double frequencia, Responsavel responsavel) {
        super(nomeCompleto, matricula, rg, cpf, serie, atividadesExtracurriculares, notaFinal, frequencia, responsavel);
    }

    @Override
    public void processarAcao() {
        System.out.println("Realizando matrícula do(a) aluno(a) " + nomeCompleto);
        System.out.println("Aluno(a) cadastrado na série: " + serie);
    }
}

class Rematricula extends Aluno {

    public Rematricula(String nomeCompleto, String matricula, String rg, String cpf, Integer serie, String atividadesExtracurriculares, double notaFinal, double frequencia, Responsavel responsavel) {
        super(nomeCompleto, matricula, rg, cpf, serie, atividadesExtracurriculares, notaFinal, frequencia, responsavel);
    }

    @Override
    public void processarAcao() {
        System.out.println("Realizando rematrícula do(a) aluno(a) " + nomeCompleto);
        if (notaFinal < 6.0 || frequencia < 75.0) {
            System.out.println("Aluno " + nomeCompleto + " foi reprovado e será rematriculado na mesma série: " + serie);
        } else {
            System.out.println("Aluno(a) " + nomeCompleto + " Foi aprovado(a) e avançará para a próxima série: " + (serie + 1) + " Série." + " Série anterior: " + serie);
        }
    }
}

class Formado extends Aluno {
    public Formado(String nomeCompleto, String matricula, String rg, String cpf, Integer serie, String atividadesExtracurriculares, double notaFinal, double frequencia, Responsavel responsavel) {
        super(nomeCompleto, matricula, rg, cpf, serie, atividadesExtracurriculares, notaFinal, frequencia, responsavel);
    }

    @Override
    public void processarAcao() {
        System.out.println("Verificando requisitos de formação para: " + nomeCompleto);
        if (notaFinal >= 6.0 && frequencia >= 75.0) {
            System.out.println("Aluno " + nomeCompleto + " está apto a se formar!");
        } else {
            System.out.println("Aluno " + nomeCompleto + " não atende aos requisitos para formação.");
        }
    }
}

public class Escola {
    public static void main(String[] args) {
        Responsavel pai = new Responsavel("Carlos Silva", "123456789", "987.654.321-00");

        Aluno aluno1 = new Matricula("João Souza", "2023001", "11223344", "123.456.789-00", 5, "Futebol", 0.0, 0.0, pai);

        Aluno alunoRematricula = new Rematricula("Ana Pereira", "2022002", "22334455", "234.567.890-11", 5, "Banda", 8, 80.0, pai);

        Aluno alunoFormado = new Formado("Andre Matos", "2021003", "33445566", "345.678.901-22", 9, "Teatro", 7.0, 90.0, pai);
        
        Aluno[] alunos = {aluno1, alunoRematricula, alunoFormado};

        for (Aluno a : alunos) {
            a.processarAcao();
            System.out.println(a);
            System.out.println("-------------------------");
        }
    }
}