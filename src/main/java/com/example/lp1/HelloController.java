package com.example.lp1;

import AcessoDAO.CarroDao;
import javafx.fxml.FXML;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button botaoAvancar;

    @FXML
    private TextField corCarro;

    @FXML
    private TextField marcaCarro;

    @FXML
    private TextField modeloCarro;

    @FXML
    private TextField placaCarro;

    @FXML
    private TextField campoCarro;

    @FXML
    void cadastrarDados(ActionEvent event) throws Exception {
        Carro  carro = new Carro();
        carro.setCor(corCarro.getText());
        carro.setMarca(marcaCarro.getText());
        carro.setModelo(modeloCarro.getText());
        carro.setPlaca(placaCarro.getText());

        CarroDao carroDao = new CarroDao();
        carroDao.guardar(carro);

        HelloApplication.ChangeScene(2);
    }

    public void mostrarDados(ActionEvent actionEvent) {
        CarroDao carroDao = new CarroDao();
        carroDao.abrirgarargem(campoCarro.getText());
        Carro carro = new Carro();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText( "Placa: " + carro.getPlaca()
                + " Marca: " + carro.getMarca() +
                " Cor: " + carro.getCor() +
                " Modelo: " + carro.getModelo());
        alert.showAndWait();
        }
}