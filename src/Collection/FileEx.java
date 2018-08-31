package Collection;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 * Created by expert on 7/18/18.
 */
public class FileEx {

    public static void main(String[] args) throws IOException{

        FileWriter fout=new FileWriter("second.txt");
        fout.write("hello world");
        fout.close();

        FileReader fin=new FileReader("second.txt");
        int ch=0;
        while((ch=fin.read())!=-1){

            System.out.println((char)ch);
        }
    }
}
