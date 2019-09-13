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
    private String category;
    
    public Auth(String name, String pass, String category) {
        setName(name); setPass(pass); setCategory(category);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPass (String pass) {
        this.pass = pass;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPass() {
        return pass;
    }
    
    public void setCategory(String category) {
        switch (category) {
            case "Admin" : this.category = "Admin";
            case "Operador" : this.category = "Operador";
            case "Piloto" : this.category = "Piloto";
            case "Cliente" : this.category = "Cliente";
        }
    }
    
    public String getCategory() {
        return category;
    }
    
    @Override
    public String toString() {
        return name + " " + pass;
    }
}
