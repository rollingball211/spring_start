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
		 set을 쓰고싶다면 <set value-type ="java.lang.String>
		 map은 
		 <map>
		 	<entry>
		 		<key>
		 		<value>
		 	</entry>
		 </map>의 구조를 가짐
		 key = value의 형태의 데이터를 등록하고 사용할 ㅒㄷ는 java.util.Properties 컬렉션 사용
		 props 엘리먼트를 사용함
		 	<property name =" a ">
		 		<props>
		 			<prop key = > </prop>
		 		</props>
		 	</property>
		 */
		factory.close();
	}

}
