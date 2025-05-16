package catolica.edu.sv.api_farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import catolica.edu.sv.api_farmacia.entities.ClienteEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    @Query("SELECT c FROM ClienteEntity c WHERE c.IdCliente = :idCliente")
    List<ClienteEntity> findByIdCliente(@Param("idCliente") Long idCliente);

}
