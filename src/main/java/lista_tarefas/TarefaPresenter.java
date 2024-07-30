/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tarefas;

import MVP.Presenter;
import Observer.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaios
 */
public class TarefaPresenter extends Observable {
    private final List<Tarefa> tarefas = new ArrayList<>();
    private TarefasView view;
    private DataBiding dataBiding;
    public enum DataBiding {
        MODEL_VIEW,
        TWO_WAY,
        VIEW_MODEL

    }

    public TarefaPresenter(TarefasView view, DataBiding dataBiding) {
        this.view = view;
        this.dataBiding = dataBiding;

        switch(dataBiding){
            case VIEW_MODEL:
            {
                //this.addObserver(model);
            }

            case MODEL_VIEW:
            {
                this.addObserver(view);
            }

            case TWO_WAY:
            {

                //this.addObserver(model);
                this.addObserver(view);
            }

    }
    
    public void addtarefa() {
        String description = this.view.preencherTarefas();
        
        if (description.isEmpty()) {
            this.view.msgError("A descrição da tarefa não pode ser vazia");
        } else {
            Tarefa model = tarefas.add(new Tarefa(description));
            this.view.update(this.tarefas);
            if (this.dataBiding == DataBiding.TWO_WAY || this.dataBiding == DataBiding.VIEW_MODEL) {
                this.addObserver(model);
            }


        }
        
    }
}