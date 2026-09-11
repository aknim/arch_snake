import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class inputListener implements KeyListener{
 private String readUserIn;
 public inputListener(){readUserIn=null;}
 /*public void readUserIn(){
  try{readUserIn = br.readLine();} catch(Exception e){}}*/
 public String giveUserIn(){String ret = readUserIn; readUserIn = null; return ret; }
 @Override
 public void keyPressed(KeyEvent e){
  switch(e.getKeyCode()){
   case KeyEvent.VK_LEFT -> readUserIn = "l";
   case KeyEvent.VK_RIGHT -> readUserIn = "r";
   case KeyEvent.VK_UP -> readUserIn = "u";
   case KeyEvent.VK_DOWN -> readUserIn = "d";
  }
  System.out.println(readUserIn);
 } 
 
 @Override public void keyTyped(KeyEvent e){}
 @Override public void keyReleased(KeyEvent e){}
}
