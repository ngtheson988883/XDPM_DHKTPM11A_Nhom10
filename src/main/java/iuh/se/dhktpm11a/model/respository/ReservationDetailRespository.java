package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.Disk;
import iuh.se.dhktpm11a.model.entity.ReservationDetail;
import iuh.se.dhktpm11a.model.entity.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDetailRespository extends JpaRepository<ReservationDetail, String> {
    public ReservationDetail findByTitleAndDisk(Title title, Disk disk);
}
