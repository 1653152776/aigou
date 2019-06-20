package com.wyl.aigou.web.controller;

import com.wyl.aigou.domain.Employee;
import com.wyl.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(value = "/loginByPost",method = RequestMethod.POST)
    public AjaxResult loginByPost(@RequestBody Employee employee){
        if(employee!=null){
            if("admin".equals(employee.getUsername())&&"123456".equals(employee.getPassword())){
                return AjaxResult.me().setMsg("登陆成功");
            }else {
                return AjaxResult.me().setSuccess(false).setMsg("登陆失败");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("请输入用户名密码");
    }
    @RequestMapping(value = "/loginByGet",method = RequestMethod.GET)
    public AjaxResult loginByGet(Employee employee){
        if(employee!=null){
            if("admin".equals(employee.getUsername())&&"123456".equals(employee.getPassword())){
                return AjaxResult.me().setMsg("登陆成功");
            }else {
                return AjaxResult.me().setSuccess(false).setMsg("登陆失败");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("请输入用户名密码");
    }
}
