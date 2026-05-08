package dev.brushedtomas.citas_vm.repository;

import dev.brushedtomas.citas_vm.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Long> {
}