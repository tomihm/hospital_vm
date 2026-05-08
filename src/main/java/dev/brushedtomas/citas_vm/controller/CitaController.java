package dev.brushedtomas.citas_vm.controller;

import dev.brushedtomas.citas_vm.model.Cita;
import dev.brushedtomas.citas_vm.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    public ResponseEntity<List<Cita>> findAll() {
        List<Cita> citas = citaService.findAll();
        if (citas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(citas);
    }

    @PostMapping
    public ResponseEntity<Cita> save(@RequestBody Cita cita) {
        return ResponseEntity.status(HttpStatus.CREATED).body(citaService.save(cita));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        citaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}