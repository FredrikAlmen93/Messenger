package se.iths.fredrik.messenger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.iths.fredrik.messenger.service.MailService;

@SpringBootApplication
public class MessengerApplication implements CommandLineRunner {

    private MailService mailService;

    public MessengerApplication(MailService mailService) {
        this.mailService = mailService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MessengerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
    }

}
