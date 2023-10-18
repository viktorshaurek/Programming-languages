package project;

public class myClass {
	static class myNumber{
		private int num;
		public int num2;
		public myNumber() {
			num = 0;
			num2 = 100;
		}
		int getNum() {
			return num;
		}
		 void setNum (int i) {
			 num = i;
			 num2 = 10*i;
		 }
	}
	public static void main(String[] args) {
		
		myNumber A = new myNumber();
		System.out.println(A.getNum());
		A.setNum(10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
	}

}
public int getNum2() {
    return getNum2();
}


public void description() {
    String num1;
	System.out.println("num1: " + num1);
    String num2;
	System.out.println("num2: " + num2);
}


public float calculateAverage() {
    int num1;
	return (float) (num1 + getNum2()) / 2;
}

public static void main(String[] args) {
   
    MyNumber mb = new MyNumber(13, 10);

   
    int num2Value = mb.getNum2();
    System.out.println("Value of num2: " + num2Value);

    mb.description();

    float average = mb.calculateAverage();
    System.out.println("Average: " + average);
}
}
