package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name = "msvc-student", url = "localhost:8090/api/student/") Para hacer conexion directamente con el msvc de students
@FeignClient(name = "msvc-student", url = "localhost:8080/api/student/") /*Esto para conexion con el Gateway*/
public interface IStudentClient {

    @GetMapping("search-by-course/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse);
}
