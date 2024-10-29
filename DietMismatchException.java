import java.lang.Exception;
public class DietMismatchException extends Exception{
    public DietMismatchException(){
        super("ERROR: This prey cannot be added as it does not match the diet of the predator");
    }
}
