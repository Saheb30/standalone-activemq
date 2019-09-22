package org.saheb.jms.controller;

import java.util.Date;

import javax.jms.Queue;

import org.saheb.jms.beans.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
public class JmsController {
	@Autowired
	JmsTemplate jmsTemplate;

	@Autowired
	Queue queue;

	@GetMapping("/{message}")
	public String publish(@PathVariable("message") final String message) {
		jmsTemplate.convertAndSend(queue, new Message(1001L, message, new Date()));
		return "Published Successfully";
	}
}
