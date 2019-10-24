/**
 * 
 */
package com.learning.service;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.model.json.GraphModel;

/**
 * @author vbejjanki
 *
 */

@Service
public class FileService {

	@Inject
	private ObjectMapper objMapper;

	@Value("classpath:json/must-start-on-time.json")
	Resource startOnTime;

	@Value("classpath:json/parent-child.json")
	Resource parentChild;

	@Value("classpath:json/parent-child - 2.json")
	Resource parentChild2;

	@Value("classpath:json/predecessor-FS-lag.json")
	Resource predFSLag;

	@Value("classpath:json/predecessor-FS-no-lag.json")
	Resource predFSNoLag;

	@Value("classpath:json/predecessor-SS-lag.json")
	Resource predSSLag;

	@Value("classpath:json/predecessor-SS-no-lag.json")
	Resource predSSNoLag;

	Logger log = Logger.getLogger(FileService.class.getName());

	public List<GraphModel> getGraphModels() {
		return Stream.of(startOnTime, parentChild, parentChild2, predFSLag, predFSNoLag, predSSLag, predSSNoLag)
				.map(j -> {
					GraphModel gModel = null;
					try {
						gModel = objMapper.readValue(j.getInputStream(), GraphModel.class);
					} catch (IOException e) {
						log.warning("Json Parsing Failed");
					}
					return gModel;
				}).collect(Collectors.toList());
	}

}
