package SAMPLE;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by expert on 8/30/18.
 */
public class ByteArray {

    public static void main(String[] args)throws IOException {

        String s="hello all";
        byte[] b=s.getBytes();
        FileOutputStream fout=new FileOutputStream("bytearray1.txt");
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write(b);
        baos.writeTo(fout);
    }
}
