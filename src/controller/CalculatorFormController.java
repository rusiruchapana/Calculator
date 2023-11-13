package controller;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CalculatorFormController {
    public Button btnClr;
    public Button btnDl;
    public Button btnMdl;
    public Button btnDvd;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btnMltpl;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btnSbstrctn;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btnAdd;
    public Button btnDcml;
    public Button btnEql;
    public Button btn0;
    public Label lblType;





    public void initialize(){
        btnClr.getStyleClass().add("round-button");

    }


    public void btn7OnMouseClicked(MouseEvent mouseEvent) {
        solveProblem("7");
    }

    public void btn8OnMouseClicked(MouseEvent mouseEvent) {
        solveProblem("8");
    }

    public void btnAddOnAction(MouseEvent mouseEvent) {
        solveProblem("+");
    }



    public String solveProblem(String value){



    }


}
