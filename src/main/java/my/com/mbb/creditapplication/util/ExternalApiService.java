package my.com.mbb.creditapplication.util;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService {

    private final RestTemplate restTemplate;

    public ExternalApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String callExternalApi() {
        String url = "https://jsonplaceholder.typicode.com/posts/1"; // Fake 3rd Party API
        return restTemplate.getForObject(url, String.class);
    }
	
}
