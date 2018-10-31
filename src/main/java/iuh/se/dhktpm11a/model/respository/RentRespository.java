package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRespository extends JpaRepository<Rent, String> {
}
