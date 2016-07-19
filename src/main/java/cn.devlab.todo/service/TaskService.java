package cn.devlab.todo.service;

import cn.devlab.todo.domain.Task;
import java.util.List;

/**
 * Created by zhong on 7/19/16.
 */
public interface TaskService {
    void save(Task task);

    void update(Task task);

    void delete(Long id);

    Task getTaskById(Long id);

    List<Task> getAllTask();
}
