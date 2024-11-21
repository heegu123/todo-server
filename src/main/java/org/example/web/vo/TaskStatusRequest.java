package org.example.web.vo;

import lombok.Getter;
import lombok.ToString;
import org.example.constants.TaskStatus;

@Getter
@ToString
public class TaskStatusRequest {
    private TaskStatus status;
}
