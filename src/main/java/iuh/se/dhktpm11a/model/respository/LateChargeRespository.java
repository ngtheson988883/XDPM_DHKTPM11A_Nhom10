package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.LateCharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LateChargeRespository extends JpaRepository<LateCharge, String> {
    public LateCharge findByRentDetailId(String id);
}
