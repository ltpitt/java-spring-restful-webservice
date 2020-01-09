package it.davidenastri.healthcheck;

public class Check {

    private int port;
    private String protocol;

    public Check(int port, String protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        return "Check{" +
                "port=" + port +
                ", protocol='" + protocol + '\'' +
                '}';
    }
}
