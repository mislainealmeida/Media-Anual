import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Helena", "12345", "Turma A");
        List<Disciplina> disciplinas= new ArrayList<>();

        disciplinas.add(new Disciplina("Química"));
        aluno.adicionarDisciplina(disciplinas.get(0));
        disciplinas.get(0).getNotasProva().add(8.0);
        disciplinas.get(0).getNotasProva().add(8.0);
        disciplinas.get(0).getNotasProva().add(8.0);
        disciplinas.get(0).getNotasProva().add(8.0);
        disciplinas.get(0).getNotasTrabalho().add(2.0);
        disciplinas.get(0).getNotasTrabalho().add(2.0);
        disciplinas.get(0).getNotasTrabalho().add(2.0);
        disciplinas.get(0).getNotasTrabalho().add(2.0);


        disciplinas.add(new Disciplina("Português"));
        aluno.adicionarDisciplina(disciplinas.get(1));
        disciplinas.get(1).getNotasProva().add(1.0);
        disciplinas.get(1).getNotasProva().add(1.0);
        disciplinas.get(1).getNotasProva().add(1.0);
        disciplinas.get(1).getNotasProva().add(1.0);
        disciplinas.get(1).getNotasTrabalho().add(0.0);
        disciplinas.get(1).getNotasTrabalho().add(0.0);
        disciplinas.get(1).getNotasTrabalho().add(0.0);
        disciplinas.get(1).getNotasTrabalho().add(0.0);

        disciplinas.add(new Disciplina("História"));
        aluno.adicionarDisciplina(disciplinas.get(2));
        disciplinas.get(2).getNotasProva().add(3.0);
        disciplinas.get(2).getNotasProva().add(2.0);
        disciplinas.get(2).getNotasProva().add(1.0);
        disciplinas.get(2).getNotasProva().add(4.0);
        disciplinas.get(2).getNotasTrabalho().add(2.0);
        disciplinas.get(2).getNotasTrabalho().add(1.0);
        disciplinas.get(2).getNotasTrabalho().add(2.0);
        disciplinas.get(2).getNotasTrabalho().add(2.0);

        aluno.imprimirInformacoesAluno();
        aluno.imprimirInformacoesDisciplina(0,"Química");
        aluno.imprimirInformacoesDisciplina(1,"Português");
        aluno.imprimirInformacoesDisciplina(2,"História");


    }
}

