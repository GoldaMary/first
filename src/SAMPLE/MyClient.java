package SAMPLE;

import java.io.*;
import java.net.*;
import java.io.DataInputStream;
import java.net.Socket;

/**
 * Created by expert on 8/8/18.
 */
public class MyClient {

    public static void main(String[] args) {

        try{
            Socket s=new Socket("localhost",6666);
           DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch (Exception e){

            System.out.println(e);
        }
    }
}
