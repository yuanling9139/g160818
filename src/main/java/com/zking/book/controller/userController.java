package com.zking.book.controller;

import com.zking.book.biz.IbookBiz;
import com.zking.book.biz.IshoppingBiz;
import com.zking.book.biz.IuserBiz;
import com.zking.book.model.Bookr;
import com.zking.book.model.bookShopping;
import com.zking.book.model.bookUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
public class userController {
    @Autowired
    private IuserBiz userBiz;
    @Autowired
    private IbookBiz bookBiz;
    @Autowired
    private IshoppingBiz shoppingBiz;

    @ModelAttribute
    public void init(Model model) {
        bookUser bookUser = new bookUser();
        model.addAttribute("bookUser",bookUser);
        List<Bookr> list= bookBiz.list(new Bookr());
        List<Bookr> listtop=bookBiz.listtop(new Bookr());
        model.addAttribute("bookList", list);
        model.addAttribute("booktopList", listtop);

    }
    @RequestMapping("toregUser")
    public String toregUser(bookUser bookUser, Model model) {
        return "register";
    }
    @RequestMapping("regUser")
    public String regUser(bookUser bookUser, Model model) {
        bookUser.setuQx(1);
        userBiz.addreq(bookUser);
        return null;
    }
    @RequestMapping("toindex")
    public String toindex(Model model,Bookr bookr) {
        return "bookindex";
    }
    @RequestMapping("totypelist")
    public String totypelist(Bookr bookr, Model model) {
        List<Bookr> listtype=bookBiz.listtype(bookr);
        model.addAttribute("listtype", listtype);
        return "findBook";
    }
    @RequestMapping("tologin")
    public String tologin(bookUser bookUser, HttpSession session) {
        return "login";
    }
    @RequestMapping("userlogin")
    public String userlogin(bookUser bookUser,HttpSession session,Model model) {
        bookUser bu=userBiz.login(bookUser);
        if (null != bu&&1==bu.getuQx()) {
            session.setAttribute("userzh", bu.getuZh());
            session.setAttribute("userid", bu.getuId());
            return "userindex";
        }else if(null != bu&&0==bu.getuQx()){
            session.setAttribute("userzh", bu.getuZh());
            session.setAttribute("userid", bu.getuId());
            return "redirect:/gly/togly";
        }
        else{
            session.setAttribute("message","帐号或密码错误");
            model.addAttribute("userzhxs", bookUser.getuZh());
            return "redirect:/user/tologin";
        }

    }
    @RequestMapping("addshopping")
    public String addshopping(bookShopping bookShopping,Bookr bookr,Model model) {
         bookShopping isbid=shoppingBiz.loadbid(bookShopping);
        if (null==isbid) {
            bookShopping.setsCout(1);
            shoppingBiz.addsop(bookShopping);
        } else if (isbid!=null) {
            shoppingBiz.updateshop(bookShopping);
        }
        return "forward:/user/totypelist?tId="+bookr.gettId();
    }
}
