package cn.hsp.login.controller;

import cn.hsp.login.domain.auth.User;
import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    private final String name= "jerry50";
    private final String password= "123456";

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void register() throws Exception {
        User user = User.builder().name(name).password(password).build();
        mockMvc.perform(MockMvcRequestBuilders.post("/api/register")
                .content(JSON.toJSONString(user))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void login() throws Exception {
        User user = User.builder().name(name).password(password).build();
        mockMvc.perform(MockMvcRequestBuilders.post("/api/login")
                .content(JSON.toJSONString(user))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


}
