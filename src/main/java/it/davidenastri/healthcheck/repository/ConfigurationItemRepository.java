package it.davidenastri.healthcheck.repository;

import it.davidenastri.healthcheck.model.ConfigurationItem;
import org.springframework.data.repository.CrudRepository;

public interface ConfigurationItemRepository extends CrudRepository<ConfigurationItem, Integer> {

}