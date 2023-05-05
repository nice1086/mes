package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.Issue;
import com.ktg.mes.wm.mapper.IssueMapper;
import com.ktg.mes.wm.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;

public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueMapper issueMapper;

    @Override
    public int insertIssue(Issue issue) {
        return issueMapper.insertIssue(issue);
    }

    @Override
    public Issue selectIssueByissuecode(String issue_code) {
        return issueMapper.selectIssueByissuecode(issue_code);
    }

    @Override
    public int updateIssue(Issue issue) {
        return issueMapper.updateIssue(issue);
    }

    @Override
    public int deleteIssueByissuecode(String issue_code) {
        return issueMapper.deleteIssueByissuecode(issue_code);
    }
}
