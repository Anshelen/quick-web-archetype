package ${package}.${artifactId}.repository;

import ${package}.${artifactId}.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("FROM Account a JOIN FETCH a.roles WHERE a.email = :email")
    Account getByEmailWithRoles(@Param("email") String email);
}
