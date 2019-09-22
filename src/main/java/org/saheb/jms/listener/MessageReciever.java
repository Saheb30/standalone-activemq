package org.saheb.jms.listener;

import org.saheb.jms.beans.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReciever {
	@JmsListener(destination = "standalone.queue")
	public void receiveMessage(Message msg) {
		System.out.println("Received... " + msg);
	}
}
