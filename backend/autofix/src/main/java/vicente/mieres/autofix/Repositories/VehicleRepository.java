package vicente.mieres.autofix.Repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vicente.mieres.autofix.Entities.VehicleEntity;

@Repository
public interface VehicleRepository extends CrudRepository<VehicleEntity, Long>{
    
    public boolean existsByRegistration(String registration);

}
