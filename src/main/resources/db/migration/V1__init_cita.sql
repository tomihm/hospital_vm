CREATE TABLE cita (
                      id BIGINT NOT NULL AUTO_INCREMENT,
                      paciente_id BIGINT NOT NULL,
                      motivo VARCHAR(255) NOT NULL,
                      fecha DATETIME(6) NOT NULL,
                      estado VARCHAR(255) NOT NULL,
                      PRIMARY KEY (id)
);