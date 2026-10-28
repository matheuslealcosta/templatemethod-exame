package padroescomportamentais.templatemethod;

public abstract class Exame {

    private String paciente;

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public abstract String getPreparo();

    public abstract String getLaudo();

    public String getTipo() {
        return "Exame";
    }

    public String realizar() {
        return getTipo() + "{" +
                "paciente='" + this.paciente + '\'' +
                ", preparo=" + this.getPreparo() +
                ", laudo=" + this.getLaudo() +
                '}';
    }
}
