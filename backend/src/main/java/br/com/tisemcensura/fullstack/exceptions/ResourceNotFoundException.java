package br.com.tisemcensura.fullstack.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super( "Foi triste, tenta depois ou senta e chora. id = " + id );
	}

}
