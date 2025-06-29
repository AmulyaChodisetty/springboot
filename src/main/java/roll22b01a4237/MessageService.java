package roll22b01a4237;

import org.springframework.stereotype.Service;

@Service  // ✅ This registers the class as a Spring Bean
public class MessageService {

    public String getMessage() {
        return "Hello from MessageService Bean!";
    }
}
