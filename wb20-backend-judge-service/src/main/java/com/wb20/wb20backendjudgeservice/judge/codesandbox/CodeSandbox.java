package com.wb20.wb20backendjudgeservice.judge.codesandbox;


import com.wb20.ROJbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.wb20.ROJbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
