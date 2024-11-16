class odd extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
              if(i%2==1){
                System.out.println("odd:"+i);
              }
        }
    }
}
class even extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println("even:"+i);
            }
        }
    }
}
public class multithread {
    public static void main(String []args){
    odd o=new odd();
    o.start();
    even e=new even();
    e.start();
    }
}
