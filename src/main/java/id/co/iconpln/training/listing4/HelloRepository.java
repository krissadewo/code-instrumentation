package id.co.iconpln.training.listing4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author krissadewo
 * @date 1/4/21 10:11 AM
 */
@Repository
public interface HelloRepository extends JpaRepository<Hello, Integer> {
}
