package it.davidenastri.healthcheck.service;


import it.davidenastri.healthcheck.model.Check;
import it.davidenastri.healthcheck.model.ConfigurationItem;
import it.davidenastri.healthcheck.model.Protocol;
import it.davidenastri.healthcheck.repository.ConfigurationItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ConfigurationItemService {

    Logger logger = LoggerFactory.getLogger(ConfigurationItemService.class);

    @Autowired
    ConfigurationItemRepository configurationItemRepository;
    private List<ConfigurationItem> configurationItems = new ArrayList<ConfigurationItem>();

    public ConfigurationItemService() {
        System.out.println("Service Layer is created");
        Check check80Http = new Check(80, Protocol.HTTP);
        Check check443Https = new Check(443, Protocol.HTTPS);
        List<Check> checks1 = new ArrayList<Check>();
        checks1.add(check80Http);
        List<Check> checks2 = new ArrayList<Check>();
        checks2.add(check443Https);
        List<Check> checks3 = new ArrayList<Check>();
        checks3.add(check80Http);
        checks3.add(check443Https);
        ConfigurationItem ci = new ConfigurationItem(1, "server_1", "web_server", checks1);
        ConfigurationItem ci2 = new ConfigurationItem(2, "server_2", "ad_server", checks2);
        ConfigurationItem ci3 = new ConfigurationItem(3, "server_3", "db_server", checks3);
        configurationItems.add(ci);
        configurationItems.add(ci2);
        configurationItems.add(ci3);
    }

    public List<ConfigurationItem> getAllConfigurationItems() {
        return configurationItems;
    }

    public ConfigurationItem getConfigurationItem(int id) {
        return configurationItems.stream()
                .filter(configurationItem -> configurationItem.getId() == id)
                .findFirst().orElse(null);
    }

    public void createConfigurationItem(ConfigurationItem configurationItem) {
        this.configurationItems.add(configurationItem);
    }

    public void updateConfigurationItem(ConfigurationItem configurationItem) {
        Optional<ConfigurationItem> configurationItemWithSameID = Optional.ofNullable(getConfigurationItem(configurationItem.getId()));
        if (configurationItemWithSameID.isPresent()) {
            ConfigurationItem configurationItemToUpdate = configurationItemWithSameID.get();
            configurationItemToUpdate.setHostname(configurationItem.getHostname());
            configurationItemToUpdate.setType(configurationItem.getType());
        }
    }

    public void deleteConfigurationItem(int id) {
        Optional<ConfigurationItem> configurationItemWithSameID = Optional.ofNullable(getConfigurationItem(id));
        if (configurationItemWithSameID.isPresent()) {
            configurationItems.remove(id);
        }

    }

}