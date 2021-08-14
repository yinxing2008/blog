package cn.hsp.service;

import cn.hsp.entity.Blog;
import cn.hsp.login.domain.auth.UserDetail;
import cn.hsp.login.mapper.AuthMapper;
import cn.hsp.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 花生皮编程(抖音 、 快手 、 B站 、 西瓜视频 、 今日头条)
 */
@Service
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public Blog query(int blogId) {
        return blogMapper.query(blogId);
    }

    public void add(long userId, String title, String content) {
        blogMapper.add(userId, title, content);
    }

    public void modify(int id, String title, String content) {
        blogMapper.modify(id, title, content);
    }

    public void del(int id) {
        blogMapper.del(id);
    }

    public List<Blog> queryByUserId(long userId) {
        return blogMapper.queryByUserId(userId);
    }
}
