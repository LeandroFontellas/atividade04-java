package Kingdom.implementations.Rat;

import Kingdom.interfaces.King;

public class RatKing implements King {
    static final String DESCRIPTION = "This is the rat king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
