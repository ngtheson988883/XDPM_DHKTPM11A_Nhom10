package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeRespository extends JpaRepository<Type, String> {
    @Override
    <S extends Type> S save(S entity);

    public List<Type> findAll();

}
