package hw5;
//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合
public class Hw1120part4 {
//	   public static String genAuthCode() {
	public static void main(String[] args) {
	        char[] c1 = new char[26 + 26 + 10];
	        int box = 0;
	        for (char i = 'A'; i <= 'Z'; i++) {
	            c1[box++] = i;
	        }
	        for (char i = 'a'; i <= 'z'; i++) {
	            c1[box++] = i;
	        }
	        for (char i = '0'; i <= '9'; i++) {
	            c1[box++] = i;
	        }
	        System.out.println(c1);
	}
}
