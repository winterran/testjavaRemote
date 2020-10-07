/*
 * 输入10位学生的成绩，并且判断他们的成绩是哪个登记。其中90-100分是A级，80-90分是B级，
 * 70-79分是C级，60-69分是D级，60分以下是F级。
 *20201007进行一次修改，测试用
 */
import java.util.Scanner;
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores =new double[10];
		Scanner s = new Scanner(System.in);
		for(int i = 0;i< 10;i++){
			System.out.println("请输入第"+i+"位学生的成绩：");
			scores[i]= s.nextDouble();
	 	}
		for(int j = 0;j<10;j++){
			double temp = scores[j];
			if(temp >= 90 && temp <=100){
				System.out.println("第"+ j + "位学生的成绩等级是A");
			}else if(temp >= 80 && temp <=90){
				System.out.println("第"+ j + "位学生的成绩等级是B");
			}else if(temp >= 70 && temp <=80){
				System.out.println("第"+ j + "位学生的成绩等级是C");
			}else if(temp >= 60 && temp <=70){
				System.out.println("第"+ j + "位学生的成绩等级是D");
			}else{
				System.out.println("第"+ j + "位学生的成绩等级是E");
			}
		}

	}
}