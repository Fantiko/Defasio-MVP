/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tarefas;


import Observer.Observer;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kaios
 */
public class TarefasView implements Observer {

    public TarefasView() {
    }

    public void mostrarTarefas(List<Tarefa> tarefas){
        //mostrar tarefas
        System.out.println("----------------------");
        for(Tarefa i : tarefas)
        {

            System.out.println(i.toString());

        }
        System.out.println("----------------------");
    }
    
    public String preencherTarefas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Tarefa:");
        return scanner.nextLine();
    }
    public void msgError(String message){
        System.out.println(message);
    }

    public void update(List<Tarefa> tarefas) {
        this.mostrarTarefas(tarefas);
    }

    @Override
    public void update() {

    }
}
