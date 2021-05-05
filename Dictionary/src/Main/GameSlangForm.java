/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author HO TRUNG HIEU
 */
public class GameSlangForm extends javax.swing.JDialog {
    private MainForm mainForm;
    private Dictionary dictionary = new Dictionary();
    private TreeMap<String, String> treeChoose = new TreeMap<String, String>();
    private String resultKey;
    /**
     * Creates new form GameSlang
     */
    public GameSlangForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mainForm = (MainForm) parent;
        this.LoadGame();
    }
    
    public void LoadGame() {
        SlangsManage slangsManage = this.mainForm.getSlangsManage();
//        int sizeSlang = slangsManage.treeSlang.size();
//        int result = ThreadLocalRandom.current().nextInt(0, sizeSlang);
//        int chooseA = ThreadLocalRandom.current().nextInt(0, sizeSlang);
//        int chooseB = ThreadLocalRandom.current().nextInt(0, sizeSlang);
//        int chooseC = ThreadLocalRandom.current().nextInt(0, sizeSlang);

        int[] arrRandom = GetArrayRandom(slangsManage);
        
        int randomQuestion =  ThreadLocalRandom.current().nextInt(0, 4);
        
        this.resultKey = (String) slangsManage.treeSlang.keySet().toArray()[arrRandom[randomQuestion]];
        String question = "The slang: " + this.resultKey + " has defign is?";
        lblQuestion.setText(question);
        
        String keyA = (String) slangsManage.treeSlang.keySet().toArray()[arrRandom[0]];
        String keyB = (String) slangsManage.treeSlang.keySet().toArray()[arrRandom[1]];
        String keyC = (String) slangsManage.treeSlang.keySet().toArray()[arrRandom[2]];
        String keyD = (String) slangsManage.treeSlang.keySet().toArray()[arrRandom[3]];

        String difignA = slangsManage.treeSlang.get(keyA);
        String difignB = slangsManage.treeSlang.get(keyB);
        String difignC = slangsManage.treeSlang.get(keyC);
        String difignD = slangsManage.treeSlang.get(keyD);

        this.treeChoose.put(keyA, difignA);
        this.treeChoose.put(keyB, difignB);
        this.treeChoose.put(keyC, difignC);
        this.treeChoose.put(keyD, difignD);
        
        
        rdoA.setText(difignA);
        rdoB.setText(difignB);
        rdoC.setText(difignC);
        rdoD.setText(difignD);
        
        rdoA.setActionCommand(difignA);
        rdoB.setActionCommand(difignB);
        rdoC.setActionCommand(difignC);
        rdoD.setActionCommand(difignD);

        //rdoB.setText(slangsManage.treeSlang.get(arrRandom[1]));
        //rdoC.setText(slangsManage.treeSlang.get(arrRandom[2]));
        //rdoD.setText(slangsManage.treeSlang.get(arrRandom[3]));

        //String keyRandom = (String) this.slangsManage.treeSlang.keySet().toArray()[randomNum];
        // String valueRandom = this.slangsManage.treeSlang.get(keyRandom);
        // String result = "Slang random: " + keyRandom + ": " + valueRandom;
        //JOptionPane.showMessageDialog(this, result);
    }

    public int[] GetArrayRandom(SlangsManage slangsManage) {
        int[] temp = new int[4];
        
        int sizeSlang = slangsManage.treeSlang.size();
        int A = ThreadLocalRandom.current().nextInt(0, sizeSlang);
        int B = ThreadLocalRandom.current().nextInt(0, sizeSlang);
        int C = ThreadLocalRandom.current().nextInt(0, sizeSlang);
        int D = ThreadLocalRandom.current().nextInt(0, sizeSlang);
        
        temp[0] = A;
        temp[1] = B;
        temp[2] = C;
        temp[3] = D;

        
        if(A == B || A == C || A == D || B == C || B == D || C == D) {
            return GetArrayRandom(slangsManage);
        }
        
        return temp;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoGourp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdoA = new javax.swing.JRadioButton();
        rdoB = new javax.swing.JRadioButton();
        rdoC = new javax.swing.JRadioButton();
        rdoD = new javax.swing.JRadioButton();
        lblQuestion = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Game Funny Choonse Defign");
        jLabel1.setToolTipText("");

        jLabel2.setText("Choonse Defign corect");

        rdoGourp.add(rdoA);
        rdoA.setText("jRadioButton1");

        rdoGourp.add(rdoB);
        rdoB.setText("jRadioButton2");

        rdoGourp.add(rdoC);
        rdoC.setText("jRadioButton3");
        rdoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCActionPerformed(evt);
            }
        });

        rdoGourp.add(rdoD);
        rdoD.setText("jRadioButton4");

        lblQuestion.setText("This slang is mean?");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnCancel)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rdoA, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                .addComponent(rdoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdoD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(lblQuestion)
                .addGap(18, 18, 18)
                .addComponent(rdoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoC)
                .addGap(6, 6, 6)
                .addComponent(rdoD)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(rdoGourp.getSelection() != null) {
            String answer = rdoGourp.getSelection().getActionCommand();
            String result = this.treeChoose.get(this.resultKey);
            if(answer == result) {
                int confirmR = JOptionPane.showConfirmDialog(this, "Amazing good Job Em! Continue?");
                if(confirmR == JOptionPane.YES_OPTION) {
                    rdoGourp.clearSelection();
                    this.LoadGame();
                } else {
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(this, "You wrong");
            }
            
            
        }else {
            JOptionPane.showMessageDialog(this, "Please choose answer");
        }
        
       
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(GameSlangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameSlangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameSlangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameSlangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameSlangForm dialog = new GameSlangForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JRadioButton rdoA;
    private javax.swing.JRadioButton rdoB;
    private javax.swing.JRadioButton rdoC;
    private javax.swing.JRadioButton rdoD;
    private javax.swing.ButtonGroup rdoGourp;
    // End of variables declaration//GEN-END:variables
}
