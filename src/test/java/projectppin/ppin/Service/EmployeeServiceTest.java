package projectppin.ppin.Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import projectppin.ppin.DTO.EmployeeDTO;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {

    private static final Logger log = LoggerFactory.getLogger(EmployeeServiceTest.class);

    @Autowired
    private EmployeeService employeeService;

    @Test
    @DisplayName("사원 조회")
    public void test1() {
        // 1. enb 값이 1L인 사원을 조회
        Long enb = 1l;
        EmployeeDTO result = employeeService.findEmployeeByEnb(enb);
        log.info(result.toString());

        // 2. 조회된 데이터가 null이 아니어야 함 (데이터베이스에 해당 enb 값이 있어야 함)
        assertNotNull(result, "enb가 1L인 사원이 데이터베이스에 존재해야 합니다.");

        // 3. 조회된 사원의 enb 값이 1L인지 확인
        assertEquals(enb, result.getEnb(), "조회된 사원의 enb 값이 1L이어야 합니다.");

        // 추가적으로 다른 필드도 검증할 수 있음 (예: 이름, 이메일 등)
//        System.out.println("Found Employee: " + result.getName());

    }

//    @Test
//    void findAllEmployees() {
//    }
}