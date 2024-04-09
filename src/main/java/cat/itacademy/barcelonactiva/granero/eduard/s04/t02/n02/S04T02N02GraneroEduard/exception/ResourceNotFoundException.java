package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n02.S04T02N02GraneroEduard.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException (String message){
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable throwable){
        super(message,throwable);
    }
}
