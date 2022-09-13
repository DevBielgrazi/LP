import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Carro{

    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private Integer tanque;

    public Carro(){

    }

    public Carro(String marca, String modelo, String cor, String placa, Integer tanque){
        public String getMarca(){
            return marca;
        }

        public void setMarca(String marca){
            this.marca = marca;
        }

        public String getModelo(){
            return modelo;
        }

        public void setModelo(String modelo){
            this.modelo = modelo;
        }

        public String getCor(){
            return cor;
        }

        public void setCor(String cor){
            this.cor = cor;
        }

        public String getPlaca(){
            return placa;
        }

        public void setPlaca(String placa){
            this.placa = placa;
        }

        this.tanque = 100;
    }

    public static void dirigir(boolean btn){
        if(btn == true && tanque>0){
            JOptionPane.showMessageDialog(null, "Carro locomovido, não esqueça de abastecer!");
            tanque=tanque-10;
        }else{
            JOptionPane.showMessageDialog(null, "Carro sem combustivel");
        }
    }

    public static void abastecer(boolean btn){
        if(btn == true && tanque<=0){
            JOptionPane.showMessageDialog(null, "Carro abastecido, pode se locomover!");
            tanque=100;
        }
    }

    private static Stage stage;
    private static Scene tela1;
    private static Scene tela2;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        primaryStage.setTitle("Carro");

        Parent tela1fxml = FXMLLoader.load(getClass().getResource("layout.fxml"));
        tela1 = new Scene(tela1fxml);

        Parent tela1fxml = FXMLLoader.load(getClass().getResource("layout.fxml"));
        tela1 = new Scene(tela1fxml);

        primaryStage.setScene(tela1);
        primaryStage.show();
    }

    public static void ChangeScene(String tela) {
        switch (tela) {
            case "tela1":
                stage.setScene(tela1);
                stage.setFullScreen(true);
                break;
            case "tela2":
                stage.setScene(tela2);
                stage.setFullScreen(true);
                break;
        }
    }

}
