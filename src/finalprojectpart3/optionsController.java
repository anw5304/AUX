/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Adam
 */
public class optionsController {
    private optionsModel model;
    private optionsView view;
    private optionsTableView view2;
    private toDoListView view3;
    
    optionsController(optionsModel model, optionsView view, optionsTableView view2, toDoListView view3){
        this.view= view;
        this.view2 = view2;
        this.view3 = view3;
        this.model = model;
        model.deserialiseObjects();
        view.addReturnButtonListener(new addReturnListener());
        view2.addRefinedSearchActionListener(new addRefinedListener());
        view2.addSearchAllActionListener(new addSearchAllListener());
        view2.adddoJobListener(new addDoJobListener());
        view3.addLoadActionListener(new addLoadListener());
        view3.addJobDoneListener(new addDoneListener());
    } 
    
     class addReturnListener implements ActionListener{
      public void actionPerformed(ActionEvent al){
         String name = view.getUserName();
         int age = view.getAge();
         String errand = view.getErrandType();
         String jobDesc =view.getErrandDescription();
         int hours = view.getHours();
         String returnDesc =  view.getReturnDescription();
         view.setUserName("");
         view.setDesc("");
         view.setReturnDesc("");
         model.createJob(name, age,errand,jobDesc ,hours ,returnDesc);
         
      }
     }
     
     class addSearchAllListener implements ActionListener{
       public void actionPerformed (ActionEvent al){
          view2.clearTable();
          int nextAvailablePos=0;
          for(int i =0; i<model.getAllJobs().size();i++)
          {
            if(model.getJob(i).isSelected()==false && model.getJob(i).isCompleted()==false)
            {   
              view2.setJobNumber(i,nextAvailablePos);
              view2.setNameTable(model.getJob(i).getUserName(),nextAvailablePos);
              view2.setErrandType(model.getJob(i).getErrandType(), nextAvailablePos);
              view2.setDescriptionTable(model.getJob(i).getJobDescription(), nextAvailablePos);
              view2.setTimeTable(model.getJob(i).getTime(), nextAvailablePos);
              view2.setreturnDesctable(model.getJob(i).getReturnDesc(), nextAvailablePos);
              nextAvailablePos++;
            }
          }
        }
     } 
      
      class addRefinedListener implements ActionListener{
         public void actionPerformed (ActionEvent al){
             view2.clearTable();
             int nextAvailablePos=0;
             String errand = view2.getErrand2Type();
             for(int i =0; i<model.getAllJobs().size();i++)
             {
                 if(model.getJob(i).getErrandType().equals(errand)&& model.getJob(i).isSelected()==false)
                 {
                  view2.setJobNumber(i,nextAvailablePos);
                  view2.setNameTable(model.getJob(i).getUserName(),nextAvailablePos);
                  view2.setErrandType(model.getJob(i).getErrandType(), nextAvailablePos);
                  view2.setDescriptionTable(model.getJob(i).getJobDescription(), nextAvailablePos);
                  view2.setTimeTable(model.getJob(i).getTime(), nextAvailablePos);
                  view2.setreturnDesctable(model.getJob(i).getReturnDesc(), nextAvailablePos);
                  nextAvailablePos++;
                 }
             }
         }
     }
      
    class addDoJobListener implements ActionListener{
        public void actionPerformed (ActionEvent al){
          try{
            view2.setJobNumberField("");
            model.getJob(view2.getJobNumber()).setSelected();
            view2.clearTable();
            int nextAvailablePos = 0;
            for(int i =0; i<model.getAllJobs().size();i++)
             {
                 if(model.getJob(i).isSelected()==false )
                 {   
                  view2.setJobNumber(i,nextAvailablePos);
                  view2.setNameTable(model.getJob(i).getUserName(),nextAvailablePos);
                  view2.setErrandType(model.getJob(i).getErrandType(), nextAvailablePos);
                  view2.setDescriptionTable(model.getJob(i).getJobDescription(), nextAvailablePos);
                  view2.setTimeTable(model.getJob(i).getTime(), nextAvailablePos);
                  view2.setreturnDesctable(model.getJob(i).getReturnDesc(), nextAvailablePos);
                  nextAvailablePos++;
                 }
             }
          }
          catch(NullPointerException e1){
            JOptionPane.showMessageDialog (view2,"Please Enter a valid Job Number");
          }
          catch(IndexOutOfBoundsException e3){
            JOptionPane.showMessageDialog (view2,"Please Enter a valid Job Number");
          }
        }
    }
    
    class addLoadListener implements ActionListener{
        public void actionPerformed(ActionEvent al){
            int nextAvailablePos=0;
            for(int i = 0; i<model.getAllJobs().size();i++){
                if(model.getJob(i).isSelected()&& model.getJob(i).isCompleted()==false){
                    view3.setNumber(i, nextAvailablePos);
                    view3.setNameTable(model.getJob(i).getUserName(), nextAvailablePos);
                    view3.setErrandType(model.getJob(i).getErrandType(),nextAvailablePos);
                    view3.setDescriptionTable(model.getJob(i).getJobDescription(), nextAvailablePos);
                    view3.setTimeTable(model.getJob(i).getTime(),nextAvailablePos);
                    view3.setreturnDesctable(model.getJob(i).getReturnDesc(), nextAvailablePos);
                    nextAvailablePos++;
                }
            }
        }
    }
    
    class addDoneListener implements ActionListener{
        public void actionPerformed(ActionEvent al){
          try{
            model.getJob(view3.getJobNumber()).setCompleted();
            view3.clearTable();
            view3.setJobNumberField("");
            int nextAvailablePos =0;
            for(int i =0; i<model.getAllJobs().size();i++)
             {
                 if(model.getJob(i).isSelected()==true && model.getJob(i).isCompleted()== false)
                 { 
                  view3.setNumber(i, nextAvailablePos);   
                  view3.setNameTable(model.getJob(i).getUserName(),nextAvailablePos);
                  view3.setErrandType(model.getJob(i).getErrandType(), nextAvailablePos);
                  view3.setDescriptionTable(model.getJob(i).getJobDescription(), nextAvailablePos);
                  view3.setTimeTable(model.getJob(i).getTime(), nextAvailablePos);
                  view3.setreturnDesctable(model.getJob(i).getReturnDesc(), nextAvailablePos);
                  nextAvailablePos++;
                 }
             }
          }
        catch(NullPointerException e2){
            JOptionPane.showMessageDialog(view3, "Please enter a valid Job Number");
        }
        catch(IndexOutOfBoundsException e4){
            JOptionPane.showMessageDialog (view2,"Please Enter a valid Job Number");
        }  
    }
    }     
}
     
      

