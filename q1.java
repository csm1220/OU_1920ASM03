
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.lang.*;


class USD2GBP extends JFrame implements ActionListener{
    private JMenuBar menuBar = new JMenuBar();
    private JMenu actionMenu = new JMenu("Action");
    private JMenuItem convertItem = new JMenuItem("Convert");
    private JMenuItem exitItem = new JMenuItem("Exit");
    private JTextField usdAmount = new JTextField("USD Amount", 10);
    private JLabel gbpAmount = new JLabel("0");

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == convertItem) {
            Double convertedAmount = Double.valueOf(usdAmount.getText()) * 0.80;
            gbpAmount.setText(convertedAmount.toString());
        } else if (source == exitItem) {
            System.out.println("exit");
            System.exit(0);
        }

    }

    public USD2GBP() {
        super("USD to GBP");
        this.setJMenuBar(menuBar);
        menuBar.add(actionMenu);

        ActionListener convertlistener = new convertActionHandler();
        convertItem.addActionListener(this);
        exitItem.addActionListener(this);

        actionMenu.add(convertItem);
        actionMenu.add(exitItem);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(usdAmount);
        mainPanel.add(gbpAmount);

        
        add(mainPanel, BorderLayout.WEST);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

}


public class Q1 {
    public static void main(String[] args) {
        USD2GBP main = new USD2GBP();
        main.setSize(400,200);
        main.setVisible(true);
    }
}
