package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Entity.Asignatura;

@Repository
public interface AsignaturaRepositoty extends JpaRepository<Asignatura, Long>{

	@Query("select * from asignatura where codAsignatura like '%:codAsignatura%'")
	Asignatura findByCodAsignatura(@Param("codAsignatura") String codAsignatura);
	
	
}
