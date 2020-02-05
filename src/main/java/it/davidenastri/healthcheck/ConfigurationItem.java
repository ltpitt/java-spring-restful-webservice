package it.davidenastri.healthcheck;

import javax.persistence.*;
import java.util.List;

@Entity
public class ConfigurationItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String hostname;
    private String type;

    @OneToMany(targetEntity = Check.class, mappedBy = "check_id", fetch = FetchType.EAGER)
    private List<Check> checks;

    protected ConfigurationItem() {
    }

    public ConfigurationItem(String hostname, String type, List<Check> checks) {
        this.hostname = hostname;
        this.type = type;
        this.checks = checks;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
