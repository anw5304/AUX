/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author matthewtucker
 */
public class NavController {
    
    NavView n_view;
    optionsModel o_model;
    optionsView o_view;
    optionsTableView view2;
    Credits credits;
    MainView main;
    Instructions inst;
    optionsController o_Controller; 
    toDoListView view3;
           
    public NavController( NavView n_view ) {
        
        this.n_view = n_view;
        
        o_model = new optionsModel();        
        o_view = new optionsView(o_model);
        view2 = new optionsTableView(o_model);
        view3 = new toDoListView(o_model);
        o_Controller = new optionsController(o_model, o_view, view2, view3); 
        main = new MainView();
        credits = new Credits();
        inst = new Instructions();
                
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addTableViewButtonListener(new tableViewButtonListener());  
        n_view.addCreditsButtonListener(new creditsButtonListener());
        n_view.addMainButtonListener(new mainListener());
        n_view.addInstructionsButtonListener(new instructionsListener());
        n_view.addToDoButtonListener(new toDoListListener());
        
        n_view.addComponentListener(new ComponentAdapter(){
            public void componentHidden(ComponentEvent e){
               o_model.serialiseObjects();
               ((JFrame)(e.getComponent())).dispose();
            }
        });
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
        } 
    } 
    
    class tableViewButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent al){
            n_view.switchToOptionsTableView(view2);
        }
    }
    
    class creditsButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent al){
            n_view.switchToCredits(credits);
        }
    }
    class mainListener implements ActionListener{
        public void actionPerformed (ActionEvent al){
            n_view.switchToMain(main);
        }
    }
    
    class instructionsListener implements ActionListener{
        public void actionPerformed(ActionEvent al){
            n_view.switchToInstructions(inst);
        }
    }
    
    class toDoListListener implements ActionListener{
        public void actionPerformed(ActionEvent al){
            n_view.switchToList(view3);
        }
    }            
}
