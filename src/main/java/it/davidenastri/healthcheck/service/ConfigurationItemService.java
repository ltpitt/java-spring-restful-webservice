package it.davidenastri.healthcheck.service;


import it.davidenastri.healthcheck.model.ConfigurationItem;
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

    public ConfigurationItemService() {
        System.out.println("Service Layer is created");
    }

    public List<ConfigurationItem> getAllConfigurationItems() {
        List<ConfigurationItem> configurationItems = new ArrayList<>();
        configurationItemRepository.findAll().forEach(configurationItems::add);
        return configurationItems;
    }

    public ConfigurationItem getConfigurationItem(int id) {
        Optional<ConfigurationItem> optionalConfigurationItem = configurationItemRepository.findById(id);
        if (optionalConfigurationItem.isPresent()) {
            return optionalConfigurationItem.get();
        }
        return null;
    }

    public void createConfigurationItem(ConfigurationItem configurationItem) {
        configurationItemRepository.save(configurationItem);
    }

    public void updateConfigurationItem(ConfigurationItem configurationItem) {
        configurationItemRepository.save(configurationItem);
    }

    public void deleteConfigurationItem(int id) {
        configurationItemRepository.deleteById(id);
    }

}