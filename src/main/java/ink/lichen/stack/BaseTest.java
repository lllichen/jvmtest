package ink.lichen.stack;

public class BaseTest {

    static {
        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");
        System.out.println("cpu's number is "+Runtime.getRuntime().availableProcessors());

        System.out.println("----------------------------------------------------------");
    }
}
