package fernandamakihirose.animaissobrecarga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimaisSobrecargaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimaisSobrecargaApplication.class, args);

		Cachorro c = new Cachorro();

		c.reagir("Olá");
		c.reagir("Vai apanhar");

		c.reagir(11, 45);
		c.reagir(21, 00);

		c.reagir(true);
		c.reagir(false);

		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
	}

}
