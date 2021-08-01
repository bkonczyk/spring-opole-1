package pl.sda.start.injection;

import org.springframework.stereotype.Component;

@Component
public class ServiceC {

    private final ServiceA serviceA;

    public ServiceC(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
