/*
 * ����10λѧ���ĳɼ��������ж����ǵĳɼ����ĸ��Ǽǡ�����90-100����A����80-90����B����
 * 70-79����C����60-69����D����60��������F����
 */
import java.util.Scanner;
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores =new double[10];
		Scanner s = new Scanner(System.in);
		for(int i = 0;i< 10;i++){
			System.out.println("�������"+i+"λѧ���ĳɼ���");
			scores[i]= s.nextDouble();
	 	}
		for(int j = 0;j<10;j++){
			double temp = scores[j];
			if(temp >= 90 && temp <=100){
				System.out.println("��"+ j + "λѧ���ĳɼ��ȼ���A");
			}else if(temp >= 80 && temp <=90){
				System.out.println("��"+ j + "λѧ���ĳɼ��ȼ���B");
			}else if(temp >= 70 && temp <=80){
				System.out.println("��"+ j + "λѧ���ĳɼ��ȼ���C");
			}else if(temp >= 60 && temp <=70){
				System.out.println("��"+ j + "λѧ���ĳɼ��ȼ���D");
			}else{
				System.out.println("��"+ j + "λѧ���ĳɼ��ȼ���E");
			}
		}

	}
}
