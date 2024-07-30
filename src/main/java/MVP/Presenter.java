/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import Observer.Observable;

/**
 *
 * @author kaios
 */
public class Presenter extends Observable {
   Model model;
   View view;

    public enum DataBiding {
        MODEL_VIEW,
        TWO_WAY,
        VIEW_MODEL

    }

    public Presenter(Model model, View view, DataBiding dataBiding) {
        this.model = model;
        this.view = view;

       switch(dataBiding){
           case VIEW_MODEL:
            {
                this.addObserver(model);
            }
               
           case MODEL_VIEW:
            {
                this.addObserver(view);
            }
           case TWO_WAY:
            {
                this.addObserver(model);
                this.addObserver(view);
            }
        }
    }






}
