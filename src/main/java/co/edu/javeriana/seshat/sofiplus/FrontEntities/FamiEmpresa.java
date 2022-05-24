package co.edu.javeriana.seshat.sofiplus.FrontEntities;

public class FamiEmpresa {
    String nit;
    String razonSocial;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public FamiEmpresa(String nit, String razonSocial) {
        this.nit = nit;
        this.razonSocial = razonSocial;
    }

    public FamiEmpresa() {
    }
}
