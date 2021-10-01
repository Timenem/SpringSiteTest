package sportpit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Controller
    public class AuthorityController {
        @GetMapping("/login_page")
        public String loginPage() {
            return "login_page";
        }


    @GetMapping("/home")
    public String home() {
        return "home";
    }


    @GetMapping("/news")
    public String news() {
        return "about";
    }

    @GetMapping("/contacts")
    public String contacts() {
            return "contacts";
        }


    @GetMapping("/about")
    public String about() {
            return "about";
        }

    }

}