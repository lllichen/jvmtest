package ink.lichen.stack;

public class StackTest {


    private static int count = 0;

    private static void recursion(){
        count++;
        recursion();
    }

    public static void main(String[] args) {
        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");

        try{
            recursion();
        }catch (Throwable e){
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }

}
