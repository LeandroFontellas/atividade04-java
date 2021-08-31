import Kingdom.implementations.FactoryMaker;
import Kingdom.implementations.FactoryMaker.KingdomType;
import Kingdom.interfaces.KingdomFactory;

public class App {
    public static void main(String[] args) {
        System.out.println("Elf Kingdom");

        KingdomFactory elfKingdom = FactoryMaker.makeFactory(KingdomType.ELF);

        var elfarmy = elfKingdom.createArmy();
        var elfcastle = elfKingdom.createCastle();
        var elfking = elfKingdom.createKing();
        var elfwizard = elfKingdom.createWizard();

        System.out.println(elfarmy.getDescription());
        System.out.println(elfcastle.getDescription());
        System.out.println(elfking.getDescription());
        System.out.println(elfwizard.getDescription());

        System.out.println("Orc Kingdom");
        KingdomFactory orcKingdom = FactoryMaker.makeFactory(KingdomType.ORC);

        var orcarmy = orcKingdom.createArmy();
        var orccastle = orcKingdom.createCastle();
        var orcking = orcKingdom.createKing();
        var orcwizard = orcKingdom.createWizard();

        System.out.println(orcarmy.getDescription());
        System.out.println(orccastle.getDescription());
        System.out.println(orcking.getDescription());
        System.out.println(orcwizard.getDescription());

        System.out.println("Rat Kingdom");
        KingdomFactory ratKingdom = FactoryMaker.makeFactory(KingdomType.RAT);

        var ratarmy = ratKingdom.createArmy();
        var ratcastle = ratKingdom.createCastle();
        var ratking = ratKingdom.createKing();
        var ratwizard = ratKingdom.createWizard();

        System.out.println(ratarmy.getDescription());
        System.out.println(ratcastle.getDescription());
        System.out.println(ratking.getDescription());
        System.out.println(ratwizard.getDescription());
    }
}
