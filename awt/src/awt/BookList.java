/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BookList extends Frame implements ActionListener{
    Button book;
    public static int total=0;

    static ArrayList<String> arr=new ArrayList<>();
    
    public BookList(){
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        Checkbox c1 = new Checkbox("Programming Contest: DSA @306tk");  
        c1.setBounds(100,100, 350,50);  
        Checkbox c2 = new Checkbox("Computer Graphics : A Programming Approach @1337tk");  
        c2.setBounds(100,150, 350,50);  
        Checkbox c3 = new Checkbox("Programming in Scratch @230tk");  
        c3.setBounds(100,200, 350,50);  
        Checkbox c4 = new Checkbox("Computer Fundamentals And Programming @665tk");  
        c4.setBounds(100,250, 350,50);  
        Checkbox c5 = new Checkbox("Programming In Java @927tk");  
        c5.setBounds(100,300, 350,50);  
        Checkbox c6 = new Checkbox("Introduction to Programming with Java @1975tk");  
        c6.setBounds(100,350, 350,50);  
        book=new Button("Proceed");
        book.setBounds(100, 400, 100, 50);
        add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(book);
        c1.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1){
                     total+=306;
                     arr.add(c1.getLabel());
                 }
             }  
          });  
        c2.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1){
                     total+=1337;
                     arr.add(c2.getLabel());
                 }
             }  
          });  
        c3.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1){
                     total+=230;
                     arr.add(c3.getLabel());
                 }
             }  
          });  
        c4.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1){
                     total+=665;
                     arr.add(c4.getLabel());
                 }
             }  
          });  
        c5.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1){
                     total+=927;
                     arr.add(c5.getLabel());
                 }
             }  
          });  
        c6.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1){
                     total+=1975;
                     arr.add(c6.getLabel());
                 }
             }  
          });  
        setSize(500,500);
        setTitle("Booklist");
        setLayout(null);
        setBackground(Color.lightGray);
        book.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae){
    Confirmation c=new Confirmation();
            setVisible(false);
            c.setVisible(true);
}
});
    }
    public static void main(String[] args) {
        Frame b=new BookList();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        /*if(e.getSource()==book){
            Confirmation c=new Confirmation();
            this.setVisible(false);
            c.setVisible(true);
            
        }*/
    }
    
}
