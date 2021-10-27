package br.com.apilocar.exception;

public class SvcException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public SvcException(String msg) {
		super(msg);
	}

}
