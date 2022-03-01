package com.mycompany.firstframe;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FirstFrame extends javax.swing.JFrame {
   
    public FirstFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cms = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("CGPA Calculator");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Enter CMS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter Password");

        cms.setText("000-00-0000");
        cms.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmsFocusLost(evt);
            }
        });
        cms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmsActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        password.setText("0000");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("GPA               Marks                Marks");

        jLabel5.setText("4.0                          93-100                      46-50 ");

        jLabel6.setText("3.67                        87-92                        44-45");

        jLabel7.setText("3.33                        82-86                        42-43");

        jLabel8.setText("3.00                        77-81                        39-41");

        jLabel9.setText("2.67                        72-76                        37-38");

        jLabel10.setText("2.3                          68-71                        35-36");

        jLabel11.setText("2.0                          64-67                        32-34");

        jLabel12.setText("1.67                        60-63                        30-31");

        jLabel13.setText("0.00                        0-59                          0-29");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72)
                        .addComponent(cms, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancel)
                                .addGap(86, 86, 86)
                                .addComponent(login))
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addComponent(login))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(2, 2, 2)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        boolean c=false, pass= false;
            String cmS= cms.getText();
            String pas= password.getText();
            
            if(cmS.length()== 11 && cmS.charAt(3)== 45 && cmS.charAt(6)==45){
                c=true;
                for(int i=0; i<3;i++){
                    if((cmS.charAt(i)!='1' && cmS.charAt(i)!='2' && cmS.charAt(i)!='3' && cmS.charAt(i)!='4' && cmS.charAt(i)!='5' && cmS.charAt(i)!='6' && cmS.charAt(i)!='7' && cmS.charAt(i)!='8' && cmS.charAt(i)!='9' && cmS.charAt(i)!='0' )){
                        c= false;
                    }
                }
                for(int i=4; i<6;i++){
                    if((cmS.charAt(i)!='1' && cmS.charAt(i)!='2' && cmS.charAt(i)!='3' && cmS.charAt(i)!='4' && cmS.charAt(i)!='5' && cmS.charAt(i)!='6' && cmS.charAt(i)!='7' && cmS.charAt(i)!='8' && cmS.charAt(i)!='9' && cmS.charAt(i)!='0' )){
                        c= false;
                    }
                }
                for(int i=7; i<11;i++){
                    if((cmS.charAt(i)!='1' && cmS.charAt(i)!='2' && cmS.charAt(i)!='3' && cmS.charAt(i)!='4' && cmS.charAt(i)!='5' && cmS.charAt(i)!='6' && cmS.charAt(i)!='7' && cmS.charAt(i)!='8' && cmS.charAt(i)!='9' && cmS.charAt(i)!='0' )){
                        c= false;
                    }
                }
            }
            if(pas.length()==4){
                pass=true;
                for(int i=0; i<4;i++){
                    if((pas.charAt(i)!='1' && pas.charAt(i)!='2' && pas.charAt(i)!='3' && pas.charAt(i)!='4' && pas.charAt(i)!='5' && pas.charAt(i)!='6' && pas.charAt(i)!='7' && pas.charAt(i)!='8' && pas.charAt(i)!='9' && pas.charAt(i)!='0' )){
                        pass= false;
                    }
                }
            }
            if(pass== true && c== true){
                this.dispose();
                SecondFrame obj = new SecondFrame();
                obj.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Enter Valid Patteran \n Password xxx-xx-xxxx (0-9) \n Code           xxxx (0-9)");
            }
    }//GEN-LAST:event_loginActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
      System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void cmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmsActionPerformed

    private void cmsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmsFocusGained
  
        if(cms.getText().equals("000-00-0000")){
            cms.setText("");
            cms.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_cmsFocusGained

    private void cmsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmsFocusLost
        if(cms.getText().equals("")){
            cms.setText("000-00-0000");
            cms.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_cmsFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(password.getText().equals("0000")){
            password.setText("");
            password.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
       if(password.getText().equals("")){
            password.setText("0000");
            password.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordFocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
