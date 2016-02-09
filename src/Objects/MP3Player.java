
package Objects;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

public class MP3Player {

    private BasicPlayer player = new BasicPlayer();
    
    private String currentFileName;
    private double currentVolumeValue;

    public MP3Player(BasicPlayerListener listner) {
        player.addBasicPlayerListener(listner);
    }
    
    
    
    
    public void play(String filename) {
        
    try{        
// Если то что было на паузе
        if (currentFileName != null && currentFileName.equals(filename) && player.getStatus() == BasicPlayer.PAUSED ){
            player.resume();
            return;
        }
        currentFileName = filename;
        player.open(new File(filename));
        player.play();
        player.setGain(currentVolumeValue); // Уровень звука
        
    } catch(BasicPlayerException ex){
       System.out.println("Ошибка! " + ex.getMessage());
          }
    }
    
    public void stop(){
        try {
            player.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    public void pause(){
        try {
            player.pause();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setVolume(int currentValue,int maximumValue){
     try{
        this.currentVolumeValue = currentValue;
        if(currentValue == 0){
            player.setGain(0);
        }else{
            player.setGain(calcVolume(currentValue, maximumValue));
        }
    }catch(BasicPlayerException ex){
         ex.printStackTrace();
    }
 }
    
    public void jump(long bytes){
        try{
            player.seek(bytes);
            player.setGain(currentVolumeValue);
        }catch(BasicPlayerException ex){
            ex.printStackTrace();
        }
    }
    
    private double calcVolume(int currentValue, int maximumValue){
        currentVolumeValue = (double) currentValue / (double) maximumValue;
        return currentVolumeValue;
    }
    
    
}
