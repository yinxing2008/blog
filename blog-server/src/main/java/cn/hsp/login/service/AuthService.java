package cn.hsp.login.service;

import cn.hsp.login.domain.auth.ResponseUserToken;
import cn.hsp.login.domain.auth.UserDetail;

/**
 * @author 花生皮编程(抖音、快手、B站、西瓜视频、今日头条)
 */
public interface AuthService {
    /**
     * 注册用户
     * @param userDetail
     * @return
     */
    UserDetail register(UserDetail userDetail);

    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    ResponseUserToken login(String username, String password);

    /**
     * 登出
     * @param token
     */
    void logout(String token);

    /**
     * 刷新Token
     * @param oldToken
     * @return
     */
    ResponseUserToken refresh(String oldToken);

    /**
     * 根据Token获取用户信息
     * @param token
     * @return
     */
    UserDetail getUserByToken(String token);
}
