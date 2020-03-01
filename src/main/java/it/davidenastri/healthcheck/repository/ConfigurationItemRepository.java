package it.davidenastri.healthcheck.repository;

import it.davidenastri.healthcheck.model.ConfigurationItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationItemRepository extends JpaRepository<ConfigurationItem, Long> {

  ConfigurationItem findById(long id);

}