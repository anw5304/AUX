/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author matthewtucker
 */
public class NavView extends JFrame{
 
   NavViewPanel navPanel;
   
    NavView(){
        super("Primary View");                 
        setSize(700, 500);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        navPanel = new NavViewPanel();
        add(navPanel);    
    }
    
    public void switchToOptionsPanel(optionsView o_view){
        navPanel.removeInstructions();
        navPanel.removeMain();
        navPanel.removeSplash();
        navPanel.removeOptionsTableView();
        navPanel.removeCredits();
        navPanel.removeToDo();
        navPanel.addOptions(o_view);        
    }
    
    public void switchToOptionsTableView (optionsTableView tableView){
        navPanel.removeInstructions();
        navPanel.removeMain();
        navPanel.removeSplash();
        navPanel.removeOptions();
        navPanel.removeCredits();
        navPanel.removeToDo();
        navPanel.addTableView(tableView);
    }
    
    public void switchToCredits(Credits credits){
        navPanel.removeInstructions();
        navPanel.removeMain();
        navPanel.removeSplash();
        navPanel.removeOptionsTableView();
        navPanel.removeOptions();
        navPanel.removeToDo();
        navPanel.addCredits(credits);
    }
    
    public void switchToMain(MainView mview){
        navPanel.removeInstructions();
        navPanel.removeSplash();
        navPanel.removeOptionsTableView();
        navPanel.removeOptions();
        navPanel.removeCredits();
        navPanel.removeToDo();
        navPanel.addMain(mview);
    }
    
    public void switchToInstructions(Instructions inst){
        navPanel.removeMain();
        navPanel.removeSplash();
        navPanel.removeOptionsTableView();
        navPanel.removeOptions();
        navPanel.removeCredits(); 
        navPanel.removeToDo();
        navPanel.addInstructions(inst);
    }
    
    public void switchToList(toDoListView toDo){
        navPanel.removeMain();
        navPanel.removeSplash();
        navPanel.removeOptionsTableView();
        navPanel.removeOptions();
        navPanel.removeCredits(); 
        navPanel.removeInstructions();
        navPanel.addToDo(toDo);
    }        
    
    public void addOptionsButtonListener(ActionListener al) {    
        navPanel.menu.userOptions.addActionListener(al);
    } 
   
    public void addTableViewButtonListener(ActionListener al){
        navPanel.menu.availableJobs.addActionListener(al);
    }
    
    public void addCreditsButtonListener(ActionListener al){
        navPanel.menu.credits.addActionListener(al);
    }
    
    public void addMainButtonListener(ActionListener al){
        navPanel.menu.main.addActionListener(al);
    }
    
    public void addInstructionsButtonListener(ActionListener al){
        navPanel.menu.instructions.addActionListener(al);
    }
    
    public void addToDoButtonListener(ActionListener al){
        navPanel.menu.toDoList.addActionListener(al);
    }  
}
