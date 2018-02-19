package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random gen =new Random();
int n1=gen.nextInt(90)+10;
int n2=gen.nextInt(90)+10;
int n3=gen.nextInt(90)+10;
int n4=gen.nextInt(90)+10;
int n5=gen.nextInt(90)+10;

	JOptionPane.showMessageDialog(null, "Your numbers are "+n1+", "+n2+", "+n3+", "+3+", "+n4+", "+n5);
	
	
	}

}

