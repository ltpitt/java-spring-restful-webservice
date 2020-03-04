package it.davidenastri.healthcheck.controller;

import it.davidenastri.healthcheck.model.ConfigurationItem;
import it.davidenastri.healthcheck.repository.ConfigurationItemRepository;
import it.davidenastri.healthcheck.service.ConfigurationItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HealthCheckController {

    @Autowired
    ConfigurationItemRepository configurationItemRepository;

    @Autowired
    ConfigurationItemService configurationItemService;

    @GetMapping("/configurationitems")
    public List<ConfigurationItem> getAllConfigurationItems() {
        return configurationItemService.getAllConfigurationItems();
    }

    @GetMapping("/configurationitems/{id}")
    public ConfigurationItem getConfigurationItemById(@PathVariable int id) {
        return configurationItemService.getConfigurationItem(id);
    }

    @PostMapping(value = "/configurationitems/create")
    public void createConfigurationItem(@RequestBody ConfigurationItem configurationItem) {
        configurationItemService.createConfigurationItem(configurationItem);
    }

    @PutMapping(value = "/configurationitems/update")
    public void updateConfigurationItem(@RequestBody ConfigurationItem configurationItem) {
        configurationItemService.updateConfigurationItem(configurationItem);
    }

    @DeleteMapping(value = "/configurationitems/delete")
    public void deleteConfigurationItem(@RequestBody ConfigurationItem configurationItem) {
        configurationItemService.deleteConfigurationItem(configurationItem.getId());
    }

}