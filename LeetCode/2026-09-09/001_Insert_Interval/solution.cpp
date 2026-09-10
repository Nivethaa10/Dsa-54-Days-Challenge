class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals)); 
        intervalList.add(newInterval); 

