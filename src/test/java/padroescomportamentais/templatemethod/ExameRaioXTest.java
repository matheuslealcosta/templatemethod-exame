package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameRaioXTest {

    @Test
    void deveRetornarPreparo() {
        ExameRaioX exame = new ExameRaioX();
        assertEquals("Remover objetos de metal", exame.getPreparo());
    }

    @Test
    void deveRetornarLaudo() {
        ExameRaioX exame = new ExameRaioX();
        assertEquals("Radiografia", exame.getLaudo());
    }

    @Test
    void deveRealizarExame() {
        ExameRaioX exame = new ExameRaioX();
        exame.setPaciente("Marco");
        assertEquals("ExameImagem{paciente='Marco', preparo=Remover objetos de metal, laudo=Radiografia}", exame.realizar());
    }
}
