
package biometricapp;

import biometricapp.UI.StartUI;
import biometricapp.UI.HandInputUI;
import java.util.ArrayList;
import javax.swing.UIManager;

/**
 *
 * @author Dushan
 */
public class BioMetricApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        setTheme("Windows");
        
        new StartUI().show();


    }
    
    private static void setTheme(String text){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (text.equals(info.getName())) {
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
    }
    
}
