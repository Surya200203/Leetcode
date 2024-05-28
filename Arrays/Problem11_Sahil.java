// Widest Vertical Area Between Two Points Containing No Points

// Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.

// A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.

// Note that points on the edge of a vertical area are not considered included in the area.

 

// Example 1:

// ​
// Input: points = [[8,7],[9,9],[7,4],[9,7]]
// Output: 1
// Explanation: Both the red and the blue area are optimal.
// Example 2:

// Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
// Output: 3
 

// Constraints:

// n == points.length
// 2 <= n <= 105
// points[i].length == 2
// 0 <= xi, yi <= 109

import java.util.Arrays;

public class Problem11_Sahil {
   public int maxWidthOfVerticalArea(int[][] points) {
        int[] xaxisValues = new int[points.length];
        for(int i=0; i<points.length; i++){
            xaxisValues[i] = points[i][0];
        }
        Arrays.sort(xaxisValues);
        int max = 0;
        for(int i=0; i<points.length-1; i++){
            for(int j=0; j<points[i].length; j++){
                if(xaxisValues[i+1]-xaxisValues[i]>max) max = xaxisValues[i+1]-xaxisValues[i];
            }
        }
        return max;
    } 
}
