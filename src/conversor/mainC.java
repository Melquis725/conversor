
package conversor;

/**
 *
 * @author Melquis
 */
public class mainC {
    
        public static void main(String[] args) {

        conversor f = new conversor();

        System.out.println("La conversion de Decimal a Binario es:");
        f.dec_bin(21);
        
        
        f.bin_dec(10101);
        System.out.println("\r\nLa conversion de Binario a Decimal es:\r\n" + f.getBin_Dec());

    }
}
