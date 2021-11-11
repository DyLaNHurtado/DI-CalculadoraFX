package com.dylanhurtado.contadorfx;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class View extends VBox {
    private Button btnMas,btnMenos,btnPor,btnDiv,btnIgual,btn1,btn2,btn3,btn4,btn5,
            btn6,btn7,btn8,btn9,btn0,btnDecimal,btnReset;
    private Label label;
    private Controller controller;
    private GridPane panel;


    public View(){
        initView();
        controller=new Controller(label);
        setEvents();

    }

    private void initView(){
        label = new Label("");
        btnMas = new Button("+");
        btnMenos = new Button("-");
        btnPor = new Button("*");
        btnDiv = new Button("/");
        btnDecimal = new Button(".");
        btnIgual = new Button("=");
        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnReset = new Button("C");
        panel=new GridPane();


        this.getChildren().add(label);
        panel.add(btn7,1,1);
        panel.add(btn8,2,1);
        panel.add(btn9,3,1);
        panel.add(btnDiv,5,2);
        panel.add(btnPor,5,1);
        panel.add(btn4,1,2);
        panel.add(btn5,2,2);
        panel.add(btn6,3,2);
        panel.add(btn1,1,3);
        panel.add(btn2,2,3);
        panel.add(btn3,3,3);
        panel.add(btnMenos,4,2);
        panel.add(btnMas,4,1);
        panel.add(btn0,1,4);
        panel.add(btnDecimal,2,4);
        panel.add(btnReset,3,4);
        panel.add(btnIgual,4,3,2,2);
        btnIgual.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btnDecimal.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btnMenos.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        this.getChildren().add(panel);

    }
    private void setEvents(){
        panel.getChildren().forEach(b->((Button)b).setOnAction(e->controller.manejaBoton(e)));
    }

}
