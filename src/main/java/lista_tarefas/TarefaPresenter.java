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
    private final TarefasView view;
    private final DataBiding dataBiding;

    public enum DataBiding {
        MODEL_VIEW,
        TWO_WAY,
        VIEW_MODEL

    }

    public TarefaPresenter(TarefasView view, DataBiding dataBiding) {
        this.view = view;
        this.dataBiding = dataBiding;

        if (dataBiding == DataBiding.MODEL_VIEW) {
            this.addObserver(view);
        }


    }

    public void addtarefa() {
        String description = this.view.preencherTarefas();

        if (description.isEmpty()) {
            this.view.msgError("A descrição da tarefa não pode ser vazia");
        } else {
            tarefas.add(new Tarefa(description));

            switch (dataBiding) {
                case VIEW_MODEL: {
                    this.addObserver(tarefas.getLast());
                }

                case MODEL_VIEW: {
                    this.view.update(this.tarefas);
                }
                case TWO_WAY: {
                    this.addObserver(tarefas.getLast());
                    this.view.update(this.tarefas);
                }


            }

        }
    }

    public void removetarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public void marcar(String descricao) {
        for (Tarefa i : this.tarefas) {
            if (i.getDescricao().equals(descricao)) {
                i.setCompleto(true);
            }
        }

        this.view.update(this.tarefas);

    }






}