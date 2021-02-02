package com.wk.rbac.util;


import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.parameternameprovider.ParanamerParameterNameProvider;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: wk
 * @Date: 2021/2/2 14:53
 * @Description
 */
public class ValidateUtil {
    private static Validator validator = Validation.byProvider(HibernateValidator.class).configure()
            .failFast(false).buildValidatorFactory().getValidator();
    private static ExecutableValidator executableValidator = Validation.byProvider(HibernateValidator.class)
            .configure()
            .failFast(false)
            .parameterNameProvider(new ParanamerParameterNameProvider())
            .buildValidatorFactory().getValidator().forExecutables();

    /**
     *  获取 校验器
     * @return
     */
    public static Validator getValidator() {
        return validator;
    }

    public static ExecutableValidator getExecutableValidator() {
        return executableValidator;
    }

    /**
     *  校验bean
     * @param t  要校验的bean
     * @param clazz 分组
     * @param <T>
     * @return 返回出错信息
     */
    public static <T> Map<String,String> validateBean(T t, Class<?>... clazz){
        Set<ConstraintViolation<T>> violations = validator.validate(t, clazz);
        Map<String,String> results = null;
        boolean hasError = violations !=null && violations.size() >0;
        if (hasError){
            results = analysisViolations(violations);
        }
        return results;
    }

    /**
     *  把出错信息 转换为成一个map
     * @param violations 出错信息
     * @param <T>
     * @return
     */
    private static <T> Map<String,String> analysisViolations(Set<ConstraintViolation<T>> violations) {
        HashMap<String, String> result = new HashMap<>();
        violations.forEach(violation -> {
            String propPath = violation.getPropertyPath().toString();
            Object invalidValue = violation.getInvalidValue();
            String msg = violation.getMessage();
            msg = "invalidValue is :"+invalidValue +", "+propPath +" " + msg;
            result.put(propPath,msg);
        });
        return result;
    }

    /**
     *  校验属性(property)
     * @param obj  bean
     * @param propertyName  属性名字
     * @param <T>
     * @param clazz  分组
     * @return
     */
    public static <T> Map<String,String> validateProp(T obj,String propertyName,Class<?>... clazz){
        Set<ConstraintViolation<T>> violations = validator.validateProperty(obj, propertyName, clazz);
        Map<String,String> results = null;
        boolean hasError = violations !=null && violations.size() >0;
        if (hasError){
            results = analysisViolations(violations);
        }
        return results;
    }












}
