import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;
import com.opencsv.CSVWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class candidatoControler {

    @FXML
    private Button botaoAvancar;

    @FXML
    private TextField cpfCandidato;

    @FXML
    private DatePicker dataCandidato;

    @FXML
    private TextField emailCandidato;

    @FXML
    private TextField nomeCandidato;

    @FXML
    private TextField senhaCandidato;

    @FXML
    private TextField telefoneCandidato;

    @FXML
    void cadastrarDados(ActionEvent event) throws FileNotFoundException {
        Carro.abastecer(true);
    }

    @FXML
    void cadastrarDados(ActionEvent event) throws FileNotFoundException {
        Carro.dirigir(true);
    }

}
