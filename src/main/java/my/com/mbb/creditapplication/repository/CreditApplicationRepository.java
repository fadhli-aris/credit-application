package my.com.mbb.creditapplication.repository;

import java.util.List;

import my.com.mbb.creditapplication.model.CreditApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditApplicationRepository extends JpaRepository<CreditApplication, Long> {
	
	List<CreditApplication> findByStatus(String status);
	
}
