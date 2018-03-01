package util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//目标
@Target(value=ElementType.FIELD)   //意思该注解只能在属性中存在
//@Target(value=ElementType)        //意思是该注解只能在类中
//@Target(value=ElementType.METHOD)   //意思该注解值能修饰方法
@Retention(RetentionPolicy.RUNTIME)    //在运行中注解有效

public @interface Column {
	String value();
}
