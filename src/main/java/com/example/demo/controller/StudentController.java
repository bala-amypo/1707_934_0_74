package com.example.demo.controller;
import java.util.List;
import java.util.Optional;
import org. springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org. springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bina.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframcwork.web.bind.annotation.RestController;
import com.example.deo.entity.Student;
import com.example.demo.service.StudentService;
@CrossOrigin(origins = " *= )
@RestControllar
public class StudentController {
@Autawired
StudentService studentService,
@PostMappim("/PostStudent")
public Student postStd(@RequestBody Student st)(
return studentService.insertStudent(st);

@6etMapping("/getA1l")
public List<Student> getAlI()
return studentService.getAl1Students();

@GetMapping("/get/{id}")
public Optional<Student> get(@PatiVariable Long id)(
return studentService.getDnestudent(id);

@PutMapping("/update/(id}"]
public String update(@PathVariable Long id,@lsquestBody Student
newStudent){
Gptidnal<Student> student=studentService.getOneStudent(id);
if(student.isPresent()){
newStudent.setId(id);
studentService.insertStudent (newStudent);
return "Updated Success";

return "Id not found";

@0eleteMapping("/del/(id}")
public String deleteStument(@PathVari ble Loig id [
Opticual<Student> student=studentService.getOneStident(id);
if(student.isPresent()){
studentService.deleteitunemt(id);
return "Deleted Success":

return "Id Not Foumd":