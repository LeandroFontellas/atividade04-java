package Kingdom.implementations.Rat;

import Kingdom.interfaces.*;

public class RatKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new RatCastle();
    }
    public King createKing() {
        return new RatKing();
    }
    public Army createArmy() {
        return new RatArmy();
    }

    @Override
    public Wizard createWizard() {
        return new RatWizard();
    }
}
