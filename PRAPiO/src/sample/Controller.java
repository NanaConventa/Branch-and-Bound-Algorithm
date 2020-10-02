package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Controller {

    @FXML    private TextField[][] matrix = new TextField[10][10];

    @FXML    private TextField numberOfCities;
    @FXML    private TextField poleOfMatrix00;
    @FXML    private TextField poleOfMatrix01;
    @FXML    private TextField poleOfMatrix02;
    @FXML    private TextField poleOfMatrix03;
    @FXML    private TextField poleOfMatrix04;
    @FXML    private TextField poleOfMatrix05;
    @FXML    private TextField poleOfMatrix06;
    @FXML    private TextField poleOfMatrix07;
    @FXML    private TextField poleOfMatrix08;
    @FXML    private TextField poleOfMatrix09;
    @FXML    private TextField poleOfMatrix10;
    @FXML    private TextField poleOfMatrix11;
    @FXML    private TextField poleOfMatrix12;
    @FXML    private TextField poleOfMatrix13;
    @FXML    private TextField poleOfMatrix14;
    @FXML    private TextField poleOfMatrix15;
    @FXML    private TextField poleOfMatrix16;
    @FXML    private TextField poleOfMatrix17;
    @FXML    private TextField poleOfMatrix18;
    @FXML    private TextField poleOfMatrix19;
    @FXML    private TextField poleOfMatrix20;
    @FXML    private TextField poleOfMatrix21;
    @FXML    private TextField poleOfMatrix22;
    @FXML    private TextField poleOfMatrix23;
    @FXML    private TextField poleOfMatrix24;
    @FXML    private TextField poleOfMatrix25;
    @FXML    private TextField poleOfMatrix26;
    @FXML    private TextField poleOfMatrix27;
    @FXML    private TextField poleOfMatrix28;
    @FXML    private TextField poleOfMatrix29;
    @FXML    private TextField poleOfMatrix30;
    @FXML    private TextField poleOfMatrix31;
    @FXML    private TextField poleOfMatrix32;
    @FXML    private TextField poleOfMatrix33;
    @FXML    private TextField poleOfMatrix34;
    @FXML    private TextField poleOfMatrix35;
    @FXML    private TextField poleOfMatrix36;
    @FXML    private TextField poleOfMatrix37;
    @FXML    private TextField poleOfMatrix38;
    @FXML    private TextField poleOfMatrix39;
    @FXML    private TextField poleOfMatrix40;
    @FXML    private TextField poleOfMatrix41;
    @FXML    private TextField poleOfMatrix42;
    @FXML    private TextField poleOfMatrix43;
    @FXML    private TextField poleOfMatrix44;
    @FXML    private TextField poleOfMatrix45;
    @FXML    private TextField poleOfMatrix46;
    @FXML    private TextField poleOfMatrix47;
    @FXML    private TextField poleOfMatrix48;
    @FXML    private TextField poleOfMatrix49;
    @FXML    private TextField poleOfMatrix50;
    @FXML    private TextField poleOfMatrix51;
    @FXML    private TextField poleOfMatrix52;
    @FXML    private TextField poleOfMatrix53;
    @FXML    private TextField poleOfMatrix54;
    @FXML    private TextField poleOfMatrix55;
    @FXML    private TextField poleOfMatrix56;
    @FXML    private TextField poleOfMatrix57;
    @FXML    private TextField poleOfMatrix58;
    @FXML    private TextField poleOfMatrix59;
    @FXML    private TextField poleOfMatrix60;
    @FXML    private TextField poleOfMatrix61;
    @FXML    private TextField poleOfMatrix62;
    @FXML    private TextField poleOfMatrix63;
    @FXML    private TextField poleOfMatrix64;
    @FXML    private TextField poleOfMatrix65;
    @FXML    private TextField poleOfMatrix66;
    @FXML    private TextField poleOfMatrix67;
    @FXML    private TextField poleOfMatrix68;
    @FXML    private TextField poleOfMatrix69;
    @FXML    private TextField poleOfMatrix70;
    @FXML    private TextField poleOfMatrix71;
    @FXML    private TextField poleOfMatrix72;
    @FXML    private TextField poleOfMatrix73;
    @FXML    private TextField poleOfMatrix74;
    @FXML    private TextField poleOfMatrix75;
    @FXML    private TextField poleOfMatrix76;
    @FXML    private TextField poleOfMatrix77;
    @FXML    private TextField poleOfMatrix78;
    @FXML    private TextField poleOfMatrix79;
    @FXML    private TextField poleOfMatrix80;
    @FXML    private TextField poleOfMatrix81;
    @FXML    private TextField poleOfMatrix82;
    @FXML    private TextField poleOfMatrix83;
    @FXML    private TextField poleOfMatrix84;
    @FXML    private TextField poleOfMatrix85;
    @FXML    private TextField poleOfMatrix86;
    @FXML    private TextField poleOfMatrix87;
    @FXML    private TextField poleOfMatrix88;
    @FXML    private TextField poleOfMatrix89;
    @FXML    private TextField poleOfMatrix90;
    @FXML    private TextField poleOfMatrix91;
    @FXML    private TextField poleOfMatrix92;
    @FXML    private TextField poleOfMatrix93;
    @FXML    private TextField poleOfMatrix94;
    @FXML    private TextField poleOfMatrix95;
    @FXML    private TextField poleOfMatrix96;
    @FXML    private TextField poleOfMatrix97;
    @FXML    private TextField poleOfMatrix98;
    @FXML    private TextField poleOfMatrix99;

    @FXML    private TextField poleOfMatrixBorder00;
    @FXML    private TextField poleOfMatrixBorder01;
    @FXML    private TextField poleOfMatrixBorder02;
    @FXML    private TextField poleOfMatrixBorder03;
    @FXML    private TextField poleOfMatrixBorder04;
    @FXML    private TextField poleOfMatrixBorder05;
    @FXML    private TextField poleOfMatrixBorder06;
    @FXML    private TextField poleOfMatrixBorder07;
    @FXML    private TextField poleOfMatrixBorder08;
    @FXML    private TextField poleOfMatrixBorder09;
    @FXML    private TextField poleOfMatrixBorder010;
    @FXML    private TextField poleOfMatrixBorder11;
    @FXML    private TextField poleOfMatrixBorder12;
    @FXML    private TextField poleOfMatrixBorder13;
    @FXML    private TextField poleOfMatrixBorder14;
    @FXML    private TextField poleOfMatrixBorder15;
    @FXML    private TextField poleOfMatrixBorder16;
    @FXML    private TextField poleOfMatrixBorder17;
    @FXML    private TextField poleOfMatrixBorder18;
    @FXML    private TextField poleOfMatrixBorder19;
    @FXML    private TextField poleOfMatrixBorder110;

    @FXML private TextField minRandom;
    @FXML private TextField maxRandom;
    @FXML private TextField poleNameOfFile;
    @FXML private CheckBox checkBoxRandomize;
    @FXML private CheckBox checkBoxSymetric;

    @FXML    private TextField[][] poleBorderOfMatrix = new TextField[2][11];

    @FXML    private Label labelInscriptionNumberOfPaths;
    @FXML    private Label labelPath1;
    @FXML    private Label labelPath2;
    @FXML    private Label labelPath3;
    @FXML    private Label labelPath4;
    @FXML    private Label labelAdvertisment;
    @FXML    private Label labelNumberOfPaths;
    @FXML    private Pane paneInformationWindow;
    @FXML    private Pane paneValueRange;
    @FXML    private Pane paneReadFile;
    @FXML    private Pane paneTab;
    @FXML    private Pane paneBinaryTree;
    @FXML    private Pane paneAdvertisement;
    @FXML    private Label labelAdvertisementWindow;
    @FXML    private Button buttonGenerateMatrix;
    @FXML    private ToggleButton buttonBinaryTree;


    private boolean isTreeOnScreen = false;
    private int numberOfNodes;

    private int id = 0;
    private int numberOfCorrectPaths = 0;

    private int idOfBestPath = -1,

    idOfBestPathI = -1, idOfBestPathII = -1, idOfBestPathIII = -1;

    private Memory memory;

    public void closeInformationPane(ActionEvent event){
        paneInformationWindow.setVisible(false);
    }

    public void openReadFilePane(ActionEvent event) {
        checkBoxRandomize.setDisable(true);
        checkBoxSymetric.setDisable(true);
        paneTab.setDisable(true);
        paneReadFile.setVisible(true);
        buttonGenerateMatrix.setDisable(true);
        numberOfCities.setDisable(true);



    }
    public void closeReadFilePane(ActionEvent event) {
        checkBoxRandomize.setDisable(false);
        checkBoxSymetric.setDisable(false);
        paneTab.setDisable(false);
        paneReadFile.setVisible(false);
        buttonGenerateMatrix.setDisable(false);
        numberOfCities.setDisable(false);
    }
    public void loadFile(ActionEvent event) throws FileNotFoundException {
        try {
            String string;
            string = poleNameOfFile.getText();
            File file = new File(string);
            Scanner in = new Scanner(file);
            String sentence = in.nextLine();
            numberOfCities.setText(sentence);
            generateMatrix(event);
            String[] tabOfWords;
            int number = Integer.parseInt(sentence);
            for (int i = 0; i < number; i++) {
                sentence = in.nextLine();
                tabOfWords = sentence.split(",");
                for (int j = 0; j < number; j++) {
                    if (i != j) matrix[i][j].setText(tabOfWords[j]);
                }
            }
            closeReadFilePane(event);
        }
        catch (FileNotFoundException exception) {
            labelAdvertisment.setText("Nie ma takiego pliku!");
            displayAdvertisment(event);
        }
    }
    public void openInformationPane(ActionEvent event){
        labelAdvertisementWindow.setText("Program służy do rozwiązywania problemu komiwojażera za pomocą algorytmu podziału i ograniczeń." +
                "\nInstrukcja obsługi:\n1. Wpisać ilość miast.\n2. Wypełnić macierz kosztów(Kolejne poziomo pola informują o koszcie podróży do różnych miast).\n3. Odczytać wynik.\nMiłej pracy.");
        paneInformationWindow.setVisible(true);
    }
    public void changeVisabilityOfValueRangePane(ActionEvent event){
        if(paneValueRange.isDisable()) paneValueRange.setDisable(false); else paneValueRange.setDisable(true);
    }

    public void resetData(){
        isTreeOnScreen = false;
        id = 0;
        numberOfCorrectPaths = 0;
        idOfBestPath = -1;
        idOfBestPathI = -1;
        idOfBestPathII = -1;
        idOfBestPathIII = -1;
        labelPath1.setVisible(false);
        labelPath2.setVisible(false);
        labelPath3.setVisible(false);
        labelPath4.setVisible(false);
        labelNumberOfPaths.setVisible(false);
        labelInscriptionNumberOfPaths.setVisible(false);
    }
 
    public void createInitialMatrix(){
        matrix[0][0] = poleOfMatrix00;
        matrix[0][1] = poleOfMatrix01;
        matrix[0][2] = poleOfMatrix02;
        matrix[0][3] = poleOfMatrix03;
        matrix[0][4] = poleOfMatrix04;
        matrix[0][5] = poleOfMatrix05;
        matrix[0][6] = poleOfMatrix06;
        matrix[0][7] = poleOfMatrix07;
        matrix[0][8] = poleOfMatrix08;
        matrix[0][9] = poleOfMatrix09;
        matrix[1][0] = poleOfMatrix10;
        matrix[1][1] = poleOfMatrix11;
        matrix[1][2] = poleOfMatrix12;
        matrix[1][3] = poleOfMatrix13;
        matrix[1][4] = poleOfMatrix14;
        matrix[1][5] = poleOfMatrix15;
        matrix[1][6] = poleOfMatrix16;
        matrix[1][7] = poleOfMatrix17;
        matrix[1][8] = poleOfMatrix18;
        matrix[1][9] = poleOfMatrix19;
        matrix[2][0] = poleOfMatrix20;
        matrix[2][1] = poleOfMatrix21;
        matrix[2][2] = poleOfMatrix22;
        matrix[2][3] = poleOfMatrix23;
        matrix[2][4] = poleOfMatrix24;
        matrix[2][5] = poleOfMatrix25;
        matrix[2][6] = poleOfMatrix26;
        matrix[2][7] = poleOfMatrix27;
        matrix[2][8] = poleOfMatrix28;
        matrix[2][9] = poleOfMatrix29;
        matrix[3][0] = poleOfMatrix30;
        matrix[3][1] = poleOfMatrix31;
        matrix[3][2] = poleOfMatrix32;
        matrix[3][3] = poleOfMatrix33;
        matrix[3][4] = poleOfMatrix34;
        matrix[3][5] = poleOfMatrix35;
        matrix[3][6] = poleOfMatrix36;
        matrix[3][7] = poleOfMatrix37;
        matrix[3][8] = poleOfMatrix38;
        matrix[3][9] = poleOfMatrix39;
        matrix[4][0] = poleOfMatrix40;
        matrix[4][1] = poleOfMatrix41;
        matrix[4][2] = poleOfMatrix42;
        matrix[4][3] = poleOfMatrix43;
        matrix[4][4] = poleOfMatrix44;
        matrix[4][5] = poleOfMatrix45;
        matrix[4][6] = poleOfMatrix46;
        matrix[4][7] = poleOfMatrix47;
        matrix[4][8] = poleOfMatrix48;
        matrix[4][9] = poleOfMatrix49;
        matrix[5][0] = poleOfMatrix50;
        matrix[5][1] = poleOfMatrix51;
        matrix[5][2] = poleOfMatrix52;
        matrix[5][3] = poleOfMatrix53;
        matrix[5][4] = poleOfMatrix54;
        matrix[5][5] = poleOfMatrix55;
        matrix[5][6] = poleOfMatrix56;
        matrix[5][7] = poleOfMatrix57;
        matrix[5][8] = poleOfMatrix58;
        matrix[5][9] = poleOfMatrix59;
        matrix[6][0] = poleOfMatrix60;
        matrix[6][1] = poleOfMatrix61;
        matrix[6][2] = poleOfMatrix62;
        matrix[6][3] = poleOfMatrix63;
        matrix[6][4] = poleOfMatrix64;
        matrix[6][5] = poleOfMatrix65;
        matrix[6][6] = poleOfMatrix66;
        matrix[6][7] = poleOfMatrix67;
        matrix[6][8] = poleOfMatrix68;
        matrix[6][9] = poleOfMatrix69;
        matrix[7][0] = poleOfMatrix70;
        matrix[7][1] = poleOfMatrix71;
        matrix[7][2] = poleOfMatrix72;
        matrix[7][3] = poleOfMatrix73;
        matrix[7][4] = poleOfMatrix74;
        matrix[7][5] = poleOfMatrix75;
        matrix[7][6] = poleOfMatrix76;
        matrix[7][7] = poleOfMatrix77;
        matrix[7][8] = poleOfMatrix78;
        matrix[7][9] = poleOfMatrix79;
        matrix[8][0] = poleOfMatrix80;
        matrix[8][1] = poleOfMatrix81;
        matrix[8][2] = poleOfMatrix82;
        matrix[8][3] = poleOfMatrix83;
        matrix[8][4] = poleOfMatrix84;
        matrix[8][5] = poleOfMatrix85;
        matrix[8][6] = poleOfMatrix86;
        matrix[8][7] = poleOfMatrix87;
        matrix[8][8] = poleOfMatrix88;
        matrix[8][9] = poleOfMatrix89;
        matrix[9][0] = poleOfMatrix90;
        matrix[9][1] = poleOfMatrix91;
        matrix[9][2] = poleOfMatrix92;
        matrix[9][3] = poleOfMatrix93;
        matrix[9][4] = poleOfMatrix94;
        matrix[9][5] = poleOfMatrix95;
        matrix[9][6] = poleOfMatrix96;
        matrix[9][7] = poleOfMatrix97;
        matrix[9][8] = poleOfMatrix98;
        matrix[9][9] = poleOfMatrix99;
        poleBorderOfMatrix[0][0] = poleOfMatrixBorder00;
        poleBorderOfMatrix[0][1] = poleOfMatrixBorder01;
        poleBorderOfMatrix[0][2] = poleOfMatrixBorder02;
        poleBorderOfMatrix[0][3] = poleOfMatrixBorder03;
        poleBorderOfMatrix[0][4] = poleOfMatrixBorder04;
        poleBorderOfMatrix[0][5] = poleOfMatrixBorder05;
        poleBorderOfMatrix[0][6] = poleOfMatrixBorder06;
        poleBorderOfMatrix[0][7] = poleOfMatrixBorder07;
        poleBorderOfMatrix[0][8] = poleOfMatrixBorder08;
        poleBorderOfMatrix[0][9] = poleOfMatrixBorder09;
        poleBorderOfMatrix[0][10] = poleOfMatrixBorder010;
        poleBorderOfMatrix[1][1] = poleOfMatrixBorder11;
        poleBorderOfMatrix[1][2] = poleOfMatrixBorder12;
        poleBorderOfMatrix[1][3] = poleOfMatrixBorder13;
        poleBorderOfMatrix[1][4] = poleOfMatrixBorder14;
        poleBorderOfMatrix[1][5] = poleOfMatrixBorder15;
        poleBorderOfMatrix[1][6] = poleOfMatrixBorder16;
        poleBorderOfMatrix[1][7] = poleOfMatrixBorder17;
        poleBorderOfMatrix[1][8] = poleOfMatrixBorder18;
        poleBorderOfMatrix[1][9] = poleOfMatrixBorder19;
        poleBorderOfMatrix[1][10] = poleOfMatrixBorder110;



    }

    public void setMatriVisibility(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if (i != 1 || j != 0) {
                    matrix[i][j].setVisible(true);
                }
                if (i < 2 && !(i == 1 && j == 0)){
                    poleBorderOfMatrix[i][j].setVisible(true);
                }
            }
        }
        poleBorderOfMatrix[0][10].setVisible(true);
        poleBorderOfMatrix[1][10].setVisible(true);
    }

    public void loadMatrixToTab(){
        for (int i = 0; i < numberOfNodes; i++){
            for (int j = 0; j < numberOfNodes; j++){
                memory.nodesOfBinaryTree[0].nodeMatrix[i][j] = getIntFromTextField(matrix[i][j]);
            }
        }
    }

    public int getIntFromTextField(TextField poleTekstowe){
        String string = poleTekstowe.getText();
        if (string.equals("-")) return -1;
        else return Integer.parseInt(string);
    }

    public void generateMatrix(ActionEvent event){
        try {
            getIntFromTextField(minRandom);
            getIntFromTextField(maxRandom);
        }
        catch (NumberFormatException exeption) {
            labelAdvertisment.setText("Niepoprawnie wpisany zakres odległości.\nDozwolone są wyłącznie liczby naturalne.");
            displayAdvertisment(event);
            return;
        }
        if (!(numberOfCities.getText().equals("10") || numberOfCities.getText().equals("9") || numberOfCities.getText().equals("8") ||
                numberOfCities.getText().equals("7") || numberOfCities.getText().equals("6") || numberOfCities.getText().equals("5") ||
                numberOfCities.getText().equals("4") || numberOfCities.getText().equals("3"))) {
            labelAdvertisment.setText("Wielkość macierzy jest błędna. Macierz może mieć wielkość tylko z zakresu <3...10>");
            displayAdvertisment(event);
            return;
        }
        if (minRandom.getText().length() > 5 || maxRandom.getText().length() > 5) {
            labelAdvertisment.setText("Dane wpisane w zakres wartości są nieprawidłowe!\n");
            displayAdvertisment(event);
            return;
        }
        else if (getIntFromTextField(maxRandom) <= getIntFromTextField(minRandom)){
            labelAdvertisment.setText("Wartość maksymalna losowanej odległości musi być większa od minimalnej!");
            displayAdvertisment(event);
            return;
        }
        else if (getIntFromTextField(minRandom) > 10000  || ( getIntFromTextField(minRandom) < 0) || (getIntFromTextField(maxRandom) > 10000) || (getIntFromTextField(maxRandom) < 0)) {
            labelAdvertisment.setText("Dane wpisane w zakres wartości są nieprawidłowe!\nDopuszczalny zakres mieści się w przedziale <0,10000>");
            displayAdvertisment(event);
            return;
        }

        resetData();

        createInitialMatrix();
        setMatriVisibility();
        numberOfNodes = getIntFromTextField(numberOfCities);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                if (i >= numberOfNodes || j>= numberOfNodes) matrix[i][j].setVisible(false);
                if (i == 0 && j > numberOfNodes || i == 1 && j > numberOfNodes) poleBorderOfMatrix[i][j].setVisible(false);
            }
        }
        if (numberOfNodes < 10) {
            poleBorderOfMatrix[0][10].setVisible(false);
            poleBorderOfMatrix[1][10].setVisible(false);
        }
        memory = new Memory(numberOfNodes);
        if (checkBoxRandomize.isSelected()) {
            int randomValue, maxValue, minValue, numberOfPossibilities;


            for (int i = 0; i < numberOfNodes; i++){
                for(int j = 0; j < numberOfNodes; j++) {
                    Random generator = new Random();
                    maxValue = Integer.parseInt(maxRandom.getText());
                    minValue = Integer.parseInt(minRandom.getText());
                    numberOfPossibilities = maxValue - minValue + 1;
                    randomValue = generator.nextInt(numberOfPossibilities);
                    randomValue += minValue;
                    if (i != j) {
                        matrix[i][j].setText(Integer.toString(randomValue));
                        if(checkBoxSymetric.isSelected()) matrix[j][i].setText(matrix[i][j].getText());
                    }
                }
            }
        }
    }
    public void displayBinaryTree(ActionEvent event) {
        if ((numberOfNodes > 7 || memory.counterOfId > 75) && buttonBinaryTree.isSelected() ) {
            labelAdvertisment.setText("Rozmiar macierzy lub liczba węzłów jest zbyt duża, aby było możliwe narysowanie drzewa w czytelny sposób.");
            paneAdvertisement.setVisible(true);
        }
        if (isTreeOnScreen && buttonBinaryTree.isSelected()) {
            paneBinaryTree.setVisible(true);
        }
        else paneBinaryTree.setVisible(false);


    }
    public void displayAdvertisment(ActionEvent event) {
        paneAdvertisement.setVisible(true);
    }
    public void closeAdvertisment(ActionEvent event) {
        paneAdvertisement.setVisible(false);
    }
    public void closeProgram(ActionEvent event) {
        System.exit(0);
    }
    public void findCheapestPath(ActionEvent event){
        try {
            loadMatrixToTab();
        }
        catch (NumberFormatException exeption) {
            labelAdvertisment.setText("Niepoprawnie odległości w macierzy.\nDozwolone są wyłącznie liczby naturalne.");
            displayAdvertisment(event);
            return;
        }
        for (int i = 0; i < numberOfNodes; i++){
            for (int j = 0; j < numberOfNodes; j++){
                if (matrix[i][j].getText().length() > 5) {
                    labelAdvertisment.setText("Dane wpisane w macierzy są nieprawidłowe!\nDopuszczalny zakres mieści się w przedziale <0,10000>");
                    displayAdvertisment(event);
                    return;
                }
                else if ((getIntFromTextField(matrix[i][j]) > 10000) || ( getIntFromTextField(matrix[i][j]) < 0) && !(getIntFromTextField(matrix[i][j]) == -1)) {
                    labelAdvertisment.setText("Dane wpisane w macierzy są nieprawidłowe!\nDopuszczalny zakres mieści się w przedziale <0,10000>");
                    displayAdvertisment(event);
                    return;
                }
            }
        }

        resetData();
        memory = new Memory(numberOfNodes);
        loadMatrixToTab();
        do {
            memory.nodesOfBinaryTree[id].optimize();
            memory.selectPath(id);
            memory.nodesOfBinaryTree[memory.nodesOfBinaryTree[id].idOfRightChild].optimize();
            if(id == 0) id++;
            else id+= 2;
        }while (memory.nodesOfBinaryTree[id].numberOfPaths < numberOfNodes);
        int costOfBestPath = memory.nodesOfBinaryTree[id].cost;
        idOfBestPath = id;
        for (int i = 0; i <= memory.counterOfId; i++){
            if(!memory.nodesOfBinaryTree[i].hasLeftChild && memory.nodesOfBinaryTree[i].cost <= costOfBestPath && !memory.nodesOfBinaryTree[i].hasKids){
                int j = i;
                do {
                    memory.nodesOfBinaryTree[j].optimize();
                    memory.selectPath(j);
                    memory.nodesOfBinaryTree[memory.nodesOfBinaryTree[j].idOfRightChild].optimize();
                    if (memory.nodesOfBinaryTree[j].hasKids && memory.nodesOfBinaryTree[j].idOfLeftChild != 0) {
                        j = memory.nodesOfBinaryTree[j].idOfLeftChild;
                        if (!memory.nodesOfBinaryTree[j].hasKids && memory.nodesOfBinaryTree[j].hasLeftChild
                                && memory.nodesOfBinaryTree[j].numberOfPaths == numberOfNodes
                                && memory.nodesOfBinaryTree[j].cost < costOfBestPath) {
                            costOfBestPath = memory.nodesOfBinaryTree[j].cost;
                        }
                    }
                    else break;
                }while (memory.nodesOfBinaryTree[j].numberOfPaths < numberOfNodes && memory.nodesOfBinaryTree[j].cost <= costOfBestPath && j < (numberOfNodes * numberOfNodes * numberOfNodes -1));
            }
        }

        costOfBestPath = 99999;
        for (int i = 0; i <= memory.counterOfId; i++)
        {
            if (memory.nodesOfBinaryTree[i].hasLeftChild && !memory.nodesOfBinaryTree[i].hasKids
                    && memory.nodesOfBinaryTree[i].numberOfPaths == numberOfNodes) {
                if (memory.nodesOfBinaryTree[i].cost < costOfBestPath) {
                    idOfBestPath = i;
                    costOfBestPath = memory.nodesOfBinaryTree[i].cost;
                    numberOfCorrectPaths = 1;
                }
                else if (memory.nodesOfBinaryTree[i].cost == costOfBestPath) {
                    if (idOfBestPathI == -1) {
                        idOfBestPathI = i;
                        numberOfCorrectPaths++;
                    } else if (idOfBestPathII == -1) {
                        idOfBestPathII = i;
                        numberOfCorrectPaths++;
                    } else if (idOfBestPathIII == -1) {
                        idOfBestPathIII = i;
                        numberOfCorrectPaths++;
                    }
                }
            }
        }
        memory.displayPaths(idOfBestPath);
        if(idOfBestPathI != -1) memory.displayPaths(idOfBestPathI);
        if(idOfBestPathII != -1) memory.displayPaths(idOfBestPathII);
        if(idOfBestPathIII != -1) memory.displayPaths(idOfBestPathIII);

        labelInscriptionNumberOfPaths.setVisible(true);
        labelNumberOfPaths.setVisible(true);
        labelNumberOfPaths.setText(Integer.toString(numberOfCorrectPaths));
        String inscription1, inscription2, inscription3, inscription4;
        switch(numberOfCorrectPaths){
            case 4:
                inscription4 = "Połączenie numer 4\nPosiadane połączenia:\n";
                for (int i = 0; i < numberOfNodes; i++){
                    inscription4 = inscription4 + "(" + (memory.nodesOfBinaryTree[idOfBestPathIII].paths[i].departure +1)
                            + ", " + (memory.nodesOfBinaryTree[idOfBestPathIII].paths[i].destination +1) + ")\n";
                }
                inscription4 += "\n" + memory.returnTheHamiltonCycle(idOfBestPathIII);
                labelPath4.setText(inscription4);
                labelPath4.setVisible(true);
            case 3:
                inscription3 = "Połączenie numer 3\nPosiadane połączenia:\n";
                for (int i = 0; i < numberOfNodes; i++){
                    inscription3 = inscription3 + "(" + (memory.nodesOfBinaryTree[idOfBestPathII].paths[i].departure +1)
                            + ", " + (memory.nodesOfBinaryTree[idOfBestPathII].paths[i].destination +1) + ")\n";
                }
                inscription3 += "\n" + memory.returnTheHamiltonCycle(idOfBestPathII);
                labelPath3.setText(inscription3);
                labelPath3.setVisible(true);
            case 2:
                inscription2 = "Połączenie numer 2\nPosiadane połączenia:\n";
                for (int i = 0; i < numberOfNodes; i++){
                    inscription2 = inscription2 + "(" + (memory.nodesOfBinaryTree[idOfBestPathI].paths[i].departure +1)
                            + ", " + (memory.nodesOfBinaryTree[idOfBestPathI].paths[i].destination +1) + ")\n";
                }
                inscription2 += "\n" + memory.returnTheHamiltonCycle(idOfBestPathI);
                labelPath2.setText(inscription2);
                labelPath2.setVisible(true);
            case 1:
                inscription1 = "Połączenie numer 1\nPosiadane połączenia:\n";
                for (int i = 0; i < numberOfNodes; i++){
                    inscription1 = inscription1 + "(" + (memory.nodesOfBinaryTree[idOfBestPath].paths[i].departure +1)
                            + ", " + (memory.nodesOfBinaryTree[idOfBestPath].paths[i].destination +1) + ")\n";
                }
                inscription1 += "\n" + memory.returnTheHamiltonCycle(idOfBestPath);
                inscription1 = inscription1 + "\nKoszt wynosi : " + memory.nodesOfBinaryTree[idOfBestPath].cost;
                labelPath1.setText(inscription1);
                labelPath1.setVisible(true);
        }
        if (numberOfNodes >= 4 && numberOfNodes <=7 && memory.counterOfId <= 100) {
            drawTree();
            if (buttonBinaryTree.isSelected()) paneBinaryTree.setVisible(true);
        }
        else {
            buttonBinaryTree.setSelected(false);
            paneBinaryTree.setVisible(false);
        }
    }
    public void drawTree(){
        paneBinaryTree.getChildren().removeAll();
        paneBinaryTree.getChildren().clear();


        //DD NOT TOUCH SHIFTS
        int shiftY = 40; // Shift of parametr Y on the tree pane
        int shiftX = 12; // Shift of parametr X on the tree pane

        int maxElements = memory.counterOfId;
        Line[] lines = new Line[maxElements];
        Circle[] circles = new Circle[maxElements];
        Label[] inscriptions = new Label[maxElements];
        Label[] inscriptionsOfWays = new Label[maxElements];
        for (int i = 0; i < maxElements; i++){
            lines[i] = new Line();
            lines[i].setStrokeWidth(3);
            circles[i] = new Circle();
            circles[i].setFill(Color.YELLOW);
            circles[i].setStroke(Color.BLACK);
            inscriptions[i] = new Label();
            inscriptions[i].setFont(new Font("Courier New", 13));
            inscriptions[i].setStyle("-fx-font-weight: bold;");
            inscriptionsOfWays[i] = new Label();
            inscriptionsOfWays[i].setStyle("-fx-font-weight: bold;");
            if(i > 0) inscriptionsOfWays[i].setText(memory.nodesOfBinaryTree[i].chosenPath);
        }

        if(maxElements >= 40) memory.nodesOfBinaryTree[0].x = 60;
        else if (maxElements < 40) memory.nodesOfBinaryTree[0].x = 40;

        memory.nodesOfBinaryTree[0].y = 1;

        //Drawing a tree
        int shift = 20; // Odległość rozłożenia sąsiednich węzłów od siebie.
        circles[0].setCenterX(memory.nodesOfBinaryTree[0].x * shiftX);
        circles[0].setCenterY(shiftY);
        circles[0].setRadius(10);
        inscriptions[0].setLayoutX(memory.nodesOfBinaryTree[0].x  * shiftX - 5);
        inscriptions[0].setLayoutY(shiftY - 8);
        inscriptions[0].setText(Integer.toString(0));
        for (int i = 1; i < memory.counterOfId; i++){
            int parentId = memory.nodesOfBinaryTree[i].parentId;

            memory.nodesOfBinaryTree[i].y = memory.nodesOfBinaryTree[parentId].y + 1;
            int y = memory.nodesOfBinaryTree[i].y;
            switch (y){
                case 2:
                    if(maxElements > 40) shift = 32;
                    else shift = 16;
                    break;
                case 3:

                    if(maxElements > 40) shift = 16;
                    else shift = 8;
                    break;
                case 4:

                    if(maxElements > 40) shift = 8;
                    else shift = 4;
                    break;
                case 5:

                    if(maxElements > 40) shift = 4;
                    else shift = 2;
                    break;
                case 6:

                    if(maxElements > 40) shift = 2;
                    else shift = 1;
                    break;
                case 7:

                    shift = 1;
                    break;
                case 8:

                    shift = 1;
                    break;
                case 9:

                    shift = 1;
                    break;
                case 10:

                    shift = 1;
                    break;
            }

            //Setting of parametr X for node, when is a left son
            if (memory.nodesOfBinaryTree[i].isNodeLeftChild) {
                inscriptionsOfWays[i].setTextFill(Color.BLUE);
                if ( memory.nodesOfBinaryTree[parentId].x - shift >= 1) {
                    memory.nodesOfBinaryTree[i].x = memory.nodesOfBinaryTree[parentId].x - shift;
                }
                else memory.nodesOfBinaryTree[i].x = 1;
            }
            //Setting of parametr X for node, when is a right son
            else {
                inscriptionsOfWays[i].setTextFill(Color.RED);
                if (( memory.nodesOfBinaryTree[parentId].x + shift) < 110) {
                    memory.nodesOfBinaryTree[i].x = memory.nodesOfBinaryTree[parentId].x + shift;
                    if (memory.nodesOfBinaryTree[i].y > 5) memory.nodesOfBinaryTree[i].x += 2;
                }
                else {
                    memory.nodesOfBinaryTree[i].x = 110;
                }
            }

            int x = memory.nodesOfBinaryTree[i].x;

            lines[i].setStartX(x * shiftX);
            lines[i].setEndX(memory.nodesOfBinaryTree[parentId].x * shiftX);
            lines[i].setStartY(y * shiftY);
            lines[i].setEndY(memory.nodesOfBinaryTree[parentId].y  * shiftY);
            circles[i].setCenterX(x * shiftX);
            circles[i].setCenterY(y * shiftY);
            circles[i].setRadius(10);
            inscriptions[i].setText(Integer.toString(i));
            if (inscriptions[i].getText().length() == 2) inscriptions[i].setLayoutX(x * shiftX - 7);
            else inscriptions[i].setLayoutX(x * shiftX - 4);
            inscriptions[i].setLayoutY(y * shiftY - 8);
            inscriptionsOfWays[i].setLayoutX(x * shiftX - 5);
            inscriptionsOfWays[i].setLayoutY(y * shiftY - 25);
            paneBinaryTree.getChildren().add(lines[i]);
        }
        for (int i = 0; i < memory.counterOfId; i++){
            paneBinaryTree.getChildren().add(circles[i]);
            paneBinaryTree.getChildren().add(inscriptions[i]);
            paneBinaryTree.getChildren().add(inscriptionsOfWays[i]);
        }


        isTreeOnScreen = true;
    }
    public void displayInformationsAboutProgram(ActionEvent event){
        labelAdvertisment.setText("Program napisany w ramach pracy inżynierskiej pt. \"implementacja algorytmu podziału i ograniczeń dla problemu komiwojażera\"\nuczelnia: Politechnika Rzeszowska 2020\n" +
                "autor: Norbert Gomułka\npromotor: dr inż. Antoni Szczepański");
        displayAdvertisment(event);
    }
}