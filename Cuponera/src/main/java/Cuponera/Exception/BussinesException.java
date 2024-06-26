package Cuponera.Exception;

public class BussinesException extends RuntimeException{
    private static final long serialVersionUID=1L;

    public BussinesException() {
    }

    public BussinesException(String message) {
        super(message);
    }
}
