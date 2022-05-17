package com.playerscoutingapp.exception;
/**
 * @author Sheika Abuthair
 * @Date : 16-05-2022
 * @Project : assignmentProject
 */
public class PlayerNotFoundException extends RuntimeException{
    public PlayerNotFoundException() {
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
