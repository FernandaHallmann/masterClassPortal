/*
/*
 *Classe : Curso 
 *Analista Responsável:  Eduardo
 *Desenvolvedor: Renan
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @analista Eduardo
 * @desenvolvedor renan
 *
 */
public class Curso {

    private int cargaHoraria;
    private String disciplina;
    private String turnoCurso;
    private String campusAcademico;
    ArrayList<Cadastro> cadastro;

    public Curso() {
        cadastro = new ArrayList<Cadastro>();
    }

    public void cadastrarCurso() {
        String disci;
        String turno;
        String campus;
        int carga;
        boolean cadastrar = true;

        try {

            while (cadastrar) {
                System.out.println("Informe a disciplina do curso: ");
                Scanner lerDisci = new Scanner(System.in);
                disci = lerDisci.nextLine();

                System.out.println("Informe qual o turno do curso: ");
                Scanner lerTurno = new Scanner(System.in);
                turno = lerTurno.nextLine();

                System.out.println("Informe qual é o campus do curso: ");
                Scanner lerCampus = new Scanner(System.in);
                campus = lerCampus.nextLine();

                System.out.println("Informe a  carga horaria do curso: ");
                Scanner lerCarga = new Scanner(System.in);
                carga = lerCarga.nextInt();

                cadastro.add(new Cadastro(campus, disci, turno, carga));

                for (int i = 0; i < cadastro.size(); i++) {
                    Cadastro listaCurso = cadastro.get(i);
                    System.out.println("\n========= Curso cadastrado com Sucesso!===========");
                    System.out.println("Curso: " + listaCurso.getDisciplina() + " - " + listaCurso.getTurno() + " - " + listaCurso.getCampus() + " - " + listaCurso.getCargaHoraria());
                }

                System.out.println("\nDeseja cadastrar mais um Curso? (S/N)");
                Scanner lerScanner = new Scanner(System.in);
                String resposta = lerScanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    cadastrar = true;
                } else {
                    cadastrar = false;
                }
            }

        } catch (Exception exception) {
            System.out.println("ERRO! Informe os dados corretamente");
            System.exit(1);
        }
    }

    public void removerCurso() {
        Scanner ler = new Scanner(System.in);

        if (this.cadastro.size() >= 0) {
            System.out.println("\n============== Cursos Cadastrados: ==============\n");
            for (Cadastro curso : cadastro) {
                System.out.println(curso.getDisciplina() + " - " + curso.getTurno());
            }
        } else {
            System.out.println("Nenhum curso Cadastrado");
            System.exit(1);
        }

        System.out.println("\nInforme qual curso você deseja remover: ");
        String curso = ler.nextLine();

        for (Cadastro cadastros : cadastro) {
            if (cadastros.getDisciplina().equals(curso)) {
                int i = cadastro.indexOf(cadastros);
                cadastro.remove(i);
                System.out.println("\nCurso Removido: " + cadastros.getDisciplina());
                return;
            } else {
                System.out.println("\nCurso não encontrado");
                System.exit(1);
            }
        }
    }

    public void cadastrarCargaHoraria() {

        int cargaNova;
        String campusCarga;
        String turnoCarga;
        String disciplinaCarga;
        boolean cadastrarCarga = true;

        try {
            while (cadastrarCarga) {

                System.out.println("Informe qual será a carga Horária: ");
                Scanner lerCarga = new Scanner(System.in);
                cargaNova = lerCarga.nextInt();

                System.out.println("Informe qual Campus será cadastrada essa carga Horária: ");
                Scanner lerCampus = new Scanner(System.in);
                campusCarga = lerCampus.nextLine();

                System.out.println("Informe qual turno será cadastrada essa carga Horária: ");
                Scanner lerTurno = new Scanner(System.in);
                turnoCarga = lerTurno.nextLine();

                System.out.println("Informe qual Disciplina será cadastrada essa carga Horária: ");
                Scanner lerDisciplina = new Scanner(System.in);
                disciplinaCarga = lerDisciplina.nextLine();

                cadastro.add(new Cadastro(campusCarga, disciplinaCarga, turnoCarga, cargaNova));

                for (int i = 0; i < cadastro.size(); i++) {
                    Cadastro listaCurso = cadastro.get(i);
                    System.out.println("\n========= Carga cadastrada com Sucesso!===========");
                    System.out.println("Carga Horária: " + listaCurso.getCargaHoraria() + " - " + listaCurso.getCampus() + " - " + listaCurso.getTurno() + " - " + listaCurso.getDisciplina());
                }

                System.out.println("\nDeseja cadastrar mais um Carga? (S/N)");
                Scanner lerScanner = new Scanner(System.in);
                String resposta = lerScanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    cadastrarCarga = true;
                } else {
                    cadastrarCarga = false;
                }
            }

        } catch (Exception exception) {
            System.out.println("ERRO! Informe os dados corretamente");
            System.exit(1);
        }
    }

    public void cadastrarTurno() {

        String turno = null;
        int opcao;
        int cargaTurno;
        String disciplinaTurno;
        String campusTurno;
        boolean cadastrarTurno = true;

        try {
            while (cadastrarTurno) {

                System.out.println("Qual turno será cadastrado: "
                        + "[1] Matutino"
                        + "[2] Vespertino"
                        + "[3] Noturno");
                Scanner lerTurno = new Scanner(System.in);
                opcao = lerTurno.nextInt();

                turno.valueOf(opcao);

                switch (opcao) {
                    case 1:
                        turno = "Matutino";
                        break;
                    case 2:
                        turno = "Vespertino";
                        break;
                    case 3:
                        turno = "Noturno";
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        return;
                }

                System.out.println("Informe qual displina receberá o turno novo: ");
                Scanner lerDisciplina = new Scanner(System.in);
                disciplinaTurno = lerDisciplina.nextLine();

                System.out.println("Informe qual o campus receberá o turno: ");
                Scanner lerCampus = new Scanner(System.in);
                campusTurno = lerCampus.nextLine();

                System.out.println("Informe qual a carga horária receberá o turno: ");
                Scanner lerCarga = new Scanner(System.in);
                cargaTurno = lerCarga.nextInt();

                cadastro.add(new Cadastro(campusTurno, disciplinaTurno, turno, cargaTurno));

                for (int i = 0; i < cadastro.size(); i++) {
                    Cadastro listaCurso = cadastro.get(i);
                    System.out.println("\n========= Turno cadastrada com Sucesso!===========");
                    System.out.println("Turno: " + listaCurso.getTurno() + " - " + listaCurso.getDisciplina() + " - " + listaCurso.getCampus() + " - " + listaCurso.getCargaHoraria());
                }

                System.out.println("\nDeseja cadastrar mais um Turno? (S/N)");
                Scanner lerScanner = new Scanner(System.in);
                String resposta = lerScanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    cadastrarTurno = true;
                } else {
                    cadastrarTurno = false;
                }
            }
        } catch (Exception exception) {
            System.out.println("ERRO! Informe os dados corretamente");
            System.exit(1);
        }

    }

    public void cadastrarTurma() {
        Scanner ler = new Scanner(System.in);

        String disciplinaTurma;
        String turnoTurma;
        String campusTurma;
        int aulas;
        boolean cadastrarTurma = true;

        try {
            while (cadastrarTurma) {

                System.out.println("Informe a disciplina da turma: ");
                Scanner lerTurma = new Scanner(System.in);
                disciplinaTurma = lerTurma.nextLine();

                System.out.println("Informe o turno da turma: ");
                Scanner lerTurno = new Scanner(System.in);
                turnoTurma = lerTurno.nextLine();

                System.out.println("Informe o campus: ");
                Scanner lerCampus = new Scanner(System.in);
                campusTurma = lerCampus.nextLine();

                System.out.println("Informe a quantidade de aulas: ");
                Scanner lerAulas = new Scanner(System.in);
                aulas = lerAulas.nextInt();

                cadastro.add(new Cadastro(campusTurma, disciplinaTurma, turnoTurma, aulas));

                for (int i = 0; i < cadastro.size(); i++) {
                    Cadastro listaTurma = cadastro.get(i);
                    System.out.println("========= Turma cadastrada com Sucesso!===========");
                    System.out.println("Turma: " + listaTurma.getDisciplina() + " - " + listaTurma.getTurno() + " - " + listaTurma.getCampus() + " - " + listaTurma.getCargaHoraria());
                }

                System.out.println("\nDeseja cadastrar mais um Turma? (S/N)");
                Scanner lerScanner = new Scanner(System.in);
                String resposta = lerScanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    cadastrarTurma = true;
                } else {
                    cadastrarTurma = false;
                }
            }
        } catch (Exception exception) {
            System.out.println("ERRO! Informe os dados corretamente");
            System.exit(1);
        }
    }

    public void editarTurno() {

        String editarTurno;
        String novoTurno = null;
        boolean editarNovoTurno = true;

        try {
            while (editarNovoTurno) {

                if (this.cadastro.size() >= 0) {
                    System.out.println("\n============== Turno Cadastrados: ==============\n");
                    for (Cadastro turno : cadastro) {
                        System.out.println(turno.getTurno() + " - " + turno.getDisciplina());
                    }
                } else {
                    System.out.println("Nenhum turno Cadastrado");
                    System.exit(1);
                }

                System.out.println("\nInforme qual turno deseja editar: ");
                Scanner ler = new Scanner(System.in);
                editarTurno = ler.nextLine();

                for (Cadastro cadastrosTurno : cadastro) {
                    if (cadastrosTurno.getTurno().equals(editarTurno)) {
                        int i = cadastro.indexOf(cadastrosTurno);
                        cadastro.remove(i);
                    }
                }

                System.out.println("Informe as novas informações do turno: ");

                System.out.println("Qual turno: "
                        + "[1] Matutino"
                        + "[2] Vespertino"
                        + "[3] Noturno");
                Scanner lerValorNovo = new Scanner(System.in);
                int opcao = lerValorNovo.nextInt();

                novoTurno.valueOf(opcao);

                switch (opcao) {
                    case 1:
                        novoTurno = "Matutino";
                        break;
                    case 2:
                        novoTurno = "Vespertino";
                        break;
                    case 3:
                        novoTurno = "Noturno";
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        return;
                }

                System.out.println("Informe qual displina receberá o turno novo: ");
                Scanner lerDisciplina = new Scanner(System.in);
                String novaDisciplinaTurno = lerDisciplina.nextLine();

                System.out.println("Informe qual o campus receberá o turno novo: ");
                Scanner lerCampus = new Scanner(System.in);
                String novaCampusTurno = lerCampus.nextLine();

                System.out.println("Informe qual a carga horária receberá o turno novo: ");
                Scanner lerCarga = new Scanner(System.in);
                int novaCargaTurno = lerCarga.nextInt();

                cadastro.add(new Cadastro(novaCampusTurno, novaDisciplinaTurno, novoTurno, novaCargaTurno));

                for (int i = 0; i < cadastro.size(); i++) {
                    Cadastro listaEditadaTurno = cadastro.get(i);
                    System.out.println("\n========= Turno editado com Sucesso!===========");
                    System.out.println("Turno: " + listaEditadaTurno.getTurno() + " - " + listaEditadaTurno.getDisciplina() + " - " + listaEditadaTurno.getCampus() + " - " + listaEditadaTurno.getCargaHoraria());
                }

                System.out.println("\nDeseja editar mais um Turno? (S/N)");
                Scanner lerScanner = new Scanner(System.in);
                String resposta = lerScanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    editarNovoTurno = true;
                } else {
                    editarNovoTurno = false;
                }
            }
        } catch (Exception exception) {
            System.out.println("ERRO! Informe um Turno corretamente");
            System.exit(1);
        }
    }

    public void editarTurma() {

        String editarTurma;
        boolean editarNovaTurma = true;

        try {
            while (editarNovaTurma) {

                if (this.cadastro.size() >= 0) {
                    System.out.println("\n============== Turmas Cadastradas: ==============\n");
                    for (Cadastro turma : cadastro) {
                        System.out.println(turma.getDisciplina() + " - " + turma.getTurno());
                    }
                } else {
                    System.out.println("Nenhuma turma cadastrada");
                    System.exit(1);
                }

                System.out.println("\nInforme qual turma deseja editar: ");
                Scanner ler = new Scanner(System.in);
                editarTurma = ler.nextLine();

                for (Cadastro cadastrosTurma : cadastro) {
                    if (cadastrosTurma.getDisciplina().equals(editarTurma)) {
                        int i = cadastro.indexOf(cadastrosTurma);
                        cadastro.remove(i);
                    }
                }

                System.out.println("Informe as novas informações da turma: \n");

                System.out.println("Informe a disciplina da turma: ");
                Scanner lerTurmaEditado = new Scanner(System.in);
                String disciplinaEditadaTurma = lerTurmaEditado.nextLine();

                System.out.println("Informe o turno da turma: ");
                Scanner lerTurnoEditado = new Scanner(System.in);
                String turnoEditadoTurma = lerTurnoEditado.nextLine();

                System.out.println("Informe o campus: ");
                Scanner lerCampusEditado = new Scanner(System.in);
                String campusEditadoTurma = lerCampusEditado.nextLine();

                System.out.println("Informe a quantidade de aulas: ");
                Scanner lerAulasEditado = new Scanner(System.in);
                int aulasEditadaTurma = lerAulasEditado.nextInt();

                cadastro.add(new Cadastro(campusEditadoTurma, disciplinaEditadaTurma, turnoEditadoTurma, aulasEditadaTurma));

                for (int i = 0; i < cadastro.size(); i++) {
                    Cadastro listaEditadaTurma = cadastro.get(i);
                    System.out.println("========= Turma editada com Sucesso!===========");
                    System.out.println("Turma: " + listaEditadaTurma.getDisciplina() + " - " + listaEditadaTurma.getTurno() + " - " + listaEditadaTurma.getCampus() + " - " + listaEditadaTurma.getCargaHoraria());
                }

                System.out.println("\nDeseja editar mais uma Turma? (S/N)");
                Scanner lerScanner = new Scanner(System.in);
                String resposta = lerScanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    editarNovaTurma = true;
                } else {
                    editarNovaTurma = false;
                }
            }
        } catch (Exception exception) {
            System.out.println("ERRO! Informe os dados corretamente");
            System.exit(1);
        }
    }

    public void editarCargaHoraria() {

        String editarCarga;
        boolean editarNovaCarga = true;

        try {
            while (editarNovaCarga) {

                if (this.cadastro.size() >= 0) {
                    System.out.println("\n============== Carga Horária Cadastradas: ==============\n");
                    for (Cadastro cargaHoraria : cadastro) {
                        System.out.println(cargaHoraria.getCargaHoraria() + " - " + cargaHoraria.getDisciplina());
                    }
                } else {
                    System.out.println("Nenhuma carga Horaria cadastrada");
                    System.exit(1);
                }

                System.out.println("\nInforme qual Disciplina você deseja editar a carga Horaria: ");
                Scanner ler = new Scanner(System.in);
                editarCarga = ler.nextLine();

                for (Cadastro cadastrosCarga : cadastro) {
                    if (cadastrosCarga.getDisciplina().equals(editarCarga)) {
                        int i = cadastro.indexOf(cadastrosCarga);
                        cadastro.remove(i);
                    }
                }

                System.out.println("Informe as novas informações da turma: \n");

                System.out.println("Informe qual será a carga Horária: ");
                Scanner lerCargaEditada = new Scanner(System.in);
                int cargaEditada = lerCargaEditada.nextInt();

                System.out.println("Informe qual Campus será cadastrada essa carga Horária: ");
                Scanner lerCampusEditada = new Scanner(System.in);
                String campusCargaEditada = lerCampusEditada.nextLine();

                System.out.println("Informe qual turno será cadastrada essa carga Horária: ");
                Scanner lerTurnoEditada = new Scanner(System.in);
                String turnoCargaEditada = lerTurnoEditada.nextLine();

                System.out.println("Informe qual Disciplina será cadastrada essa carga Horária: ");
                Scanner lerDisciplinaEditada = new Scanner(System.in);
                String disciplinaCargaEditada = lerDisciplinaEditada.nextLine();

                cadastro.add(new Cadastro(campusCargaEditada, disciplinaCargaEditada, turnoCargaEditada, cargaEditada));

                for (int i = 0; i < cadastro.size(); i++) {
                    Cadastro listaCargaEditada = cadastro.get(i);
                    System.out.println("\n========= Carga editada com Sucesso!===========");
                    System.out.println("Carga Horária: " + listaCargaEditada.getCargaHoraria() + " - " + listaCargaEditada.getCampus() + " - " + listaCargaEditada.getTurno() + " - " + listaCargaEditada.getDisciplina());
                }

                System.out.println("\nDeseja editar mais uma Carga? (S/N)");
                Scanner lerScanner = new Scanner(System.in);
                String resposta = lerScanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    editarNovaCarga = true;
                } else {
                    editarNovaCarga = false;
                }
            }

        } catch (Exception exception) {
            System.out.println("ERRO! Informe os dados corretamente");
            System.exit(1);
        }
}



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurnoCurso() {
        return turnoCurso;
    }

    public void setTurnoCurso(String turnoCurso) {
        this.turnoCurso = turnoCurso;
    }

    public String getCampusAcademico() {
        return campusAcademico;
    }

    public void setCampusAcademico(String campusAcademico) {
        this.campusAcademico = campusAcademico;

    }

    private class Cadastro {

        private String campus;
        private String disciplina;
        private String turno;
        private int CargaHoraria;

        public Cadastro(String campus, String disciplina, String turno, int CargaHoraria) {
            this.campus = campus;
            this.disciplina = disciplina;
            this.turno = turno;
            this.CargaHoraria = CargaHoraria;
        }

        public String getCampus() {
            return campus;
        }

        public void setCampus(String campus) {
            this.campus = campus;
        }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

        public String getTurno() {
            return turno;
        }

        public void setTurno(String turno) {
            this.turno = turno;
        }

        public int getCargaHoraria() {
            return CargaHoraria;
        }

        public void setCargaHoraria(int CargaHoraria) {
            this.CargaHoraria = CargaHoraria;
        }

    }

}