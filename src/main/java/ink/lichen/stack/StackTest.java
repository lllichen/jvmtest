package ink.lichen.stack;


//-Xss128K -Xmx128M -Xms128M
public class StackTest extends BaseTest{


    private static int count = 0;

    private static void recursion(){
        count++;
        recursion();
    }

    public static void main(String[] args) {


        try{
            recursion();
        }catch (Throwable e){
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }

}
