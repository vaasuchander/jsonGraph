/**
 * 
 */
package com.learning.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.model.PlayBookTask;

/**
 * @author vbejjanki
 *
 */

public interface PlayBookTaskRepository extends CrudRepository<PlayBookTask, Long>{
	
	
}
