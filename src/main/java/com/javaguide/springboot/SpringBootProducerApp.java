package com.javaguide.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApp.class);
    }

    @Autowired
    private WikimediaChangeProducer wikimediaChangeProducer;

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangeProducer.Sendmessage();
    }
}
