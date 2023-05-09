
package com.portfolio.njvp.Security.Repository;

import com.portfolio.njvp.Security.Enums.Entity.Rol;
import com.portfolio.njvp.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
