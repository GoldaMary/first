package SAMPLE;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by expert on 8/9/18.
 */

public class Userhandler extends DefaultHandler {

    boolean Name=false;
    boolean price=false;
    boolean descrpition=false;
    boolean calories=false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if(qName.equalsIgnoreCase("food")) {

            String label=attributes.getValue("label");
            System.out.println("label=:"+label);
        }
        else if(qName.equalsIgnoreCase("name")){
            Name=true;
        }
        else if(qName.equalsIgnoreCase("price")){
            price=true;
        }
        else if(qName.equalsIgnoreCase("description")){
            descrpition=true;
        }
        else if(qName.equalsIgnoreCase("calories")){
            calories=true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if (qName.equalsIgnoreCase("food")) {
            System.out.println("End Element:" + qName);
        }
        if (qName.equalsIgnoreCase("name")) {
            System.out.println("End Element:" + qName);
        }
        if (qName.equalsIgnoreCase("price")) {
            System.out.println("End Element:" + qName);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if(Name){
            String s=new String(ch,start,length);
            System.out.println("name:"+s);
            Name=false;
        }
        if(price){
            String s=new String(ch,start,length);
            System.out.println("price:"+s);
            price=false;
        }
        if(descrpition){
            String s=new String(ch,start,length);
            System.out.println("descrpition:"+s);
            descrpition=false;
        }
        if(calories){
            String s=new String(ch,start,length);
            System.out.println("calories:"+s);
            calories=false;
        }

    }

    public static void main(String[] args) throws ParserConfigurationException,SAXException,IOException{
        try {

            File inputFile = new File("Samplefile.txt");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            Userhandler handler = new Userhandler();
            saxParser.parse("Samplefile.txt", handler);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
