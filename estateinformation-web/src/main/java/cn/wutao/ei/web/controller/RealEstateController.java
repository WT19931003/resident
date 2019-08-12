package cn.wutao.ei.web.controller;

import cn.wutao.ei.AjaxResult;
import cn.wutao.ei.PageList;
import cn.wutao.ei.domain.RealEstate;
import cn.wutao.ei.query.RealEstateQuery;
import cn.wutao.ei.service.IRealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/re")
public class RealEstateController {

    @Autowired
    private IRealEstateService realEstateService;

    @RequestMapping("/index")
    public String mainIndex(){
        return "/realEstate";
    }

    /**
     * 分页查询
     * @param realEstateQuery
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET )
    @ResponseBody
    public PageList<RealEstate> list(RealEstateQuery realEstateQuery){
            return  realEstateService.queryPage(realEstateQuery);
    }
}
