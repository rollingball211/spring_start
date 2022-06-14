package polymorphism;
/*
  2. ���յ� ���߱� => design pattern 
  Factory Pattern
  1. Ŭ���̾�Ʈ���� ����� ��ü ������ ĸ��, User�� TV ���̸� ������ ���ջ��·� ����.
  2. BeanFactory Ŭ������ getBean()�� �Ű������� ���� beanName�� �ش��ϴ� ��ü�� ����� ����
 */
public class BeanFactory {

	public Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new Pol_SamsungTV();
		} else if (beanName.equals("lg")) {
			return new Pol_LgTV();
		}
		return null;
	}
	
}
