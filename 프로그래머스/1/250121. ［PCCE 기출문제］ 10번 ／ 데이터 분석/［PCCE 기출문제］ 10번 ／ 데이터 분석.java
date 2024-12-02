import java.util.*;
class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
     int extIndex = getColumnIndex(ext);
        int sortByIndex = getColumnIndex(sort_by);
        List<int[]> filteredData = new ArrayList<>();

        for (int[] row : data) {
            if (row[extIndex] < val_ext) { // 필터 조건
                filteredData.add(row);
            }
        }
        filteredData.sort(Comparator.comparingInt(o -> o[sortByIndex]));
        return filteredData;
    }
    private int getColumnIndex(String column) {
        switch (column){
            case "code":
            return 0;
            case "date":
            return 1;
            case "maximum":
            return 2;
            case "remain":
            return 3;
            default:
                throw new IllegalArgumentException("Invalid column name: " + column);
        }
    }
}