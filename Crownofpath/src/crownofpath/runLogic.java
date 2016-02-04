package crownofpath;

public class runLogic {

    public int ortho(int xAgent, int yAgent, int xGoal, int yGoal) {
        int hasil = Math.abs(xAgent - xGoal) + Math.abs(yAgent - yGoal);
        return hasil;
    }

    public int hpatern(int orthogonal, int diagonal){
        int hasil;
        hasil = diagonal+(orthogonal-(2*diagonal));
        
        return hasil;
        
    }
    
    public int move (int move, int hpatern){
        int hasil;
        hasil = move+hpatern;
        
        return hasil;
        
    }
    
    
    public void arraynya (){
        int [][] kotak = new int [3][3];
    }
    
}
