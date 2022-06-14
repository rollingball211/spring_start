package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class TVUser {
	
	
	public static void main(String[] args) {
		
		//1. Spring �����̳� ����
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(LookUp) ��
		TV tv = (TV)factory.getBean("tv");
		tv.PowerOn();
		tv.volumeDown();
		tv.volumeUp();
		tv.PowerOff();
		
		//3. Spring �����̳� ����.
		factory.close();
	
		/*
		 * Spring IoC �����̳ʰ� �����ϴ� �ڹ� ��ü�� ��(Bean)�̶� ��.
		 1. TVUser Ŭ���̾�Ʈ�� ������ ���� ������ �ε�, �����̳� ����
		 2. ������ ���� ���Ͽ� <bean> ��ϵ� SamsungTV ��ü ����
		 3. getBean() �޼ҵ�� �̸��� 'tv'�� ��ü�� ��û(LookUp)
		 4. SamsungTv ��ü ��ȯ
		 
		 */
		
		/*
		 Spring Container ����
		 1. BeanFactory , ApplicationContext �� ���� ���� �����̳� ����
		 
		 BeanFactory
		 1.Spring ���� ���Ͽ� ��ϵ� <bean> ��ü ����,�����ϴ� ���� �⺻���� ��� ����
		 2.Ŭ���̾�Ʈ�� ��û�� ���ؼ��� <bean> ��ü�� �����Ǵ� ���� �ε� ��� ���.
		 
		 ApplicationContext 
		 BeanFactory�� ��� 
		 Ʈ������ ���� , �����̳ʰ� �����Ǵ� ������ bean ��ϵ� Ŭ�������� ��ü �����ϴ� 
		 ��� �ε� ��� ���.
		 
		 GenericXmlApplicationContext - ���Ͻý���/Ŭ������ο� �ִ� xml ���� ���� �ε��Ͽ� ����
		 
		 XmlWebApplicaitonContext  - �� ����� ������ ���ø����̼� ������ �� ���.
		 */
	}

}
