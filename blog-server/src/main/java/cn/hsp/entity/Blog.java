package cn.hsp.entity;

import java.sql.Timestamp;

/**
 * @author 花生皮编程(抖音、快手、B站、西瓜视频、今日头条)
 *
 */
public class Blog {
    private Integer id;
    private String title;
    private String content;
    private Timestamp lastUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
