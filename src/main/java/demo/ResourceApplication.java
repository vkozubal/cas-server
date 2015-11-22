package demo;

import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@EnableResourceServer
public class ResourceApplication {
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
