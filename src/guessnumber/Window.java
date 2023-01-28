/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guessnumber;

import javax.swing.JOptionPane;

/**
 *
 * @author SERGIO
 */
public class Window extends javax.swing.JFrame {
    
    private static final int MAX_ATTEMPS = 5;
    private int attemps = MAX_ATTEMPS;
    private int number = getRandomNumber();
    
    //Generates a random number between 1 and 100
    private static int getRandomNumber() {
        return (int) ((Math.random()*100)+1);
    }
    
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        setLocationRelativeTo(null);
        jLabelAttemps.setText("Number of attemps: " + attemps);
    }

    //Returns a random number between 1 and 100
    private int generateRandomNumber(){
        return ((int) (Math.random()*100)) + 1;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTextFieldNumber = new javax.swing.JTextField();
        jButtonTry = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelAttemps = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuNew = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guess the number");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 350));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTextFieldNumber.setColumns(10);
        jTextFieldNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jTextFieldNumber, gridBagConstraints);

        jButtonTry.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonTry.setText("Try your luck");
        jButtonTry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTryActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weighty = 3.6;
        getContentPane().add(jButtonTry, gridBagConstraints);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setText("Guess a number between 1 and 100");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 78;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(3, 1, 3, 1);
        getContentPane().add(jLabelTitle, gridBagConstraints);

        jLabelAttemps.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabelAttemps, gridBagConstraints);

        jMenuFile.setText("File");

        jMenuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessnumber/icons/new.png"))); // NOI18N
        jMenuNew.setText("New Game");
        jMenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuNew);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessnumber/icons/exit.png"))); // NOI18N
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemExit);

        jMenuBar1.add(jMenuFile);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumberActionPerformed
    
    private void disableElements() {
        jTextFieldNumber.setEnabled(false);
        jButtonTry.setEnabled(false);
    }
    
    private void enableElements() {
        jTextFieldNumber.setEnabled(true);
        jButtonTry.setEnabled(true);
    }
    
    private void lose() {
        JOptionPane.showMessageDialog(this, "You have lost!");
        disableElements();
    }
    
    private void newGame (){
        number = getRandomNumber();
        attemps = MAX_ATTEMPS;
        enableElements();
        jLabelAttemps.setText("Number of attemps: " + attemps);
    }
    
    private void jButtonTryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTryActionPerformed
        int value = 0;
        try {
            value = Integer.parseInt(jTextFieldNumber.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You must introduce a numeric value.", "Wrong value.", JOptionPane.ERROR_MESSAGE);
        }
        if ((value < 0) || (value > 100)){
            JOptionPane.showMessageDialog(this, "The number must be bigger or equal than 0 and smaller or equal than 100.");
            return;
        }
        if (value == number) {
            JOptionPane.showMessageDialog(this, "Correct! The number is " + number);
            disableElements();
            return;
        } else if (attemps > 0) {
            if (value < number){
                JOptionPane.showMessageDialog(this, "The number is bigger than " + value);
                attemps--;
                jLabelAttemps.setText("Number of attemps: " + attemps);
                if (attemps==0)
                    lose();
                return;
            }
            if (value > number){
                JOptionPane.showMessageDialog(this, "The number is smaller than " + value);
                attemps--;
                jLabelAttemps.setText("Number of attemps: " + attemps);
                if (attemps==0)
                    lose();
                return;
            }
        }
    }//GEN-LAST:event_jButtonTryActionPerformed

    private void jMenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewActionPerformed
        newGame();
    }//GEN-LAST:event_jMenuNewActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTry;
    private javax.swing.JLabel jLabelAttemps;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuNew;
    private javax.swing.JTextField jTextFieldNumber;
    // End of variables declaration//GEN-END:variables
}