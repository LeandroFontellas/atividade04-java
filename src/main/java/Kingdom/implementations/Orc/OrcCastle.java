package Kingdom.implementations.Orc;

import Kingdom.interfaces.Castle;

public class OrcCastle implements Castle {
    static final String DESCRIPTION = "This is the orc castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
