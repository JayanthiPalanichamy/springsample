import com.thoughtWorks.repository.CustomerRepository;
import com.thoughtWorks.repository.HibernateCustomerRepositoryImpl;
import com.thoughtWorks.service.CustomerService;
import com.thoughtWorks.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.thoughtWorks"})
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {

        CustomerServiceImpl customerService = new CustomerServiceImpl();
        return customerService;
    }
}
