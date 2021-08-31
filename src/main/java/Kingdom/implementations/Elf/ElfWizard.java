package Kingdom.implementations.Elf;

import Kingdom.interfaces.Wizard;

public class ElfWizard implements Wizard {
    static final String DESCRIPTION = "This is the elven wizard!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
