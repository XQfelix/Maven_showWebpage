package util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Ŀ��
@Target(value=ElementType.FIELD)   //��˼��ע��ֻ���������д���
//@Target(value=ElementType)        //��˼�Ǹ�ע��ֻ��������
//@Target(value=ElementType.METHOD)   //��˼��ע��ֵ�����η���
@Retention(RetentionPolicy.RUNTIME)    //��������ע����Ч

public @interface Column {
	String value();
}
