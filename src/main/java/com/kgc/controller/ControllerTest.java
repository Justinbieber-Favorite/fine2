package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Invitation;
import com.kgc.entity.Replydetail;
import com.kgc.mapper.InvitationMapper;
import com.kgc.mapper.ReplydetailMapper;
import com.kgc.service.InvitationService;
import com.kgc.service.ReplydetailService;
import com.kgc.utils.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class ControllerTest {
    @Autowired
    private InvitationService invitationService;
    @Autowired
    private ReplydetailService replydetailService;
    @RequestMapping("/list")
    public  String list(@RequestParam(value = "pageNo",defaultValue = "1")Integer pageNo,
                        @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize,
                        Check check, Model model){
        PageInfo<Invitation> info = invitationService.getBypage(pageNo, pageSize, check);
        model.addAttribute("info",info);
        model.addAttribute("check",check);
        return "list";

    }
    @RequestMapping(value = "/delete",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public  String delete(Integer id){
        boolean b = invitationService.delete(id);
        if(b){
            String url="/list";
            return "<script>alert('删除成功！！');location.href='" + url + "'</script>";
        } else {
            return "<script>alert('删除失败！！');history.go(-1)</script>";
        }
    }


    @RequestMapping("/detail")
            public String detail(@RequestParam(value = "pageNo",defaultValue = "1")Integer pageNo,
                                 @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize, Model model, Integer id, HttpSession session){
        PageInfo<Replydetail> info = replydetailService.getListredail(pageNo, pageSize);
        Invitation invia = invitationService.getInvia(id);
        model.addAttribute("info",info);
        model.addAttribute("invia",invia);
    session.setAttribute("id",id);
        return "detail";
    }


    @RequestMapping(value = "/hhh",produces = "text/html;charset=UTF-8",method = RequestMethod.POST)
    @ResponseBody
    public String add(Replydetail replydetail){
        boolean b = replydetailService.readd(replydetail);
        String url="/list";
        if(b){
            return "<script>alert('添加回复成功！！');location.href='" + url + "'</script>";
        } else {
            return "<script>alert('添加回复失败！！');location.href='"+ url + "'</script>";
        }
    }
    @RequestMapping("/readd")
    public String readd(Integer invid,Model model){
        Replydetail re = replydetailService.getbyid(invid);
        model.addAttribute("re",re);
        return "add";
    }

    }


