
package lista_tarefas;

import java.util.Scanner;

/**
 *
 * @author kaios
 */
public class Main {

    public static void main(String[] args) {

        TarefasView view = new TarefasView();
        TarefaPresenter presenter = new TarefaPresenter(view, TarefaPresenter.DataBiding.TWO_WAY);

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Marcar Tarefa como Completa");
            System.out.println("3. Mostrar Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    presenter.addtarefa();
                    break;
                case 2:
                    System.out.print("Digite a descrição da tarefa para marcar como completa: ");
                    String descricao = scanner.nextLine();
                    presenter.marcar(descricao);
                    break;
                case 3:
                    presenter.view.update(presenter.getarefas());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");


            }
        }
    }
}