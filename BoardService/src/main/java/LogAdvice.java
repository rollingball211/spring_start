import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {

	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	
	@Before("allPointcut()") //@AfterReturning / @AfterThrowing / @After..���
	public void printLog() {
		System.out.println("[Common log, before starting logic");
	}
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
	
	
	/*
	 Ư�� ����Ʈ�� ���� ����.
	 */
}
