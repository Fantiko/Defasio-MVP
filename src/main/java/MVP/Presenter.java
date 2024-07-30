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
   
    public enum DataBiding
    {
        VIEW_MODEL,
        MODEL_VIEW,
        TWO_WAY
    }

    public Presenter(Model model, View view, DataBiding dataBiding) {
        
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
