import java.lang.Exception;
public class IsPlantException extends Exception{
    public IsPlantException(){
        super("ERROR: The cursor is at a plant node. Plants cannot be predators");
    }
}
