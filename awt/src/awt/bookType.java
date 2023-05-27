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

/**
 *
 * @author User
 */
public class bookType extends Frame implements ActionListener{
    Choice c;
    Button b;
    public bookType() {
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        Label l=new Label("*Select a Book type");
        l.setBounds(150,100, 150,30);
        l.setFont(new Font("Arial",Font.BOLD,14));
        l.setBackground(Color.red);
        c=new Choice();  
        c.setBounds(130,250, 200,100);  
        c.add("Thriller");  
        c.add("Programming");  
        c.add("Novel");  
        c.add("Comics");  
        c.add("Horror");
        c.setFont(new Font("Arial",Font.BOLD,12));
        b= new Button("OK");
        b.setBounds(200,300, 25,25);
        b.addActionListener(this);
        add(c);add(b);add(l);
        setSize(500,500);
        setTitle("Book Type");
        setBackground(Color.lightGray);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            BookList bl=new BookList();
            this.setVisible(false);
            bl.setVisible(true);
        }
    }
    
        
}
