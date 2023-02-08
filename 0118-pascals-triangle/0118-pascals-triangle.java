class Solution {
    public List<List<Integer>> generate(int numRows) {  
	    List<List<Integer>> result = new ArrayList<>(); // 2중 리스트를 만들어 공간 생성 
			
		for(int i=0; i<numRows; i++) {		// numRows 만큼 List 생성
			ArrayList<Integer> row = new ArrayList<>(i+1); // 행이 내려갈수록 하나씩 추가

			if(i == 0 ) {	
				row.add(1); // 1번째 리스트 요소는 1               
			}else {			
            		// ArrayList size만큼 ArrayList 값 셋팅
				for(int j=0; j<=result.size(); j++ ) {	
                		// 전 ArrayList 값 가져오기
					ArrayList<Integer> before = (ArrayList<Integer>) result.get(i-1); 
					
					if(j == 0 || j == result.size() ) {	
                 	       // 행의 첫번째 값과 마지막 값은 1
						row.add(1);
					}else {
                  	      // 전 ArrayList의 자신의 위치-1, 위치 값을 가져와서 더한다.
						row.add(before.get(j-1) + before.get(j)); 
					}
				}
			}
			result.add(row);		
		}
		return result;
    }
}