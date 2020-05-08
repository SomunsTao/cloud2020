//Json封装体CommentResult,传给前端 通用json串，判断编码是否成功，成功才显示
package com.atguigu.springcloud.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
  /*Comment可以放第三方接口、工具类，统一调配使用。*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {  //泛型：如果装的payment 返回payment,装的order 返回order

    private Integer code; //404 notfind
    private String message;
    private T data;

    public CommonResult(Integer code,String message){//data 可能为null
        this(code,message,null);
    }
}
