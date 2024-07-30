/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tarefas;

import MVP.Model;
import MVP.Presenter;
import MVP.View;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaios
 */
public class TarefaPresenter extends Presenter{
    private final List<Tarefa> tarefas = new ArrayList<>();
    private final TarefasView view;
    

    public TarefaPresenter(Tarefa model, TarefasView view, DataBiding dataBiding) {
        super(model, view, dataBiding);
        this.view = view;
    }
    
    public void addtarefa() {
        String description = this.view.preencherTarefas();
        
        if (description.isEmpty()) {
            this.view.msgError("A descrição da tarefa não pode ser vazia");
        } else {
            tarefas.add(new Tarefa(description));
            this.view.update(this.tarefas);
        }
        
    }

   
    
}
