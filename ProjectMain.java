package project찐찐찐찐찐.copy.copy;

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

  
           
		// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ 
	        UserImfo.set1(user);
	    //  유저의 NUM 으로 for문돌면서 초기화    
	    // ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ 
		
	     // ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ 
	     // ♥관리자등급 NUM 초기화
	        AlpaInfo.set(alp); 
	    //  ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ 
	     
		
		
		     int count = 0;
		

		int choice = 0;
		while (true) {
			// 메뉴출력 //관리자설정 유저설정 전체보기 나가기
			
			// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
		    // ♥ 메뉴출력 관리자설정 유저설정 전체보기 나가기
			     Menu.menuPirnt();
			// ♥
			// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
			
			
			try {
				choice = sc.nextInt();

			}

			catch (InputMismatchException e) {
				sc.next();
				System.out.println("1 ~ 4 사이의값을입력해주세요");
			}

			if (choice > 4) {
				System.out.println("1 ~ 4 의값을입력해주세요");
			}

			if (choice == 1) {
				while (true) {
					System.out.println("1.등급별기준설정 2.등급별정보보기 3.등급별정보수정 4.뒤로가기");
					int choice1 = 0;
					try {
						choice1 = sc.nextInt();

					} catch (InputMismatchException e) {
						sc.next();
						System.out.println("1 ~ 4 범위의값을입력해주세요");

					}
					if (choice1 == 1) {
						while (true) {
							System.out.println("1. Eicp 2. Unique 3. Rere 4.Noraml 5.뒤로가기");
							int choice2 = 0;
							try {
								choice2 = sc.nextInt();
							} catch (InputMismatchException e) {
								sc.next();

								System.out.println("1 ~ 5 사이의 값을입력해주세요");

							}
							// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
						    // choice2 에 따라 alp의 배열에 각각의 등급 초기화.
							   AlpaInfo.rankrank(choice2, alp);
							// ♥
							// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
							
							
							
							if (choice2 == 5)

								break;

							while (true) {
								// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
							    // ♥"1 능력치기준설정 2 뒤로가기"
								    Menu.menuPrint1();								
								// ♥
								// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
								
								int choice3 = 0;
								try {
									choice3 = sc.nextInt();
								} catch (InputMismatchException e) {
									sc.next();
									System.out.println("1 ~ 3 사이의 값을 입력해주세요");
								}

								if (choice3 == 1) {
									try {
										System.out.println("1 ~ 50 중 MAX MIN  범위 설정해주세요");
										System.out.println("maxAvg :");
										alp[choice2 - 1].setMaxAvg(sc.nextInt());
										if (AlpaInfo.MaxRange(alp, choice2)) {
											System.out.println("올바른MAX범위를설정해주세요");
											continue;
											
											// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
										    // ♥AlpaInfo.MaxRange(alp, choice2)
											// MAXAVG 를 1 ~ 50 이외의값으로 설정하려고할시 오류출력
											// ♥
											// ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
											
											
											
										}

									} catch (InputMismatchException e) {
										sc.next();
										System.out.println("숫자값을입력하세요");

									} catch (ArrayIndexOutOfBoundsException e) {

									}

									try {
										System.out.println("minAvg :");
										alp[choice2 - 1].setMinAvg(sc.nextInt());
										if (!(alp[choice2 - 1].getMinAvg() >= 1
												&& alp[choice2 - 1].getMinAvg() <= 50)) {
											System.out.println("[오류]잘못입력했습니다 1~50 의범위에서 입력해주세요");
											continue;

										}
                                
										if (AlpaInfo.MinRange(alp, choice2)) {
											System.out.println("올바른범위를 지정해주세요");
											continue;
//											 ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//										     ♥ AlpaInfo.MinRange(alp, choice2)
//											   MINAVG 를 MAXAVG 보다 높게 설정하려고할시 오류메세지
//											 ♥
//											 ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
											
										}

									} catch (InputMismatchException e) {
										sc.next();
										System.out.println("숫자값을입력하세요");
									}

									catch (ArrayIndexOutOfBoundsException e) {

									}

								} else if (choice3 == 2) {
									break;
								}

							} // 1번째와일문끝
						} // 2번째와일문끝
					} // choie1 == 1일때 if문끝 관리자설정하기메뉴
////////////////////////////////////////////////////////// 유저출력하기 //////////////////////////////////////////////////////////////
					else if (choice1 == 2) {

						System.out.println("1.Epic 2.Unique 3.Rare 4.Noraml 5.뒤로가기");
						int choice4 = 0;

						try {
							choice4 = sc.nextInt();
							if (choice4 >= 1 && choice4 <= 4) {
								System.out.println(alp[choice4 - 1]);
							} else if (choice4 == 5)
								break;
							else
								System.out.println("1 ~ 5 사이의값을 입력해주세요");
						} catch (InputMismatchException e) {
							sc.next();
							System.out.println("1 ~ 5 사이의값을 입력해주세요");

						}
                       
					
					} else if (choice1 == 3) { 
                       while (true) {
						System.out.println("1.Epic 2.Unique 3.Rare 4.Noraml 5.뒤로가기");
						int choice5 = 0;
						try {
							choice5 = sc.nextInt();
							if(choice5 == 5) break;
						} catch (InputMismatchException e) {
							sc.next();
							System.out.println("1 ~ 5 사이의값을입력해주세요");
							continue;
						}
                       
						
						
						try {
							System.out.println("maxAvg :");

							alp[choice5 - 1].setMaxAvg(sc.nextInt());
							System.out.println("minAvg :");
							alp[choice5 - 1].setMinAvg(sc.nextInt());
//							 ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//						     MINAVG 를 MAXAVG 보다 높게 설정하려고할시 오류메세지
							 AlpaInfo.MinRange(alp, choice5);				 
//							 ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
							

						} catch (InputMismatchException e) {
							System.out.println("숫자만입력해주세요");
						} catch (ArrayIndexOutOfBoundsException e) {

						}
                       }

					} else if (choice1 == 4)
						break;
					
				}
				
				

			} 
			else if (choice == 2) {

				if (alp[0].isAllInitialized()) {
					System.out.println("관리자등급설정이안되어있습니다.");
//					♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//                  Alp배열 MIN MAX 값이 0일시 오류출력
//                  isAllInitialized()						
//					♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
					
					
					continue;
				}

				while (true) {

					System.out.println("1. 내정보입력 2.내정보보기 3.내정보수정 4.뒤로가기");
					int choice6 = 0;
					try {
						choice6 = sc.nextInt();
					}

					catch (InputMismatchException e) {
						sc.next();
						System.out.println("1 ~ 4 사이의값을입력해주세요");
						continue;
					}

					if (choice6 == 1) {

						try {
							System.out.println("닉네임 :       ");
							user[count].setId(sc.next());
							System.out.println("LV :       ");
							user[count].setLv(sc.nextInt());
							System.out.println("능력치는 1 ~ 50 중 랜덤으로 설정됩니다 ");
							System.out.println("기회는 2회주어집니다.");
							
							
//							 ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//						     // 능력치를 1 ~ 50 중 랜덤으로 돌려주는함수
							 random(user, sc, count);
//							 
//							 ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
							
							
							while(true) {
							System.out.println("게임머니는 3000$ ~ 5000$ 중 랜덤으로설정됩니다.");
							System.out.println("M 버튼을 눌러  게임머니를 설정하세요~!!!");
							String InputMoney = sc.next();
							if(InputMoney.equalsIgnoreCase("m")){
								
//								♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//							    // 게임머니 3000 ~ 5000 사이를 랜덤으로돌려주는함수	
									MoneyRandom( InputMoney, user,  count);					
//								♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
							}
							else {
								System.out.println("[입력오류] M키를눌러 주세요"); continue;
							}
									
							
							count++; 
							
							
							
							
							user[count - 1].setRank(userrank1(user, alp, count)); break;
							}
						} catch (InputMismatchException e) {
							sc.next();
							System.out.println("유효하지않은데이터입니다.");
						}
						System.out.println(user[count - 1]);

						continue;

					}
					if (choice6 == 4)
						break;

					else if (choice6 == 2) {
						if (user[0].getMoney() == 0) {
							System.out.println("등록된유저가없습니다.");
							continue;
						}
						System.out.println("닉네임 을 입력하세요");
                          
						String choice7 = sc.next();
//						♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//                      UserInfoClass CompareTo 정렬
						Arrays.sort(user);
//						♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
						
					
						
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
							
							System.out.println("등록된유저가없습니다.");
//							♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//	                        유저배열에 Money 값이 0일경우
//                          오류 출력							
//							♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
							continue;
						}

						if (alp[0].isAllInitialized()) {
							System.out.println("[오류]관리자등급설정을확인해주세요");
//							♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//	                        관리자 배열에 MAX MIN 설정이
//                          안되있을시 오류 출력							
//							♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
							break;
						}
						System.out.print("변경할 ID 를 입력하세요 :");
						String reName = sc.next();
						
						 modifyNameOrAvg(alp, user, count, reName, sc);
                        /**
                         * 해당유저 ID 검색후 일치하는 아이디가없을경우 오류출력
                         * 유저의 닉네임 및 능력치를 랜덤을돌려 변경하는기능
                         * 닉네임 변경시 1500 $  지출  능력치 변경시 2500 $ 지출 
                         * 현재가진돈이 상품가격보다 많을경우만 살수있고
                         * (현재가진돈이 상품가격보다 적을경우 게임머니충전유도)
                         * 능력치변동에 따른 랭크 재배정
                         */
					}
                       
				}

					

			}

			if (choice == 3) {
				if (user[0].getMoney() == 0) {
					System.out.println("등록된유저가없습니다.");
					continue;
				}

				while (true) {

					System.out.println("1. 랭킹별출력  2. 뒤로가기");

					int choice7 = 0;
					try {
						choice7 = sc.nextInt();
						if (alp[0].isAllInitialized()) {
//							♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//	                        관리자 배열에 MAX MIN 설정이
//                          안되있을시 오류 출력 							
//							♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
							System.out.println("관리자등급설정이안되어있습니다.");
							
							break;
						}
					} catch (InputMismatchException e) {
						sc.next();
						System.out.println("1 ~ 2 값을입력해주세요");
						continue;

					}

					if (choice7 == 1) { // ranks == 4
						Arrays.sort(user);
						/**
						 * User클래스에 Comparable 을이용해 랭킹재정의
						 * 1.각 능력치의합 + LV 의합이 높은순서대로 재정의
						 * 2. 1번의합이 같은경우 먼저 등록한순서 (NUM이빠른순서) 로재정의 
						 */
						for (int i = 0; i < count; i++) {
							System.out.printf("%d등 %s\n", i + 1, user[i]);
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

	///// 메인함수끝/////////////////////////////////////////////////////////////////////////////////////

	
	
	
  
	public static void MoneyRandom(String InputMoney, UserImfo[] user, int count) {
		while(true) {
		if (InputMoney.equalsIgnoreCase("m")) {
			Menu.AvgRandomPrint();
			user[count].setMoney((int) (Math.random() * 2000) + 3000);
			
		}
		else System.out.println("[입력에러 M 을 눌러주세요]"); break;
		   
		}
	}

	public static void modifyNameOrAvg(AlpaInfo[] alp, UserImfo[] user, int count, String reName, Scanner sc) {
		int count1 = 0;
		for (int i = 0; i < count; i++) {
             
			if (!(reName.equalsIgnoreCase(user[i].getId()))) {
				count1++;
			}
			if(count == count1) {
			   System.out.println("등록된유저가없습니다");continue;
			}
		}
		
		for (int i = 0; i < count; i++) {
			 if(reName.equalsIgnoreCase(user[i].getId())) {
				System.out.println("1. 닉네임수정(1500$) 2. 능력치수정(2500$)");
				String Input1 = sc.next();
				try {
					if (Input1.equals("1") && user[i].getMoney() >= 1500) {
						System.out.println("닉네임 :    ");
						user[i].setId(sc.next());
						user[i].setMoney(user[i].getMoney() - 1500);
						System.out.println("[수정완료]" + user[i]);
					}

					else if (Input1.equals("2") && user[i].getMoney() >= 2500) {
						System.out.println("능력치는 1 ~ 50 중 랜덤으로 설정됩니다 ");
						System.out.println("기회는 1회주어집니다.");
					
						System.out.println("★ R 을 눌러 랜덤능력치를설정하세요 ★");
						String Input = sc.next();
						if(!(Input.equalsIgnoreCase("r"))) {
							System.out.println("[오류]R버튼을눌러주세요"); continue; 
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
						System.out.println("[수정완료]" + user[i]);

					} else {
						System.out.println("[잔액이부족합니다]");
						System.out.println("1. 게임머니 충전하기  2. 뒤로가기");
						Input1 = sc.next();
						if (Input1.equals("1")) {
							System.out.println("충전금액을입력해주세요");
							int charge = sc.nextInt();
							user[i].setMoney(user[i].getMoney() + charge);
							System.out.println("충전이완료되었습니다.");
							System.out.println(user[i]);
						} else if (Input1.equals("2")) {

						} else
							System.out.println("1 ~ 2 중 선택해주세요 ");
						continue;
					}

				} catch (InputMismatchException e) {
					System.out.println("올바른값을입력해주세요");
				}
			
			} 
			
				
		}
	   
		
	}

	public static String userrank1(UserImfo[] user, AlpaInfo[] alp, int count) {
		String temp = "랭크가아닙니다.";
		for (int i = 0; i < count; i++) { // i 랭크 4개
			for (int j = 0; j < alp.length; j++) {
				if (((user[i].getPower() + user[i].getSpeed() + user[i].getDefense()) / 3) >= alp[j].getMinAvg()
						&& ((user[i].getPower() + user[i].getSpeed() + user[i].getDefense()) / 3) <= alp[j]
								.getMaxAvg()) {
					temp = alp[j].getRank();

				} // 안쪽폴문ㄴ

			} // 바깥쪽

		}
		return temp;
	}

	

	public static void random(UserImfo[] user, Scanner sc, int count) {
		for (int i = 0; i < 2; i++) {
			System.out.println("★ R 을 눌러 랜덤능력치를설정하세요 ★");

			String Input = sc.next();
			if (Input.equalsIgnoreCase("R")) {
				Menu.AvgRandomPrint();
				user[count].setPower((int) (Math.random() * 50) + 1);
				System.out.println("Power : " + user[count].getPower());
				user[count].setSpeed((int) (Math.random() * 50) + 1);
				System.out.println("Speed : " + user[count].getSpeed());
				user[count].setDefense((int) (Math.random() * 50) + 1);
				System.out.println("Defense : " + user[count].getDefense());
				System.out.println("1. 다시돌리기  2. 다음 ");
				Input = sc.next();
				if (Input.equals("1")) {
					
					if(i == 1 && Input.equals("1")) {
						
						System.out.println("[랜덤기회를모두사용하셨습니다.]\n");
						
					}
					
				}
					
				else if (Input.equals("2"))
					break;

			}

		}
	}



	public static String userrank(UserImfo[] user, AlpaInfo[] alp, int count) {
		String temp = "랭크가아닙니다.";
		for (int i = 0; i < count; i++) { // i 랭크 4개
			for (int j = 0; j < alp.length; j++) {
				if (((user[i].getPower() + user[i].getSpeed() + user[i].getDefense()) / 3) >= alp[j].getMinAvg()
						&& ((user[i].getPower() + user[i].getSpeed() + user[i].getDefense()) / 3) <= alp[j].getMaxAvg()
						&& user[i].getLv() >= alp[j].getMinLv() && user[i].getLv() <= alp[j].getMaxLv()) {
					temp = alp[j].getRank();

				} // 안쪽폴문ㄴ

			} // 바깥쪽

		}
		return temp;
	}








}// 클래스끝
