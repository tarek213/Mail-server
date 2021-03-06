/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailapp.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import linkedList.cs45_cs23.LinkedList;
import static mailapp.gui.AddRecframe.in;
import static mailapp.gui.ContactsGui.jTable1;
import mailapp.logicCode.UserContacts;
import mailapp.logicCode.UserContactsFunctions;

/**
 *
 * @author محمد
 */
public class AddContactGui extends javax.swing.JFrame {

    String currentUser;
    int xMouse;
    int yMouse;
    public LinkedList list = new LinkedList();
    int editCounter = 0;
    ContactsGui contacts;

    /**
     * Creates new form AddContactGui
     */
    public AddContactGui(JFrame frame) {
        initComponents();
        contacts = (ContactsGui) frame;
        jPanel1.setVisible(false);
    }

    private AddContactGui() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        closeAddMails = new javax.swing.JLabel();
        deleteMails = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        backgroundAddMails = new javax.swing.JLabel();
        nameAddCon1 = new javax.swing.JTextField();
        nameAddCon2 = new javax.swing.JTextField();
        nameAddCon = new javax.swing.JTextField();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        dragFrame = new javax.swing.JLabel();
        addNewContact = new javax.swing.JLabel();
        editEmailInAdd = new javax.swing.JLabel();
        editEmailInAdd1 = new javax.swing.JLabel();
        empty = new javax.swing.JLabel();
        backgroundAddContact = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 41, 482, 184));

        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 278, 55, 30));

        closeAddMails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeAddMails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeAddMailsMouseClicked(evt);
            }
        });
        jPanel1.add(closeAddMails, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 365, 100, 43));

        deleteMails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteMails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMailsMouseClicked(evt);
            }
        });
        jPanel1.add(deleteMails, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 260, 139, 61));

        error.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 170, 40));

        backgroundAddMails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/addEmails.png"))); // NOI18N
        jPanel1.add(backgroundAddMails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 560, 430));

        nameAddCon1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        nameAddCon1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameAddCon1.setBorder(null);
        nameAddCon1.setOpaque(false);
        nameAddCon1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameAddCon1KeyTyped(evt);
            }
        });
        jLayeredPane1.add(nameAddCon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 230, 443, 73));

        nameAddCon2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        nameAddCon2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameAddCon2.setBorder(null);
        nameAddCon2.setOpaque(false);
        jLayeredPane1.add(nameAddCon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 360, 360, 70));

        nameAddCon.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        nameAddCon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameAddCon.setBorder(null);
        nameAddCon.setOpaque(false);
        jLayeredPane1.add(nameAddCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 103, 443, 73));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jLayeredPane1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 5, 23, 40));

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jLayeredPane1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 5, 23, 40));

        dragFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dragFrame.setName(""); // NOI18N
        dragFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragFrameMouseDragged(evt);
            }
        });
        dragFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragFrameMousePressed(evt);
            }
        });
        jLayeredPane1.add(dragFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 2, 770, 45));

        addNewContact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewContactMouseClicked(evt);
            }
        });
        jLayeredPane1.add(addNewContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 514, 150, 66));

        editEmailInAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editEmailInAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmailInAddMouseClicked(evt);
            }
        });
        jLayeredPane1.add(editEmailInAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 384, 22, 24));

        editEmailInAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editEmailInAdd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmailInAdd1MouseClicked(evt);
            }
        });
        jLayeredPane1.add(editEmailInAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 384, 20, 24));

        empty.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        empty.setForeground(new java.awt.Color(255, 0, 0));
        empty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 220, 40));

        backgroundAddContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/add.png"))); // NOI18N
        jLayeredPane1.add(backgroundAddContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 772, 625));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dragFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_dragFrameMouseDragged

    private void dragFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragFrameMousePressed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(Inbox.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void editEmailInAdd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailInAdd1MouseClicked
        UserContactsFunctions uc = new UserContactsFunctions();
        if (nameAddCon2.getText().length() != 0) {
            try {
                if (uc.checkEmail(nameAddCon2.getText())) {
                    if (uc.checkExist(list, nameAddCon2.getText())) {

                        uc.addEmails(list, nameAddCon2.getText());
                        nameAddCon2.setText("");
                    } else {
                        nameAddCon2.setText("Email already Exists");

                    }
                } else {
                    nameAddCon2.setText("Email Doesn't Exist");
                }
            } catch (IOException ex) {
                Logger.getLogger(AddContactGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            nameAddCon2.setText("Empty Field");
        }
    }//GEN-LAST:event_editEmailInAdd1MouseClicked

    private void editEmailInAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailInAddMouseClicked
        editCounter++;
        if (editCounter % 2 == 1) {
            UserContactsFunctions uc = new UserContactsFunctions();
            jPanel1.setVisible(true);
            jTextField1.setText("");
            error.setText("");
            jTextArea1.setText(uc.showNames(list));
        } else {
            jPanel1.setVisible(false);
        }
    }//GEN-LAST:event_editEmailInAddMouseClicked

    private void deleteMailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMailsMouseClicked
        UserContactsFunctions uc = new UserContactsFunctions();
        try {
            if (uc.removeName(list, Integer.parseInt(jTextField1.getText()))) {
                jTextField1.setText("");
                error.setText("");
                jTextArea1.setText(uc.showNames(list));
            } else {
                error.setText("Wrong index");
            }
        } catch (Exception e) {
            error.setText("Wrong index");
        }

    }//GEN-LAST:event_deleteMailsMouseClicked

    private void closeAddMailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeAddMailsMouseClicked
        editCounter++;
        jPanel1.setVisible(false);
    }//GEN-LAST:event_closeAddMailsMouseClicked

    private void addNewContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewContactMouseClicked
        if (nameAddCon.getText().length() != 0 && nameAddCon1.getText().length() != 0 && !list.isEmpty()) {
            if (nameAddCon1.getText().length() == 7 || nameAddCon1.getText().length() == 11) {
                UserContactsFunctions uc = new UserContactsFunctions();
                try {
                    if (uc.CheckUserName(currentUser, nameAddCon.getText())) {
                        uc.addNewContact(currentUser, nameAddCon.getText(), nameAddCon1.getText(), list);
                        empty.setText("");
                        this.dispose();
                        uc.setViewingOptions(currentUser, null, null, false);
                        UserContacts[] allContacts = (UserContacts[]) uc.listContacts(1);
                        contacts.allContacts = allContacts;
                        contacts.ShowCheckBoxContact(uc.showContactsInTable(allContacts, contacts.jTable1));
                    } else {
                        nameAddCon.setText("This name is already used!");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(AddContactGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                empty.setText("invalid phone number");
            }
        } else {
            empty.setText("there's empty field!");
        }
    }//GEN-LAST:event_addNewContactMouseClicked

    private void nameAddCon1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameAddCon1KeyTyped
        // TODO add your handling code here:
        char txt = evt.getKeyChar();
        if (!Character.isDigit(txt)) {
            evt.consume();
        }
    }//GEN-LAST:event_nameAddCon1KeyTyped

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
            java.util.logging.Logger.getLogger(AddContactGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddContactGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddContactGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddContactGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddContactGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addNewContact;
    private javax.swing.JLabel backgroundAddContact;
    private javax.swing.JLabel backgroundAddMails;
    private javax.swing.JLabel closeAddMails;
    private javax.swing.JLabel deleteMails;
    private javax.swing.JLabel dragFrame;
    private javax.swing.JLabel editEmailInAdd;
    private javax.swing.JLabel editEmailInAdd1;
    public static javax.swing.JLabel empty;
    private javax.swing.JLabel error;
    private javax.swing.JLabel exit;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel minimize;
    public static javax.swing.JTextField nameAddCon;
    public static javax.swing.JTextField nameAddCon1;
    public static javax.swing.JTextField nameAddCon2;
    // End of variables declaration//GEN-END:variables
}
