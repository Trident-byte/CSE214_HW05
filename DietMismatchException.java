import java.lang.Exception;
public class DietMismatchException extends Exception{
    public DietMismatchException(){
        super("This animal can't eat this type of prey!");
    }
}
