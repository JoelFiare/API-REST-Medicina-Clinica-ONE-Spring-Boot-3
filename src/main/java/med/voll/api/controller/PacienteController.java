package med.voll.api.controller;

import med.voll.api.domain.paciente.DatosRegistroPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    //@Autowired
    //private PacienteRepository repository;

    @PostMapping
    public void registrar(@RequestBody DatosRegistroPaciente datos) {
        System.out.println("datos recebidos: " +datos);
    }

    //TODO
    //@GetMapping
    //public Page<DatosListaPaciente> listar(@PageableDefault(page = 0, size = 10, sort = {"nombre"}) Pageable paginacion {
    //    return repository.findAll(paginacion).map(DatosListaPaciente::new);
    //}

}