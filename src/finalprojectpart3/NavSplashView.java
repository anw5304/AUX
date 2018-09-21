/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import java.awt.BorderLayout;
import javax.swing.*;
/**.swing.*
 *
 * @author matthewtucker
 */
public class NavSplashView extends JPanel {
    JButton splashImage;
    JLabel optionPrintLabel;
    
    NavSplashView()
    {
        splashImage = new JButton(new ImageIcon("src/images/Aux copy.png"));
        
        add(splashImage, BorderLayout.CENTER);
    }         
}
