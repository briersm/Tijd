package View;

import Model.tijdModel;
import javafx.scene.layout.GridPane;

public class tijdPresenter extends GridPane {
    private final tijdModel model;
    private final tijdView view;

    public tijdPresenter(tijdModel model, tijdView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void updateView() {

    }

    private void addEventHandlers() {

    }

}
