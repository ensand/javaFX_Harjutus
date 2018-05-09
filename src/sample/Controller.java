package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.Random;


public class Controller {

    @FXML
    Canvas canvas1 = new Canvas();
    static GraphicsContext gc;

    @FXML
    ComboBox combo1 = new ComboBox();
    private ObservableList<String> options1 = FXCollections.observableArrayList("Ring", "Ruut");

    @FXML
    ComboBox combo2 = new ComboBox();
    private ObservableList<Integer> options2 = FXCollections.observableArrayList(1, 2, 3);

    static Random r = new Random();
    static double x = r.nextInt(400);
    static double y = r.nextInt(400);
    static int n = 1;
    static String k = "Ring";


    static void drawShape(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillOval(x, y, 20, 20);
        if (k.equals("Ring")) {
            gc.fillOval(x, y, 20, 20);
        } else if (k.equals("Ruut")) {
            gc.fillRect(x, y, 20, 20);
        }
    }

//    public static void amount() {
//
//    }

    public void hiir() {
        System.out.println("Boop!");
        k = combo1.getValue().toString();
        //n = combo2.getValue();
        gc = canvas1.getGraphicsContext2D();
        x = r.nextInt(400);
        y = r.nextInt(400);
        drawShape(gc);
    }

    public void initialize() {
        System.out.println("I am working properly I guess. Well done.");
        combo1.setItems(options1);
        combo1.setValue("Ring");
        combo2.setItems(options2);
        combo2.setValue(1);
    }
}
