package com.example.lp1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stage;
    private static Scene tela1;
    private static Scene tela2;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;

        stage.setTitle("+Emprego");

        Parent layout = FXMLLoader.load(getClass().getResource("layout.fxml"));
        tela1 = new Scene(layout);

        Parent layout2 = FXMLLoader.load(getClass().getResource("layout2.fxml"));
        tela2 = new Scene(layout2);

        stage.setScene(tela1);
        stage.show();
    }

    public static void ChangeScene(Integer tela) {
        switch (tela) {
            case 1:
                stage.setScene(tela1);
                break;
            case 2:
                stage.setScene(tela2);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}