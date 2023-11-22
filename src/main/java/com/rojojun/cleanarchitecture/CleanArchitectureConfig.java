package com.rojojun.cleanarchitecture;

import com.rojojun.cleanarchitecture.account.domain.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties()
public class CleanArchitectureConfig {
    /**
     * 애플리케이션 컨텍스트에 use-case-specific {@link MoneyTransferProperties} 객체를 추가합니다.
     * 이 속성들은 Spring Boot의 {@link BuckPalConfigurationProperties} 객체에서 읽어옵니다.
     */
    @Bean
}
