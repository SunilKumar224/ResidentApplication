package eswar.adhithya.repositery;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import eswar.adhithya.model.*;

@Repository
public interface ResidentMasterDao extends CrudRepository<ResidentMaster, Integer> {

}
