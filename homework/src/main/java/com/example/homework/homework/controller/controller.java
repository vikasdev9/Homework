package com.example.homework.homework.controller;

import java.util.UUID;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.homework.homework.model.contactm;
import com.example.homework.homework.model.Student;
import com.example.homework.homework.repo.contactRepo;
import com.example.homework.homework.repo.students;

@Controller
public class controller {
    @Autowired
    private students repositoryStudents;
    @Autowired
    private contactRepo contactRepository;

    @GetMapping(value = "/hi")
    public String hello() {
        return "Homepages/index";
    }

    @GetMapping(value = "/header")
    public String header() {
        return "Homepages/header";
    }

    @GetMapping(value = "/contact")
    public String contact_us() {
        return "contact_us";
    }

    @GetMapping(value = "/user")
    public String user() {

        return "Userdashboard/Userdashboard";
    }

    @GetMapping(value = "/notification")
    public String notification() {

        return "Userdashboard/Notification";
    }

    @GetMapping(value = "/side")
    public String side() {

        return "Userdashboard/side";
    }

    @GetMapping(value = "/Login")
    public String login() {

        return "LoginandRegisters/login";
    }

    @GetMapping(value = "/userdashboard")
    public String userdashboard() {

        return "Userdashboard/menu";
    }

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student Student) {
        Student save = this.repositoryStudents.save(Student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/api/user_data")
    public ResponseEntity<?> getStudent() {
        return ResponseEntity.ok(this.repositoryStudents.findAll());
    }

    @PostMapping("/register")
    public String register(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
            @RequestParam("address") String address, @RequestParam("zip") String zip,
            @RequestParam("contact") String contact, @RequestParam("mail") String mail) {

        try {
            Student s = new Student();
            s.setFname(fname);
            s.setLname(lname);
            s.setAddress(address);
            s.setZip(zip);
            s.setContact(contact);
            s.setEmail(mail);
            this.repositoryStudents.save(s);
            return "redirect:/hi";
        } catch (Exception e) {
            return "redirect:/hi";
        }

    }

    // contact us

    @PostMapping("/contact_us")
    public String contactus(@RequestParam("cname") String cname, @RequestParam("cemail") String cemail,
            @RequestParam("cmessage") String cmessage) {
        try {
            contactm c = new contactm();
            c.setClientName(cname);
            c.setClientEmail(cemail);
            c.setClientMessage(cmessage);
            this.contactRepository.save(c);
            return "redirect:/hi";
        } catch (Exception e) {
            return "redirect:/hi";
        }
    }

}
