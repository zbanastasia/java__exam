package com.example.java_exam;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField getNumber;

    @FXML
    private Label resultOfSum;

    @FXML
    protected void countButton() {
        double result = getSumOfNumbers(Integer.parseInt(getNumber.getText()));
        resultOfSum.setText("Результат: "+ result); // показываем результат
    }

    //метод вычисляющий сумму ряда
    double getSumOfNumbers(int n){
        double k=0;
        double r=1;
        for(int i=1;i<=n;i++){
            k+=(1/r);
            System.out.println(1/r);
            r*=2;
        }
        return k;
    }
}