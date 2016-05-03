/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole_phonebook1;

/**
 *
 * @author mhcrnl
 */
public class ContactMain {
    
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.adaugaContact();
        controller.afiseazaContacte();
    }
    
}
