package dev.brushedtomas.citas_vm.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "paciente-client", url = "http://localhost:8080/api/v1")
public interface PacienteClient {

    @GetMapping("/pacientes/{id}")
    Object getPacienteById(@PathVariable Long id);
}