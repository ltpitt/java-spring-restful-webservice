package it.davidenastri.healthcheck;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheckController {

    @GetMapping("/")
    @ResponseBody
    public String getAllEnvironments(@RequestParam(name = "environment", required = false, defaultValue = "all") String environment) {
        HttpResponse<JsonNode> response = Utils.httpGet("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154");
        System.out.println(environment);
        return response.getBody().toString();
    }

    @GetMapping(value = "/api/{name}")
    @ResponseBody
    public String getSpecificEnvironment(@PathVariable String name) {
        HttpResponse<JsonNode> response = Utils.httpGet("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154");
        System.out.println(name);
        return response.getBody().toString();
    }


}