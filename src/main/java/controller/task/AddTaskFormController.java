package controller.task;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class AddTaskFormController {

    public TableView tblAdd;
    public TableColumn colTitle;
    public TableColumn colDiscription;
    public TableColumn colComplete;
    public JFXTextField txtTitle;
    public JFXTextArea txtDiscription;
    public AnchorPane ancPane;

    public void btnAddOnAction(ActionEvent actionEvent) {
    }

    public void btnBackOnAction(MouseEvent mouseEvent) {
    }

    public void btnCompletedTaskOnAction(ActionEvent actionEvent) {
    }
}
