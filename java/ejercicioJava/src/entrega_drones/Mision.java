package entrega_drones;

public class Mision {
    private final double longitudOrigen = -58.504111;
    private final double latitudOrigen = -34.573195;
    private double longitudDestino;
    private double latitudDestino;
    private boolean exito;

    public double getLongitudOrigen() {
        return longitudOrigen;
    }

    public double getLatitudOrigen() {
        return latitudOrigen;
    }

    public double getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(double longitudDestino) {
        this.longitudDestino = longitudDestino;
    }

    public double getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(double latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public Mision(double longitudDestino, double latitudDestino, boolean exito) {
        this.longitudDestino = longitudDestino;
        this.latitudDestino = latitudDestino;
        this.exito = exito;
    }

    public double obtenerKm()
    {
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;

    }
}
