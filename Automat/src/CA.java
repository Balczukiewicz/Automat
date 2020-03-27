public class CA {

    private int[][] cells;
    private int[] ruleSet;
    public int steps, length;

    public CA(int steps, int length, int ruleSet) {

        this.steps = steps;
        this.length = length;
        this.cells = new int[steps][length];

        cells[0][cells[0].length / 2] = 1;

        this.ruleSet = generateRuleSet(ruleSet);
        rules();

    }

    private void rules(){


        int left, me, right;

        for(int i = 1; i< cells.length; ++i){
            for(int j = 0; j< cells[i].length; ++j){

                left = cells[i-1][(((j-1)+ cells[i].length)% cells[i].length)];
                me = cells[i-1][j];
                right = cells[i-1][(((j+1)+ cells[i].length)% cells[i].length)];
                int idx = 4*left + 2*me + right;
                cells[i][j] = ruleSet[ 7 - idx ];
            }
        }
    }

    public int[] generateRuleSet(int rule){
        int[] ruleSet = new int[8];

        String binaryRule = Integer.toBinaryString(rule);
        int l = 8 - binaryRule.length();

        for(int i=0; i<binaryRule.length(); i++) {
            ruleSet[i+l] = (binaryRule.charAt(i)=='1') ? 1 : 0;
        }

        return ruleSet;
    }


    public int[] getRuleSet() {
        return ruleSet;
    }

    public int getSteps() {
        return steps;
    }

    public int getLength() {
        return length;
    }

    public int[][] getCells() {
        return cells;
    }
}
