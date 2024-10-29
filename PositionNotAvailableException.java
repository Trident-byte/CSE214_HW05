import java.lang.Exception;
public class PositionNotAvailableException extends Exception{
    public PositionNotAvailableException(){
        super("ERROR: There is no more room for more prey for this predator");
    }
}
