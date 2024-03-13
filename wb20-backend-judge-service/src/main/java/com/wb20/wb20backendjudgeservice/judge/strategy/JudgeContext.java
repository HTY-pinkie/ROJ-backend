package com.wb20.wb20backendjudgeservice.judge.strategy;

import com.wb20.ROJbackendmodel.model.codesandbox.JudgeInfo;
import com.wb20.ROJbackendmodel.model.dto.question.JudgeCase;
import com.wb20.ROJbackendmodel.model.entity.Question;
import com.wb20.ROJbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;



}
