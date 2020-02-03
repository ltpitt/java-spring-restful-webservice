package it.davidenastri.healthcheck;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationItemRepository extends JpaRepository<ConfigurationItem, Long> {

  ConfigurationItem findById(long id);

}