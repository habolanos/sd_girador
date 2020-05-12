package co.edu.campusucc.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.campusucc.sd.hilos.Operacion;
import co.edu.campusucc.sd.hilos.OperacionThread;

@SpringBootApplication
@EnableAutoConfiguration
public class GiradorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GiradorApplication.class, args);
		
		System.out.println("Lanzamiento Hilos");
		
		Operacion op1 = new Operacion("SUMA", 10L, 5L, 5L, 1000L);
		Operacion op2 = new Operacion("RESTA", 100L, 10L, 5L, 1000L);
		Operacion op3 = new Operacion("DIV", 1000L, 10L, 1L, 1000L);
		Operacion op4 = new Operacion("MULT", 10L, 20L, 5L, 1000L);
		
		OperacionThread thread1 = new OperacionThread("HILO 1", op1, 10);
		OperacionThread thread2 = new OperacionThread("HILO 2", op2, 50);
		OperacionThread thread3 = new OperacionThread("HILO 3", op3, 5);
		OperacionThread thread4 = new OperacionThread("HILO 4", op4, 10);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
