package controller.task;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ViewTaskFormController {

    public ImageView ancPane;
    @FXML
    private ComboBox<?> cmbTitle;

    @FXML
    private TableColumn colCompletedDate;

    @FXML
    private TableColumn colDiscription;

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

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

}
