package project찐찐찐찐찐.copy.copy;

public class AlpaInfo {

	private static int count = 0;
	private int num ; 
	private int maxAvg ;
	private int minAvg;
	private int maxLv ;
	private int minLv ;
	
	private String rank; 
	
	
	
	
	
	public AlpaInfo(){count++;}
	public AlpaInfo(int num) {
		this.num = num;
		count++;
	}
	public AlpaInfo(int num , int maxAvg , int minAvg , int maxLv, int minLv,String rank) {
		this.num = num;
		this.maxAvg = maxAvg;
		this.minAvg = minAvg;
		this.maxLv= maxLv;
		this.minLv = minLv;
		this.rank = rank;
		
		count++;
	}
	
	
	
	public boolean isAllInitialized() {
		return maxAvg == 0 || minAvg == 0 ;
		
	}
	
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getMaxAvg() {
		return maxAvg;
	}
	public void setMaxAvg(int maxAvg) {
		this.maxAvg = maxAvg;
	}
	public int getMinAvg() {
		return minAvg;
	}
	public void setMinAvg(int minAvg) {
		this.minAvg = minAvg;
	}
	public int getMaxLv() {
		return maxLv;
	}
	public void setMaxLv(int maxLv) {
		this.maxLv = maxLv;
	}
	public int getMinLv() {
		return minLv;
	}
	public void setMinLv(int minLv) {
		this.minLv = minLv;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		AlpaInfo.count = count;
	}
	
	
	
	public int getnum() {
		return num;
	}
	public void setEno(int eno) {
		this.num = eno;
	}
	
	

	public static boolean MaxRange(AlpaInfo[] alp, int choice2) {
		if (!(alp[choice2 - 1].getMaxAvg() >= 1 && alp[choice2 - 1].getMaxAvg() <= 50)) {
			System.out.println("[오류]잘못입력했습니다 1~50 의범위에서 입력해주세요"); return true;

		}
		return false;
	}
	
	
	public static boolean MinRange(AlpaInfo[] alp, int choice2) {
		if (alp[choice2 - 1].getMinAvg() >= alp[choice2 - 1].getMaxAvg()) {
			System.out.println("[오류]올바른범위를지정해주세요");

		}
		return false;
	}
	public static void set(AlpaInfo[] alp) {
		for (int i = 0; i < alp.length; i++) {
			alp[i] = new AlpaInfo(i + 1);
		}
	}
	
	public static void rankrank(int choice2, AlpaInfo[] alp) {
		if (choice2 == 1)
			alp[0].setRank("Epic");
		else if (choice2 == 2)
			alp[1].setRank("Unique");
		else if (choice2 == 3)
			alp[2].setRank("Rare");
		else if (choice2 == 4)
			alp[3].setRank("Nomal");
	}
	
	@Override
	public String toString() {
		return String.format("%d 능력치기준 : [%d ~ %d] 까지  [★%s★]",
				num,minAvg,maxAvg,rank);
	}
	
	@Override
	public boolean equals(Object o ) {
		return this.rank.equals(((AlpaInfo)o).rank);
	}
	
	
	
	
}
