package com.zking.book.controller;

import com.zking.book.biz.IbookBiz;
import com.zking.book.biz.ItypeBiz;
import com.zking.book.model.Bookr;
import com.zking.book.model.bookType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("gly")
public class glyController {
    @Autowired
    private IbookBiz bookBiz;
    @Autowired
    private ItypeBiz typeBiz;

    @ModelAttribute
    public void init(Model model) {
        bookType bookType = new bookType();
        model.addAttribute("bookType", bookType);
        Bookr bookr = new Bookr();
        model.addAttribute("bookr", bookr);
        System.out.println("init啊啊啊啊啊");
        List<bookType> listtypeName=typeBiz.listtypename(new bookType());
        model.addAttribute("listtypeName", listtypeName);
    }
    @RequestMapping("togly")
    public String togly(Bookr bookr, Model model) {
        return "console1";
    }
    @RequestMapping("toglyadd")
    public String toglyadd(Bookr bookr, Model model) {
        return "addbook";
    }
    @RequestMapping("glyadd")
    public String glyadd(Bookr bookr, Model model) {
        bookr.setbScsj(new Date());
        bookr.setbSjzt(0);
        bookBiz.addbook(bookr);
        return "redirect:/gly/togly";
    }
    @RequestMapping("glynotbook")
    public String glynotbook(Bookr bookr, Model model) {
        bookr.setbSjzt(0);
       List<Bookr> list= bookBiz.listnotbook(bookr);
        model.addAttribute("notbook", list);
        return "listbook1";
    }
    @RequestMapping("glyyestbook")
    public String glyyestbook(Bookr bookr, Model model) {
        bookBiz.editzt(bookr);
        if(bookr.getbSjzt()==1){
            return "redirect:/gly/glynotbook";
        } else if (bookr.getbSjzt() == 2) {
            return "redirect:/gly/toglynotbook";
        }
        return null;

    }
    @RequestMapping("toglynotbook")
    public String toglynotbook(Bookr bookr, Model model) {
        bookr.setbSjzt(1);
        List<Bookr> list= bookBiz.listnotbook(bookr);
        model.addAttribute("notbook", list);
        return "listbook2";
    }
    @RequestMapping("toglyendbook")
    public String toglyendbook(Bookr bookr, Model model) {
        bookr.setbSjzt(2);
        List<Bookr> list= bookBiz.listnotbook(bookr);
        model.addAttribute("notbook", list);
        return "listbook3";
    }
    @RequestMapping("glydelbook")
    public String glydelbook(Bookr bookr, Model model) {
        bookBiz.delbook(bookr);
        return "redirect:/gly/glynotbook";
    }

    /**
     * 修改查看
     * @param bookr
     * @param model
     * @return
     */
    @RequestMapping("glyloadeditbook")
    public String glyloadeditbook(Bookr bookr, Model model) {
        Bookr bk= bookBiz.loadedit(bookr);

        model.addAttribute("loadeditlist", bk);
        return "editbook";
    }
    @RequestMapping("glyeditbook")
    public String glyeditbook(Bookr bookr, Model model) {
        bookr.setbSjzt(0);
        bookBiz.editbook(bookr);
        return "redirect:/gly/glynotbook";
    }
}
