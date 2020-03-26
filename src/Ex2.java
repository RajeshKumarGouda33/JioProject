
import java.security.SecureRandom;
import java.util.Random;
import static javafx.beans.binding.Bindings.length;


public class Ex2 {

    
    
    private static final String lower="abcdefghijklmnopqrstuvwxyz";
    private static final String upper=lower.toUpperCase();
    private static final String num="0123456789";
    
    private static final String alphanum=lower+upper+num;
    private static SecureRandom random = new SecureRandom();
    
    
    private static void main(String [] args)
    {
        System.out.println("String: "+alphanum);
//        for(int i=0; i<5; i++)
//        {
//            System.out.println("result :"+generateRandomString(6));
//        }
    }
}
