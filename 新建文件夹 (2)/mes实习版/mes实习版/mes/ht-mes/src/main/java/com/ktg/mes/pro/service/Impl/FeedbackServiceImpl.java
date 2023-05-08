package com.ktg.mes.pro.service.Impl;

import com.ktg.mes.pro.domain.Feedback;
import com.ktg.mes.pro.mapper.FeedbackMapper;
import com.ktg.mes.pro.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;

public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public int insertFeedback(Feedback feedback) {
        return feedbackMapper.insertFeedback(feedback);
    }

    @Override
    public Feedback selectFeedbackByrecordid(String record_id) {
        return feedbackMapper.selectFeedbackByrecordid(record_id);
    }

    @Override
    public int updateFeedback(Feedback feedback) {
        return feedbackMapper.updateFeedback(feedback);
    }

    @Override
    public int deleteFeedbackByrecordid(String record_id) {
        return feedbackMapper.deleteFeedbackByrecordid(record_id);
    }
}
