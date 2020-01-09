package it.davidenastri.healthcheck;

public class ConfigurationItem {
    private String hostname;
    private String type;

    public ConfigurationItem(String hostname, String type, String environment) {
        this.hostname = hostname;
        this.type = type;
        this.environment = environment;
    }

    private String environment;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "ConfigurationItem{" +
                "hostname='" + hostname + '\'' +
                ", type='" + type + '\'' +
                ", environment='" + environment + '\'' +
                '}';
    }
}
