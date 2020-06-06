package com.jin.demo.shardingjdbcdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wangjin
 */
public interface COrderRepository extends JpaRepository<COrder,Long> {
}
