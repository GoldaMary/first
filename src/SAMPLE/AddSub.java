package SAMPLE;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 7/25/18.
 */
public class AddSub implements ActionListener{
    private JButton button1;
    private JButton button2;
    private JPanel panel1;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JLabel label1,label2,label3;

    AddSub(){

        JFrame frame=new JFrame("Second App");
        button1=new JButton("Add");
        button2= new JButton("Sub");
        textField1=new JTextField();
        textField2=new JTextField();
        textField3=new JTextField();
        label1=new JLabel("First number");
        label2=new JLabel("Second number");
        label3=new JLabel("Result");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(button1);
        frame.add(button2);
        button1.setBounds(100,400,70,30);
        button1.addActionListener(this);
        button2.setBounds(200,400,70,30);
        button2.addActionListener(this);
        textField1.setBounds(120,100,90,30);
        textField2.setBounds(120,200,90,30);
        textField3.setBounds(120,300,90,30);
        label1.setBounds(70,75,90,30);
        label2.setBounds(70,175,90,30);
        label3.setBounds(70,275,90,30);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button1){
          int i1=Integer.parseInt(textField1.getText());
          int i2=Integer.parseInt(textField2.getText());
          int i3=i1+i2;
          textField3.setText(Integer.toString(i3));
        }

        if(e.getSource()==button2){
            int i1=Integer.parseInt(textField1.getText());
            int i2=Integer.parseInt(textField2.getText());
            int i3=i1-i2;
            textField3.setText(Integer.toString(i3));
        }
    }

    public static void main(String[] args) {

        new AddSub();
    }


}
