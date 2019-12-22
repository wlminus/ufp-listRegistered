package com.wlminus.ufp.repository;

import com.wlminus.ufp.domain.RegisterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterModelRepository extends JpaRepository<RegisterModel, Long> {
    @Query("select rm from RegisterModel rm left join rm.course left join rm.student where rm.student.studentCode =:studentCode")
    List<RegisterModel> findByStudentCode(@Param("studentCode") String studentCode);
}
