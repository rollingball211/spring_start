package aop;

public class AOP4 {

	/*
	 	JoinPoint �������̽� ���� => �޼ҵ尡 ���� Ŭ������ ��Ű�� ������ �˱� ���� ����
	 	
	 	JoinPoint method
	 	
	 	Signature getSignature()
	 	
	 	=> Ŭ���̾�Ʈ�� ȣ���� �޼ҵ��� �ñ״�ó(����Ÿ��,�̸�,,�Ű�����) ������ �����
	 	Signature ��ü ����
	 	
	 	Object getTarget() Ŭ���̾�Ʈ�� ȣ���� ����Ͻ� �޼ҵ带 �����ϴ� ����Ͻ� ��ü ����
	 	
	 	Object getArgs() Ŭ���̾�Ʈ�� �޼ҵ� ȣ���� �� �Ѱ��� ���� ��� Object �迭�� ����
	 	
	 	Around advice�� proceed() �޼ҵ� �ʿ���.
	 	
	 	getSignature() �� �����ϴ� �޼ҵ�
	 	
	 	1. getName() Ŭ���̾�Ʈ�� ȣ���� �޼ҵ� �̸� ����
	 	2. toLongString() Ŭ���̾�Ʈ�� ȣ���� �޼ҵ��� ����Ÿ��,�̸�,�Ű�������
	 	��Ű�� ��α��� �����Ͽ� ����
	 	3. toShortString() Ŭ���̾�Ʈ�� ȣ���� �޼ҵ� �ñ״�ó�� ����� ���ڿ��� ����.
	 
	 	JoinPoint jp => before
	 	Joinpoint jp , Object returnObj => after returning
	 	Joinpoint jp , Exception exceptObj => after throwing
	 	ProceedingJoinpoint pjp => Around
	 */
}
