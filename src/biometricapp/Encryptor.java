
package biometricapp;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dushan
 */
public class Encryptor {
    
        
        public static String encryptedString(String text) {
            String encodedtext = null;
            try {
                encodedtext = Base64.getEncoder().encodeToString(text.getBytes("utf-8"));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Encryptor.class.getName()).log(Level.SEVERE, null, ex);
            }
            return encodedtext;
        }
        
        public static String decryptedString(String encodedText){
            byte[] decodeBytes=Base64.getDecoder().decode(encodedText);
            String decodedText = null;
            try {
                decodedText = new String(decodeBytes,"utf-8");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Encryptor.class.getName()).log(Level.SEVERE, null, ex);
            }
            return decodedText;
        }
    
}
