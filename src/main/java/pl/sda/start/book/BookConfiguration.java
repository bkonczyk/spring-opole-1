package pl.sda.start.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BookConfiguration {

    @Bean
    BookSeller veryExpensiveBookSeller() {
        return () -> System.out.println("Pay me 2500");
    }

    @Bean
    BookSeller expensiveBookSeller() {
        return () -> System.out.println("Pay me 1500");
    }

    @Bean
    BookSeller cheapBookSeller() {
        return () -> System.out.println("Pay me 20");
    }
}
