package padroescomportamentais.templatemethod;

public class ExameRaioX extends Exame {

    public String getPreparo() {
        return "Remover objetos de metal";
    }

    public String getLaudo() {
        return "Radiografia";
    }

    @Override
    public String getTipo() {
        return "ExameImagem";
    }
}
