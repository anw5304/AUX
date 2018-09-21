/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.ChangeListener;
import java.text.NumberFormat;
/**
 *
 * @author Adam
 */
public class optionsView extends JPanel {
   optionsModel model;
    JLabel name;
    JTextField userName;
    JLabel ageSelect;
    JSlider age;
    JLabel workType;
    JRadioButton errand;
    JRadioButton labor;
    JRadioButton other;
    JLabel workDescrip;
    JTextField workDescription;
    JLabel time;
    JSlider hours;
    JLabel returnDescrip;
    JTextField returnDescription;
    JButton returnButton;
    ButtonGroup group;
    JTextField out;
    
    optionsView(optionsModel model){
       
      this.model = model;
        
       name = new JLabel("Enter your name: ");
       name.setLabelFor(userName);
       userName = new JTextField(35);
       ageSelect = new JLabel("Select your age:   ");
       ageSelect.setLabelFor(age);
       age  = new JSlider(1,100, 25);
       age.setMajorTickSpacing(10);
       age.setPaintLabels(true);
       age.setPaintTicks(true);
       workType = new JLabel("Select the nature of the work you need done: ");
       workType.setLabelFor(errand);
       group = new ButtonGroup(); 
       errand = new JRadioButton("Errand");
       labor = new JRadioButton("Labor");
       other  = new JRadioButton("Other");
       group.add(errand);
       group.add(labor);
       group.add(other);
       workDescrip = new JLabel("Provide brief description of the work you need done:");
       workDescrip.setLabelFor(workDescription);
       workDescription = new JTextField(35);
       time = new JLabel("How long will the task take?   ");
       time.setLabelFor(hours);
       hours = new JSlider(1,50,25);
       hours.setMajorTickSpacing(5);
       hours.setPaintLabels(true);
       hours.setPaintTicks(true);
       returnDescrip = new JLabel("Briefly explain the tasks you can do in return");
       returnDescrip.setLabelFor(returnDescription);
       returnDescription = new JTextField(35);
       returnButton = new JButton("Create job");
       out = new JTextField(35);
       add(name);
       add(userName);
       add(workType);
       add(errand);
       add(labor);
       add(other);
       add(workDescrip);
       add(workDescription);
       add(time);
       add(hours);
       add(returnDescrip);
       add(returnDescription);
       add(returnButton);
       
    }
    
    public void addReturnButtonListener(ActionListener al){
        returnButton.addActionListener(al);
    }
  
    public void addAgeChangeListener(ChangeListener al){
        age.addChangeListener(al);
    }
    
    public void addHoursChangeListner(ChangeListener al){
        hours.addChangeListener(al);
    }
    
    public String getUserName(){
        return userName.getText();
    }
    
    public int getAge(){
        return age.getValue();
    }
    
    public String getErrandDescription(){
        return workDescription.getText();
    }
    
    public int getHours(){
        return hours.getValue();
    }
    
    public String getReturnDescription(){
        return returnDescription.getText();
    }
    
    public String getErrandType()
    {
        String workType;
        if (errand.isSelected()){
            workType = "errand";
        }
        else if(labor.isSelected()){
            workType = "labor";
        }
        else{
            workType = "other";
        }
        return workType;
    }
    
   public void setUserName(String str){
       userName.setText(str);
   }
   
   public void setDesc(String str){
       workDescription.setText(str);
   }        
   
   public void setReturnDesc(String str){
       returnDescription.setText(str);
   }        
    
    
    
    
   
       
    
}
