package projectppin.ppin.Repository;

import org.springframework.data.jpa.repository.EntityGraph;
import projectppin.ppin.domain.EmployeeList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeList, Long> {
    // 사원과 연관된 회사 정보(부서, 직급)를 함께 로드
//    @EntityGraph(attributePaths = {"company"})
//    EmployeeList findByEmpID(String empID);
    Optional<EmployeeList> findByEmpID(String empID);

}
