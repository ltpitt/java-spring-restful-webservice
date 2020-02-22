package it.davidenastri.healthcheck;

import javax.persistence.*;

@Entity
@Table(name = "tblCheck")
public class Check {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int port;

    @Column
    private Protocol protocol;

    enum Protocol {
        HTTP,
        HTTPS,
        TCP
    }

    protected Check() {
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
