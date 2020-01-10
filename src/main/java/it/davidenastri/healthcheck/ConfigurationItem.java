package it.davidenastri.healthcheck;

import java.util.List;

public class ConfigurationItem {
    private String hostname;
    private String type;
    private List<Check> checks;

    public ConfigurationItem(String hostname, String type, List<Check> checks) {
        this.hostname = hostname;
        this.type = type;
        this.checks = checks;
    }

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

    public List<Check> getChecks() {
        return checks;
    }

    public void setChecks(List<Check> checks) {
        this.checks = checks;
    }

    @Override
    public String toString() {
        return "ConfigurationItem{" +
                "hostname='" + hostname + '\'' +
                ", type='" + type + '\'' +
                ", checks=" + checks +
                '}';
    }

}
