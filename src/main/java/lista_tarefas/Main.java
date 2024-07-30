
package lista_tarefas;

/**
 *
 * @author kaios
 */
public class Main {

    public static void main(String[] args) {

       TarefasView view = new TarefasView();
       TarefaPresenter presenter = new TarefaPresenter(view, TarefaPresenter.DataBiding.VIEW_MODEL);
       presenter.addtarefa();
       presenter.addtarefa();
       presenter.addtarefa();
       presenter.marcar("a");

    }
}
