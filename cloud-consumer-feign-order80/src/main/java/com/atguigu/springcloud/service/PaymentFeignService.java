package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//业务逻辑接口 + @FeignClient 配置调用provider服务
//客户端服务接口根据 @FeigClient所显示的微服务名称去调用 服务暴露对外提供的方法。
@Component
@FeignClient(value = "CLOUD-PROVIDER-SERVICE")  //指定调用哪个微服务
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")    //哪个地址
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
