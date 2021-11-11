package com.dylanhurtado.contadorfx;

public class Model {
    private String operation;
    private float num1;
    private float num2;


    public Model() {
        num1=0;
        num2=0;
        operation="";
    }


    public void setOperation(String operation) {
        this.operation = operation;
    }


    public void setNum1(float num1) {
        this.num1 = num1;
    }


    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getRes(){
        switch (operation){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1 / num2;
        }
        return 0;
    }
}