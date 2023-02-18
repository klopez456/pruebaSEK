package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Horario;
import Service.HorarioService;

@RestController
@RequestMapping("/horario")
@CrossOrigin(origins = "*")
public class HorarioController {
	
	@Autowired
	private HorarioService horarioService;

	@GetMapping("/list")
	public List<Horario> getAsignaturas() {
		return horarioService.getHorarios();
	}
	
	@PostMapping("/save")
	public boolean saveAsignatura(@RequestBody Horario horario) {
		return horarioService.saveHorario(horario);
	}
}
