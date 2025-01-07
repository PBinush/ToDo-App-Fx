package controller.task;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AddTaskFormController {

    public TableView tblAdd;
    public TableColumn colTitle;
    public TableColumn colComplete;
    public JFXTextField txtTitle;
    public AnchorPane ancPane;
    public TableColumn colDescription;
    public JFXTextArea txtDescription;

    public void btnAddOnAction(ActionEvent actionEvent) {
        System.out.println("fffff");
    }

    public void btnBackOnAction(MouseEvent mouseEvent) {
        try {
            AnchorPane pane = (FXMLLoader.load(getClass().getResource("../../view/login/loginForm.fxml")));
            ancPane.getChildren().setAll(pane);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void btnCompletedTaskOnAction(ActionEvent actionEvent) {
        try {
            AnchorPane pane = (FXMLLoader.load(getClass().getResource("../../view/task/viewTaskForm.fxml")));
            ancPane.getChildren().setAll(pane);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
