package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameSangueTest {

    @Test
    void deveRetornarPreparo() {
        ExameSangue exame = new ExameSangue();
        assertEquals("Jejum de 12h", exame.getPreparo());
    }

    @Test
    void deveRetornarLaudo() {
        ExameSangue exame = new ExameSangue();
        assertEquals("Hemograma", exame.getLaudo());
    }

    @Test
    void deveRealizarExame() {
        ExameSangue exame = new ExameSangue();
        exame.setPaciente("Marcelo");
        assertEquals("Exame{paciente='Marcelo', preparo=Jejum de 12h, laudo=Hemograma}", exame.realizar());
    }
}
