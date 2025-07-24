package cn.heycm.component.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * 日志配置
 * @author heycm
 * @version 1.0
 * @since 2025/7/24 23:11
 */
@Configuration
@Slf4j
public class LogAutoConfiguration {

    public LogAutoConfiguration() {
        log.info("日志组件启动成功");
    }

}
