package ink.lichen.stack;


//-Xss128K -Xmx128M -Xms128M
public class StackVarRefTest {

    private static Sample sample;

    private static class Sample{

        private byte[] content = new byte[1024];
    }

    private static int count = 0;


    private static void recursion(long a,long b,long c){
        long e=1,f=2,g=3,h=4,i=5,j=6,k=7,l=8,m=9,n=10;
        for (int ll=0; i < 10; i++ ){
        Sample sample = new Sample();
//        Sample sample1 = new Sample();
//        Sample sample2 = new Sample();
//        Sample sample3 = new Sample();
//        Sample sample4 = new Sample();
//        Sample sample5 = new Sample();
        }

        count++;
        recursion(a,b,c);
    }

    public static void main(String[] args) {

        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");

        try{
            recursion(0,0,0);
        }catch (Throwable e){
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }

}
