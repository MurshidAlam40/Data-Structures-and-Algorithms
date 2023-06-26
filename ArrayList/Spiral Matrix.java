class Solution {
    public List<Integer> spiralOrder(int[][] matrix ) {
        
        List<Integer> myList = new ArrayList<>();
        
        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;
        
        while(left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                myList.add(matrix[top][i]);
            }
            top++;
            
			for(int i=top; i<=bottom; i++){
                myList.add(matrix[i][right]);
            }
            right--;
            
            if(left > right || top > bottom)
                break;
            
            for(int i=right; i>=left; i--){
                myList.add(matrix[bottom][i]);
            }
            bottom--;
            
            for(int i=bottom; i>=top; i--){
                myList.add(matrix[i][left]);
            }
            left++;
        }
        return myList;
    }
}
