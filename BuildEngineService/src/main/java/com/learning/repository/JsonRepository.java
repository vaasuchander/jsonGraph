/**
 * 
 */
package com.learning.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.model.GraphJson;

/**
 * @author vbejjanki
 *
 */
public interface JsonRepository extends CrudRepository<GraphJson,Long>{

}
