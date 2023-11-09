package CrudProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
/articles
/articles/{article-id}
/articles/search
/articles/search-hashtag
*/
@RequestMapping("/articles") //모든 뷰의 end-point들은 articles로 시작해서 앞쪽에 미리 붙여놓으면 뒤의 핸들러 메소드들의 경로 줄일 수 있다
@Controller
public class ArticleController {
}
