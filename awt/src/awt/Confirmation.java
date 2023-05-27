/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Confirmation extends Frame {

    Label c,l,l2,c2;
    static int total = BookList.total;
    static ArrayList z =BookList.arr;
    TextField t,tt;
    Button conf;
    public Confirmation() {
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        c = new Label("Total Amount : " + total+"tk");
        t= new TextField();
        tt= new TextField();
        t.setBounds(150, 250, 250, 50);
        tt.setBounds(150, 300, 250, 50);
        l=new Label("Address");  
        l.setBounds(40,250, 100,50);  
        l.setFont(new Font("Arial",Font.BOLD,14));
        l2=new Label("Phone No");  
        l2.setBounds(40,300, 100,50);  
        l2.setFont(new Font("Arial",Font.BOLD,14));
        c.setBounds(40, 200, 200, 30);
        c.setFont(new Font("Arial",Font.BOLD,15));
        c.setBackground(Color.green);
        c2=new Label("*All option must be filled up");
        c2.setBackground(Color.red);
        c2.setBounds(40, 50, 220, 30);
        c2.setFont(new Font("Arial",Font.BOLD,15));
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("Cash On Delivery", cbg, false);    
        checkBox1.setBounds(40,100, 200,50);
        checkBox1.setFont(new Font("Arial",Font.BOLD,10));
        Checkbox checkBox2 = new Checkbox("Advance Pay", cbg, true);    
        checkBox2.setBounds(40,150, 200,50);
        checkBox2.setFont(new Font("Arial",Font.BOLD,10));
        conf=new Button("Confirm");
        conf.setBounds(150, 400, 100, 50);
        add(c);add(t);add(tt);add(l);add(l2);add(checkBox1);add(checkBox2);add(c2);add(conf);
        setSize(500, 500);
        setTitle("Confirmation");
        setLayout(null);
        setBackground(Color.gray);
        conf.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae){
        String s="";
        if(checkBox1.getState()){
            s= "Delivery Type : Cash On Delivery";
        }
        else s="Delivery Type : Advance Pay";
        String s1 = "Adress : " +t.getText();
        String s2 = "Phone no : "+tt.getText();
        if (ae.getSource() == conf) { 
                    try { 

                        FileWriter w 
                            = new FileWriter( 
                                "C:/Users/prant/OneDrive/Desktop/Details.txt", true);
                        w.write("***Booklist***\n");
                        for(int i=0;i<z.size();++i){
                            w.write((i+1)+". "+z.get(i)+ "\n");
                        }
                        w.write("Total Cost  : "+total+"tk\n");
                        w.write(s + "\n");
                        w.write(s1 + "\n"); 
                        w.write(s2 + "\n");  
                        w.close(); 
                    } 
                    catch (Exception e) { 
                        System.out.println(e); 
                    } 
}
    }
});
        
        
    }

    public void actionPerformed(ActionEvent e) {
        //setVisible(true);
    }
}
