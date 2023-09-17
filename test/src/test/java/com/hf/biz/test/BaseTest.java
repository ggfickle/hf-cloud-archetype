package com.hf.biz.test;

import com.hf.biz.web.Application;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class)
public class BaseTest {

    @Autowired
    public JPAQueryFactory jpaQueryFactory;

    @Autowired
    public EntityManager entityManager;
}
