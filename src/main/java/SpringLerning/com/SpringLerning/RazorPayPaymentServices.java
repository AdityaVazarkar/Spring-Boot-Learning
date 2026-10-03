package SpringLerning.com.SpringLerning;

import org.springframework.stereotype.Component;
import org.stringtemplate.v4.ST;

@Component
public class RazorPayPaymentServices {
    public String Pay(){
        String payment = "Razor Payment";
        System.out.println("Payment from:-"+payment);
        System.out.println("Payment Done");
        return payment;
    }

}
