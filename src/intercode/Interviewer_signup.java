/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhanu Pratap Singh
 */
public class Interviewer_signup extends javax.swing.JFrame {

    /**
     * Creates new form Interviewer_signup
     */
    
    Signupclass d = null;
    public Interviewer_signup() throws IOException {
        initComponents();
        d = new Signupclass();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pas = new javax.swing.JPasswordField();
        comp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Signup", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 18))); // NOI18N

        jLabel1.setText("Name");

        jLabel4.setText("Password");

        jLabel5.setText("Company");

        jLabel6.setText("Contact no.");

        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });

        jLabel7.setText("Email");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Signup");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(mob, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(mail)
                            .addComponent(pas)
                            .addComponent(comp))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 80, 360, 370);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intercode/int400x500.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
name.setText("");
mail.setText("");
mob.setText("");
pas.setText("");
comp.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String s,se,pass,com,cont;
       
        s = name.getText();
        se = mail.getText();
        cont = mob.getText();
        pass = pas.getText();
        com = comp.getText();
       if(check(s,cont,se,pass)){
        try {
        
       
          d.register("insert into interviewer (password,email,name,company,contact) values ('"+pass+"','"+se+"','"+s+"','"+com+"','"+cont+"')");
          
          
            
            
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Interviewer_signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          String i;
         while(true){
          
          i = d.get();
         if(i.equals("abc")||i.equals("aaa")){System.out.println("Loop breaks");
             break;
         }
         
         }
          if(i.equals("abc")){
          JOptionPane.showMessageDialog(null, "User Registered successfully...");
          this.setVisible(false);
          }
          
          else {
          JOptionPane.showMessageDialog(null, "Email id already Exist..");
          name.setText("");
            mail.setText("");
mob.setText("");
pas.setText("");
comp.setText("");
          
          }}
       else{
           JOptionPane.showMessageDialog(null, "Check your text fields\n1.Email should be correct\n2.Phone no. should only contains no.\n3.Password should not contain space/'='/'!'\n4.Name should contain only alphabets");
       }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interviewer_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interviewer_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interviewer_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interviewer_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interviewer_signup().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Interviewer_signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
 static  boolean check(String a,String b,String c,String o)
    {
        a=a.toLowerCase();
        int d=a.length();
        int i;
        char e;
        for(i=0;i<d;i++)
        {
            e=a.charAt(i);
           if(e=='a'||e=='b'||e=='c'||e=='d'||e=='e'||e=='f'||e=='g'||e=='h'||e=='i'||e=='j'||e=='k'||e=='l'||e=='m'||e=='n'||e=='o'||e=='p'||e=='q'||e=='r'||e=='s'||e=='t'||e=='u'||e=='v'||e=='w'||e=='x'||e=='y'||e=='z'||e==' ')
           {}else return false;
        
        }
        d=b.length();
        if(d==10)
        {
          for(i=0;i<10;i++)
          {
             e=b.charAt(i);
             if(e=='0'||e=='1'||e=='2'||e=='3'||e=='4'||e=='5'||e=='6'||e=='7'||e=='8'||e=='9'){}else return false;
          
          }
        }
        
        else return false;
       d=c.length();
       if(d<10)
           return false;
       // System.out.println(c.charAt(d-10));
       if('@'==c.charAt(d-10))
       { i=c.lastIndexOf('@'); }
       else{ return false;}                            //c=dileep1191999@gmail.com
        String f=c.substring(i);           //f=@gmail.com
       // System.out.println("f="+f);
        String g=c.substring(0, i);        // g=dileep1191999
        g=g.toLowerCase();
        //System.out.println("g="+g);
        if(!f.equalsIgnoreCase("@gmail.com"))
        { System.out.println("mail is wrong");
            return false;}
        int k=g.length();
        for(i=0;i<k;i++)
        {
           e=g.charAt(i);
           if(e=='a'||e=='b'||e=='c'||e=='d'||e=='e'||e=='f'||e=='g'||e=='h'||e=='i'||e=='j'||e=='k'||e=='l'||e=='m'||e=='n'||e=='o'||e=='p'||e=='q'||e=='r'||e=='s'||e=='t'||e=='u'||e=='v'||e=='w'||e=='x'||e=='y'||e=='z'||e=='0'||e=='1'||e=='2'||e=='3'||e=='4'||e=='5'||e=='6'||e=='7'||e=='8'||e=='9')
           {}else {return false;} 
        }
        o=o.toLowerCase();
        d=o.length();
        for(i=0;i<d;i++)
        {
           e=o.charAt(i);
           if(e==' '||e=='='||e=='!')
               return false;
        }
        
        
        
  return true;  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField comp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pas;
    // End of variables declaration//GEN-END:variables
}
