public class Simulation {
    public int numTosses = 1000000;
    public int numDice = 2;
    public Bins bin = new Bins(numDice, (numDice * 6));

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSim();
        sim.printSim();

    }
    public Simulation(int numDice, Integer numTosses) {
        this.numTosses = numTosses;
        this.numDice = numDice;
    }
    public void runSim() {
        Dice dice = new Dice(numDice);
        int result;
        for(int i = 0; i < numTosses; i++){
            result = dice.tossAndSum();
            bin.addRollValueToBin(result);
        }
    }
    public void printSim(){
        for(int i = numDice; i <= numDice * 6; i++){
            System.out.println(String.format("Bin %2s | %6s | %6.2f %% | %2s ", i, bin.getSpecificBin(i).toString(), bin.rollPercentagePerBin(i), printStarGraph(i)));
        }
    }
    public String printStarGraph(int binNumber){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Math.round(bin.rollPercentagePerBin(binNumber)); i++){
            sb.append("*");
        }
        return sb.toString();
    }



}