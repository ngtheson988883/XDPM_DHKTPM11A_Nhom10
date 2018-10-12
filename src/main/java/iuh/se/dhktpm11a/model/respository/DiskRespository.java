package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.Disk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiskRespository extends JpaRepository<Disk, String> {
    @Override
    <S extends Disk> S save(S entity);
}
