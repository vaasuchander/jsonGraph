/**
 * 
 */
package com.learning.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.learning.model.PlayBookTask;
import com.learning.repository.PlayBookTaskRepository;

/**
 * @author vbejjanki List<Task>
 */
@Service
public class TaskService {

	@Inject
	private PlayBookTaskRepository taskRepository;

	public List<PlayBookTask> getTasks() {
		List<PlayBookTask> taskList = new ArrayList<>();
		taskRepository.findAll().forEach(taskList::add);
		return taskList;
	}

}
