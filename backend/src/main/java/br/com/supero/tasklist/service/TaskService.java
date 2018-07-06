package br.com.supero.tasklist.service;

import java.util.Optional;

import org.springframework.dao.DataAccessException;

import br.com.supero.tasklist.model.Task;

public interface TaskService {

	Optional<Task> findTaskById(Long id) throws DataAccessException;
	Iterable<Task> findAllTasks() throws DataAccessException;
	Task saveTask(Task task) throws DataAccessException;
	Task updateTask(Task task) throws DataAccessException;
	void deleteTask(Task task) throws DataAccessException;
}
