package com.mycompany.firstframe;

import javax.swing.JOptionPane;

public class SemestersGPA extends javax.swing.JFrame {
    public static double g=0;
    public static double c=0;
    //public double TotalGrade=0;

    public SemestersGPA() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        epdata = new javax.swing.JLabel();
        cgpa = new javax.swing.JLabel();
        tcHours = new javax.swing.JLabel();
        gpaT = new javax.swing.JTextField();
        chT = new javax.swing.JTextField();
        enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        epdata.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        epdata.setText("Enter Previous Data");

        cgpa.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        cgpa.setText("CGPA");

        tcHours.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tcHours.setText("Total Cradit Hours");

        gpaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaTActionPerformed(evt);
            }
        });

        enter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(cgpa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tcHours)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(epdata)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(gpaT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enter)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(epdata)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cgpa)
                    .addComponent(tcHours))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gpaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(enter)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gpaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaTActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
        try{
            g=Double.parseDouble(gpaT.getText());
            c=Double.parseDouble(chT.getText());
            
            if(g>0 && c>0){
                this.dispose();
                ThirdFrame obj1= new ThirdFrame();               
            }
            else{
                throw new ArithmeticException("Your Enter Large Number of Subject");
            }
           
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(rootPane,"You enter invalid data");
        }catch(Exception e){ 
            JOptionPane.showMessageDialog(rootPane,"You enter Textual Data instead of number");
        }
        
    }//GEN-LAST:event_enterActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SemestersGPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cgpa;
    private javax.swing.JTextField chT;
    private javax.swing.JButton enter;
    private javax.swing.JLabel epdata;
    private javax.swing.JTextField gpaT;
    private javax.swing.JLabel tcHours;
    // End of variables declaration//GEN-END:variables
}
