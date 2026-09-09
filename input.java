import java.io.*;
public class input{
 private BufferedReader br;
 private String readUserIn;
 public input(){br = new BufferedReader(new InputStreamReader(System.in));}
 public void readUserIn(){
  try{readUserIn = br.readLine();} catch(Exception e){}}
 public String giveUserIn(){String ret = readUserIn; readUserIn = null; return ret; }
}
