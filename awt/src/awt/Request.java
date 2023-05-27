/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author User
 */
public class Request extends Frame implements ActionListener{
    TextField t,tt;
    Label l,l2,w;
     Button b,b2;
    Request(){
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
        t= new TextField();
        tt= new TextField();
        t.setBounds(150, 150, 250, 50);
        tt.setBounds(150, 250, 250, 50);
        w = new Label("Request for a user ID");
        w.setBounds(120, 50, 350, 60);
        w.setFont(new Font("Arial",Font.BOLD,15));
        l=new Label("Full Name");  
        l.setBounds(40,150, 100,50);   
        l.setFont(new Font("Arial",Font.BOLD,14));
        l2=new Label("Email");  
        l2.setBounds(40,250, 100,50);   
        l2.setFont(new Font("Arial",Font.BOLD,14));
        b=new Button("Send Request");
        b.setBounds(150, 350, 170, 30);
        b2=new Button("Back");
        b2.setBounds(150, 400, 170, 30);
        b2.addActionListener(this);
        add(b);add(b2);
        add(t);
        add(tt);add(l);add(l2);add(w);
        setBackground(Color.gray);
        setSize(500,500);
        setTitle("Request a ID");
        setLayout(null);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            this.setVisible(false);
            new Awt();
        }
    }
}
