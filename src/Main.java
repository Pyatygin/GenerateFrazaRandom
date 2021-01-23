import serega.myIdealProgect.gui.view.MiniGameMainFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException,
            InstantiationException, IllegalAccessException {

        for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(laf.getName())) {
                UIManager.setLookAndFeel(laf.getClassName());
                new MiniGameMainFrame();
            }
        }
    }
}
