class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals)); 
        intervalList.add(newInterval); 
        Collections.sort(intervalList, (a, b) -> Integer.compare(a[0], b[0])); 
 
        List<int[]> res = new ArrayList<>(); 
        int[] current = intervalList.get(0); 

