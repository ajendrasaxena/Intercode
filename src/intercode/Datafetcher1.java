/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import static intercode.Loginclass.s;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;

/**
 *
 * @author Bhanu Pratap Singh
 */
public class Datafetcher1 {
    
    void Dataclass () throws IOException{
     
    }
    
    private Connection conn;
       static DataInputStream din;
       static DataOutputStream dout;
       static Socket s;
       String sss=null ;
       public int port=0;
       public void fetch(String ss) throws IOException{  
   System.out.println("function called");
           try{
       
        s=new Socket("192.168.4.207",port);
        din=new DataInputStream(s.getInputStream());
        dout=new DataOutputStream(s.getOutputStream());
        String msgin="";
          
        
        String msgout="";
        msgout=ss;
        dout.writeUTF(ss);
        System.out.println("Message sent");
      
                sss=din.readUTF();
                System.out.println(sss);
               System.out.println("Message recieved");

        
                 }catch(Exception e){}
      
    }
    
   public String get(){
       while(true){System.out.println("function called...");
           if(sss!=null){System.out.println("answer returned..."+sss);
               return sss;
           }
       }
   } 
  
}
