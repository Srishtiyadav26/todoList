package com.taskStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskStore.entity.empList;

@Repository
public interface empListRepository extends JpaRepository<empList,Integer>{

}
