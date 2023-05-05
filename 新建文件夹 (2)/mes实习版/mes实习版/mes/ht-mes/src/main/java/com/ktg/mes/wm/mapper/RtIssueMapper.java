package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.RtIssue;

public interface RtIssueMapper {
    int insertRtIssue(RtIssue rtIssue);

    RtIssue selectRtIssueByrtcode(String rt_code);

    int updateRtIssue(RtIssue rtIssue);

    int deleteRtIssueByrtcode(String rt_code);
}
