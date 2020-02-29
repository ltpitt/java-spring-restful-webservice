package it.davidenastri.healthcheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = "/api/{name}")
    public String getSpecificEnvironment(@PathVariable String name) {
        return "Work in progress";
    }

}