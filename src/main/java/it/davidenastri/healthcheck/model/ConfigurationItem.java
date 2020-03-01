package it.davidenastri.healthcheck.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tblConfigurationItem")
public class ConfigurationItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CONFIGURATIONITEM_ID")
    private int id;

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

    public ConfigurationItem(int id, String hostname, String type, List<Check> checks) {
        this.id = id;
        this.hostname = hostname;
        this.type = type;
        this.checks = checks;
    }

    public List<Check> getChecks() {
        return checks;
    }

    public int getId() {
        return id;
    }

    public void setId() {
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
