package component;

import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class TodoListCell extends ListCell<Task> {
    private HBox hBox = new HBox();
    private CheckBox checkBox = new CheckBox();

    public TodoListCell(){
        hBox.getChildren().add(checkBox);
        hBox.setAlignment(Pos.CENTER_LEFT);
        checkBox.selectedProperty().addListener((obs, wasSelected, isSelected) -> {
            Task t = getItem();
            if(t != null) t.setComplete(isSelected);
        });
    }

}
