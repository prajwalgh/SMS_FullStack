package in.co.vwits.sms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.co.vwits.sms.model.Student;

// jpa repositry gives of lot of build in method for crude operation which we don't have to implement at all
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	//but we also have freedom of writing our custom method
	//we just have to declare custom method , we don't have to define them,
	//but for custom method we have to write jpql on top of respective custom method.
	//this is done using @Query annotation 
	@Query("SELECT DISTINCT s FROM Student AS s LEFT JOIN FETCH s.subjectsLearning")
	List<Student> findAllWithSubjects() ;
	
	@Query("FROM Student AS s LEFT JOIN FETCH s.subjectsLearning WHERE s.rollno = :rno")
	Student findOneWithSubjectsLearning(@Param(value="rno") int rollNo);
	
	

}
