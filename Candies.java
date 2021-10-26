class Candies {

    public static void main(str[] args){
        int [] candyType = [1,1,2,2,3,3];
        int result = distributeCandies(candyType);
        System.out.println(result);
    }
    
    public int distributeCandies(int[] candyType) {
        
        HashSet<Integer> unique = new HashSet<Integer>();
        
        for(int i=0; i<candyType.length; i++){
            if(unique.size() < candyType.length/2){
                unique.add(candyType[i]);
            }
            
        }      
        return unique.size();
    }
}