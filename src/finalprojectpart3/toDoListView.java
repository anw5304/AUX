/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;
/**
 *
 * @author matthewtucker
 */
public class toDoListView extends JPanel {
     private JTable toDoList;
     optionsModel model;
     selectJobPanelView selectPanel;
     loadButtonView loadView;
     
     toDoListView(optionsModel model){
      setLayout(new BorderLayout());    
      this.model = model;
      setLayout(new BorderLayout());  
      Object [][] tableVals = new Object [100][6];
      String [] headers = {"Job Number","Name", "Work Type", "Description", "Time", "Return Service"};
      selectPanel = new selectJobPanelView();
      loadView = new loadButtonView();
      toDoList = new JTable(tableVals,headers);
      toDoList.setEnabled(false);
      add(loadView, BorderLayout.NORTH);
      add(new JScrollPane(toDoList));
      add(selectPanel, BorderLayout.SOUTH);
      
     }
     
     public void addJobDoneListener(ActionListener al){
        selectPanel.doJob.addActionListener(al);
    }
     
     public void setNumber (int num, int row){
         toDoList.setValueAt(num, row, 0);
     }
     
      public void setNameTable (String Name,int row){
        toDoList.setValueAt(Name, row, 1);
    }
    
    public void setErrandType(String errand, int row){
        toDoList.setValueAt(errand, row, 2);
    }
    
    public void setDescriptionTable(String description, int row){
        toDoList.setValueAt(description, row, 3);
    }
    
    public void setTimeTable(int time, int row){
        toDoList.setValueAt(time, row, 4);
    }
    
    public void setreturnDesctable(String description, int row){
        toDoList.setValueAt(description, row, 5);
    }
    
    public void addLoadActionListener(ActionListener al){
       loadView.Load.addActionListener(al); 
    }
    
    public int getJobNumber(){
     return ((Number)selectPanel.number.getValue()).intValue();
  }
    
    public void clearTable(){
    for(int i =0; i<toDoList.getRowCount();i++){
        toDoList.setValueAt("", i, 0);
        toDoList.setValueAt("", i, 1);
        toDoList.setValueAt("", i, 2);
        toDoList.setValueAt("", i, 3);
        toDoList.setValueAt("", i, 4);
        toDoList.setValueAt("", i, 5);
        
    }
  }
    
   public void setJobNumberField(String string){
     selectPanel.number.setText(string);
   }   
}
