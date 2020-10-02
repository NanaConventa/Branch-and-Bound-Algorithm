package sample;
import java.util.Scanner;
/**
* Class holds binary tree data and primary matrix, algorithm is written inside of class.
*/
public class Memory {
    Scanner load = new Scanner(System.in);
    boolean isGraphDirected = false;
    int numberOfPointsInGraph;
    int counterOfId = 0;
    Node[] nodesOfBinaryTree;
    public Memory(int numberOfCities){
        nodesOfBinaryTree = new Node[numberOfCities*numberOfCities*numberOfCities*numberOfCities];
        numberOfPointsInGraph = numberOfCities;
        for (int i = 0; i < numberOfCities*numberOfCities*numberOfCities*numberOfCities; i++){
            nodesOfBinaryTree[i] = new Node(numberOfCities,i);
            nodesOfBinaryTree[i].paths = new Path[numberOfCities];
            for (int j = 0; j < numberOfCities; j++){
                nodesOfBinaryTree[i].paths[j] = new Path(0,0);
            }
        }
    }
    public int selectPath(int id) {
        int maxReduction = -1, numberOfZeros = 0, numberOfZerosOnX = 0, xOfEmergencyPath = -1, jOfEmergencyPath = -1, numberOfZerosNotOnX = 0, numberOfZerosOnJ = 0;
        int costOfRows = -1, costOfColumns = -1, iOfMaxReduction = -1, jOfMaxReduction = -1, iOfFirstZero = -1, jOfFirstZero = -1;

        // Checking if there is 3 or less ways remain
        for (int i = 0; i < numberOfPointsInGraph; i++){
            for (int j = 0; j < numberOfPointsInGraph; j++) {
                if(nodesOfBinaryTree[id].nodeMatrix[i][j] == 0 && numberOfZeros < 3) {
                    ++numberOfZeros;
                    if (iOfFirstZero == -1) {
                        iOfFirstZero = i;
                        jOfFirstZero = j;
                        numberOfZerosOnX++;
                        numberOfZerosOnJ++;
                    }
                    else {
                        if(i == iOfFirstZero) numberOfZerosOnX++;
                        else {
                            numberOfZerosNotOnX++;
                            xOfEmergencyPath = i;
                            jOfEmergencyPath = j;
                        }
                        if (j == jOfFirstZero) numberOfZerosOnJ++;
                    }
                }
                else if (nodesOfBinaryTree[id].nodeMatrix[i][j] == 0 && numberOfZeros == 3) numberOfZeros++;
            }
        }
        // Choosing the best path
        if (numberOfZeros > 3) {
            for (int i = 0; i < numberOfPointsInGraph; i++) {
                for (int j = 0; j < numberOfPointsInGraph; j++) {
                    if (nodesOfBinaryTree[id].nodeMatrix[i][j] == 0) {

                        costOfRows = costOfColumns = -1;
                        for (int k = 0; k < numberOfPointsInGraph; k++) {
                            if (j != k && nodesOfBinaryTree[id].nodeMatrix[i][k] != -1) {
                                if (costOfRows == -1) costOfRows = nodesOfBinaryTree[id].nodeMatrix[i][k];
                                else if (nodesOfBinaryTree[id].nodeMatrix[i][k] < costOfRows)
                                    costOfRows = nodesOfBinaryTree[id].nodeMatrix[i][k];
                            }
                            if (i != k && nodesOfBinaryTree[id].nodeMatrix[k][j] != -1) {
                                if (costOfColumns == -1) costOfColumns = nodesOfBinaryTree[id].nodeMatrix[k][j];
                                else if (nodesOfBinaryTree[id].nodeMatrix[k][j] < costOfColumns)
                                    costOfColumns = nodesOfBinaryTree[id].nodeMatrix[k][j];
                            }
                        }
                        if (maxReduction < costOfColumns + costOfRows) {
                            maxReduction = costOfColumns + costOfRows;
                            iOfMaxReduction = i;
                            jOfMaxReduction = j;
                        }
                    }
                }
            }

            if (maxReduction == -1) {
                iOfMaxReduction = iOfFirstZero;
                jOfMaxReduction = jOfFirstZero;
                maxReduction = 0;
            }
        }


        // additional conditions of choosing the right path

        else if (numberOfZeros == 2 || numberOfZeros == 3){
            if(numberOfZerosOnX > numberOfZerosNotOnX){
                iOfMaxReduction = xOfEmergencyPath;
                jOfMaxReduction = jOfEmergencyPath;
                maxReduction = 0;
            }
            else {
                iOfMaxReduction = iOfFirstZero;
                jOfMaxReduction = jOfFirstZero;
                maxReduction = 0;
            }
        }
        else if (numberOfZeros == 1){
            iOfMaxReduction = iOfFirstZero;
            jOfMaxReduction = jOfFirstZero;
        }
        else if (numberOfZeros == 0) {
            return 0;
        }

        if (numberOfZeros == 2 && (numberOfZerosOnJ == 2 || numberOfZerosOnX == 2))
        {
            nodesOfBinaryTree[id].hasKids = true;
            return 0;
        }

        nodesOfBinaryTree[id].hasKids = true;

        //Creating the left child
        int ChildId;
        nodesOfBinaryTree[id].idOfLeftChild = ChildId = ++counterOfId;
        copyTab(id,ChildId);
        copyPaths(id,ChildId);
        copyCycles(id, ChildId);
        nodesOfBinaryTree[ChildId].cost = nodesOfBinaryTree[id].cost;
        nodesOfBinaryTree[ChildId].parentId = id;
        nodesOfBinaryTree[ChildId].numberOfPaths = nodesOfBinaryTree[id].numberOfPaths + 1;
        nodesOfBinaryTree[ChildId].paths[nodesOfBinaryTree[id].numberOfPaths].departure = iOfMaxReduction;
        nodesOfBinaryTree[ChildId].paths[nodesOfBinaryTree[id].numberOfPaths].destination = jOfMaxReduction;
        nodesOfBinaryTree[ChildId].hasLeftChild = true;
        nodesOfBinaryTree[ChildId].isNodeLeftChild = true;
        nodesOfBinaryTree[ChildId].chosenPath = Integer.toString(iOfMaxReduction + 1) + " -> "
                + Integer.toString(jOfMaxReduction + 1);


        //Elimination of ways that can't be chosen anymore
        for (int k = 0; k < numberOfPointsInGraph; k++){
            nodesOfBinaryTree[ChildId].nodeMatrix[iOfMaxReduction][k] = -1;
            nodesOfBinaryTree[ChildId].nodeMatrix[k][jOfMaxReduction] = -1;
            nodesOfBinaryTree[ChildId].nodeMatrix[jOfMaxReduction][iOfMaxReduction] = -1;
        }
        //Eliminating the occurrence of smaller Hamillon cycles
        if (nodesOfBinaryTree[ChildId].numberOfPaths < numberOfPointsInGraph - 1) {
            for (int i = 0; i < 5; i++) {
                if (nodesOfBinaryTree[ChildId].cycle[i][0] == -1) {
                    nodesOfBinaryTree[ChildId].cycle[i][0] = iOfMaxReduction;
                    nodesOfBinaryTree[ChildId].cycle[i][1] = jOfMaxReduction;
                    break;
                } else {
                    if (iOfMaxReduction == nodesOfBinaryTree[ChildId].cycle[i][1]) {
                        nodesOfBinaryTree[ChildId].cycle[i][1] = jOfMaxReduction;
                        for (int j = 0; j < numberOfPointsInGraph /2+1; j ++){
                            if ( jOfMaxReduction == nodesOfBinaryTree[ChildId].cycle[j][0] ) {
                                nodesOfBinaryTree[ChildId].cycle[i][1] = nodesOfBinaryTree[ChildId].cycle[j][1];
                                break;
                            }
                        }
                        int beginningOfCycle = nodesOfBinaryTree[ChildId].cycle[i][0];
                        int endOfCycle = nodesOfBinaryTree[ChildId].cycle[i][1];
                        nodesOfBinaryTree[ChildId].nodeMatrix[endOfCycle][beginningOfCycle] = -1;
                        break;
                    } else if (jOfMaxReduction == nodesOfBinaryTree[ChildId].cycle[i][0]) {
                        nodesOfBinaryTree[ChildId].cycle[i][0] = iOfMaxReduction;
                        for (int j = 0; j < numberOfPointsInGraph /2+1; j ++){
                            if ( iOfMaxReduction == nodesOfBinaryTree[ChildId].cycle[j][1] ) {
                                nodesOfBinaryTree[ChildId].cycle[i][0] = nodesOfBinaryTree[ChildId].cycle[j][0];
                                break;
                            }
                        }
                        int endOfCycle = nodesOfBinaryTree[ChildId].cycle[i][1];
                        int beginningOfCycle = nodesOfBinaryTree[ChildId].cycle[i][0];
                        nodesOfBinaryTree[ChildId].nodeMatrix[endOfCycle][beginningOfCycle] = -1;
                        break;
                    }
                }
            }
        }

                        if(numberOfZeros > 1) {

            //Creating of right child
            nodesOfBinaryTree[id].idOfRightChild = ChildId = ++counterOfId;
            copyTab(id, ChildId);
            copyPaths(id, ChildId);
            copyCycles(id, ChildId);
            nodesOfBinaryTree[ChildId].cost = nodesOfBinaryTree[id].cost;
            nodesOfBinaryTree[ChildId].optimize();
            nodesOfBinaryTree[ChildId].numberOfPaths = nodesOfBinaryTree[id].numberOfPaths;
            nodesOfBinaryTree[ChildId].nodeMatrix[iOfMaxReduction][jOfMaxReduction] = -1;
            nodesOfBinaryTree[ChildId].parentId = id;
            nodesOfBinaryTree[ChildId].hasLeftChild = false;
            nodesOfBinaryTree[ChildId].isNodeLeftChild = false;
            nodesOfBinaryTree[ChildId].chosenPath = Integer.toString((iOfMaxReduction + 1)) + " -> "
                    + Integer.toString((jOfMaxReduction + 1));

        }
        if (numberOfZeros == 2) nodesOfBinaryTree[ChildId].hasKids = true;



        return 0;

    }
    public String returnTheHamiltonCycle(int id){
        String inscription = "(1";
        int departure = 0;

        do {
            boolean flag = false;
        for(int i = 0; i < numberOfPointsInGraph; i++) {
            if (nodesOfBinaryTree[id].paths[i].departure == departure) {
                departure = nodesOfBinaryTree[id].paths[i].destination;
                flag = true;
                break;
            }
        }
                if (departure == 0 && flag == true) break;
                inscription += "-" + Integer.toString(departure + 1);
        } while (departure != 0);
        inscription += ")";
        return inscription;
    }
    public void copyTab(int Z, int Do){
        for(int i = 0; i < numberOfPointsInGraph; i++){
            for(int j = 0; j < numberOfPointsInGraph; j++){
                nodesOfBinaryTree[Do].nodeMatrix[i][j] = nodesOfBinaryTree[Z].nodeMatrix[i][j];
            }
        }
    }
    public void copyPaths(int Z, int Do){
        for(int i = 0; i < numberOfPointsInGraph; i++){
            nodesOfBinaryTree[Do].paths[i].destination = nodesOfBinaryTree[Z].paths[i].destination;
            nodesOfBinaryTree[Do].paths[i].departure = nodesOfBinaryTree[Z].paths[i].departure;

        }
    }
    public void copyCycles(int Z, int Do){
        for(int i = 0; i < numberOfPointsInGraph /2+1; i ++){
            nodesOfBinaryTree[Do].cycle[i][0] = nodesOfBinaryTree[Z].cycle[i][0];
            nodesOfBinaryTree[Do].cycle[i][1] = nodesOfBinaryTree[Z].cycle[i][1];
        }
    }
        public void displayPaths(int id){
        System.out.println("Węzeł o ID " + id + " Posiada następujące przejścia: ");
        for(int i = 0; i < numberOfPointsInGraph; i++){
            System.out.println("Z " + (nodesOfBinaryTree[id].paths[i].departure + 1)
                    + " do " + (nodesOfBinaryTree[id].paths[i].destination + 1));
        }
    }
}

