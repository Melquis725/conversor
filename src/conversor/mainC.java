/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Melquis
 */
public class mainC {
    
        public static void main(String[] args) {

        conversor f = new conversor();

        System.out.println("La conversion de Decimal a Binario es:");
        f.dec_bin(14);
        
        
        f.bin_dec(1110);
        System.out.println("\r\nLa conversion de Binario a Decimal es:\r\n" + f.getBin_Dec());

    }
}
