package com.qhieco.apiwrite.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.qhieco.request.api.CouponExchangeRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @author 刘江茳 363834586@qq.com
 * @version 2.0.1 创建时间: 2018/2/27 15:17
 * <p>
 * 类说明：
 *     coupon controller的测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CouponWebTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void exchange() throws Exception{
        CouponExchangeRequest request = new CouponExchangeRequest();
        request.setUser_id(1);
        request.setCoupon_code("12345678");
        request.setTimestamp(String.valueOf(System.currentTimeMillis()));
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(request);
        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/coupon/exchange").contentType(MediaType.APPLICATION_JSON).content(requestJson))
                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(print()).andReturn().getResponse().getContentAsString();
        System.out.println("--------返回的json = " + responseString);
    }
}