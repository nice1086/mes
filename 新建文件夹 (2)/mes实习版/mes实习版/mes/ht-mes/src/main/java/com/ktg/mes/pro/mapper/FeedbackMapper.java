package com.ktg.mes.pro.mapper;

import com.ktg.mes.pro.domain.Feedback;

public interface FeedbackMapper {
    int insertFeedback(Feedback feedback);

    Feedback selectFeedbackByrecordid(String record_id);

    int updateFeedback(Feedback feedback);

    int deleteFeedbackByrecordid(String record_id);
}
