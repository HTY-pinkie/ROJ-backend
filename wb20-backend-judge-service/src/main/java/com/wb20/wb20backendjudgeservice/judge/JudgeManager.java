package com.wb20.wb20backendjudgeservice.judge;

import com.wb20.ROJbackendmodel.model.codesandbox.JudgeInfo;
import com.wb20.ROJbackendmodel.model.entity.QuestionSubmit;
import com.wb20.wb20backendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.wb20.wb20backendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.wb20.wb20backendjudgeservice.judge.strategy.JudgeContext;
import com.wb20.wb20backendjudgeservice.judge.strategy.JudgeStrategy;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
