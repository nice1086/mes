package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.Issue;

public interface IssueMapper {
    int insertIssue(Issue issue);

    Issue selectIssueByissuecode(String issue_code);

    int updateIssue(Issue issue);

    int deleteIssueByissuecode(String issue_code);
}
