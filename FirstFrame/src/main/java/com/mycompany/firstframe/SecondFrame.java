package com.mycompany.firstframe;

import javax.swing.JOptionPane;

public class SecondFrame extends javax.swing.JFrame {
    
    char se='a';
   
    public static int semester=0, subject=0;
    public SecondFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sem = new javax.swing.JComboBox<>();
        Enter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NofSubject = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Enter Semester");

        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8", " " }));
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });

        Enter.setBackground(new java.awt.Color(0, 0, 0));
        Enter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter.setForeground(new java.awt.Color(255, 255, 255));
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("Enter Number of Subject in Semster");

        NofSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NofSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(NofSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Enter)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(NofSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Enter)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        // TODO add your handling code here:
    try{
        String text1= sem.getSelectedItem().toString();
        se=text1.charAt(9);
        semester= Character.getNumericValue(se);
        
        String text2= NofSubject.getText();
        subject= Integer.parseInt(text2);
        if(subject>10 || subject <0){
            throw new ArithmeticException("Your Enter Large Number of Subject");
        }    
        if(semester == 1){
            this.dispose();
            ThirdFrame obj1= new ThirdFrame();
        }    
        else{
            this.dispose();
            SemestersGPA obj2= new SemestersGPA();
            obj2.setVisible(true);
        }
    }catch(ArithmeticException e){
        JOptionPane.showMessageDialog(rootPane,"Please enter Number of Subjects between 0 to 10");
    }
    catch(Exception e){ 
            JOptionPane.showMessageDialog(rootPane,"You enter invalid Data");
    }   
    }//GEN-LAST:event_EnterActionPerformed

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_semActionPerformed

    private void NofSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NofSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NofSubjectActionPerformed
   public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JTextField NofSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> sem;
    // End of variables declaration//GEN-END:variables
}
