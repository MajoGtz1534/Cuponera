package Cuponera.Error;

import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;
import java.util.List;

public class ApiErrors {

    String mensaje;
    List<String> detalles;
    HttpStatusCode status;
    LocalDateTime timeStamp;

    public ApiErrors(String mensaje, List<String> detalles, HttpStatusCode status, LocalDateTime timeStamp) {
        this.mensaje = mensaje;
        this.detalles = detalles;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public ApiErrors(String mensaje, HttpStatusCode status, LocalDateTime timeStamp) {
        this.mensaje = mensaje;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<String> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<String> detalles) {
        this.detalles = detalles;
    }

    public HttpStatusCode getStatus() {
        return status;
    }

    public void setStatus(HttpStatusCode status) {
        this.status = status;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}