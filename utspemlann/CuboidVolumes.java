package utspemlann;

public class CuboidVolumes {
    
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int volumeA = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int volumeB = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];
        
        return Math.abs(volumeA - volumeB);
    }
    
    public static void main(String[] args) {
        int[] firstCuboid = {2, 2, 3};
        int[] secondCuboid = {5, 4, 1};
        
        int difference = findDifference(firstCuboid, secondCuboid);
        System.out.println("Perbedaan volume: " + difference);
    }
}