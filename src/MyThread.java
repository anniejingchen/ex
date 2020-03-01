////public class MyThread implements Runnable {
////    void run() {
////        System.out.print("running... ");
////    }
////    public static void main(String [] args) {
////        MyThread mythread = new MyThread ();
////        Thread t = new Thread(mythread);
////        t.start();
////    }
////}
//
//class MyExc extends RuntimeException
//{}
//class SuperExc extends Exception
//{}
//class SubExc extends SuperExc
//{}
//public class Test  {
//    public void doStuff() throws SubExc  {
//        throw new SubExc();
//    }
//    public static void main(String args[])  {
//        try {
//            new Test().doStuff();
//        }
//        // insert code here
////        catch (Exception e);
//        catch(SuperExc e);
//
//        { // begin catch block
//            System.err.print("Caught");
//        } // end catch block
//    } // end main
//} // end class