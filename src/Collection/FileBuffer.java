package Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by expert on 7/18/18.
 */
public class FileBuffer {

    public static void main(String[] args)throws IOException {

        System.out.println("input a line");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        System.out.println(line);
    }
}
