package projectÂğÂğÂğÂğÂğ.copy.copy;

public class UserImfo implements Comparable <UserImfo>{
private  int num ;
private String id;
private int Lv;
private int power;
private int speed;
private int defense;
private int money;
private String rank;




public UserImfo() {}


public UserImfo(String id) {
	this.id = id ;
}

public UserImfo(int num) {
	this.num = num;
}
public UserImfo(int power , int speed , int defense) {
	this.power = power;
	this.speed = speed;
	this.defense = defense;
}

public UserImfo(int num,String id ,int Lv, int power , int speed, int defense ,String rank) {
	this.num = num;
	this.id = id;
	this.Lv = Lv;
	this.power = power;
	this.speed = speed;
	this.defense= defense;
	this.rank = rank;
}

public int getLv() {
	return Lv;
}

public void setLv(int lv) {
	Lv = lv;
}

public  int getNum() {
	return num;
}

public  void setNum(int num) {
	this.num = num;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public int getPower() {
	return power;
}

public void setPower(int power) {
	this.power = power;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getDefense() {
	return defense;
}

public void setDefense(int defense) {
	this.defense = defense;
}

public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}
	




public int getMoney() {
	return money;
}


public void setMoney(int money) {
	this.money = money;
}




public static void set1(UserImfo[] user) {
	for (int i = 0; i < user.length; i++) {
		user[i] = new UserImfo(i + 1);
	}
}


@Override
public String toString() {
	return String.format("[%d¹øÀ¯Àú %sRank] [id : %s]  [Lv : %d] [power : %d speed : %d defense : %d] [º¸À¯¸Ó´Ï : %d ¿ø]",num,rank,id,Lv,power,speed,defense
			,money);
}

@Override
public boolean equals(Object o) {
	return this.id.equals(((UserImfo)o).id)&&
	this.rank.equals(((UserImfo)o).rank);
}


@Override
public int compareTo(UserImfo o) {
	// TODO Auto-generated method stub
	if(this.Lv + this.power + this.speed + this.defense < o.Lv + o.power + o.speed + o.defense ) return 1;
	else if(this.Lv + this.power + this.speed + this.defense == o.Lv + o.power + o.speed + o.defense ) {
		if(this.num < o.num)return -1;
		else return 1;
	}
	else return -1;
	
	
	
}

	
}
