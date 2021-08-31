package Kingdom.implementations.Rat;

import Kingdom.interfaces.Wizard;

public class RatWizard implements Wizard {
    static final String DESCRIPTION = "This is the rat wizard!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
