/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;
import java.io.*;
/**
 *
 * @author matthewtucker
 */
public class Jobs implements Serializable {
    private String userName;
    private String jobType;
    private String jobDescription;
    private int timeHours;
    private String returnDescription;
    private boolean selected;
    private boolean completed;
    
    
    Jobs(String userName, int age, String jobType, String jobDescription, int timeHours, String returnDescription){
        this.userName = userName;
        
        this.jobType = jobType;
        this.jobDescription = jobDescription;
        this.timeHours = timeHours;
        this.returnDescription = returnDescription;
        this.selected= false;
        this.completed = false;
    }
    
    public String getUserName(){
       return this.userName;
    }
    
    public String getErrandType(){
        return this.jobType;
    }
    
    public String getJobDescription(){
        return this.jobDescription;
    }
    
    public int getTime(){
        return this.timeHours;
    }
    
    public String getReturnDesc(){
        return this.returnDescription;
    }
    
    public boolean isCompleted(){
        return this.completed;
    } 
    
    public boolean isSelected(){
        return this.selected;
    }
    
    public void setSelected(){
       this.selected= true;
    }
    
    public void setCompleted(){
        this.completed = true;
    }
       
   
    
}
