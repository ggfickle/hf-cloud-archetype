package com.hf.biz.dao.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author xiehongfei
 * @description
 * @date 2023/8/27 16:20
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.hf.biz.dao.repo")
@EntityScan(basePackages = "com.hf.biz.dao.entity")
public class JPAConfig {
}
