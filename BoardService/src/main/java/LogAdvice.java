import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {

	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	
	@Before("allPointcut()") //@AfterReturning / @AfterThrowing / @After..사용
	public void printLog() {
		System.out.println("[Common log, before starting logic");
	}
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
	
	
	/*
	 특정 포인트컷 지정 가능.
	 */
}
