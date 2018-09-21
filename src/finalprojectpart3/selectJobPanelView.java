/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import java.awt.BorderLayout;
import java.text.NumberFormat;
import javax.swing.*;
/**
 *
 * @author matthewtucker
 */
public class selectJobPanelView extends JPanel {
     JFormattedTextField number;
     JButton doJob;
    
    selectJobPanelView(){
      super();
    
      setSize(30,40);
      number = new JFormattedTextField(NumberFormat.getIntegerInstance());
      number.setEditable(true);
      number.setColumns(10);
      number.setText("Job # Here");
      doJob = new JButton("Mark Job as Completed");
      add(doJob);
      add(number);
      
    }
}
