package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Asignatura;
import Entity.Horario;
import Repository.AsignaturaRepositoty;
import Repository.HorarioRepository;

@Service
public class HorarioService {
	
	@Autowired
	private HorarioRepository horarioRepository;
	
	public boolean saveHorario(Horario horario) {
		horario = horarioRepository.save(horario);
		if(horario.getIdHorario() != 0) {
			return true;
		}else {
			return false;
		}
	       
	   }
	
	public List<Horario> getHorarios() {
	       return horarioRepository.findAllAndAsignatura();
	   }

}
