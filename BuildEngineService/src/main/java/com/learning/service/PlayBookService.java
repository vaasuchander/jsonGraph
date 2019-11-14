/**
 * 
 */
package com.learning.service;

import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.learning.model.PlayBook;
import com.learning.repository.PlayBookRepository;

/**
 * @author vbejjanki
 *
 */

@Service
public class PlayBookService {

	@Inject
	private PlayBookRepository playBookRepository;
	
	@Inject
	private GraphExectionService gService;

	public Optional<PlayBook> playBook(final Long id) {

		return playBookRepository.findById(id);

	}
	
	public void exec(final Long id) {
		
		gService.exec(id);
		
	}

}
