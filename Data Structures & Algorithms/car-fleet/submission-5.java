class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double lastTime = 0;
        int output = 0;

        int[][] pairs = new int[position.length][2];

        for (int index = 0; index < position.length; index++) {
            pairs[index][0] = position[index];
            pairs[index][1] = speed[index];
            }

        Arrays.sort(pairs, (first, second) -> Integer.compare(second[0], first[0]));

        for (int [] pair: pairs)    {
            double currTime = (double) (target - pair[0])/pair[1];
            if (currTime > lastTime) {
                lastTime = currTime;
                 output++;
                
            }
            
        }

        return output;



        
    }
}