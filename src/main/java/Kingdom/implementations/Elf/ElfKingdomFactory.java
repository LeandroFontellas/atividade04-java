package Kingdom.implementations.Elf;

import Kingdom.interfaces.*;
import Kingdom.interfaces.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new ElfCastle();
    }
    public King createKing() {
        return new ElfKing();
    }
    public Army createArmy() {
        return new ElfArmy();
    }

    @Override
    public Wizard createWizard() {
        return new ElfWizard();
    }
}
