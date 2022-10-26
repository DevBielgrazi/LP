package com.example.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class HelloController2 {

    @FXML
    private Button botaoAbastecer;

    @FXML
    private Button botaoDirigir;

    @FXML
    private Button botaoVoltar;

    private static Carro carro = new Carro();

    @FXML
    void abastecerCarro(ActionEvent event) {
        if (carro.getTanque() == 3) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("CARRO JÁ ABASTECIDO");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("CARRO ABASTECIDO, PODE SE LOCOMOVER");
            alert.showAndWait();
            carro.setTanque(3);
        }
    }

    @FXML
    void dirigirCarro(ActionEvent event) {
        if (carro.getTanque() > 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("CARRO SE LOCOMOVEU");
            alert.showAndWait();
            carro.setTanque(carro.getTanque()-1);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("CARRO SEM COMBUSTIVEL");
            alert.showAndWait();
        }
    }

    @FXML
    void voltarTela(ActionEvent event) {
        HelloApplication.ChangeScene(1);
    }

}
