import java.lang.Exception;
public class DietMismatchException extends Exception{
    public DietMismatchException(){
        super("Plants can't eat animals");
    }
}
