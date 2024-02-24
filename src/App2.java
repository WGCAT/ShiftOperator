public class App2 {
	public static void main(String[] args) {
  
	  // 1. 2^11+3^18 계산을 위해
	  // 각 밑(base)의 값을 지닌 변수와
	  // 각 지수(exponent)의 값을 지닌 변수 선언
	  int baseX = 2;
	  int baseY = 3;
	  int exponentX = 11;
	  int exponentY = 18;
  
	  // 2. 비트연산자로 2진수계산
	  int bitX = 1 << exponentX;
	  int bitY = 1 << exponentY;
	  System.out.println("비트연산자로 2진수 계산 : 2의 " + exponentX + "제곱 " + bitX);
	  System.out.println("비트연산자로 2진수 계산 : 2의 " + exponentY + "제곱 " + bitY);
  
	  // 3. toBinaryString로 정수 10진수를 문자열 2진수로 변환
	  String binaryX = Integer.toBinaryString(bitX); // 정수 10진수 'bitX'를 문자열 2진수 'binaryX'로
	  String binaryY = Integer.toBinaryString(bitY); // 정수 10진수 'bitY'를 문자열 2진수 'binaryY'로
	  System.out.println("toBinaryString로 " + "10진수 " + bitX + "를 2진수로 변환 : " + binaryX);
	  System.out.println("toBinaryString로 " + "10진수 " + bitY + "를 2진수로 변환 : " + binaryY);
  
	  // 4. parseInt로 문자열 값을 n진법으로 읽은 후 정수 10진법으로 변환
	  int parseX = Integer.parseInt(binaryX,baseX); // 문자열 'binaryX'를 'baseX'진법으로 읽은 후 정수 10진법으로 변환
	  int parseY = Integer.parseInt(binaryY,baseY); // 문자열 'binaryY'를 'baseY'진법으로 읽은 후 정수 10진법으로 변환
	  System.out.println("parseInt로 " + binaryX + "를 " + baseX + "진법으로 읽은 후 10진법으로 변환 : " + parseX);
	  System.out.println("parseInt로 " + binaryY + "를 " + baseY + "진법으로 읽은 후 10진법으로 변환 : " + parseY);
  
	  // 5. sum
	  int sum = parseX + parseY;
	  System.out.println(baseX + "^" + exponentX + "+" + baseY + "^" + exponentY + " = " + sum);

  
	}
  
  }