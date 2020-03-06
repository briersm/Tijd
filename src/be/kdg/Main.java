package be.kdg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Model.tijdModel;
import View.tijdView;
import View.tijdPresenter;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        tijdModel model = new tijdModel();
        tijdView view = new tijdView();
        tijdPresenter mijnPresenter = new tijdPresenter(model, view);
        stage.setScene(new Scene(view));
        stage.setHeight(700);
        stage.setWidth(700);
        stage.show();
    }
}
