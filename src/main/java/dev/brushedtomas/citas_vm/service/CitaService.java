package dev.brushedtomas.citas_vm.service;

import dev.brushedtomas.citas_vm.client.PacienteClient;
import dev.brushedtomas.citas_vm.model.Cita;
import dev.brushedtomas.citas_vm.repository.CitaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    @Autowired
    private PacienteClient pacienteClient;

    public List<Cita> findAll() {
        return citaRepository.findAll();
    }

    public Cita save(Cita cita) {
        pacienteClient.getPacienteById(cita.getPacienteId());
        return citaRepository.save(cita);
    }

    public void delete(Long id) {
        citaRepository.deleteById(id);
    }
}