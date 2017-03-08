
package biometricapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dushan
 */
public class DataHandler {
    
    private static String fileNameWithLocation="profileData.bio"; 
    
    public static void writeData(String data){
        try {
            FileWriter fileWriter=new FileWriter(fileNameWithLocation, true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            
            bufferedWriter.write(data+System.getProperty("line.separator"));
            bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(DataHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList getAllProfiles(){
        ArrayList profileList=new ArrayList();
        String profileData="";
        try {
            FileReader fileReader= new FileReader(fileNameWithLocation);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            
            
            while((profileData=bufferedReader.readLine())!=null){
                profileList.add(profileData);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return profileList;
    }
}
