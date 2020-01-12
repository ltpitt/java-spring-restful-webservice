package it.davidenastri.healthcheck;

import org.apache.tomcat.jni.Proc;

public class Check {

    private int port;
    private Protocol protocol;

    enum Protocol {
        HTTP,
        HTTPS,
        TCP
    }

    public Check(int port, Protocol protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
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
