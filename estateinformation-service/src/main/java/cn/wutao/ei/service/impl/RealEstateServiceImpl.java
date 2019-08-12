package cn.wutao.ei.service.impl;

import cn.wutao.ei.PageList;
import cn.wutao.ei.domain.RealEstate;
import cn.wutao.ei.mapper.BaseMapper;
import cn.wutao.ei.mapper.RealEstateMapper;
import cn.wutao.ei.query.BaseQuery;
import cn.wutao.ei.service.IRealEstateService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class RealEstateServiceImpl extends BaseServiceImpl<RealEstate> implements IRealEstateService {

    @Autowired
    private RealEstateMapper realEstateMapper;


    @Override
    protected BaseMapper<RealEstate> getMapper() {
        return realEstateMapper;
    }
}
