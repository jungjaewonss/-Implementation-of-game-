package project����������.copy.copy;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 100;
		int ranks = 4;
		AlpaInfo[] alp = new AlpaInfo[ranks];
		UserImfo[] user = new UserImfo[max];

  
           
		// ���������������������������������������������� 
	        UserImfo.set1(user);
	    //  ������ NUM ���� for�����鼭 �ʱ�ȭ    
	    // ���������������������������������������������� 
		
	     // ���������������������������������������������� 
	     // �������ڵ�� NUM �ʱ�ȭ
	        AlpaInfo.set(alp); 
	    //  ���������������������������������������������� 
	     
		
		
		     int count = 0;
		

		int choice = 0;
		while (true) {
			// �޴���� //�����ڼ��� �������� ��ü���� ������
			
			// ����������������������������������������������
		    // �� �޴���� �����ڼ��� �������� ��ü���� ������
			     Menu.menuPirnt();
			// ��
			// ����������������������������������������������
			
			
			try {
				choice = sc.nextInt();

			}

			catch (InputMismatchException e) {
				sc.next();
				System.out.println("1 ~ 4 �����ǰ����Է����ּ���");
			}

			if (choice > 4) {
				System.out.println("1 ~ 4 �ǰ����Է����ּ���");
			}

			if (choice == 1) {
				while (true) {
					System.out.println("1.��޺����ؼ��� 2.��޺��������� 3.��޺��������� 4.�ڷΰ���");
					int choice1 = 0;
					try {
						choice1 = sc.nextInt();

					} catch (InputMismatchException e) {
						sc.next();
						System.out.println("1 ~ 4 �����ǰ����Է����ּ���");

					}
					if (choice1 == 1) {
						while (true) {
							System.out.println("1. Eicp 2. Unique 3. Rere 4.Noraml 5.�ڷΰ���");
							int choice2 = 0;
							try {
								choice2 = sc.nextInt();
							} catch (InputMismatchException e) {
								sc.next();

								System.out.println("1 ~ 5 ������ �����Է����ּ���");

							}
							// ����������������������������������������������
						    // choice2 �� ���� alp�� �迭�� ������ ��� �ʱ�ȭ.
							   AlpaInfo.rankrank(choice2, alp);
							// ��
							// ����������������������������������������������
							
							
							
							if (choice2 == 5)

								break;

							while (true) {
								// ����������������������������������������������
							    // ��"1 �ɷ�ġ���ؼ��� 2 �ڷΰ���"
								    Menu.menuPrint1();								
								// ��
								// ����������������������������������������������
								
								int choice3 = 0;
								try {
									choice3 = sc.nextInt();
								} catch (InputMismatchException e) {
									sc.next();
									System.out.println("1 ~ 3 ������ ���� �Է����ּ���");
								}

								if (choice3 == 1) {
									try {
										System.out.println("1 ~ 50 �� MAX MIN  ���� �������ּ���");
										System.out.println("maxAvg :");
										alp[choice2 - 1].setMaxAvg(sc.nextInt());
										if (AlpaInfo.MaxRange(alp, choice2)) {
											System.out.println("�ùٸ�MAX�������������ּ���");
											continue;
											
											// ����������������������������������������������
										    // ��AlpaInfo.MaxRange(alp, choice2)
											// MAXAVG �� 1 ~ 50 �̿��ǰ����� �����Ϸ����ҽ� �������
											// ��
											// ����������������������������������������������
											
											
											
										}

									} catch (InputMismatchException e) {
										sc.next();
										System.out.println("���ڰ����Է��ϼ���");

									} catch (ArrayIndexOutOfBoundsException e) {

									}

									try {
										System.out.println("minAvg :");
										alp[choice2 - 1].setMinAvg(sc.nextInt());
										if (!(alp[choice2 - 1].getMinAvg() >= 1
												&& alp[choice2 - 1].getMinAvg() <= 50)) {
											System.out.println("[����]�߸��Է��߽��ϴ� 1~50 �ǹ������� �Է����ּ���");
											continue;

										}
                                
										if (AlpaInfo.MinRange(alp, choice2)) {
											System.out.println("�ùٸ������� �������ּ���");
											continue;
//											 ����������������������������������������������
//										     �� AlpaInfo.MinRange(alp, choice2)
//											   MINAVG �� MAXAVG ���� ���� �����Ϸ����ҽ� �����޼���
//											 ��
//											 ����������������������������������������������
											
										}

									} catch (InputMismatchException e) {
										sc.next();
										System.out.println("���ڰ����Է��ϼ���");
									}

									catch (ArrayIndexOutOfBoundsException e) {

									}

								} else if (choice3 == 2) {
									break;
								}

							} // 1��°���Ϲ���
						} // 2��°���Ϲ���
					} // choie1 == 1�϶� if���� �����ڼ����ϱ�޴�
////////////////////////////////////////////////////////// ��������ϱ� //////////////////////////////////////////////////////////////
					else if (choice1 == 2) {

						System.out.println("1.Epic 2.Unique 3.Rare 4.Noraml 5.�ڷΰ���");
						int choice4 = 0;

						try {
							choice4 = sc.nextInt();
							if (choice4 >= 1 && choice4 <= 4) {
								System.out.println(alp[choice4 - 1]);
							} else if (choice4 == 5)
								break;
							else
								System.out.println("1 ~ 5 �����ǰ��� �Է����ּ���");
						} catch (InputMismatchException e) {
							sc.next();
							System.out.println("1 ~ 5 �����ǰ��� �Է����ּ���");

						}
                       
					
					} else if (choice1 == 3) { 
                       while (true) {
						System.out.println("1.Epic 2.Unique 3.Rare 4.Noraml 5.�ڷΰ���");
						int choice5 = 0;
						try {
							choice5 = sc.nextInt();
							if(choice5 == 5) break;
						} catch (InputMismatchException e) {
							sc.next();
							System.out.println("1 ~ 5 �����ǰ����Է����ּ���");
							continue;
						}
                       
						
						
						try {
							System.out.println("maxAvg :");

							alp[choice5 - 1].setMaxAvg(sc.nextInt());
							System.out.println("minAvg :");
							alp[choice5 - 1].setMinAvg(sc.nextInt());
//							 ����������������������������������������������
//						     MINAVG �� MAXAVG ���� ���� �����Ϸ����ҽ� �����޼���
							 AlpaInfo.MinRange(alp, choice5);				 
//							 ����������������������������������������������
							

						} catch (InputMismatchException e) {
							System.out.println("���ڸ��Է����ּ���");
						} catch (ArrayIndexOutOfBoundsException e) {

						}
                       }

					} else if (choice1 == 4)
						break;
					
				}
				
				

			} 
			else if (choice == 2) {

				if (alp[0].isAllInitialized()) {
					System.out.println("�����ڵ�޼����̾ȵǾ��ֽ��ϴ�.");
//					����������������������������������������������
//                  Alp�迭 MIN MAX ���� 0�Ͻ� �������
//                  isAllInitialized()						
//					����������������������������������������������
					
					
					continue;
				}

				while (true) {

					System.out.println("1. �������Է� 2.���������� 3.���������� 4.�ڷΰ���");
					int choice6 = 0;
					try {
						choice6 = sc.nextInt();
					}

					catch (InputMismatchException e) {
						sc.next();
						System.out.println("1 ~ 4 �����ǰ����Է����ּ���");
						continue;
					}

					if (choice6 == 1) {

						try {
							System.out.println("�г��� :       ");
							user[count].setId(sc.next());
							System.out.println("LV :       ");
							user[count].setLv(sc.nextInt());
							System.out.println("�ɷ�ġ�� 1 ~ 50 �� �������� �����˴ϴ� ");
							System.out.println("��ȸ�� 2ȸ�־����ϴ�.");
							
							
//							 ����������������������������������������������
//						     // �ɷ�ġ�� 1 ~ 50 �� �������� �����ִ��Լ�
							 random(user, sc, count);
//							 
//							 ����������������������������������������������
							
							
							while(true) {
							System.out.println("���ӸӴϴ� 3000$ ~ 5000$ �� �������μ����˴ϴ�.");
							System.out.println("M ��ư�� ����  ���ӸӴϸ� �����ϼ���~!!!");
							String InputMoney = sc.next();
							if(InputMoney.equalsIgnoreCase("m")){
								
//								����������������������������������������������
//							    // ���ӸӴ� 3000 ~ 5000 ���̸� �������ε����ִ��Լ�	
									MoneyRandom( InputMoney, user,  count);					
//								����������������������������������������������
							}
							else {
								System.out.println("[�Է¿���] MŰ������ �ּ���"); continue;
							}
									
							
							count++; 
							
							
							
							
							user[count - 1].setRank(userrank1(user, alp, count)); break;
							}
						} catch (InputMismatchException e) {
							sc.next();
							System.out.println("��ȿ���������������Դϴ�.");
						}
						System.out.println(user[count - 1]);

						continue;

					}
					if (choice6 == 4)
						break;

					else if (choice6 == 2) {
						if (user[0].getMoney() == 0) {
							System.out.println("��ϵ������������ϴ�.");
							continue;
						}
						System.out.println("�г��� �� �Է��ϼ���");
                          
						String choice7 = sc.next();
//						����������������������������������������������
//                      UserInfoClass CompareTo ����
						Arrays.sort(user);
//						����������������������������������������������
						
					
						
						for (int i = 0; i < ranks; i++) {

							// epic
							if (choice7.equalsIgnoreCase(user[i].getId())) {
								System.out.printf(" %s\n", user[i]);
								break;
							}

						}

					}
					if (choice6 == 3) {
						if (user[0].getMoney() == 0) {
							
							System.out.println("��ϵ������������ϴ�.");
//							����������������������������������������������
//	                        �����迭�� Money ���� 0�ϰ��
//                          ���� ���							
//							����������������������������������������������
							continue;
						}

						if (alp[0].isAllInitialized()) {
							System.out.println("[����]�����ڵ�޼�����Ȯ�����ּ���");
//							����������������������������������������������
//	                        ������ �迭�� MAX MIN ������
//                          �ȵ������� ���� ���							
//							����������������������������������������������
							break;
						}
						System.out.print("������ ID �� �Է��ϼ��� :");
						String reName = sc.next();
						
						 modifyNameOrAvg(alp, user, count, reName, sc);
                        /**
                         * �ش����� ID �˻��� ��ġ�ϴ� ���̵𰡾������ �������
                         * ������ �г��� �� �ɷ�ġ�� ���������� �����ϴ±��
                         * �г��� ����� 1500 $  ����  �ɷ�ġ ����� 2500 $ ���� 
                         * ���簡������ ��ǰ���ݺ��� ������츸 ����ְ�
                         * (���簡������ ��ǰ���ݺ��� ������� ���ӸӴ���������)
                         * �ɷ�ġ������ ���� ��ũ �����
                         */
					}
                       
				}

					

			}

			if (choice == 3) {
				if (user[0].getMoney() == 0) {
					System.out.println("��ϵ������������ϴ�.");
					continue;
				}

				while (true) {

					System.out.println("1. ��ŷ�����  2. �ڷΰ���");

					int choice7 = 0;
					try {
						choice7 = sc.nextInt();
						if (alp[0].isAllInitialized()) {
//							����������������������������������������������
//	                        ������ �迭�� MAX MIN ������
//                          �ȵ������� ���� ��� 							
//							����������������������������������������������
							System.out.println("�����ڵ�޼����̾ȵǾ��ֽ��ϴ�.");
							
							break;
						}
					} catch (InputMismatchException e) {
						sc.next();
						System.out.println("1 ~ 2 �����Է����ּ���");
						continue;

					}

					if (choice7 == 1) { // ranks == 4
						Arrays.sort(user);
						/**
						 * UserŬ������ Comparable ���̿��� ��ŷ������
						 * 1.�� �ɷ�ġ���� + LV ������ ����������� ������
						 * 2. 1�������� ������� ���� ����Ѽ��� (NUM�̺�������) �������� 
						 */
						for (int i = 0; i < count; i++) {
							System.out.printf("%d�� %s\n", i + 1, user[i]);
						}

					} else if (choice7 == 2) {
						break;
					}
				}
			} else if (choice == 4) {
				return;
			}

		}

	}

	///// �����Լ���/////////////////////////////////////////////////////////////////////////////////////

	
	
	
  
	public static void MoneyRandom(String InputMoney, UserImfo[] user, int count) {
		while(true) {
		if (InputMoney.equalsIgnoreCase("m")) {
			Menu.AvgRandomPrint();
			user[count].setMoney((int) (Math.random() * 2000) + 3000);
			
		}
		else System.out.println("[�Է¿��� M �� �����ּ���]"); break;
		   
		}
	}

	public static void modifyNameOrAvg(AlpaInfo[] alp, UserImfo[] user, int count, String reName, Scanner sc) {
		int count1 = 0;
		for (int i = 0; i < count; i++) {
             
			if (!(reName.equalsIgnoreCase(user[i].getId()))) {
				count1++;
			}
			if(count == count1) {
			   System.out.println("��ϵ������������ϴ�");continue;
			}
		}
		
		for (int i = 0; i < count; i++) {
			 if(reName.equalsIgnoreCase(user[i].getId())) {
				System.out.println("1. �г��Ӽ���(1500$) 2. �ɷ�ġ����(2500$)");
				String Input1 = sc.next();
				try {
					if (Input1.equals("1") && user[i].getMoney() >= 1500) {
						System.out.println("�г��� :    ");
						user[i].setId(sc.next());
						user[i].setMoney(user[i].getMoney() - 1500);
						System.out.println("[�����Ϸ�]" + user[i]);
					}

					else if (Input1.equals("2") && user[i].getMoney() >= 2500) {
						System.out.println("�ɷ�ġ�� 1 ~ 50 �� �������� �����˴ϴ� ");
						System.out.println("��ȸ�� 1ȸ�־����ϴ�.");
					
						System.out.println("�� R �� ���� �����ɷ�ġ�������ϼ��� ��");
						String Input = sc.next();
						if(!(Input.equalsIgnoreCase("r"))) {
							System.out.println("[����]R��ư�������ּ���"); continue; 
						}
						

						if (Input.equalsIgnoreCase("R")) {
							user[i].setPower((int) (Math.random() * 50) + 1);
							System.out.println("Power : " + user[i].getPower());
							user[i].setSpeed((int) (Math.random() * 50) + 1);
							System.out.println("Speed : " + user[i].getSpeed());
							user[i].setDefense((int) (Math.random() * 50) + 1);
							System.out.println("Defense : " + user[i].getDefense());
                              
						}

						user[i].setMoney(user[i].getMoney() - 2500);
						user[i].setRank(userrank1(user, alp, count));
						System.out.println("[�����Ϸ�]" + user[i]);

					} else {
						System.out.println("[�ܾ��̺����մϴ�]");
						System.out.println("1. ���ӸӴ� �����ϱ�  2. �ڷΰ���");
						Input1 = sc.next();
						if (Input1.equals("1")) {
							System.out.println("�����ݾ����Է����ּ���");
							int charge = sc.nextInt();
							user[i].setMoney(user[i].getMoney() + charge);
							System.out.println("�����̿Ϸ�Ǿ����ϴ�.");
							System.out.println(user[i]);
						} else if (Input1.equals("2")) {

						} else
							System.out.println("1 ~ 2 �� �������ּ��� ");
						continue;
					}

				} catch (InputMismatchException e) {
					System.out.println("�ùٸ������Է����ּ���");
				}
			
			} 
			
				
		}
	   
		
	}

	public static String userrank1(UserImfo[] user, AlpaInfo[] alp, int count) {
		String temp = "��ũ���ƴմϴ�.";
		for (int i = 0; i < count; i++) { // i ��ũ 4��
			for (int j = 0; j < alp.length; j++) {
				if (((user[i].getPower() + user[i].getSpeed() + user[i].getDefense()) / 3) >= alp[j].getMinAvg()
						&& ((user[i].getPower() + user[i].getSpeed() + user[i].getDefense()) / 3) <= alp[j]
								.getMaxAvg()) {
					temp = alp[j].getRank();

				} // ����������

			} // �ٱ���

		}
		return temp;
	}

	

	public static void random(UserImfo[] user, Scanner sc, int count) {
		for (int i = 0; i < 2; i++) {
			System.out.println("�� R �� ���� �����ɷ�ġ�������ϼ��� ��");

			String Input = sc.next();
			if (Input.equalsIgnoreCase("R")) {
				Menu.AvgRandomPrint();
				user[count].setPower((int) (Math.random() * 50) + 1);
				System.out.println("Power : " + user[count].getPower());
				user[count].setSpeed((int) (Math.random() * 50) + 1);
				System.out.println("Speed : " + user[count].getSpeed());
				user[count].setDefense((int) (Math.random() * 50) + 1);
				System.out.println("Defense : " + user[count].getDefense());
				System.out.println("1. �ٽõ�����  2. ���� ");
				Input = sc.next();
				if (Input.equals("1")) {
					
					if(i == 1 && Input.equals("1")) {
						
						System.out.println("[������ȸ����λ���ϼ̽��ϴ�.]\n");
						
					}
					
				}
					
				else if (Input.equals("2"))
					break;

			}

		}
	}



	public static String userrank(UserImfo[] user, AlpaInfo[] alp, int count) {
		String temp = "��ũ���ƴմϴ�.";
		for (int i = 0; i < count; i++) { // i ��ũ 4��
			for (int j = 0; j < alp.length; j++) {
				if (((user[i].getPower() + user[i].getSpeed() + user[i].getDefense()) / 3) >= alp[j].getMinAvg()
						&& ((user[i].getPower() + user[i].getSpeed() + user[i].getDefense()) / 3) <= alp[j].getMaxAvg()
						&& user[i].getLv() >= alp[j].getMinLv() && user[i].getLv() <= alp[j].getMaxLv()) {
					temp = alp[j].getRank();

				} // ����������

			} // �ٱ���

		}
		return temp;
	}








}// Ŭ������
