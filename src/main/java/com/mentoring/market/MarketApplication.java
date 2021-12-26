package com.mentoring.market;

import com.mentoring.market.entity.Item;
import com.mentoring.market.entity.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@Slf4j
@SpringBootApplication
public class MarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(ItemRepository repository) {
//        return (args) -> {
//            repository.save(new Item("Pencil", "This is pencil"));
//            repository.save(new Item("Notepad", "This is notepad"));
//
//            log.info("CurdRepository::findAll():");
//            log.info("-------------------------------");
//            for (Item customer : repository.findAll()) {
//                log.info(customer.toString());
//            }
//            log.info("");``
//
//            Optional<Item> customer = repository.findById(1L);
//            log.info("Item with id = 1");
//            log.info("--------------------------------");
//            if (customer.isPresent()) {
//                log.info(customer.get().toString());
//            } else {
//                log.info("No item with id = 1");
//            }
//
//            log.info("");
//        };
//    }

}
