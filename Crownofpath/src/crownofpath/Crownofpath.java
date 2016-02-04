/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crownofpath;

/**
 *
 * @author devan
 */
public class Crownofpath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Crownofpath T = new Crownofpath();
      T.go();
    }
    
    
    
    public void go(){
            
    Control C = new Control();
    Board B = new Board();

        if (B.runing == false) {
            C.dispose();
        }
        
        
    }
    public void goes(){
            
    Control2 C = new Control2();
    Board2 B = new Board2();

        if (B.runing == false) {
            C.dispose();
        }
        
        
    }
    public void goesto(){
            
    Control3 C = new Control3();
    Board3 B = new Board3();

        if (B.runing == false) {
            C.dispose();
        }
        
        
    }
    
}
