package conversor;

public class conversor {

    int num;
    int decimal;
    int binario;
    
    public conversor() {
    num= 0;
    decimal= 0;  
    binario= 0;
            
    } 
    
    // De Decimal a Binario  
    
   public  void dec_bin(int num) {

        this.num = num;
        String valor= "";
        int v;
        while (num != 0) {
            
            if (num % 2 == 0) {

                //System.out.print("0 ");
                v= 0;
                 
            } else {

                //System.out.print("1 ");
                v= 1;
                
            }
            valor= valor + v;
            num = Math.round(num / 2);
        }
       System.out.println(new StringBuilder(valor).reverse().toString()); 
    }

    
    // De Binario a Decimal
    
    public void bin_dec(int binario){
        
        this.decimal= 0; 
        this.binario= binario;
        int exp= 0, digito;
        
        while(binario > 0){
            
            digito= binario % 10;
            decimal= decimal + digito * (int)Math.pow(2, exp);
            binario /= 10;
            exp++;
        }
    }
    
    public int getBin_Dec(){
        
        return this.decimal;
    }

}
