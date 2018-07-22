package ink.lichen.memory;

import ink.lichen.stack.BaseTest;

//-Xss128K -Xmx16M -Xms16M -XX:+PrintGC
public class HistogramTest extends BaseTest {


    public void localVarGC1(){
        byte[] a = new byte[6*1024*1024];
        System.gc();
    }


    public void localVarGC2(){
        byte[] a = new byte[1024*6*1024];
        a = null;
        System.gc();
    }


    public void localVarGC3(){
        {
            byte[] a = new byte[1024 * 6 * 1024];
        }
        System.gc();
    }


    public void localVarGC4(){
        {
            byte[] a = new byte[1024 * 6 * 1024];
        }
        int c = 10;
        System.gc();
    }


    public void localVarGC5(){
        localVarGC1();
        System.gc();;
    }

    public static void main(String[] args) throws InterruptedException {
        HistogramTest gc = new HistogramTest();
//        gc.localVarGC1();
//        gc.localVarGC2();
//        gc.localVarGC3();
//        gc.localVarGC4();
        gc.localVarGC5();
        Thread.sleep(10*100000);
    }

}
