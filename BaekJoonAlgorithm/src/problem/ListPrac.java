package problem;

public class ListPrac {
   public static void main(String[] args) {
      MyList ml = new MyList();
      ml.add("첫번째데이터");
      ml.add("두번째데이터");
      ml.add("세번째데이터");
      ml.addFirst("첫번째에 끼워넣기");
      ml.addLast("네번째데이터");
      System.out.println(ml.size());
      System.out.println(ml.get(3));
      
      String testData = "첫번째데이터";
      if(ml.contains(testData)) {
    	  System.out.println(testData + "라는 데이터 존재함");
      }else {
    	  System.out.println(testData + "라는 데이터 존재안함");
      }
      System.out.println(ml.toString());
      ml.clear();
      System.out.println("clear이후 크기: " +ml.size());
      ml.add("첫번째데이터");
      ml.add("두번째데이터");
      System.out.println(ml.toString());
      System.out.println("새로운 크기: " +ml.size());
      //... 등등 구현한 모든건 실제 사용 가능해야함.
   }
}


class ListNode {
   String data;
   ListNode next;
   
   public ListNode(String data) {
      this.data = data;
   }
}

/*
 * 	여기서 start, end 는 전체 LinkedList 의 start end 가 아닌
 * 	각각의 노드의 start 와 end를 의미하는 것 같음.
 * 	=> 아 체 LinkedList 가 맞는 듯 하다.
 * 	MyList 에 size 가 있어서 전체 길이를 나타내는 등..
 * 	 
 */
class MyList {
   private ListNode start, end;
   private int size;
   
   public MyList() {
      start = new ListNode(null);
      end = start;
      size = 0;
   }
   
   // add 할 때 마다 ListNode 객체를 생성하고, 
   // 다음 ListNode 에 연결하는 작업을 한다.
   public void add(String data) {
      ListNode tmp = new ListNode(data);
      end.next = tmp;
      end = tmp;
      size++;
   }
   
   public int size() {
      return size;
   }
   
   /**
    * 이하 함수 구현
    */
   // data가 list 내에 있는지
   public boolean contains(String data) {
	   boolean result = false;
	   ListNode startNode = start;
	   while(startNode.next != null) {
		   if(data.equals(startNode.next.data)) {
			   result = true;
			   break;
		   }
		   startNode = startNode.next;
	   }
	   
	   return result;
   }
   
   // 리스트의 맨 끝에 data 추가
   // => 걍 이미 세영이가 구현해준 add를 사용하면 된다.
   public void addLast(String data) {
	   add(data);
   }
   
   // 리스트의 맨 앞에 data 추가
   // => 맨 앞에는 null이 들어간 새 ListNode 를 생성하고,
   // 기존의 start 를 유지하고 그 사이에 ListNode 를 하나 추가하고, 연결을 다시 이을 것인가?
   // 그래도 될 듯 하다.
   public void addFirst(String data) {
	   ListNode tmp = new ListNode(null);
	   tmp.next = start.next;
	   tmp.data = data;
	   start = tmp;
	   
	   size++;
   }
   
   // 리스트 모두 제거
   public void clear() {
	   start.next = null;
	   //start = null;
	   //end = nul
	   //start = new ListNode(null);
	   start.data = null;
	   end = start;
	   size = 0;
   }
   
   // 리스트의 첫번째 항목 리턴
   public String getFirst() {
	   return this.start.data;
   }
   
   // 리스트의 마지막 항목 리턴
   public String getLast() {
	   return this.end.data;
   }
   
   // 리스트에서 idx번째 항목 리턴 (맨 처음 인덱스는 0임. 즉 'getFirst()'와 'get(0)'은 동일 )
   public String get(int idx) {
	   String s = null;
	   int startNum = 0;
	   ListNode startNode = start;
	   while(startNum < idx) {
		   startNode = startNode.next;
		   startNum++;
	   }
	   
	   return startNode.data;
   }

   // 리스트 내의 모든 항목을 순서대로 출력함.
   // 예를들어 "A", "B", "C"가 들어있었다면
   // "A, B, C"가 리턴되어야 함.
   @Override
   public String toString() {
	   String result = "";
	   if(start == null) {
		   
	   }else {
		   ListNode startNode = start.next;
		   result = startNode.data;
		   int startNum = 0;
		   while(startNode != null) {
			   if(startNum != 0) result += ", " +startNode.data;
			   startNode = startNode.next;
			   startNum++;
		   }
	   }
	   
	   return result;
   }
   
}
