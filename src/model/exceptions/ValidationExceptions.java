package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationExceptions extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<>(); // o primeiro string vai dizer o nome do campo, 
														   //o segundo a mensagem a ser implementada.
	
	public ValidationExceptions(String msg) {// valida o formulário
		super(msg);		
	}
	
	public Map<String, String> getErrors(){
		return errors;		
	}
	
	public void addErrors(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}

}
