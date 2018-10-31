package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.RentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentDetailRespository extends JpaRepository<RentDetail, String> {
}
