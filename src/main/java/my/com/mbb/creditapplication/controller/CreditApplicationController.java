package my.com.mbb.creditapplication.controller;

import my.com.mbb.creditapplication.model.CreditApplication;
import my.com.mbb.creditapplication.service.CreditApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credit-applications")
public class CreditApplicationController {

    private static final Logger logger = LoggerFactory.getLogger(CreditApplicationController.class);

    @Autowired
    private CreditApplicationService creditApplicationService;

    @PostMapping
    public CreditApplication submitApplication(@RequestBody CreditApplication application) {
        logger.info("Received request: {}", application);
        CreditApplication response = creditApplicationService.submitApplication(application);
        logger.info("Response: {}", response);
        return response;
    }

    @GetMapping
    public List<CreditApplication> getApplications(@RequestParam int page, @RequestParam int size) {
        logger.info("Request for page: {}, size: {}", page, size);
        List<CreditApplication> response = creditApplicationService.getApplications(page, size);
        logger.info("Response: {}", response);
        return response;
    }
}
