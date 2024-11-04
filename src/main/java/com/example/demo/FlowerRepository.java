package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.flower.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {
}
