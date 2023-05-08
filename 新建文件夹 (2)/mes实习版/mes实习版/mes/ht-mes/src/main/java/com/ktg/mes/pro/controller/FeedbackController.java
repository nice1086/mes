package com.ktg.mes.pro.controller;

import com.ktg.common.annotation.Log;
import com.ktg.common.enums.BusinessType;
import com.ktg.mes.pro.domain.Feedback;
import com.ktg.mes.pro.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mes/dv/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:feedback:add')")
    @Log(title = "生产工单编号", businessType = BusinessType.INSERT)
    @PostMapping
    public int add(@Validated @RequestBody Feedback feedback)
    {
        return feedbackService.insertFeedback(feedback);
    }

    /**
     * 查看
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:feedback:list')")
    @GetMapping("/list")
    public Feedback select(@Validated @RequestParam String record_id)
    {
        return feedbackService.selectFeedbackByrecordid(record_id);
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:feedback:edit')")
    @Log(title = "生产工单编号", businessType = BusinessType.UPDATE)
    @PutMapping
    public int edit(@Validated @RequestBody Feedback feedback)
    {
        return feedbackService.updateFeedback(feedback);
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('mes:pro:feedback:remove')")
    @Log(title = "生产工单编号", businessType = BusinessType.DELETE)
    @DeleteMapping("/{record_id}")
    public int remove(@PathVariable String record_id)
    {
        return feedbackService.deleteFeedbackByrecordid(record_id);
    }
}
