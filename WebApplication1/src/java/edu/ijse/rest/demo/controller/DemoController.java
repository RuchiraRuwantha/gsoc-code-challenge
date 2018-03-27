/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.rest.demo.controller;

import edu.ijse.rest.demo.model.Student;
import edu.ijse.rest.demo.model.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author student
 */
@RestController
public class DemoController {

    @RequestMapping("/hello/{student}")
    public Message message(@PathVariable String student) {//REST Endpoint.

        Message msg = new Message(student, "Hello " + student);
        return msg;
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public Student studentDetails(@PathVariable Student student) {//REST Endpoint.

        System.out.println("=========" + student.getStudentName());
        return student;
    }
}
