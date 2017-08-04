package prob5;

public class MyStackException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyStackException(){
		super("MyStackException occurs");
	}

	public MyStackException(String expMsg){
		super(expMsg);
	}
}
