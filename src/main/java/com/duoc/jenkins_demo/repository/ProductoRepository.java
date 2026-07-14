package com.duoc.jenkins_demo.repository;

import com.duoc.jenkins_demo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}