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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author simou
 */
public class app2 extends javax.swing.JFrame {
    DefaultTableModel TabModel,TabModel2,TabModel3,TabModel4;
    static  String username="root";
    static String passwd="";
   static  String conc="jdbc:mysql://localhost/simou";
  static  Connection cnxDB;
   static Statement createST;
   static ResultSet Result;
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
        addPlanceholderStyle(jTextField4);
      //  AffichData("controleacce");
                
        
        //connectionDB();
       // CreateTable("controleAcce");
       // AjouterDATA("app1",nom ,Prenom,passw);
        
        
    }
        
       public static  Connection  connectionDB(){
           
             try{ 
           cnxDB=DriverManager.getConnection(conc, username, passwd);
              
             
             System.out.println("good connection");
             return cnxDB;
             }
              catch(SQLException e ){
           e.printStackTrace();
              return null;}
           
       }
     
      public static void CreateTable(String l){
            
             try{
              String c="CREATE TABLE "+l+" ("+"id int auto_increment primary key"+","+"nom varchar(13)"+","+"Prenom varchar(13)"+","+"passwd varchar(13)"+","+"gmail varchar(20)"+")";
             
              cnxDB=connectionDB();
              createST=cnxDB.createStatement();
             
              createST.executeUpdate(c);}
            catch(SQLException e ){
                 e.printStackTrace();
            }
             }
     
     
     
     
     public  void AjouterDATA(String tableName,String  Nom ,String Prenom,String Passwd,String gmail){
        try{ 
          
          String l="insert into "+tableName+"(" +"nom"+","+"Prenom"+","+"passwd"+","+"gmail"+")"+" VALUES"+"("+"\""+Nom+"\""+","+"\""+Prenom+"\""+"," +"\""+Passwd+"\""+","+"\""+gmail+"\""+")";
          cnxDB=connectionDB();
          createST=cnxDB.createStatement();
          createST.executeUpdate(l);  
           
        }
       catch(SQLException e ){
           e.printStackTrace();
        // String l="insert into info VALUES"+"("+12+","+"\"simou\""+");";
         //System.out.print(l);
       }}
     
     public void DeleteData(String tableName)
     {
         try{
             cnxDB=connectionDB();
             String l="delete from "+tableName+" where " +"gmail="+"\""+selectGmail+"\"";
             createST=cnxDB.createStatement();
             createST.executeUpdate(l);
             
             
         }
         catch(SQLException e){
             e.printStackTrace();
         }
     }
     public void AffichData(String tableName){
         try{
             cnxDB=connectionDB();
             String sql ="select nom,Prenom,gmail from "+tableName;
             createST=cnxDB.createStatement();
             Result=createST.executeQuery(sql);
             String[] data =new String[3];
              TabModel2=(DefaultTableModel) jTable1.getModel();
             while(Result.next()){
                        
                        String No=Result.getString("nom");
                        String Pre=Result.getString("Prenom");
                        String Gma=Result.getString("gmail");
                        data[0]=No;  
                        data[1]=Pre;
                        data[2]=Gma;
                       // System.out.print("Nom ="+No);
                        TabModel2.addRow(data);
                       
                    }              
         }
         catch(SQLException e){
             e.printStackTrace();
         }
        
     }
     public void recuperDATA(String tableName){
     try{
             cnxDB=connectionDB();
             String sql ="select nom,Prenom,gmail from "+tableName+" where concat(nom,' ',prenom) like"+"\""+"%"+ValueChercher+"%"+"\"";
             createST=cnxDB.createStatement();
             Result=createST.executeQuery(sql);
              String[] DATA =new String[3];
              TabModel3=(DefaultTableModel) jTable1.getModel();
             TabModel3.setRowCount(0);
              while(Result.next()){
                 String nom=Result.getString("nom");
                 String Prenom=Result.getString("Prenom");
                 String gmail=Result.getString("gmail");
                DATA[0]=nom;
                DATA[1]=Prenom;
                DATA[2]=gmail;
                
                TabModel3.addRow(DATA);
                 }
            
            
     
      
      
      }
     
     catch(SQLException e ){
         e.printStackTrace();
     }
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
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

        jTextField2.setBackground(new java.awt.Color(255, 204, 204));
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

        jPasswordField1.setBackground(new java.awt.Color(255, 204, 204));
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

        jPasswordField2.setBackground(new java.awt.Color(255, 204, 204));
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

        jButton1.setBackground(new java.awt.Color(255, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jButton1.setText("inscrire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(255, 204, 204));
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

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prénom", "Gmail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField4.setText("Chercher");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //System.out.println("nom :" +nom);
        //System.out.println("Prenom :" +Prenom);
        AjouterDATA("controleAcce",nom ,Prenom,passw,gmail);
        TabModel=(DefaultTableModel) jTable1.getModel();
        String data[] ={nom,Prenom,gmail};
        TabModel.addRow(data);
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
       // nom=jTextField1.getText();
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
       //Prenom= jTextField2.getText();
    }                                           

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
         //passw=new String(jPasswordField1.getPassword());      
        //paswd=jPasswordField1.getPassword();
    }                                               

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        //copassw=new String(jPasswordField2.getPassword());
    }                                               

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        //jTextField1.setText("Mode pass");
       
         nom=jTextField1.getText();
    }                                     

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        Prenom= jTextField2.getText();
    }                                     

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {                                          
        // TODO add your handling code here:
        passw=new String(jPasswordField1.getPassword());
    }                                         

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {                                          
        // TODO add your handling code here:
        copassw=new String(jPasswordField2.getPassword());

    }                                         

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
     //   jTextField1.setText("Mode pass");
     if(jTextField1.getText().equals("Name")){
         
         jTextField1.setText(null);
         jTextField1.requestFocus();
         removePlanceholderStyle(jTextField1);
         
     }
        
    }                                       

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        
    }                                           

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        if(jTextField2.getText().equals("Prénom")){
         
         jTextField2.setText(null);
         jTextField2.requestFocus();
         removePlanceholderStyle(jTextField2);
         
     }
    }                                       

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        if(jTextField3.getText().equals("gmail")){
         
         jTextField3.setText(null);
         jTextField3.requestFocus();
         removePlanceholderStyle(jTextField3);
         
     }
    }                                       

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {                                            
        // TODO add your handling code here:
        if(jPasswordField1.getText().equals("passwd")){
         
         jPasswordField1.setText(null);
         jPasswordField1.requestFocus();
         removePlanceholderStyle(jPasswordField1);
         
     }
    }                                           

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {                                            
        // TODO add your handling code here:
        if(jPasswordField2.getText().equals("confirm passwd")){
         
         jPasswordField2.setText(null);
         jPasswordField2.requestFocus();
         removePlanceholderStyle(jPasswordField2);
         
     }
    }                                           

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        gmail=jTextField3.getText();
       
    }                                     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(IndexRow!=-1)
        TabModel.removeRow(IndexRow);
        DeleteData("controleacce");
        
    }                                        

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:

    }                                    

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        IndexRow =jTable1.getSelectedRow();
        IndexColn=jTable1.getSelectedColumn();
        selectGmail =String.valueOf(TabModel.getValueAt(IndexRow, 2));

        //String c =jTable1.getColumnName(IndexColn);
        //System.out.print("column name is "+selectGmail);

    }                                    

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        if(jTextField4.getText().length()==0){
         addPlanceholderStyle(jTextField4);
         jTextField4.setText("Chercher");
         TabModel4=(DefaultTableModel) jTable1.getModel() ;
         TabModel4.setRowCount(0);
         AffichData("controleacce");
        
        
        }
    }                                     

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        if(jTextField4.getText().equals("Chercher")){
         
         jTextField4.setText(null);
         jTextField4.requestFocus();
         removePlanceholderStyle(jTextField4);
         
     }
    }                                       

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {                                       
        // TODO add your handling code here:
        this.requestFocus();
    }                                      

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
         ValueChercher =jTextField4.getText();
         //jTable1.removeAll();
         recuperDATA("controleacce");
        
    }                                           

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
    static  String nom;
   static  String Prenom;
   static String gmail;
    static String passw;
    String copassw;
    int IndexRow;
    int IndexColn;
    String selectGmail;
    String ValueChercher;
}
