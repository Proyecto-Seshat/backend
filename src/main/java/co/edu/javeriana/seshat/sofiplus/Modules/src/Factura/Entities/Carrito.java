package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Carrito {
    List<CarritoItem> carrito;

    public Carrito() {
    }

    public Carrito(List<Map<String, Object>> carrito) {
        this.carrito = new ArrayList<>();
        for (Map<String, Object> item : carrito) {
            this.carrito.add(new CarritoItem((String) item.get("nombre"), (int) item.get("cantidad"),(int) item.get("descuento"), (int) item.get("descuento")));
        }
    }


    public List<CarritoItem> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<CarritoItem> carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        String ret = "Carrito{\n";
        for (CarritoItem item :
                this.carrito) {
            ret = ret + item.toString() + "\n";
        }
        ret = ret + "}";
        return ret;
    }
}
