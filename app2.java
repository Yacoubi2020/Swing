/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject2;
import static com.google.protobuf.JavaType.MESSAGE;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.color.*;
import java.awt.font.*;
import javax.swing.JTextField;
/**
 *
 * @author simou
 */
public class app2 extends javax.swing.JFrame {
 static  String username="root";
    static String passwd="";
   static  String conc="jdbc:mysql://localhost/simou";
  static  Connection k;
   static Statement n;
   static ResultSet d;
    /**
     * Creates new form app2
     */
    public app2() {
        initComponents();
        setVisible(true);
        addPlanceholderStyle(jTextField1);
        addPlanceholderStyle(jPasswordField1);
        addPlanceholderStyle(jTextField2);
 
        addPlanceholderStyle(jPasswordField2);
          addPlanceholderStyle(jTextField3);
        
        
        //connectionDB();
       // CreateTable("controleAcce");
       // AjouterDATA("app1",nom ,Prenom,passw);
        
        
    }
       public static  Connection  connectionDB(){
           
             try{ 
           k=DriverManager.getConnection(conc, username, passwd);
              
             
             System.out.print("good connection");
             return k;
             }
              catch(SQLException e ){
           e.printStackTrace();
              return null;}
           
       }
     
      public static void CreateTable(String l){
            
             try{
              String c="CREATE TABLE "+l+" ("+"id int auto_increment primary key"+","+"nom varchar(13)"+","+"Prenom varchar(13)"+","+"passwd varchar(13)"+","+"gmail varchar(20)"+")";
             
              k=connectionDB();
              n=k.createStatement();
             
              n.executeUpdate(c);}
            catch(SQLException e ){
                 e.printStackTrace();
            }
             }
     
     
     
     
     public  void AjouterDATA(String tableName,String  Nom ,String Prenom,String Passwd,String gmail){
        try{ 
          
          String l="insert into "+tableName+"(" +"nom"+","+"Prenom"+","+"passwd"+","+"gmail"+")"+" VALUES"+"("+"\""+Nom+"\""+","+"\""+Prenom+"\""+"," +"\""+Passwd+"\""+","+"\""+gmail+"\""+")";
          k=connectionDB();
          n=k.createStatement();
          n.executeUpdate(l);  
           
        }
       catch(SQLException e ){
           e.printStackTrace();
        // String l="insert into info VALUES"+"("+12+","+"\"simou\""+");";
         //System.out.print(l);
       }}
     public static void LireDB(String table){
       String l="select * from "+table+" where nom="+nom+" and Prenom="+Prenom+" and gmail=";
     }
     public void addPlanceholderStyle(JTextField txt){
         Font font=txt.getFont();
         font=font.deriveFont(Font.ITALIC);
         txt.setFont(font);
         txt.setForeground(Color.gray);
         
     }
      public void removePlanceholderStyle(JTextField txt){
         Font font=txt.getFont();
         font=font.deriveFont(Font.BOLD);
         txt.setFont(font);
         txt.setForeground(Color.BLACK);
         
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setText("Name");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setText("Prénom");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField1.setText("passwd");
        jPasswordField1.setEchoChar('\u0000');
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField2.setText("confirm passwd");
        jPasswordField2.setEchoChar('\u0000');
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("inscrire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setText("gmail");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jPasswordField1)
                    .addComponent(jPasswordField2)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("nom :" +nom);
        System.out.println("Prenom :" +Prenom);
        AjouterDATA("controleAcce",nom ,Prenom,passw,gmail);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
       // nom=jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
       //Prenom= jTextField2.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
         //passw=new String(jPasswordField1.getPassword());      
        //paswd=jPasswordField1.getPassword();
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
        //copassw=new String(jPasswordField2.getPassword());
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        //jTextField1.setText("Mode pass");
       
         nom=jTextField1.getText();
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        Prenom= jTextField2.getText();
    }//GEN-LAST:event_jTextField2FocusLost

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
        passw=new String(jPasswordField1.getPassword());
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        // TODO add your handling code here:
        copassw=new String(jPasswordField2.getPassword());

    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
     //   jTextField1.setText("Mode pass");
     if(jTextField1.getText().equals("Name")){
         
         jTextField1.setText(null);
         jTextField1.requestFocus();
         removePlanceholderStyle(jTextField1);
         
     }
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        if(jTextField2.getText().equals("Prénom")){
         
         jTextField2.setText(null);
         jTextField2.requestFocus();
         removePlanceholderStyle(jTextField2);
         
     }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        if(jTextField3.getText().equals("gmail")){
         
         jTextField3.setText(null);
         jTextField3.requestFocus();
         removePlanceholderStyle(jTextField3);
         
     }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        if(jPasswordField1.getText().equals("passwd")){
         
         jPasswordField1.setText(null);
         jPasswordField1.requestFocus();
         removePlanceholderStyle(jPasswordField1);
         
     }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        // TODO add your handling code here:
        if(jPasswordField2.getText().equals("confirm passwd")){
         
         jPasswordField2.setText(null);
         jPasswordField2.requestFocus();
         removePlanceholderStyle(jPasswordField2);
         
     }
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        gmail=jTextField3.getText();
    }//GEN-LAST:event_jTextField3FocusLost

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    static  String nom;
   static  String Prenom;
   static String gmail;
    static String passw;
    String copassw;
}