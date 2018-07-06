package br.com.supero.tasklist.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import br.com.supero.tasklist.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}
