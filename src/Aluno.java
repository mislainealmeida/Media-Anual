import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nomeAluno;
    private String matricula;
    private String turma;
    private List<Disciplina> disciplinas;

    public Aluno(String nomeAluno, String matricula, String turma) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.turma = turma;
        this.disciplinas = new ArrayList<>();
    }

    public String getNomeAluno() {

        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {

        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {

        return matricula;
    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }

    public String getTurma() {

        return turma;
    }

    public void setTurma(String turma) {

        this.turma = turma;
    }

    public List<Disciplina> getDisciplinas() {

        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {

        disciplinas.add(disciplina);
    }

    public double calcularMediaAnual(String nomeDisciplina) {
        double somaAnual = disciplinas.stream()
                .filter(disciplina -> disciplina.getNomeDisciplina().equals(nomeDisciplina))
                .mapToDouble(Disciplina::calcularBimestre)
                .reduce(0.0, Double::sum);

       double mediaAnual = somaAnual/4;
       return mediaAnual;
        }

    public String verificarStatus(String nomeDisciplina) {
        double mediaAnual = calcularMediaAnual(nomeDisciplina);
        if (mediaAnual >= 7) {
            return "Aprovado";
        } else if (mediaAnual >= 4 && mediaAnual < 7) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void imprimirInformacoesAluno(){
        System.out.println("Aluno: " + getNomeAluno());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Turma: " + getTurma());
        System.out.println();

    }

    public void imprimirInformacoesDisciplina(int index, String nomeDisciplina){
        System.out.println("Disciplina: " + disciplinas.get(index).getNomeDisciplina());
        System.out.println("Média anual: " + calcularMediaAnual(nomeDisciplina));
        System.out.println("Status: " + verificarStatus(nomeDisciplina));
        System.out.println("------------------");

    }
}


