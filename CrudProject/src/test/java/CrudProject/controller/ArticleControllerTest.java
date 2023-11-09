package CrudProject.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("View 컨트롤러 - 게시글")
@WebMvcTest
class ArticleControllerTest {

    private final MockMvc mvc;

    public ArticleControllerTest(@Autowired MockMvc mvc){ //테스트코드에 있는애들은 @어노테이션을 바로 옆에 명시해줘야 한다
        this.mvc = mvc;
    }

    @DisplayName("[view] [GET] 게시글 상세 페이지 - 정상호출")
    @Test
    public void giveNothing_whenRequestingArticlesView_thenReturnsArticlesView() throws Exception{
        //Given

        //When & Then
        mvc.perform(get("/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(model().attributeExists("articles"));
    }

    @DisplayName("[view] [GET] 게시글 검색 전용 페이지 - 정상호출")
    @Test
    public void giveNothing_whenRequestingArticleSearchView_thenReturnsArticleSearchView() throws Exception{
        //Given

        //When & Then
        mvc.perform(get("/articles/search"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML));

    }

    @DisplayName("[view] [GET] 게시글 해시태그 검색 페이지 - 정상호출")
    @Test
    public void giveNothing_whenRequestingArticleHashtagSearchVIEW_thenReturnsArticleHashtagSearchView() throws Exception{
        //Given

        //When & Then
        mvc.perform(get("/articles/search-hashtag"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML));

    }
}