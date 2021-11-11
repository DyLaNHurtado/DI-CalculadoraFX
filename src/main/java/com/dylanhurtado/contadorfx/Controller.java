package com.dylanhurtado.contadorfx;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    private Model model;
    private Label pantalla;

    public Controller(Label label){
        this.pantalla=label;
        model=new Model();

    }

    public void manejaBoton(ActionEvent e){

        switch(((Button)e.getSource()).getText()){

            case "+":
            case "-":
            case "*":
            case "/":
                model.setNum1(Float.parseFloat(pantalla.getText()));
                model.setOperation(((Button)e.getSource()).getText());
                break;
            case "=":
                model.setNum2(Float.parseFloat(pantalla.getText()));
                pantalla.setText(String.valueOf(model.getRes()));
                break;
            case "C":
                pantalla.setText("");
                break;
            default:
                pantalla.setText("");
                pantalla.setText(pantalla.getText()+((Button)e.getSource()).getText());

        }

    }
}
