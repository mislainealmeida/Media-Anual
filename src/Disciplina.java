import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private List<Double> notasProva;
    private List<Double> notasTrabalho;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notasProva =  new ArrayList<>();
        this.notasTrabalho = new ArrayList<>();
    }

    public String getNomeDisciplina() {

        return nomeDisciplina;
    }

    public List<Double> getNotasProva() {

        return notasProva;
    }

    public void setNotasProva(List<Double> notasProva) {

        this.notasProva = notasProva;
    }

    public List<Double> getNotasTrabalho() {
        return notasTrabalho;
    }

    public void setNotasTrabalho(List<Double> notasTrabalho) {
        this.notasTrabalho = notasTrabalho;
    }

    public double calcularBimestre() {
        double somaProvas = notasProva.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        double somaTrabalho = notasTrabalho.stream().mapToDouble(Double::doubleValue)
                .sum();
        double notaBimestre = somaProvas + somaTrabalho;
        return notaBimestre;
    }

}
