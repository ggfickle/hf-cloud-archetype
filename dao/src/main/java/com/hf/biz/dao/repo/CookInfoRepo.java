package com.hf.biz.dao.repo;

import com.hf.biz.dao.entity.IbCookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author xiehongfei
 * @description
 * @date 2023/8/27 15:48
 */
@Repository
public interface CookInfoRepo extends JpaRepository<IbCookInfo, Long> {
}
