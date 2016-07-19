package cn.devlab.todo.service;

import cn.devlab.todo.dao.TaskRepository;
import cn.devlab.todo.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhong on 7/19/16.
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskReposity;

    @Override
    public void save(Task task) {
        taskReposity.save(task);
    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Task getTaskById(Long id) {
        return taskReposity.findTaskById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return taskReposity.findAll();
    }
}
