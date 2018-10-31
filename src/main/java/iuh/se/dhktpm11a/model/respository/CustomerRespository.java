package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer, String> {
}
