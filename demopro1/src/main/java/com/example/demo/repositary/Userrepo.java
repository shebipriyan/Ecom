package com.example.demo.repositary;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Userentity;
@Repository
public interface Userrepo extends JpaRepository<Userentity,Integer>{

}
