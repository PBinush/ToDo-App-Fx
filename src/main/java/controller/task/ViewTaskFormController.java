package controller.task;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ViewTaskFormController {

    public TableColumn colDescription;
    public AnchorPane ancPane;
    @FXML
    private ComboBox cmbTitle;

    @FXML
    private TableColumn colCompletedDate;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colTitle;

    @FXML
    private TableView tblCompleteTask;

    @FXML
    private JFXTextField txtSearch;

    @FXML
    void btnBackOnAction(MouseEvent event) {
        try {
            AnchorPane pane = (FXMLLoader.load(getClass().getResource("../../view/task/addTaskForm.fxml")));
            ancPane.getChildren().setAll(pane);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }
}
