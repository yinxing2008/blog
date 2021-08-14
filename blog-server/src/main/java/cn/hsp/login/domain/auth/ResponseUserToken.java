package cn.hsp.login.domain.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 花生皮编程(抖音、快手、B站、西瓜视频、今日头条)
 */
@Data
@AllArgsConstructor
public class ResponseUserToken {
    private String token;
    private UserDetail userDetail;
}
