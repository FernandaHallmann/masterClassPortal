package controller;
import java.util.*;
public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\n\n\n\nOlá, bem vindo ao MasterClass, seu aluno Online melhorado!!");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1 - Cadastrar um Aluno");
        System.out.println("2 - Cadastrar uma Instituição");
        System.out.println("3 - Cadastrar um Cursos");
        System.out.println("4 - Cadastrar uma Pessoa");
        System.out.println("5 - Cadastrar um Setor");
        System.out.println("6 - Cadastrar um Financeiro");
        System.out.println("7 - Cadastrar uma Forma de pagamento");
        System.out.println("0 - Sair");
        
        System.out.println("Informe o valor desejado:");
        int valor = 0;
        valor = ler.nextInt();
        switch (valor) {
            case 1:
                System.out.println("Parabéns você escolheu cadastrar um Aluno!");
                break;
            case 2:
                System.out.println("Parabéns você escolheu cadastrar uma Instituição!");
                break;
            case 3:
                System.out.println("Parabéns você escolheu cadastrar um Cursos!");
                break;
            case 4:
                System.out.println("Parabéns você escolheu cadastrar uma Pessoa!");
                break;
            case 5:
                System.out.println("Parabéns você escolheu cadastrar um Setor!");
                break;
            case 6:
                System.out.println("Parabéns você escolheu cadastrar um Financeiro!");
                break;
            case 7:
                System.out.println("Parabéns você escolheu cadastrar uma Forma de pagamento!");
                break;
            case 0:
                System.out.println("Você escolheu sair, tchau tchau");
                break;
            default:
                System.out.println("Não há nenhuma opção com esse valor");
        }
    }
}
