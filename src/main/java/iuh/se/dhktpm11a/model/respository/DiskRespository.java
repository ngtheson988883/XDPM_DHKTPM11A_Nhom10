package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.Disk;
import iuh.se.dhktpm11a.model.entity.Title;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiskRespository extends JpaRepository<Disk, String> {
    @Override
    public <S extends Disk> S save(S entity);
    public List<Disk> findByTitle(Title title);
    public Disk findByDiskId(String id);
}
