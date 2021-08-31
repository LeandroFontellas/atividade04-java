package Kingdom.implementations.Rat;
import Kingdom.interfaces.Army;

public class RatArmy implements Army {
    static final String DESCRIPTION = "This is the rat army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
