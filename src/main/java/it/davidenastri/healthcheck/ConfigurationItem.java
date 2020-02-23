package it.davidenastri.healthcheck;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tblConfigurationItem")
public class ConfigurationItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String hostname;

    @Column
    private String type;

    @Column
    @OneToMany(cascade = {CascadeType.ALL})
    @ElementCollection(targetClass = Check.class)
    private List<Check> checks;

    protected ConfigurationItem() {
    }

    public ConfigurationItem(String hostname, String type, List<Check> checks) {
        this.hostname = hostname;
        this.type = type;
        this.checks = checks;
    }

    public List<Check> getChecks() {
        return checks;
    }

    public Long getId() {
        return id;
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
