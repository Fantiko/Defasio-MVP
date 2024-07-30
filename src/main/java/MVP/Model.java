/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;
import Observer.Observable;
import Observer.Observer;
/**
 *
 * @author kaios
 */
public class Model implements Observer {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        update();
    }


    @Override
    public void update() {
        // att o model
    }
}
