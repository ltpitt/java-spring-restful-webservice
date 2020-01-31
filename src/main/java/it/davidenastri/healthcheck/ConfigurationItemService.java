package it.davidenastri.healthcheck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationItemService {

    Logger logger = LoggerFactory.getLogger(ConfigurationItemService.class);

    @Autowired
    ConfigurationItemRepository repository;

    public void performCheck(Check check) {
        if (check.getProtocol().equals(Check.Protocol.HTTP)) {
            logger.info("A DEBUG Message");

        } else if (check.getProtocol().equals(Check.Protocol.HTTPS)) {
            logger.info("Debug log HTTPS");
        }
    }

//    @Autowired
//    ConfigurationItemRepository repository;
//    public void add(DogDto dto) {
//        repository.save(toEntity(dto));
//    }
//    public void delete(long id) {
//        repository.deleteById(id);
//    }
//    public List<Dog> getDogs() {
//        return (List<Dog>) repository.findAll();
//    }
//    public Dog getDogById(long id) {
//        Optional<Dog> optionalDog = repository.findById(id);
//        return optionalDog.orElseThrow(() -> new DogNotFoundException("Couldn't find a Dog with id: " + id));
//    }
//    private Dog toEntity(DogDto dto) {
//        Dog entity = new Dog();
//        entity.setName(dto.getName());
//        entity.setAge(dto.getAge());
//        return entity;
//    }
}