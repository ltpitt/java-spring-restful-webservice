package it.davidenastri.healthcheck;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ConfigurationItem {
    @Id
    @GeneratedValue
    private Long id;
    private String hostname;
    private String type;
    private List<Check> checks;

    protected ConfigurationItem() {}

    public ConfigurationItem(String hostname, String type, List<Check> checks) {
        this.hostname = hostname;
        this.type = type;
        this.checks = checks;
    }

    public String getHostname() {
        return hostname;
    }

    public String getType() {
        return type;
    }

    public List<Check> getChecks() {
        return checks;
    }

    @Override
    public String toString() {
        return "ConfigurationItem{" +
                "id=" + id +
                ", hostname='" + hostname + '\'' +
                ", type='" + type + '\'' +
                ", checks=" + checks +
                '}';
    }

}
