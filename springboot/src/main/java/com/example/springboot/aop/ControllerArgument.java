package com.example.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.aspectj.lang.annotation.Pointcut;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-11
 * Time: 2:18 PM
 *
 * @author: wukn
 * @since v1.0.3
 */
@Aspect
@Component
public class ControllerArgument {

    /**
     * 对controller 入口参数进行基本校验
     * 只有第一个参数有 @Validate 注解
     *
     * @param joinPoint
     * @see org.springframework.validation.annotation.Validated
     * 第二个是 {@link BindingResult} 才管用
     */
    @Before("execution(public * com.example.springboot.controller.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        if (args.length > 1 && args[1] instanceof BindingResult) {
            BindingResult bindingResult = (BindingResult) args[1];
            /**
             * {@code bindResult} 不为空并且存在错误
             */
            Optional.ofNullable(bindingResult)
                    .filter(result -> !result.hasErrors())
                    .orElseThrow(() -> new IllegalArgumentException(bindingResult
                            .getFieldError().getDefaultMessage()));
        }
    }
}
