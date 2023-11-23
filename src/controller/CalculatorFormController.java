package controller;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CalculatorFormController {

    public Button btnC;
    public Button btnDel;
    public Button btnModuler;
    public Button btnDivide;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btnMultiply;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btnSubstract;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btnAddition;
    public Button btnDecimal;
    public Button btnEqual;
    public Button btn0;
    public TextField txtShow;
    public Label txtShowPlace;
    public Label lblAnswer;


    public String problem = "0";



    public void btnCOnMouseClicked(MouseEvent mouseEvent) {
            txtShowPlace.setText("");
            lblAnswer.setText("");
    }


    public void btnDeleteOnMouseClicked(MouseEvent mouseEvent) {

    }


    public void btnModulesOnMouseClicked(MouseEvent mouseEvent) {
                setProblem("%");
    }


    public void btnDivideOnMouseClicked(MouseEvent mouseEvent) {
                setProblem("/");
    }


    public void btn7OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("7");
    }


    public void btn8OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("8");
    }


    public void btn9OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("9");
    }


    public void btnMultiplyOnMouseClicked(MouseEvent mouseEvent) {
                setProblem("*");
    }


    public void btn4OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("4");
    }


    public void btn5OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("5");
    }


    public void btn6OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("6");
    }


    public void btnSubstractOnMouseClicked(MouseEvent mouseEvent) {
                setProblem("-");
    }


    public void btn1OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("1");
    }


    public void btn2OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("2");
    }


    public void btn3OnMouseClicked(MouseEvent mouseEvent) {
                setProblem("3");
    }


    public void btnAdditionOnMouseClicked(MouseEvent mouseEvent) {
                setProblem("+");
    }


    public void btnDecimalOnMouseClicked(MouseEvent mouseEvent) {
                setProblem(".");
    }


    public void btnEqualOnMouseClicked(MouseEvent mouseEvent) {
                answer();
    }


    public void btnZeroOnMouseClicked(MouseEvent mouseEvent) {
                setProblem("0");
    }

    public void setProblem(String symbol){
                problem = txtShowPlace.getText();
                problem = problem.concat(symbol);
                txtShowPlace.setText(problem);
    }

    public void answer(){
                int operatorIndex = -1;
                char operator = ' ';

                for (int i = 0; i < problem.length(); i++) {
                    char currentChar = problem.charAt(i);
                    if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/' || currentChar == '%') {
                        operatorIndex = i;
                        operator = currentChar;
                        break;
                    }
                }


                if (operatorIndex != -1) {

                    String beforeOperator = problem.substring(0, operatorIndex).trim();
                    String afterOperator = problem.substring(operatorIndex + 1).trim();
                    int result;

                        int beforeOperatorNew = Integer.parseInt(beforeOperator);
                        int afterOperatorNew  = Integer.parseInt(afterOperator);


                        if(operator ==  '+'){
                                result = beforeOperatorNew + afterOperatorNew;
                                lblAnswer.setText(String.valueOf(result));

                        }else if(operator == '-'){
                            result = beforeOperatorNew - afterOperatorNew;
                            lblAnswer.setText(String.valueOf(result));

                        }else if(operator == '*'){
                            result = beforeOperatorNew * afterOperatorNew;
                            lblAnswer.setText(String.valueOf(result));

                        }else if(operator == '/'){
                            result = beforeOperatorNew / afterOperatorNew;
                            lblAnswer.setText(String.valueOf(result));

                        }else if(operator == '%'){
                            result = beforeOperatorNew % afterOperatorNew;
                            lblAnswer.setText(String.valueOf(result));
                        }






                }
    }



}
