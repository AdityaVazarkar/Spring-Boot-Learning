package SpringLerning.com.SpringLerning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLerningApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringLerningApplication.class, args);
	}

	@Autowired
	private RazorPayPaymentServices paymentServices ;

//	public SpringLerningApplication(RazorPayPaymentServices paymentServices) {
//		this.paymentServices = paymentServices;
//	}

	@Override
	public void run(String... args) throws Exception {
		paymentServices.Pay();
	}

}
