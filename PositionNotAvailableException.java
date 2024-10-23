import java.lang.Exception;
public class PositionNotAvailableException extends Exception{
    public PositionNotAvailableException(){
        super("Not available child position");
    }
}
