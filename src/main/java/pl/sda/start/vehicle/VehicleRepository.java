package pl.sda.start.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    Vehicle findByYearGreaterThanEqualAndMakeEndingWith(Integer year, String makeEndingWith);

    Optional<Vehicle> findFirstByYear(Integer year);
}
