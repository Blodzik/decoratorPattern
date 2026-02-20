import core.BasicWatch;
import decorators.LeatherStrap;
import decorators.NfcModule;


public class Main {
    public static void main(String[] args) {
        BasicWatch watch = new BasicWatch();
        NfcModule nfcModule = new NfcModule(watch);
        LeatherStrap leatherStrap = new LeatherStrap(nfcModule);

        System.out.println(leatherStrap.getDescription());
        System.out.println(watch.getDescription());
    }
}