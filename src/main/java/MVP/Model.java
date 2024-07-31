/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import Observer.Observable;
import lista_tarefas.Tarefa;

import java.util.List;

/**
 *
 * @author kaios
 */
public class Model extends Observable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }



}
