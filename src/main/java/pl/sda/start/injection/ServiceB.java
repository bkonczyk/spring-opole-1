package pl.sda.start.injection;

import org.springframework.stereotype.Component;

@Component
public class ServiceB {

    private final ServiceC serviceC;

    public ServiceB(ServiceC serviceC) {
        this.serviceC = serviceC;
    }
}
