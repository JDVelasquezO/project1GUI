/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import countries.Country;
import countries.Location;
import installations.Airport;
import installations.Installation;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author JD
 */
class PanelTree2 extends JPanel {

    public PanelTree2(JTree tree) {
        setLayout(new BorderLayout());
        add(tree, BorderLayout.NORTH);
    }
}

public class JTreeExampleClass {

    public static void main(String[] args) {
        JFrame tree = new Tree();
        tree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tree.setVisible(true);
    }
}

class Tree extends JFrame {

    public Tree() {
        setTitle("Arbol");
        setBounds(350, 300, 350, 300);
        setLocationRelativeTo(null);

        Installation installation = new Airport("Denver", "Aeropuerto");
        Installation installation2 = new Airport("Car", "Estacionamiento");

        Location location = new Location(2, "Mixco");
        location.addInstallation(installation);
        location.addInstallation(installation2);

        Country country = new Country(502, "Guatemala", 1);
        country.addLocations(location);

        DefaultMutableTreeNode root = null;
        DefaultMutableTreeNode location1;
        DefaultMutableTreeNode installation1;
        
        JTree tree2 = new JTree(root);

        Country[] countries = new Country[1];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] == null) {
                continue;
            } else {
                root = new DefaultMutableTreeNode(countries[i].getName());

                for (int j = 0; j < countries[i].getLocation().length; j++) {
                    if (countries[i].getLocation()[j] == null) {
                        continue;
                    } else {
                        location1 = new DefaultMutableTreeNode(countries[i].getLocation()[j].getName());
                        root.add(location1);
                        for (int k = 0; k < countries[i].getLocation()[j].getInstalations().length; k++) {
                            if (countries[i].getLocation()[j].getInstalations()[k] == null) {
                                continue;
                            } else {
                                installation1
                                        = new DefaultMutableTreeNode(countries[i].getLocation()[j]
                                                .getInstalations()[k].getName());
                                location1.add(installation1);
                                tree2 = new JTree(root);
                            }
                        }
                    }
                }
            }
        }
        
        PanelTree2 panelTree = new PanelTree2(tree2);
        add(panelTree);
    }
}
