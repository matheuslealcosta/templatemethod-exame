package padroescomportamentais.templatemethod;

public class ExameSangue extends Exame {

    public String getPreparo() {
        return "Jejum de 12h";
    }

    public String getLaudo() {
        return "Hemograma";
    }

}
