/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

import static awt.BookList.total;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author User
 */
public class Awt extends Frame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    TextField t,tt;
    Label l,l2,w;
    Button b,b2;
    Awt(){
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
        t= new TextField();
        tt= new TextField();
        t.setBounds(150, 150, 250, 50);
        tt.setBounds(150, 250, 250, 50);
        w = new Label("Welcome to Nayan's Bookshop!");
        w.setBounds(120, 50, 350, 60);
        w.setFont(new Font("Arial",Font.BOLD,20));
        l=new Label("Username");  
        l.setBounds(40,150, 100,50);   
        l.setFont(new Font("Arial",Font.BOLD,14));
        l2=new Label("Password");  
        l2.setBounds(40,250, 100,50);   
        l2.setFont(new Font("Arial",Font.BOLD,14));
        b=new Button("Login");
        b.setBounds(150, 350, 170, 30);
        b.setBackground(Color.green);
        b.addActionListener(this);
        b2=new Button("Request for a ID?");
        b2.setBounds(150, 400, 170, 30);
        b2.setBackground(Color.red);
        b2.addActionListener(this);
        add(b);add(b2);
        add(t);
        add(tt);add(l);add(l2);add(w);
        setBackground(Color.gray);
        setSize(500,500);
        setTitle("User Login");
        setLayout(null);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Frame awt= new Awt();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            //BookList bl=new BookList();
            bookType b=new bookType();
            this.setVisible(false);
            b.setVisible(true);
            
        }
        else if(e.getSource()==b2){
            Request r= new Request();
            this.setVisible(false);
            r.setVisible(true);
            
        }
        /*if(e.getSource()==b){
            Confirmation c=new Confirmation();
            this.setVisible(false);
            c.setVisible(true);
            
        }*/
        //t.setText("Welcome!!!");
        //tt.setText("password");
        //l.setText("Username");
        //l2.setText("Password");
    }
    
}
