package com.rojojun.cleanarchitecture;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "hojun")
public class CleanArchitecturePropeties {
    private long transferThreshold = Long.MAX_VALUE;
}
