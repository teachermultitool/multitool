package de.redmann.teachermultitool.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by redmann on 04.08.16.
 */
@RestController
@RequestMapping ("/rest/open")
@Slf4j
public class RestTestController
{
	@RequestMapping (value = "/test", method = RequestMethod.GET)
	public String test()
	{
		int rand = (int) (Math.random() * 100);
		log.debug("test called:" + rand);
		return "OK " + rand;
	}
}
