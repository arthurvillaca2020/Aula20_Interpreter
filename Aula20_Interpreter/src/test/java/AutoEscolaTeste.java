import org.example.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoEscolaTeste {
    @Test
    void deveCalcularExpressaoComFormula() {
        Aluno aluno = new Aluno();
        aluno.setNota1(5.0);
        aluno.setNota2(5.0);

        assertEquals(6.0, aluno.calcularNota());
    }
}
