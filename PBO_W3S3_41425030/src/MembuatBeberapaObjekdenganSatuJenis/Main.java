/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatBeberapaObjekdenganSatuJenis;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author ASUS
 */

/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/  

public class Main extends Application {
        public static void main(String[] args) { launch(args);} 
        @Override public void start(Stage stage) 
        {
            Button button = new Button("Click Me");
        // Anonymous object dibuat melalui lambda expression
            button.setOnAction(
            event 
            -> System.out.println("Button clicked!"));
            // Anonymous object melalui lambda

        StackPane root = new StackPane(button);
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }
}
