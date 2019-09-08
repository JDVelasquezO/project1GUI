/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1GUI;

/**
 *
 * @author JD
 */

public class Auth {
    private String name;
    private String pass;
    
    public Auth(String name, String pass) {
        this.name = name; this.pass = pass;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPass() {
        return pass;
    }
    
    @Override
    public String toString() {
        return name + " " + pass;
    }
}
