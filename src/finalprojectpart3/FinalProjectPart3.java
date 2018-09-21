/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;

/**
 *
 * @author matthewtucker
 */
public class FinalProjectPart3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NavView view = new NavView();
       NavController controller = new NavController(view);
       view.setVisible(true);
       
    }
    
}
