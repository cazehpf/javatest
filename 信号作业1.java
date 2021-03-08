import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"Faint signals,barely perceptible","Very weak signals","Weak signals","Fair signals","Fairly good signals","Good signals","Moderately strong signals","Strong signals","Extremely strong signals"};
		String[] r={"Unreadable","Barely readable,occasional words distinguishable","Readable with considerable diffculy","Readable with practically no diffculty","Perfectly readable"};
		String rs="";
		int i;
		Scanner in =new Scanner(System.in);
		i=in.nextInt();
		rs=s[i%10-1]+","+r[i/10-1]+".";
		System.out.println(rs);
		
	}

	}

