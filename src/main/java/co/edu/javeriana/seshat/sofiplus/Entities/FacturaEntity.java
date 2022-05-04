package co.edu.javeriana.seshat.sofiplus.Entities;

public class FacturaEntity {
    private String clienteCedula;
    private int total;
 //id factura

    public FacturaEntity(String clienteCedula, int total) {
        this.clienteCedula = clienteCedula;
        this.total = total;
    }

    public String getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(String clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
