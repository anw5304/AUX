/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import javax.swing.*;
/**
 *
 * @author matthewtucker
 */
public class MainView extends JPanel {
    private JLabel welcome;
    
    MainView(){
        welcome = new JLabel("Welcome to Aux!!");
        add(welcome);
    }
    
}
