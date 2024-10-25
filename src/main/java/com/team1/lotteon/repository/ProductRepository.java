package com.team1.lotteon.repository;

import com.team1.lotteon.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    날짜 : 2024/10/25
    이름 : 이상훈
    내용 : 상품 리파지토리 생성
*/
public interface ProductRepository extends JpaRepository<Product, Long> {

}
