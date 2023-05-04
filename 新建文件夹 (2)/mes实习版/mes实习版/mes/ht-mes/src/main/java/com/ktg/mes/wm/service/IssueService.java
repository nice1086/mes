package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.Issue;

public interface IssueService {
    int insertIssue(Issue issue);

    Issue selectIssueByissuecode(String issue_code);

    int updateIssue(Issue issue);

    int deleteIssueByissuecode(String issue_code);
}
