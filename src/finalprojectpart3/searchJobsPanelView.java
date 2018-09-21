/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpart3;

import javax.swing.*;

/**
 *
 * @author matthewtucker
 */
public class searchJobsPanelView extends JPanel {
    JButton searchAll;
    JButton refinedSearch;
    JLabel workType;
    JRadioButton errand;
    JRadioButton labor;
    JRadioButton other;
    ButtonGroup group;
    
    searchJobsPanelView(){
      searchAll = new JButton("Search All");
      refinedSearch = new JButton("Refined Search");
      errand = new JRadioButton("Errand");
      labor = new JRadioButton("Labor");
      other  = new JRadioButton("Other");
      group = new ButtonGroup();
      group.add(errand);
      group.add(labor);
      group.add(other);
      add(searchAll);
      add(refinedSearch);
      add(errand);
      add(labor);
      add(other);
    }
}
