package pl.sda.start.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Service
@RequestScope
public class RequestService {

    private Integer randomNumber = new Random().nextInt();

    public Integer getRandomNumber() {
        return randomNumber;
    }
}
