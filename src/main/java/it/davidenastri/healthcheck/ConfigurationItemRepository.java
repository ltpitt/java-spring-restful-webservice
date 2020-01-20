package it.davidenastri.healthcheck;

import org.springframework.data.repository.CrudRepository;

public interface ConfigurationItemRepository extends CrudRepository<ConfigurationItem, Long> {

  ConfigurationItem findById(long id);

}