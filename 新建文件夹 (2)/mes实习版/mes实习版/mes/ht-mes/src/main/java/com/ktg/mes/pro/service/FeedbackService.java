package com.ktg.mes.pro.service;

import com.ktg.mes.pro.domain.Feedback;

public interface FeedbackService {
    int insertFeedback(Feedback feedback);

    Feedback selectFeedbackByrecordid(String record_id);

    int updateFeedback(Feedback feedback);

    int deleteFeedbackByrecordid(String record_id);
}
