package day2;

public class EightTest{
	public static boolean hasEight(int number) {
		boolean result = true;
		//Convert a int number to string
		String numberStr = String.valueOf(number);
		//Duyệt qua từng ký tự trong string
		for (int i = 0;i < numberStr.length(); i++) {
			//So sánh từng ký tự trong string nếu chứa ký tự 8 thì gán result = true và thoát khỏi vòng lặp
			if(numberStr.charAt(i)=='8') {
				result = true;
				//break; có thể thoát vòng lặp hoặc return
				//return result;
			}else 
			{
				result = false;
			}
		}
		
		return result;
	}
}
