import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController{

    @RequestMapping("/error")
    public String handleError() {
        // Trả về một view tùy chỉnh cho lỗi
        return "error"; // Tham chiếu tới error.html trong thư mục templates
    }

}
