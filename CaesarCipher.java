
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class CaesarCipher {
    public String encrypt(String input, int key){
        // make a StringBuilder with message encrypted
        StringBuilder encrypted = new StringBuilder(input);
        //write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        //count from o to length of encrypted, call it i
        for(int i = 0; i < encrypted.length(); i++){
            //look at the character located in index=i of encrypted, call it currChar
            char currChar = encrypted.charAt(i);
            //find the inifdex of currChar in the alphabet, call it idx
            int idx = alphabet.indexOf(currChar);
            //if currChar exits in the alphabet
            if (idx != -1) {
                // get the characther located in the index=idx in shiftedAlphabet, call it newChar
                char newChar = shiftedAlphabet.charAt(idx);
                // replace currChar with newChar in encrypted
                encrypted.setCharAt(i, newChar);
            }
            // otherwise do nothing
        }
        // the string inside the encrypted is the answer
        return encrypted.toString();
    }  
    
}
