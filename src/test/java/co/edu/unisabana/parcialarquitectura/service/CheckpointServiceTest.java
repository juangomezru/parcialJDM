package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcialarquitectura.repository.CheckpointPort;
import co.edu.unisabana.parcialarquitectura.repository.jpa.CheckpointRepository;
import co.edu.unisabana.parcialarquitectura.service.model.Checkin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CheckpointServiceTest {
    private CheckpointPort repo;
    private CheckpointDTO dto;
    private CheckpointService logica;
    @BeforeEach
    public void setUp() {
        dto = mock(CheckpointDTO.class);

        logica = new CheckpointService(repo);
    }
    @Test
    public void Dado_dtoInvalido_Cuando_checkin_Entonces_IllegalArgumentException(){
        dto = new CheckpointDTO("Prueba","Prueba",32);

        assertThrows(IllegalArgumentException.class, () -> {
            logica.checkin(dto);
        });

    }
}
