/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailapp.gui;

import AppPackage.AnimationClass;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author محمد
 */
public class AnimationFrame extends javax.swing.JFrame {

    AnimationClass ac = new AnimationClass();

    /**
     * Creates new form AnimationFrame
     */
    public AnimationFrame(String name) {
        this.setLocation(450, 300);
        initComponents();
        if (name.contains("mostafa")) {
            SlidShow("img\\characterMostafa.png");
        } else if (name.contains("reham") || name.contains("roham")) {
            SlidShow("img\\characterRoham.png");
        } else if (name.contains("nashar")) {
            SlidShow("img\\character.png");
        } else if (name.contains("tarek")) {
            SlidShow("img\\characterTarek.png");
        } else if (name.contains("7amdy") || name.contains("hamdy") || name.contains("ahmed") || name.contains("a7med") || name.contains("a7md")) {
            SlidShow("img\\characterHamdy.png");
        } else {
            SlidShow("img\\mario.png");
        }
    }

    private AnimationFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void SlidShow(String fName) {
        new Thread() {
            int i;

            @Override
            public void run() {
                try {
                    Image img = ImageIO.read(new File(fName));
                    Image pp = img.getScaledInstance(207, 170, Image.SCALE_AREA_AVERAGING);
                    ImageIcon t = new ImageIcon(pp);
                    man.setIcon(t);

                    man.setLocation(-200, 120);
                    ac.jLabelXRight(-200, 1122, 35, 10, man);
                    Thread.sleep(2200);
                    InputStream in;
                    in = new FileInputStream(new File("sound\\doorway.wav"));
                    AudioStream audios = new AudioStream(in);
                    AudioPlayer.player.start(audios);
                                    // man.setLocation(700, 120);
                    // ac.jLabelXRight(700, 1122, 50, 10, man);
                    Thread.sleep(2800);
                    AnimationFrame.this.dispose();
                } catch (Exception e) {

                }
            }

        }.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pip = new javax.swing.JLabel();
        man = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/pipe.png"))); // NOI18N
        getContentPane().add(pip, new org.netbeans.lib.awtextra.AbsoluteConstraints(1027, 10, 95, -1));
        getContentPane().add(man, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 30, 200, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1122, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AnimationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel man;
    private javax.swing.JLabel pip;
    // End of variables declaration//GEN-END:variables
}
