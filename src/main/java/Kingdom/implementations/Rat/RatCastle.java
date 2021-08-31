package Kingdom.implementations.Rat;
import Kingdom.interfaces.Castle;

public class RatCastle implements Castle {
    static final String DESCRIPTION = "This is the rat castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
