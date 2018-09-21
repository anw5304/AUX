/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Adam
 */
public class optionsModel {
    private ArrayList <Jobs> Jobs;
    
    optionsModel(){
      Jobs = new ArrayList<>();
    }
    
    public Jobs getJob(int index){
        return Jobs.get(index);
    }
  
    public void createJob(String userName, int age, String jobType, String jobDescription, int timeHours, String returnDescription){
       Jobs.add(new Jobs (userName, age, jobType, jobDescription,timeHours, returnDescription)); 
    }
    
    public ArrayList<Jobs> getAllJobs(){
    return Jobs;
    }
    
    public void serialiseObjects(){
       ObjectOutputStream out;
        try{
           
            for (int i=0; i<Jobs.size();i++){
             out = new ObjectOutputStream(new FileOutputStream("src/outputFile/job"+i+".ser"));   
             out.writeObject(Jobs.get(i));  
             out.close();
            }
        }
        
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void deserialiseObjects(){
        FileInputStream fileIn;
        int fileNum = new File ("src/outputFile").listFiles().length;
        try{
         for(int i =0; i<fileNum;i++){ 
           
            fileIn = new FileInputStream("src/outputFile/job"+i+".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Jobs.add((Jobs)in.readObject());
            in.close();
            
         } 
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
