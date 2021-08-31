package Kingdom.implementations;

import Kingdom.implementations.Elf.ElfKingdomFactory;
import Kingdom.implementations.Orc.OrcKingdomFactory;
import Kingdom.implementations.Rat.RatKingdomFactory;
import Kingdom.interfaces.KingdomFactory;

public class FactoryMaker {
    public enum KingdomType{
        ELF, ORC, RAT
    }
    public static KingdomFactory makeFactory(KingdomType type){
        switch (type){
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            case RAT:
                return new RatKingdomFactory();
            default:
                throw new IllegalArgumentException("Kingdom not supported");
        }
    }
}
