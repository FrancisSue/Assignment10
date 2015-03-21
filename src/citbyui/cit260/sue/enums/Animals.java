/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.sue.enums;

/**
 *
 * @author Sue
 */
public enum Animals {
    
    Elephants("large mammal with a trunk"),
    Zebra("size of a horse with stripes"),
    Giraffe("long neck, runs fast"),
    Rhino("Large gray animal with a horn"),
    Lion("large cat with a mane");
    
    public String description;
    
    Animals(String description){
        this.description = description;
    }
}
