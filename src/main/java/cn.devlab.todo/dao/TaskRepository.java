package cn.devlab.todo.dao;

import cn.devlab.todo.domain.Task;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by zhong on 7/18/16.
 */
public interface TaskRepository extends Repository<Task, Long> {

    List<Task> findAll();

    Task findTaskById(Long id);

    void save(Task task);


    void delete(Task task);



}
