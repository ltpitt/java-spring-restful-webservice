package it.davidenastri.healthcheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HealthCheckController {

    @Autowired
    ConfigurationItemRepository configurationItemRepository;

    @Autowired
    ConfigurationItemService configurationItemService;

    @GetMapping("/")
    public List<ConfigurationItem> getAllEnvironments() {
        List<ConfigurationItem> cis = configurationItemRepository.findAll();
//        cis.stream()
//                .forEach(ci -> ci.getChecks().stream()
//                        .forEach(check -> configurationItemService.performCheck(check))
//                );
        return cis;
    }

    @GetMapping(value = "/api/{name}")
    public String getSpecificEnvironment(@PathVariable String name) {
        return "Work in progress";
    }

    @GetMapping(value = "/api/init")
    public String initializeData() {
        Check check80Http = new Check(80, Check.Protocol.HTTP);
        Check check443Https = new Check(443, Check.Protocol.HTTPS);
        List<Check> checks1 = new ArrayList<Check>();
        checks1.add(check80Http);
        List<Check> checks2 = new ArrayList<Check>();
        checks2.add(check443Https);
        List<Check> checks3 = new ArrayList<Check>();
        checks3.add(check80Http);
        checks3.add(check443Https);
        ConfigurationItem ci = new ConfigurationItem("davidenastri.it", "webserver", checks1);
        ConfigurationItem ci2 = new ConfigurationItem("davidenastri.it2", "webserver", checks2);
        ConfigurationItem ci3 = new ConfigurationItem("davidenastri.it3", "webserver", checks3);
        configurationItemRepository.save(ci);
        configurationItemRepository.save(ci2);
        configurationItemRepository.save(ci3);
        return "Done";
    }

}