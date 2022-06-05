abstract public class Locality {
    private String supervisor;

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Locality(String supervisor) {
        this.supervisor = supervisor;
    }
}

