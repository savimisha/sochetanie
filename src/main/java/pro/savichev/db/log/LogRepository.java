package pro.savichev.db.log;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<LogEntity, Integer> {

}
