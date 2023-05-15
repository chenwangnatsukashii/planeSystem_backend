package com.example.engine_system.aspect;


import org.apache.ibatis.builder.StaticSqlSource;
import org.apache.ibatis.mapping.*;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@Aspect
@Component
public class DynamicDataSourceAspect {

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    //mapper切点
    @Pointcut("execution( * com.example.engine_system.mapper.*.*(..))")
    public void daoAspect() {
    }

    @Before("daoAspect()")
    public void showSql(JoinPoint joinPoint) throws NoSuchFieldException, IllegalAccessException {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //类路径
        String namespace = method.getDeclaringClass().getName();
        //方法名
        String methodName = method.getName();
        Configuration configuration = sqlSessionFactory.getConfiguration();
        MappedStatement mappedStatement = configuration.getMappedStatement(
                namespace + "." + methodName);
        //操作类型
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        System.out.println("type==>" + sqlCommandType);
        //sql

        BoundSql boundSql = mappedStatement.getBoundSql(null);
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        Field field = boundSql.getClass().getDeclaredField("sql");
        field.setAccessible(true);
        String sql = "select * from plane where id = 1";
        field.set(boundSql, sql);

        sqlSessionFactory.getConfiguration().getMappedStatements().remove(mappedStatement);

        SqlSource sqlSource = new StaticSqlSource(configuration, sql, parameterMappings);
        Field mappedStatementField = mappedStatement.getClass().getDeclaredField("sqlSource");
        mappedStatementField.setAccessible(true);
        mappedStatementField.set(mappedStatement, sqlSource);
        sqlSessionFactory.getConfiguration().addMappedStatement(mappedStatement);


//        String sql = mappedStatement.getBoundSql(null).getSql();
//        System.out.println("sql==>" + sql);

    }
}
