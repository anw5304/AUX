/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
/**
 *
 * @author Adam
 */
public class optionsTableView extends JPanel {
    private JTable jobListings;
    private JButton searchAll;
    private JButton refinedSearch;
    JLabel workType;
    JRadioButton errand;
    JRadioButton labor;
    JRadioButton other;
    optionsModel model;
    ButtonGroup group;
    searchJobsPanelView searchView;
    doJobPanelView doJobPanel;
    
    optionsTableView(optionsModel model){
      setLayout(new BorderLayout());     
      this.model = model;
      Object [][] tableVals = new Object [100][6];
      String [] headers = {"Job Number","Name", "Work Type", "Description", "Time", "Return Service"};
      jobListings = new JTable(tableVals,headers);
      jobListings.setEnabled(false);
      searchAll = new JButton("Search All Jobs");
      refinedSearch = new JButton("Refined Search");
      errand = new JRadioButton("Errand");
      labor = new JRadioButton("Labor");
      other  = new JRadioButton("Other");
      group = new ButtonGroup();
      searchView = new searchJobsPanelView();
      doJobPanel = new doJobPanelView();
      group.add(errand);
      group.add(labor);
      group.add(other);
      add(searchAll);
      add(refinedSearch);
      add(errand);
      add(labor);
      add(other);
      add(searchView, BorderLayout.NORTH);
      add(new JScrollPane(jobListings));
      add(doJobPanel, BorderLayout.SOUTH);
      
    }
    
    public void addRefinedSearchActionListener(ActionListener al){
      searchView.refinedSearch.addActionListener(al);  
    }
    
    public void addSearchAllActionListener(ActionListener al){
        searchView.searchAll.addActionListener(al);
    }
    
    public void adddoJobListener(ActionListener al){
        doJobPanel.doJob.addActionListener(al);
    }
            
     public String getErrand2Type(){
        String workType;
        if (searchView.errand.isSelected()){
            workType = "errand";
        }
        else if(searchView.labor.isSelected()){
            workType = "labor";
        }
        else{
            workType = "other";
        }
        return workType;
    }       
    
     public void setJobNumber(int number, int row){
         jobListings.setValueAt(number, row, 0);
     }
     
     public void setNameTable (String Name,int row){
        jobListings.setValueAt(Name, row, 1);
    }
    
    public void setErrandType(String errand, int row){
        jobListings.setValueAt(errand, row, 2);
    }
    
    public void setDescriptionTable(String description, int row){
        jobListings.setValueAt(description, row, 3);
    }
    
    public void setTimeTable(int time, int row){
        jobListings.setValueAt(time, row, 4);
    }
    
    public void setreturnDesctable(String description, int row){
        jobListings.setValueAt(description, row, 5);
    }
    
    public void clearTable(){
    for(int i =0; i<jobListings.getRowCount();i++){
        jobListings.setValueAt("", i, 0);
        jobListings.setValueAt("", i, 1);
        jobListings.setValueAt("", i, 2);
        jobListings.setValueAt("", i, 3);
        jobListings.setValueAt("", i, 4);
        jobListings.setValueAt("", i, 5);
    }
  }
    
  public int getJobNumber(){
     return ((Number)doJobPanel.number.getValue()).intValue();
  } 
  
  public void setJobNumberField(String string){
      doJobPanel.number.setText(string);
  }
}
