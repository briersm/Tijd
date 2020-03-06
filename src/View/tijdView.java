package View;

import com.sun.javafx.geom.Rectangle;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;

public class tijdView extends GridPane {
    private Button rechthoek1;
    private Button rechthoek2;
    private Button rechthoek3;
    private Button rechthoek4;
    private Button rechthoek5;
    private Button rechthoek6;
    private Button rechthoek7;
    private Button rechthoek8;
    private Button rechthoek9;
    private Button rechthoek10;
    private Button rechthoek11;
    private Button rechthoek12;

    public tijdView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        rechthoek1 = new Button();
        rechthoek2 = new Button();
        rechthoek3 = new Button();
        rechthoek4 = new Button();
        rechthoek5 = new Button();
        rechthoek6 = new Button();
        rechthoek7 = new Button();
        rechthoek8 = new Button();
        rechthoek9 = new Button();
        rechthoek10 = new Button();
        rechthoek11 = new Button();
        rechthoek12 = new Button();
    }

    private void layoutNodes() {
        this.add(rechthoek1, 0,0);
        this.add(rechthoek2, 0,1);
        this.add(rechthoek3, 0,2);
        this.add(rechthoek4, 0,3);
        this.add(rechthoek5, 1,0);
        this.add(rechthoek6, 1,1);
        this.add(rechthoek7, 1,2);
        this.add(rechthoek8, 1,3);
        this.add(rechthoek9, 2,0);
        this.add(rechthoek10, 2,1);
        this.add(rechthoek11, 2,2);
        this.add(rechthoek12, 2,3);
    }

}
