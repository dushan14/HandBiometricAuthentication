package biometricapp.UI;

import biometricapp.Process;
import biometricapp.Profile;
import biometricapp.SignType;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author Dushan
 */
public class HandInputUI extends javax.swing.JFrame {

    SignType signType;

    public HandInputUI(SignType x) {
        initComponents();

        
        signType = x;

        setLocationRelativeTo(null);
        String btntext = getSignTypeAndChangeUi(signType);
        submitButton.setText(btntext);
        
        pinkyTipText.requestFocusInWindow();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pinkyTipText = new javax.swing.JTextField();
        middleTipText = new javax.swing.JTextField();
        ringWidthText = new javax.swing.JTextField();
        ringTipText = new javax.swing.JTextField();
        pinkyHeightText = new javax.swing.JTextField();
        middleWidthText = new javax.swing.JTextField();
        ringHeightText = new javax.swing.JTextField();
        pinkyWidthText = new javax.swing.JTextField();
        thumbWidthText = new javax.swing.JTextField();
        thumbHeightText = new javax.swing.JTextField();
        thumbTipText = new javax.swing.JTextField();
        middleHeightText = new javax.swing.JTextField();
        indexHeightText = new javax.swing.JTextField();
        indexWidthText = new javax.swing.JTextField();
        indexTipText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pinkyTipText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pinkyTipText.setNextFocusableComponent(ringTipText);
        pinkyTipText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkyTipTextActionPerformed(evt);
            }
        });
        jPanel2.add(pinkyTipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));
        pinkyTipText.getAccessibleContext().setAccessibleName("");

        middleTipText.setNextFocusableComponent(indexTipText);
        jPanel2.add(middleTipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 60, -1));

        ringWidthText.setNextFocusableComponent(middleWidthText);
        jPanel2.add(ringWidthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 50, -1));

        ringTipText.setNextFocusableComponent(middleTipText);
        ringTipText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ringTipTextActionPerformed(evt);
            }
        });
        jPanel2.add(ringTipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, -1));

        pinkyHeightText.setNextFocusableComponent(ringHeightText);
        jPanel2.add(pinkyHeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 60, -1));

        middleWidthText.setNextFocusableComponent(indexWidthText);
        middleWidthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleWidthTextActionPerformed(evt);
            }
        });
        jPanel2.add(middleWidthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 60, -1));

        ringHeightText.setNextFocusableComponent(middleHeightText);
        jPanel2.add(ringHeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 60, -1));

        pinkyWidthText.setNextFocusableComponent(ringWidthText);
        jPanel2.add(pinkyWidthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 60, -1));

        thumbWidthText.setNextFocusableComponent(pinkyHeightText);
        thumbWidthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thumbWidthTextActionPerformed(evt);
            }
        });
        jPanel2.add(thumbWidthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 70, -1));

        thumbHeightText.setNextFocusableComponent(nameText);
        jPanel2.add(thumbHeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 60, -1));

        thumbTipText.setNextFocusableComponent(pinkyWidthText);
        jPanel2.add(thumbTipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 60, -1));

        middleHeightText.setNextFocusableComponent(indexHeightText);
        jPanel2.add(middleHeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 70, -1));

        indexHeightText.setNextFocusableComponent(thumbHeightText);
        jPanel2.add(indexHeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 60, -1));

        indexWidthText.setNextFocusableComponent(thumbWidthText);
        jPanel2.add(indexWidthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 60, -1));

        indexTipText.setNextFocusableComponent(thumbTipText);
        jPanel2.add(indexTipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 60, -1));

        submitButton.setText("submit");
        submitButton.setNextFocusableComponent(pinkyTipText);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 120, 50));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 70, -1));

        nameText.setNextFocusableComponent(submitButton);
        jPanel2.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 170, -1));

        nameLabel.setText("Name:");
        jPanel2.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biometricapp/Images/handImage.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 520, 550));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ringTipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ringTipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ringTipTextActionPerformed

    private void middleWidthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleWidthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleWidthTextActionPerformed

    private void thumbWidthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thumbWidthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thumbWidthTextActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new StartUI().show();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void pinkyTipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkyTipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinkyTipTextActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        if (signType == SignType.SIGNIN) {
            try {
                Profile tempProfile = new Profile();
                tempProfile.setHand(val(thumbHeightText.getText()), val(indexHeightText.getText()), val(middleHeightText.getText()), val(ringHeightText.getText()), val(pinkyHeightText.getText()),
                        val(thumbWidthText.getText()), val(indexWidthText.getText()), val(middleWidthText.getText()), val(ringWidthText.getText()), val(pinkyWidthText.getText()),
                        val(thumbTipText.getText()), val(indexTipText.getText()), val(middleTipText.getText()), val(ringTipText.getText()), val(pinkyTipText.getText())
                );

                Profile signedInUserProfile=Process.checkProfile(tempProfile);
                
                if(signedInUserProfile==null){
                    showMessageDialog(null,"No profile found !","Sign In Error",JOptionPane.ERROR_MESSAGE);
                }else{
                
                
                    //user has singed in..
                    
                    System.out.println("UserName: "+signedInUserProfile.getName()+" signed in.");
                    this.dispose();
                    new DashboardUI(signedInUserProfile).show();
                    showMessageDialog(null,"UserName: "+signedInUserProfile.getName()+"\nProfile object: "+signedInUserProfile.toString(),"Signed In Success",JOptionPane.INFORMATION_MESSAGE);
                    
                
                    
                }
                
                
                
                
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Please fill all the fields with correct values");
            }
            
        } else if (signType == SignType.SIGNUP) {
            try {
                Profile newProfile = new Profile();
                newProfile.setHand(val(thumbHeightText.getText()), val(indexHeightText.getText()), val(middleHeightText.getText()), val(ringHeightText.getText()), val(pinkyHeightText.getText()),
                        val(thumbWidthText.getText()), val(indexWidthText.getText()), val(middleWidthText.getText()), val(ringWidthText.getText()), val(pinkyWidthText.getText()),
                        val(thumbTipText.getText()), val(indexTipText.getText()), val(middleTipText.getText()), val(ringTipText.getText()), val(pinkyTipText.getText())
                );
                if (nameText.getText().equals("")) {
                    showMessageDialog(null, "Please fill the name field");
                } else {
                    newProfile.setName(nameText.getText());
                    Process.addProfile(newProfile);
                    this.dispose();
                    new StartUI().show();
                    showMessageDialog(null, "Profile created\n name: " + nameText.getText());

                }
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Please fill all the fields with correct values");
            }
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private float val(String text) {
        return Float.valueOf(text);
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HandInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HandInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HandInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HandInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HandInputUI(SignType.SIGNIN).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField indexHeightText;
    private javax.swing.JTextField indexTipText;
    private javax.swing.JTextField indexWidthText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField middleHeightText;
    private javax.swing.JTextField middleTipText;
    private javax.swing.JTextField middleWidthText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField pinkyHeightText;
    private javax.swing.JTextField pinkyTipText;
    private javax.swing.JTextField pinkyWidthText;
    private javax.swing.JTextField ringHeightText;
    private javax.swing.JTextField ringTipText;
    private javax.swing.JTextField ringWidthText;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField thumbHeightText;
    private javax.swing.JTextField thumbTipText;
    private javax.swing.JTextField thumbWidthText;
    // End of variables declaration//GEN-END:variables

    
    private String getSignTypeAndChangeUi(SignType x) {
        if (x == SignType.SIGNIN) {
            nameLabel.hide();
            nameText.hide();
            return "Sign In";
        } else if (x == SignType.SIGNUP) {
            return "Sign Up";
        }
        return null;
    }
    
    

}
