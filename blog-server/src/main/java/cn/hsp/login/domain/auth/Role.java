package cn.hsp.login.domain.auth;

import lombok.Builder;
import lombok.Data;

/**
 * @author 花生皮编程(抖音、快手、B站、西瓜视频、今日头条)
 */
@Data
@Builder
public class Role {
    private Long id;
    private String name;
    private String nameZh;
}
