package it.davidenastri.healthcheck;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public List<ConfigurationItem> getAllEnvironments(@RequestParam(name = "environment", required = false, defaultValue = "all") String environment) {
        Check check = new Check(80, Check.Protocol.HTTP);
        List<Check> checks = new ArrayList<Check>();
        checks.add(check);
        ConfigurationItem ci = new ConfigurationItem("davidenastri.it", "webserver", checks);
//        HttpResponse<JsonNode> response = Utils.httpGet("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154");
//        System.out.println(environment);
//        return response.getBody().toString();
        List<ConfigurationItem> ciList = new ArrayList<ConfigurationItem>();
        ciList.add(ci);
        ciList.add(ci);
        return ciList;
    }

    @GetMapping(value = "/api/{name}")
    public String getSpecificEnvironment(@PathVariable String name) {
        HttpResponse<JsonNode> response = Utils.httpGet("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154");
        System.out.println(name);
        return response.getBody().toString();
    }

}