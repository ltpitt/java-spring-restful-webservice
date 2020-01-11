package it.davidenastri.healthcheck;

import java.lang.reflect.Type;

public class Check {

    private int port;
    private String protocol;
    private CheckType checkType;

    enum CheckType {
        HTTP,
        HTTPS,
        TCP
    }

    public Check(int port, String protocol, CheckType checkType) {
        this.port = port;
        this.protocol = protocol;
        this.checkType = checkType;
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

    public CheckType getCheckType() {
        return checkType;
    }

    public void setCheckType(CheckType checkType) {
        this.checkType = checkType;
    }

    @Override
    public String toString() {
        return "Check{" +
                "port=" + port +
                ", protocol='" + protocol + '\'' +
                ", checkType=" + checkType +
                '}';
    }

}
