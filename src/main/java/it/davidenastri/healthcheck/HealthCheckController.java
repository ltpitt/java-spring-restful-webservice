package it.davidenastri.healthcheck;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
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

    @GetMapping("/")
    public List<ConfigurationItem> getAllEnvironments() {
        List<ConfigurationItem> cis = configurationItemRepository.findAll();
//        cis.stream()
//                .forEach(ci -> configurationItemService.performCheck());
        return cis;
    }

    @GetMapping(value = "/api/{name}")
    public String getSpecificEnvironment(@PathVariable String name) {
        HttpResponse<JsonNode> response = Utils.httpGet("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154");
        System.out.println(name);
        return response.getBody().toString();
    }

}