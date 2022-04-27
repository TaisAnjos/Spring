package ord.generation.helloworld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloControler {
	@GetMapping
public String HelloWorld () 
{
	return "Olá Mundo!!";
	
}
}
