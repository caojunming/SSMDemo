package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentService;

@Controller
@RequestMapping("/Hello")
public class HelloWorld {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/SayHello")
    public String SayHello(Model model) {
        String student = studentService.getStudent(1).toString();
        System.out.println(student);
        model.addAttribute("message", student);
        // 对应页面名
        return "/hello";
    }
}