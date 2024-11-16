import java.io.*;
public class file {
    public static void main(String[]args)throws IOException{
        try{
         FileInputStream fin=new FileInputStream("C:\\Users\\aswin\\OneDrive\\Desktop\\c\\d.txt");
         FileOutputStream fout=new FileOutputStream("C:\\Users\\aswin\\OneDrive\\Desktop\\c\\g.txt");
         int i=0;
         while((i=fin.read())!=-1){
            fout.write(i);
             }
             System.out.println("message written to file");
        }
        catch(IOException e){
                    e.printStackTrace();
        }
    }
}
