import java.awt.*;
import java.awt.event.*;

class radio_Buttons_3 extends Frame implements ItemListener
{
    Label lb_title, lb1, lb2, lb3, lb4;
    TextField tf1, tf2, tf4;
    Button but_show, but_close;
    Checkbox rb1, rb2, rb3;
    CheckboxGroup cbg;
    radio_Buttons_3()
    {
        setSize(1200, 800);
        setVisible(true);
        setLayout(null);
        lb_title = new Label("Demo of ItemListner Interface");
        lb1= new Label("Product Name");
        lb2= new Label("Product Cost");
        lb3= new Label("Product Type");
        lb4= new Label("Applicable Gst");
        tf1= new TextField();
        tf2= new TextField();
        tf4= new TextField();
        cbg= new CheckboxGroup();
        rb1= new Checkbox("Imported", cbg,false);
        rb2= new Checkbox("Domestic", cbg,false);
        rb3= new Checkbox("Local", cbg, false);
       
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);

        Font f1,f2,f3;
        f1= new Font("ariel black", Font.PLAIN, 36);
        f2= new Font("ariel", Font.BOLD, 26);
        f3= new Font("times new roman", Font.BOLD, 18);
        lb_title.setFont(f2);
        lb1.setFont(f2);
        tf1.setFont(f3);
        lb2.setFont(f2);
        lb3.setFont(f2);
        tf2.setFont(f3);
        lb4.setFont(f2);
        tf4.setFont(f3);
        rb1.setFont(f2);
        rb2.setFont(f2);
        rb3.setFont(f2);

        add(lb_title);
        add(lb1);
        add(tf1);
        add(lb2);
        add(rb1);
        add(rb2);
        add(rb3);
        add(lb3);
        add(tf2);
        add(lb4);
        add(tf4);

        lb_title.setBounds(200,150,900,40);
        lb1.setBounds(100, 250, 300, 35);
        tf1.setBounds(450, 250, 500, 35);
        lb2.setBounds(100, 300, 300, 35);
        tf2.setBounds(450, 300, 150, 35);
        lb3.setBounds(100, 350, 200, 35);
        rb1.setBounds(450, 350, 150, 35);
        rb2.setBounds(620, 350, 150, 35);
        rb3.setBounds(790, 350, 200, 35);
        lb4.setBounds(100, 420, 300, 35);
        tf4.setBounds(450, 420, 150, 35);
    }

    public void itemStateChanged(ItemEvent ie)
        {
            double pc = Double.parseDouble(tf2.getText());
            double gst;
            if(rb1.getState()== true)
                gst= 18 * pc/100;
            else if(rb2.getState()== true)
                gst= 12 * pc/100;
            else if(rb3.getState()== true) 
                gst= 9 * pc/100;
            else
                gst=0;
            tf4.setText(String.valueOf(gst));               

        }
    public static void main(String args[]) {
        radio_Buttons_3 obj = new radio_Buttons_3();
        obj.addWindowListener(
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we) {
                        System.exit(0);
                    }
                }
            );
    }





}        