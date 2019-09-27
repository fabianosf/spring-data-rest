package br.com.demo.repository;

import java.util.logging.Logger;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import br.com.demo.models.User;

@RepositoryEventHandler(User.class)
public class UserEventHandler {
	
	private Logger logger = Logger.getLogger("UserEventHandler Logger ->");
	
	@HandleBeforeCreate
	public void handleUserSave(User user) {
		logger.info("Handle Before Save....");
	}

}
