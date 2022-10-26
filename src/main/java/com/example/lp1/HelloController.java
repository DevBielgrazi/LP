package com.example.lp1;

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

    private Carro carro;

    private int contador;

    ArrayList<Carro> garagem = new ArrayList<Carro>();
    HashSet<String> chave = new HashSet<String>();
    HashMap<String, Carro> myDict = new HashMap<String, Carro>();

    @FXML
    void cadastrarDados(ActionEvent event) throws FileNotFoundException {
        Carro  carro = new Carro();
        carro.setCor(corCarro.getText());
        carro.setMarca(marcaCarro.getText());
        carro.setModelo(modeloCarro.getText());
        carro.setPlaca(placaCarro.getText());
        setCarro(carro);
        contador = contador + 1;
        guardar(carro, ("c" + contador));
        myDict.put(("c" + contador), carro);

        HelloApplication.ChangeScene(2);
    }

    public void mostrarDados(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String mytext = "Garagem:";
        if (campoCarro.getText().equals("")) {
            for (String key : myDict.keySet()) {
                mytext = mytext + "\n" + "Chave: " + key + " Placa: " + myDict.get(key).getPlaca()
                        + " Marca: " + myDict.get(key).getMarca() + " Cor: "
                        + myDict.get(key).getCor() + " Modelo: "
                        + myDict.get(key).getModelo();

//                mytext = mytext + "test//";
            }
            alert.setContentText(mytext);
            alert.showAndWait();
        } else if(myDict.isEmpty()){
            alert.setContentText( "Garagem Vazia");
            alert.showAndWait();
        }else{
            alert.setContentText( "Placa: " + myDict.get(campoCarro.getText()).getPlaca()
                    + " Marca: " + myDict.get(campoCarro.getText()).getMarca() +
                    " Cor: " + myDict.get(campoCarro.getText()).getCor() +
                    " Modelo: " + myDict.get(campoCarro.getText()).getModelo());
            alert.showAndWait();
        }
    }

    public void guardar(Carro carro, String chave){
        this.garagem.add(carro);
        this.chave.add(chave);
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return this.carro;
    }
}