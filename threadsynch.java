class callme{
    synchronized void call(String msg){
        System.out.print("["+msg);
    
    try{
        Thread.sleep(1000);
    }
    catch(InterruptedException e){
        e.printStackTrace();
     }
     System.out.println("]");
  }
}
  class Caller extends Thread{
    String msg;
    callme target;
    Caller(callme target,String msg){
        this.target=target;
        this.msg=msg;
        
    }
     public void run(){
        target.call(msg);
     }

  }

public class synch {
    public static void main(String []arg){
        callme c=new callme();
        Caller t1=new Caller(c,"Hello");
       Caller t2=new Caller(c,"java programming");
       t1.start();
       t2.start();

    }
    
}
