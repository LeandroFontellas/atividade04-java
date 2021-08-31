package Kingdom.implementations.Orc;

import Kingdom.interfaces.KingdomFactory;
import Kingdom.interfaces.*;

public class OrcKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new OrcCastle();
    }
    public King createKing() {
        return new OrcKing();
    }
    public Army createArmy() {
        return new OrcArmy();
    }

    @Override
    public Wizard createWizard() {
        return new OrcWizard();
    }
}
