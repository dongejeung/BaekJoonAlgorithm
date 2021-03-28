package study.java.basic.variable;

public class LoopStatement {

	/*
	 * 	for, while, do-while
	 * 
	 * 	# for
	 * 
	 * 	For 문의 실행순서 :
	 * 
	 * 	for(초기화(1); 조건식(2); 증감식(4)) {
	 * 		수행될 문장(3)
	 * 	}
	 * 
	 * 	cf) 증감식에는 생각보다 다양한 식이 들어갈 수 있다.
	 * 
	 * 	확장 for 문 :
	 * 
	 *  for( 타입 변수명 : 배열 또는 컬렉션) {
	 *  
	 *  }
	 *  
	 *  cf) for(;;) 이딴 식으로 무한 반복문으로 쓸 수도 있음.
	 *  
	 *  ===
	 *  
	 *  while() {
	 *  
	 *  }
	 *  
	 *  ---
	 *  
	 *  do {
	 *  
	 *  } while {
	 *  
	 *  }
	 *  
	 *  ===
	 *  
	 *  break : 자신이 포함된 가장 가까운 반복문을 벗어난다.
	 *  
	 *  continue : 반복문의 끝으로 이동하여 다음 반복으로 넘어간다. (요거는 잘 안 사용해봤다.)
	 *  (전체 반복 중에 특정조건을 만족하는 경우를 제외하고자 할 때 유용하다.)
	 *  
	 *  
	 *  !* 이름 붙은 반복문 : 여러 개의 반복문이 중첩 된 경우에는 break 문으로 중첩 반복문을 완전히 벗어날 수 없다.
	 *   이때는 중첩 반복문 앞에 이름을 붙이고 break 문과 continue 문에 이름을 지정해 줌으로써,
	 *   하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.
	 *   
	 *   Loop1 : for(int i=2; i <=9; i++) {
	 *   		for(int j=1; j <=9; j++) {
	 *   			if(j==5)
	 *   				break Loop1;
	 *   				//break;
	 *   				//continue Loop1;
	 *   				//continue;
	 *   			System.out.println(i+ "*"+ j +"="+ i*j);
	 *   		} // end of for i
	 *   		System.out.println();
	 *   } // end of Loop1
	 *   
	 *  
	 *  
	 */
}
