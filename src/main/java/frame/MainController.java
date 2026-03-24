package frame;

import component.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private MenuItem add;

    @FXML
    private MenuBar bar;

    @FXML
    private MenuItem close;

    @FXML
    private Menu editMenu;

    @FXML
    private Menu fileMenu;

    @FXML
    private ListView<Task> listview;
    ObservableList<Task> list;

    @FXML
    private AnchorPane pane;

    @FXML
    void addAction(ActionEvent event) {
        if(list == null){
            list = FXCollections.observableArrayList();
            listview.setItems(list);

        }
        list.add(new Task("title", "content"));
    }

    @FXML
    void closeAction(ActionEvent event) {

    }

}

