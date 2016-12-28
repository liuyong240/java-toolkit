package aop;

import com.thankjava.toolkit.aop.anno.After;
import com.thankjava.toolkit.aop.anno.Before;

public class BusinessImpl implements IBusiness{
	
	@Before(cutMethod = "before",cutClass = CutPoint.class)
	@After(cutMethod = "after",cutClass = CutPoint.class)
	public String exe(String str){
		return str;
	}

	@Override
	public String exe(int num) {
		System.out.println(num);
		return "num";
	}
}
