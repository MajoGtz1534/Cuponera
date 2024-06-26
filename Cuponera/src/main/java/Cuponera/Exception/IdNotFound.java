package Cuponera.Exception;

public class IdNotFound extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public IdNotFound(){
        super();
    }

    public IdNotFound(String message){
        super(message);
    }
}
