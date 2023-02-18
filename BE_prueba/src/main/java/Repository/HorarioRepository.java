package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Entity.Asignatura;
import Entity.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long>{
	
	@Query("select * from horario join asignatura on asignatura.codAsignatura = horario.codAsignatura ")
	List<Horario>  findAllAndAsignatura();
	
}
