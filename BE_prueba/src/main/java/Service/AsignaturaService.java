package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Asignatura;
import Repository.AsignaturaRepositoty;

@Service
public class AsignaturaService {
	
	@Autowired
	private AsignaturaRepositoty asignaturaRepositoty;
	
	public Asignatura getAsignatura(String codAsignatura) {
	       return asignaturaRepositoty.findByCodAsignatura(codAsignatura);
	   }

	public boolean saveAsignatura(Asignatura asignatura) {
		boolean estado = false;
		List<Asignatura> listAsignaturas = asignaturaRepositoty.findAll();
		for (Asignatura asig : listAsignaturas) {
			if(estado != false) {
				asignaturaRepositoty.save(asignatura);
				estado = true;
			}else {
				estado = false;
			}
			
		}
		return estado;
	   }
	
	public List<Asignatura> getAsignaturas() {
	       return asignaturaRepositoty.findAll();
	   }
}
