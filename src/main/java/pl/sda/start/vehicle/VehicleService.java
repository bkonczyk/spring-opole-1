package pl.sda.start.vehicle;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository repository;

    public List<Vehicle> findAll() {
        return repository.findAll();
    }
}
