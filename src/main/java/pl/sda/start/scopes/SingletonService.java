package pl.sda.start.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Scope("singleton")
public class SingletonService {

    private Integer randomNumber = new Random().nextInt();

    public Integer getRandomNumber() {
        return randomNumber;
    }
}
