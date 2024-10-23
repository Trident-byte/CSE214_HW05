import java.lang.Exception;
public class IsPlantException extends Exception{
    public IsPlantException(){
        super("Plants can't eat animals");
    }
}
