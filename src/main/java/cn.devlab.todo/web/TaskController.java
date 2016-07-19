package cn.devlab.todo.web;

import cn.devlab.todo.domain.Task;
import cn.devlab.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

/**
 * Created by zhong on 7/19/16.
 */

@RestController
@RequestMapping("task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Task> list(){
        return taskService.getAllTask();
    }

    @RequestMapping(value = "/{taskId}", method = RequestMethod.GET)
    public Task getTask(@PathVariable Long taskId){
        Task task = taskService.getTaskById(taskId);
        return task;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody Task task){
        taskService.save(task);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
