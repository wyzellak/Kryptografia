/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kryptografia;

/**
 *
 * @author Kuba
 */
public class DSASignStrategy implements CryptStrategy {

    @Override
    public String decrypt(String ciphertext, String decryptKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String crypt(String plaintext, String cryptKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getKeyTypeForCrypt() {
         return "private";
    }

    @Override
    public String getKeyTypeForDecrypt() {
       return "public";
    }
    
}
