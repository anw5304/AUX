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
public class NavViewPanel extends JPanel {
    NavViewBottomMenuPanel menu;
    NavSplashView splash;
    
    optionsView oview;
    optionsTableView tableView;
    Credits credits;
    MainView main;
    Instructions inst;
    toDoListView toDo;
    
    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new NavSplashView();
        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);                        
    }
    
    public void addOptions(optionsView oview){
        this.oview = oview; 
        add(oview, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addTableView(optionsTableView tableView){
        this.tableView = tableView;
        add(tableView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addSplash(NavView n_view){
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addCredits(Credits credits){
        this.credits = credits;
        add(credits, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addMain(MainView main){
        this.main = main;
        add(main, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addInstructions(Instructions inst){
        this.inst = inst;
        add(inst, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addToDo(toDoListView toDo){
        this.toDo= toDo;
        add(toDo, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeOptions(){
        if (this.oview != null)
        {    
            remove(this.oview);
        }    
    }
   
    public void removeOptionsTableView(){
        if(this.tableView !=null)
        {
            remove(this.tableView);
        }
    }
    
    public void removeCredits(){
        if(this.credits !=null)
        {
            remove(this.credits);
        }
    }
    
     public void removeMain(){
         if(this.main !=null)
         {
             remove(this.main);
         }   
     } 
     
     public void removeInstructions(){
         if(this.inst !=null)
         {
             remove(this.inst);
         }    
     }
     
     public void removeToDo(){
         if(this.toDo !=null)
         {
             remove(this.toDo);
         }    
     }        
    
    public void removeSplash(){
        remove(splash);
    }
             
}

