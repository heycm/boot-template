package cn.heycm.api.console;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台用户认证
 * @author heycm
 * @version 1.0
 * @since 2025/7/31 23:03
 */
@RestController
@RequestMapping("/console/auth")
public class AuthController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
