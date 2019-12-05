class Elevator{

	int floor;
	boolean isOpen;
	
	void open(){
		System.out.println("���� �����ϴ�.");
		isOpen = true;
	}
	
	void close(){
		System.out.println("���� �����ϴ�.");
		isOpen = false;
	}
	
	void move(int n){
		close();//���� �ݰ�

		if(n>=-2&&n<=10){//n�� ��ȿ�� ���� ��� n������ �̵�	
			
			if(n ==0)	System.out.println("�κ������� �̵��մϴ�.");
			else if(n >0) System.out.println(n+"������ �̵��մϴ�.");
			else  System.out.println("����"+(-1*n)+"������ �̵��մϴ�.");
			floor = n;
		}
		else{//n�� ��ȿ���� ���� ���� ��� ���� �޽��� ��� �� �޼ҵ� ����
			System.out.println(n+"���� �����ϴ�. ���� �ٽ� �Է����ּ���. ");
			return;
		}
		
		report();//���� �� ���� �� ǥ��
		
		open();//�� ����
	}
	
	void report(){
		if(floor ==0)	System.out.println("�κ����Դϴ�.");
		else if(floor>0) System.out.println(floor+"���Դϴ�.");
		else  System.out.println("����"+(-1*floor)+"���Դϴ�.");
	}
}

class ElevatorTest{
	public static void main(String [] args){
		Elevator e1 = new Elevator();
		Elevator e2 = new Elevator();
		
		e1.move(3);
		
		
	}
}