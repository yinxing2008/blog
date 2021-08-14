package cn.hsp.mapper;

import cn.hsp.entity.Blog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 花生皮编程(抖音 、 快手 、 B站 、 西瓜视频 、 今日头条)
 */
@Repository
public interface BlogMapper {
    @Select(value = "select * from blog where id = #{blogId}")
    Blog query(@Param("blogId") int blogId);

    @Select(value = "select * from blog where userId = #{userId} order by lastUpdateTime desc")
    List<Blog> queryByUserId(@Param("userId") long userId);

    @Insert(value = "insert into blog(userId,title,content) values (#{userId}, #{title}, #{content})")
    void add(@Param("userId") long userId, @Param("title") String title, @Param("content") String content);

    @Update(value = "update blog set title=#{title},content=#{content},lastUpdateTime=now() where id = #{id}")
    void modify(@Param("id") int id, @Param("title") String title, @Param("content") String content);

    @Delete("delete from blog where id = #{id}")
    void del(@Param("id") int id);
}
