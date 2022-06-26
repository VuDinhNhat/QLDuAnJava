package test;

import javax.swing.UIManager;
import view.QLTOURView;

/**
 *
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new QLTOURView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
