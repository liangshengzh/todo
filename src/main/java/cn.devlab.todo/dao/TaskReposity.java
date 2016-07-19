package cn.devlab.todo.dao;

import cn.devlab.todo.domain.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

/**
 * Created by zhong on 7/18/16.
 */
public interface TaskReposity extends Repository<Task, Long> {

    Page<Task> findAll(Pageable pageable);

    Task save(Task task);

}
