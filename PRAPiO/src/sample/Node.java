package sample;
public class Node {
    Path[] paths;
    int [][] nodeMatrix;
    int[][] cycle; // number of cycle, [entance] [exit]
    int cost = 0, idOfLeftChild, idOfRightChild,
            parentId, matrixSize, id, numberOfPaths,
    x = 0, y = 0;
    boolean hasLeftChild = false,
    hasKids = false,
    isNodeLeftChild;
    String chosenPath;

    public Node(int numberOfCities, int id){
        nodeMatrix = new int[numberOfCities][numberOfCities];
        paths = new Path[numberOfCities];
        cycle = new int[numberOfCities/2+1][2];
        matrixSize = numberOfCities;
        hasLeftChild = true;
        hasKids = false;
        this.id = id;
        for (int i = 0 ; i < numberOfCities/2+1 ; i++){
            cycle[i][0] = -1;
            cycle[i][1] = -1;
        }

        numberOfPaths = 0;
    }
    public void optimize() {
        int reductionCost = 0;
        // Checking rows
        for (int i = 0; i < matrixSize; i++){
            int min = -1;
            for (int j = 0; j < matrixSize; j++) {
                if (nodeMatrix[i][j] != -1) {
                    if (min == -1) min = nodeMatrix[i][j];
                    else if (nodeMatrix[i][j] < min) min = nodeMatrix[i][j];
                }
            }
            for (int j = 0; j < matrixSize; j++) {
                if (nodeMatrix[i][j] != -1)  nodeMatrix[i][j] -= min;
            }
            if (min != -1)reductionCost += min;
        }
        // Checking columns
        for (int i = 0; i < matrixSize; i++) {
            int min = -1;
            for (int j = 0; j < matrixSize; j++) {
                if (nodeMatrix[j][i] != -1) {
                    if (min == -1) min = nodeMatrix[j][i];
                    else if (nodeMatrix[j][i] < min) min = nodeMatrix[j][i];
                }
            }
            for (int j = 0; j < matrixSize; j++) {
                if (nodeMatrix[j][i] != -1)  nodeMatrix[j][i] -= min;
            }
            if(min != -1)reductionCost += min;
        }
        cost += reductionCost;
    } // reduces matrix and returns cost of reduction
}
