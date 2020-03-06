package hu.idom.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartCalculatorApplication {
    public static void main( String[] args ) {
        System.out.println( "App start..." );
        SpringApplication.run(StartCalculatorApplication.class);
    }
}
