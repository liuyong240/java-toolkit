package zip4j;

import com.thankjava.toolkit3d.enums.zip4j.ZipLevel;
import com.thankjava.toolkit3d.enums.zip4j.ZipType;
import com.thankjava.toolkit3d.zip4j.Zip4jHelper;

public class Zip4jHelperTest {

	public static void main(String[] args) {
		
		boolean flag = false;
//		boolean flag = Zip4jHelper.unzip("F:\\Temp\\windows.weiyun.3.3.1539.zip", "F:\\Temp\\froad-cbank-server-order-0.0.1-SNAPSHOT","123");
//		System.out.println(flag);
		
		
		Zip4jHelper.zip("F:\\Temp\\myeclipse.10.7.1_crack", "F:\\Temp\\", ZipType.COMP_DEFLATE, ZipLevel.DEFLATE_LEVEL_NORMAL,"123");
	}
}
