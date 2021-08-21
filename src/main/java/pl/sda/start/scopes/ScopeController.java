package pl.sda.start.scopes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/scopes")
class ScopeController {

    private final SingletonService singletonService;
    private final RequestService requestService;

    public ScopeController(SingletonService singletonService, RequestService requestService) {
        this.singletonService = singletonService;
        this.requestService = requestService;
    }

    @GetMapping("/singleton")
    Integer getSingletonRandom() {
        return singletonService.getRandomNumber();
    }

    @GetMapping("/request")
    Integer getRequestRandom() {
        return requestService.getRandomNumber();
    }
}
