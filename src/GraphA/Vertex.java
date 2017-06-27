/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphA;

import java.util.ArrayList;

/**
 *
 * @author upatryk
 */
public class Vertex {
    private ArrayList<Edge> neighborhood;
    private String label;
    
    public Vertex(String label){
        this.label = label;
        this.neighborhood = new ArrayList<>();
    }
    
    public void addNeighbor(Edge edge){
        if(this.neighborhood.contains(edge)){
            
        }
    }
}
