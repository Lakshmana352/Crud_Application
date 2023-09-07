package crud.exception;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(Long id) {
		super("User is not found with the id "+id);
	}
}
