package Practice6;

public class MinMax extends MinMaxClass1 {
	
	//練習問題2
	
	@Override
	int getMaxValue(int a, int b, int c) {
		
		return Math.max(Math.max(a, b), c);
	}
	@Override
	int getMinValue(int a, int b, int c) {
		
		return Math.min(Math.min(a, b), c);
}
}