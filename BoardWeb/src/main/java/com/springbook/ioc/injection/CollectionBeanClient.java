package com.springbook.ioc.injection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		List<String> addressList = bean.getAddressList();
		for (String address : addressList) {
			System.out.println(address.toString());
		}
		
		/*
		 set�� ����ʹٸ� <set value-type ="java.lang.String>
		 map�� 
		 <map>
		 	<entry>
		 		<key>
		 		<value>
		 	</entry>
		 </map>�� ������ ����
		 key = value�� ������ �����͸� ����ϰ� ����� �¤��� java.util.Properties �÷��� ���
		 props ������Ʈ�� �����
		 	<property name =" a ">
		 		<props>
		 			<prop key = > </prop>
		 		</props>
		 	</property>
		 */
		factory.close();
	}

}
