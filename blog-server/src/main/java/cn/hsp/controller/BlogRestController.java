package cn.hsp.controller;

import cn.hsp.entity.Blog;
import cn.hsp.entity.Result;
import cn.hsp.login.domain.ResultCode;
import cn.hsp.login.domain.ResultJson;
import cn.hsp.login.domain.auth.UserDetail;
import cn.hsp.login.service.AuthService;
import cn.hsp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private HttpServletRequest request;

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthService authService;

    @GetMapping(value = "api/del/{id}")
    public Result delBlog(@PathVariable int id) {
        blogService.del(id);
        return new Result();
    }

    @PostMapping(value = "api/add")
    public Result addBlog(String title, String content) {
        Long userId = getLoggedInUserId();
        if (userId != null) {
            blogService.add(userId, title, content);
        }

        return new Result();
    }

    private Long getLoggedInUserId() {
        Long userId = null;
        String token = request.getHeader(tokenHeader);
        if (token != null && !token.isEmpty()) {
            UserDetail userDetail = authService.getUserByToken(token);
            userId = userDetail.getId();
        }
        return userId;
    }

    @PostMapping(value = "api/modify")
    public Result modifyBlog(int id, String title, String content) {
        blogService.modify(id, title, content);
        return new Result();
    }

    @GetMapping("api/list/{userId}")
    public List<Blog> list(@PathVariable long userId) {
        return blogService.queryByUserId(userId);
    }

    @GetMapping("api/query/{blogId}")
    public Blog query(@PathVariable int blogId) {
        return blogService.query(blogId);
    }

}
