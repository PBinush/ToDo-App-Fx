package model;


import javafx.scene.control.CheckBox;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {
    private Integer taskId;
    private String  taskTitle;
    private String taskDescription;
    private LocalDate completeDate;
    private Boolean isComplete;
    private CheckBox checkBox;
}
