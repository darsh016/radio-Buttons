import java.awt.*;
import java.awt.event.*;

class Radio_Buttons_Demo1 extends Frame implements ActionListener
{
    Label lb_title, lb_pname, lb_ptype, lb_price, lb_scost;
    TextField tf_pname, tf_price, tf_scost;
    Button but_show, but_close;
    Checkbox rb1, rb2, rb3;
    CheckboxGroup cbg;
    Radio_Buttons_Demo1()
    {
        setSize(1200, 800);
        setVisible(true);
        setLayout(null);
        lb_title= new Label("Implementation of Radio Buttons for Product's Form");
        lb_pname = new Label("Product Name");
        lb_ptype= new Label("Product Type");
        lb_price = new Label("Product's Base Price");
        lb_scost = new Label("Product's Selling Cost");
        tf_pname = new TextField();
        tf_price = new TextField();
        tf_scost = new TextField();
        tf_scost = new TextField();
        cbg= new CheckboxGroup();
        rb1 = new Checkbox ("Imported", cbg, false);
        rb2 = new Checkbox("Domestic", cbg, false);
        rb3 = new Checkbox("Local", cbg, true); but_show= new Button ("Show Result");
        but_close = new Button("Close Form");
        but_show.addActionListener(this);
        but_close.addActionListener(this);


        Font f1, f2, f3;
        f1= new Font("arial black", Font.PLAIN, 36);
        f2 = new Font ("arial", Font. BOLD, 26);
        f3= new Font("times new roman", Font.BOLD, 18);
        lb_title.setFont(f1);
        lb_pname.setFont(f2);
        tf_pname.setFont (f3);
        lb_ptype.setFont (f2);
        lb_price.setFont (f2);
        tf_price.setFont (f3);
        lb_scost.setFont (f2);
        tf_scost.setFont (f3);
        tf_scost.setFont (f3);
        rb1.setFont (f2);
        rb2.setFont(f2);
        rb3.setFont(f2);
        but_show.setFont(f3); 
        but_close.setFont(f3);
        
        add(lb_title);
        add(lb_pname);
        add(tf_pname);
        add(lb_ptype);
        add(rb1);
        add (rb2);
        add (rb3);
        add (lb_price);
        add(tf_price);
        add (but_show);
        add (but_close);
        add (lb_scost);
        add(tf_scost);
        lb_title.setBounds (200, 150, 900, 40); 
        lb_pname.setBounds (100, 300, 200, 35);
        tf_pname.setBounds (450, 300, 400, 35);
        lb_ptype.setBounds (100, 350, 200, 35);
        rb1.setBounds (450, 350, 150, 35); 
        rb2.setBounds (620, 350, 150, 35);
        rb3.setBounds (790, 350, 200, 35); 
        lb_price.setBounds (100, 400, 300, 35);
        tf_price.setBounds (450, 400, 150, 35);
        but_show.setBounds (350, 500, 200, 40);
        but_close.setBounds (600, 500, 200, 40);
        lb_scost.setBounds (100, 620, 300, 35); 
        tf_scost.setBounds (450, 620, 150, 35);
        tf_pname.requestFocus();
        tf_scost.setEditable(false);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if(ae.getSource() == but_show)
        {
            double bp= Double.parseDouble(tf_price.getText());
            double ovr, prof, gst, sprice;
            if(rb1.getState() == true)
                ovr= 65*bp/100;
            else if(rb2.getState() == true)
                ovr=45*bp/100;
            else if(rb3.getState() == true)
                ovr = 25*bp/100;
            else
                ovr = 0;
            prof= 20* bp/100;
            if(bp < 200)
                gst=12 * bp/100;
            else if(bp >= 200 && bp <= 500) 
                gst=15* bp/100; 
            else
                gst=18 * bp/100;
            sprice = bp + ovr + prof+gst; 
            tf_scost.setText(String.valueOf(sprice));
        }    
        else if(ae.getSource() == but_close)
        {
            dispose();
        } 
    }
    
    public static void main(String args[]) {
        Radio_Buttons_Demo1 obj = new Radio_Buttons_Demo1();
        obj.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        System.exit(0);
                    }
                }
            );
    }
}

