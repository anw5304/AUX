/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import java.text.NumberFormat;
import javax.swing.*;
/**
 *
 * @author matthewtucker
 */
public class doJobPanelView extends JPanel {
     JFormattedTextField number;
     JButton doJob;
     
     doJobPanelView(){
      
      number = new JFormattedTextField(NumberFormat.getIntegerInstance());
      number.setEditable(true);
      number.setColumns(10);
      doJob = new JButton("Accept this Job");
      add(doJob);
      add(number);
      
     }
}
