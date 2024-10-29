package my.com.mbb.creditapplication.service;

import my.com.mbb.creditapplication.model.CreditApplication;
import my.com.mbb.creditapplication.repository.CreditApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CreditApplicationService {

    @Autowired
    private CreditApplicationRepository creditApplicationRepository;

    @Transactional
    public CreditApplication submitApplication(CreditApplication application) {
        application.setStatus("PENDING");
        return creditApplicationRepository.save(application);
    }

    @Transactional(readOnly = true)
    public List<CreditApplication> getApplications(int page, int size) {
        return creditApplicationRepository.findAll(PageRequest.of(page, size)).getContent();
    }

}
