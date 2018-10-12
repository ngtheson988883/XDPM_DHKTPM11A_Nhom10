package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRespository extends JpaRepository<Title, String> {
    @Override
    <S extends Title> S save(S entity);
}
