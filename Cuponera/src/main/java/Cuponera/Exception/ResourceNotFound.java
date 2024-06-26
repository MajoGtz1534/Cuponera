package Cuponera.Exception;

public class ResourceNotFound extends RuntimeException{

    private static final long serialVersionUID =1L;

    public ResourceNotFound() {
    }

    public ResourceNotFound(String message) {
        super(message);
    }
}
