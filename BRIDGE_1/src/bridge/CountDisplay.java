//日本語確認用ちぇえく
//ﾁｪｯｸ
//チェック
package bridge;

import java.util.Random;

public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	public void multiDisplay(int times) {
		open();
		for (int i=0;i<times;i++){
			print();
		}
		close();
		
	}
	public void randomDisplay(int times) {
		if ( times >= 0 ){
			int ramdamCount = (new Random()).nextInt(10);
			multiDisplay(ramdamCount);
		}
		
	}
	

}
