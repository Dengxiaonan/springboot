package com.lening.test1005a_dengxiaonan.controller;

import com.github.pagehelper.PageInfo;
import com.lening.test1005a_dengxiaonan.entity.UserBean;
import com.lening.test1005a_dengxiaonan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class Usercontroller {
    @Resource
    private UserService userService;
    @RequestMapping("/findByPage")
    public String findByPage(Model model , String mname , Integer aspoints , Integer bspoints  , Integer page , Integer pagesize){
        page = page==null?1:page;
        pagesize = pagesize==null?5:pagesize;
       PageInfo<UserBean> pageInfo = userService.getUserPage(page , pagesize , mname , aspoints , bspoints );
        model.addAttribute("pageInfo" , pageInfo);
        model.addAttribute("mname" , mname);
        model.addAttribute("aspoints" , aspoints);
        model.addAttribute("bspoints" , bspoints);
        System.out.println(pageInfo);
        System.out.println("dxnn ");
        return "user_list";
    }
    @RequestMapping("/deleteUserById")
    public String deleteUserById(String id){
        userService.deleteUserById(id);
        return "redirect:findByPage";
    }
    @RequestMapping("/toUpdate")
    public String toUpdate(String id , Model model){
     UserBean userBean =  userService.getUserByid(id);
    model.addAttribute("userBean" , userBean);
    return "user_upd";
    }
    @RequestMapping("/updStu")
    public  String updStu(UserBean userBean){
        userService.updStu(userBean);
        return "redirect:findByPage";
    }
    @RequestMapping("/test")
    public String test(Integer b){

        System.out.println(b);
        String a="sjhgjskhdfks";

        System.out.println(a);
        return "1212";
    }

}
