/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author matthewtucker
 */
public class NavViewBottomMenuPanel extends JPanel {
    JButton userOptions;
    JButton credits;
    JButton instructions;
    JButton availableJobs;
    JButton main;
    JButton toDoList;
   
    
    NavViewBottomMenuPanel(){
        super();
        userOptions = new JButton("Create a Job");
        credits = new JButton("Credits");
        instructions = new JButton("Instructions");
        availableJobs = new JButton (" Available Jobs");
        main = new JButton ("Main");
        toDoList = new JButton("My to do List");
        add(userOptions, BorderLayout.SOUTH);
        add(availableJobs, BorderLayout.SOUTH);
        add(toDoList, BorderLayout.SOUTH);
        add(main, BorderLayout.SOUTH);
        add(instructions, BorderLayout.SOUTH);
        add(credits, BorderLayout.SOUTH);
       
  }
}
