/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tarefas;


import MVP.View;
import Observer.Observer;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kaios
 */
public class TarefasView implements Observer {
    
    public void mostrarTarefas(List<Tarefa> tarefas){
        //mostrar tarefas
        for(Tarefa i : tarefas)
        {
            System.out.println(i.getDescricao());
        }
    }
    
    public String preencherTarefas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Tarefa:");
        return scanner.nextLine();
    }
    public void msgError(String message){
        System.out.println("A descrição da tarefa não pode ser vazia");
    }
    
    public void update(List<Tarefa> tarefas) {
        this.mostrarTarefas(tarefas);
    }

    @Override
    public void update() {

    }
}
