package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.RtIssue;
import com.ktg.mes.wm.mapper.RtIssueMapper;
import com.ktg.mes.wm.service.RtIssueService;
import org.springframework.beans.factory.annotation.Autowired;

public class RtIssueServiceImpl implements RtIssueService {

    @Autowired
    private RtIssueMapper rtIssueMapper;

    @Override
    public int insertRtIssue(RtIssue rtIssue) {
        return rtIssueMapper.insertRtIssue(rtIssue);
    }

    @Override
    public RtIssue selectRtIssueByrtcode(String rt_code) {
        return rtIssueMapper.selectRtIssueByrtcode(rt_code);
    }

    @Override
    public int updateRtIssue(RtIssue rtIssue) {
        return rtIssueMapper.updateRtIssue(rtIssue);
    }

    @Override
    public int deleteRtIssueByrtcode(String rt_code) {
        return rtIssueMapper.deleteRtIssueByrtcode(rt_code);
    }
}
