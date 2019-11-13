/**
 * 
 */
package com.learning.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.model.Graph;

/**
 * @author vbejjanki
 *
 */
public interface JsonRepository extends CrudRepository<Graph,Long>{

}
