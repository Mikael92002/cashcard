package example.cashcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CashCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashCardApplication.class, args);
	}

}

/*@RestController
class CashCardController{
	@GetMapping("/cashcards/{requestedId}")
	private ResponseEntity<CashCard> findById(@PathVariable Long requestedId){
		// work in progress...
		CashCard cashCard = /* code to retrieve cashcard
	}*/

