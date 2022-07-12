package aop;

public class AOP2 {

	/*
	 1. ����Ʈ�� ����
	 	<aop:pointcut id =" getPointcut"
	 	  expression = "execution ( *com.springbok.biz..*Impl.get*(..))"/>
	 	  �� �� * = return type
	 	  com~biz = package path
	 	  *Impl = class name
	 	  get*(..); = method name/ parameters
	 	  
	 	  <aop:aspect ref = "log">
	 	  	<aop:before pointcut-ref ="pointcutId" method = " "/>
	 	  	...
	 	  	
	 	  	pointcut-ref id�� getPointcut�� �ٲٸ� get���� �����ϴ� getBoardList()�� ����
	 	  	
	 	  	
	 2. advice ����
	 => Ⱦ�� ���ɿ� �ش��ϴ� ���� ������ڵ�, ������ Ŭ������ �޼ҵ�� �ۼ�.
	
		spring������ advice�� ���� ������ ���� ����. 
		before
		after
		after-returning
		after-throwing
		around

		
		before <aop:before>
		�޼ҵ� ���� �� ó���� ���� ����ϱ� ���� ���.
		
		after <aop:after>
		try-catch-finally ó��
		���� �߻� ���ο� ������� ������ ����Ǵ� �����̽� ��� �� ���.
		
		after returning <aop:after-returning>
		����Ʈ������ ������ �޼ҵ� ���� �� , ���� ����� ������ �����͸� �����ϴ� ������ ����
		���� ����ó�� ���� �߰��� ���. 
		
		after-throwing <aop:after-throwing>
		���ܰ� �߻��ϴ� ������ ������.
		
		around
		Ư�� �����̽��� �޼ҵ� �������� �Ŀ� ��� ����
		
		<aop:aspect ref = "log">
	 	  	<aop:after pointcut-ref ="getPointcut" method = "printLog"/>
	 	  	...
	 	  
	 	 ���: getBoardList() �޼ҵ� ������ printLog() �޼ҵ� ���� �Ϸ�.
	 	 
	 
	 3. Aspect/Advisor 
	    Aspect = pointCut + advisor
	    � ����Ʈ�� �޼ҵ忡 ���� � �����̽� �޼ҵ� �������� ������.
	    Ʈ������ �������� <aop:advisor> ���
	 	 
	 
	 (1) ��������Ʈ�� ȣ��
	 (2) Ư�� ����Ʈ������ ������ �޼ҵ� ȣ��
	 (3) �� ���� �����̽� ��ü�� �����̽� ȣ�� ���� ���� 5�� ���� ����
	 (4) ����Ʈ������ ������ �޼ҵ� ȣ��� ��, �����̽� �޼ҵ� �����ϰ� �ϴ� ���� = ������Ʈ
	 (5) ������Ʈ ������ ���� ���� ó��
		
	 */
}
