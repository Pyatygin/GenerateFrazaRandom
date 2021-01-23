package serega.myIdealProgect.gui.view;

import net.miginfocom.swing.MigLayout;
import serega.myIdealProgect.commons.GuiBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class MiniGameMainFrame extends JFrame {

    public static final Dimension FRAME_SIZE = new Dimension(400, 210);
    public static final Dimension PANEL_MENU_SIZE = new Dimension(300, 50);
    public static final Dimension PANEL_GENERATE_FRAZA_SIZE = new Dimension(300, 200);
    public static final Dimension BUTTON_GENERATE_SIZE = new Dimension(100, 50);

    public JPanel panelUpForMenu;
    public JPanel panelGenerateFraza;
    public JPanel panelRezultFraza = new JPanel();

    public MiniGameMainFrame() {

        setSize(new Dimension(FRAME_SIZE));
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new MigLayout());


        panelGenerateFraza = new PanelGenerateFraza();

        setJMenuBar(new ApplicationMenu());

        add(panelGenerateFraza,"wrap");
        add(panelRezultFraza);

        setVisible(true);
    }

    class ApplicationMenu extends JMenuBar {

        public JMenu fileMenu = new JMenu("Меню");

        public ApplicationMenu() {

            setSize(new Dimension(PANEL_MENU_SIZE));

            fileMenu.setMnemonic(KeyEvent.VK_F);

            JMenuItem menuItem = new JMenuItem("Информация о разработчике", KeyEvent.VK_N);

            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(
                            MiniGameMainFrame.this,
                            "Разработчик: Super_Sergo\n"+
                            "Версия ПО: 1.0",
                            "О программе",
                            JOptionPane.INFORMATION_MESSAGE,
                            new ImageIcon("src/hello.png")
                    );
                }
            });

            fileMenu.add(menuItem);
            add(fileMenu);

        }
    }

    class PanelGenerateFraza extends JPanel{

        JButton buttonGenerate = new JButton("Сгенерировать");

        public PanelGenerateFraza() {

            setLayout(new MigLayout());

            setSize(new Dimension(PANEL_GENERATE_FRAZA_SIZE));

            buttonGenerate.setSize(new Dimension(BUTTON_GENERATE_SIZE));
            buttonGenerate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JLabel label = new JLabel(GuiBuilder.generateRandomFraza());
                    panelRezultFraza.removeAll();
                    panelRezultFraza.add(label);
                    panelRezultFraza.revalidate();
                    panelRezultFraza.repaint();

                }
            });

            add(new JLabel(new ImageIcon(("src/motor.png"))));
            add(new JLabel("Генератор фраз"),"wrap,gapleft 75");
            add(buttonGenerate,"wrap, gapleft 118,span");

        }
    }
}
