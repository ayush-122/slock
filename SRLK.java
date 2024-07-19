package SherlockSecret;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class SRLK {

    static BigDecimal total_win= BigDecimal.ZERO;
    static Random random= new Random();
    static BigDecimal Base_rtp=BigDecimal.ZERO;
    static BigDecimal reSpin_rtp=BigDecimal.ZERO;

    //?
    static BigDecimal F_Fea_rtp=BigDecimal.ZERO;
    static BigDecimal total_rtp= BigDecimal.ZERO;
    static BigDecimal Free_rtp= BigDecimal.ZERO;
    static double sc3hits = 0;
    static double bnshits = 0;

    public static String[][] baseMatrixCreation() {
        String[][] matrix = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = "  ";
            }
        }
        ArrayList<String> Reel2 = new ArrayList<>();
        ArrayList<String> Reel1 = new ArrayList<>();
        ArrayList<String> Reel3 = new ArrayList<>();
        ArrayList<String> Reel4 = new ArrayList<>();
        ArrayList<String> Reel5 = new ArrayList<>();

        Reel1.addAll(Arrays.asList("SC","L1","L4","H2","L3","L1","L1","L2","L4","L2","L3","H4","L2","H3","L6","L4","L3","H1","L2","L3","L3","L4","L3","L3","H4","SC","L2","L4","L2","L3","L5","L4","L5","L5","SC","L1","L1","L5","L5","L2","L6","L1","L1","L5","L5","L3","L3","L3","BO","L3","L3","L3","L3","L3","L3","L5","L5","L5","L5","BO","L5","L5","L5","L5","L5","L3","L5","L3","L5","L5","L5","L5","BO","L5","L5","L5","L5","L5","L5","L5","L5","L5","L3","L5","L4","L3","L3","L5","L6","L2"));
        Reel2.addAll(Arrays.asList("H2","L3","L1","H4","L2","WC","H4","L1","BO","L2","L3","L2","L1","L3","H1","L1","L3","L3","H3","H4","L1","SC","H3","L3","H3","SC","H1","L1","L2","L3","SC","H2","H4","L2","L3","H3","L2","SC","L6","L5","L6","L6","L5","L2","L5","L6","L1","L1","L2","L2","L2","L2","BO","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","BO","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2"));
        Reel3.addAll(Arrays.asList("L4","L1","H1","H3","L4","BO","L6","L3","L2","L1","H4","L4","L1","L6","H1","L3","L4","L6","L1","H3","L4","H4","H3","L4","L1","H3","L1","H3","SC","H2","H4","H4","L2","L1","SC","H3","H4","H2","L6","L5","L6","L5","L5","L5","BO","L5","L5","H1","L1","L4","L4","L4","L4","L4","L4","L4","L4","BO","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4"));
        Reel4.addAll(Arrays.asList("L3","L4","H3","H4","H1","L3","L1","H2","H4","L3","L2","H3","BO","L1","L4","H1","H3","L1","L1","H2","L2","L4","H4","L3","L2","H4","H3","L2","SC","L4","L2","L1","H4","H1","L1","WC","H2","H3","SC","L1","H4","H3","L2","L3","H4","L3","L3"));
        Reel5.addAll(Arrays.asList("L2","H3","L1","L3","L2","H4","H2","L1","L2","L4","SC","H2","L1","H1","L3","H3","H2","L1","L4","L3","H1","H2","L4","L3","L1","L2","H3","H4","L4","L2","H3","L3","H1","H2","H3","L2","H4","L3","L4","H1","H4","L1","H1","H2","H4","L4","H1","L3","L2","L4","H2","H4","SC","L6","L5","L6","L3","L6","L5","L5","L5","BO","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5"));

        System.out.println(Reel1.size()+" "+Reel2.size()+" "+Reel3.size()+" "+Reel4.size()+" "+Reel5.size());
        ArrayList<ArrayList> Reellist = new ArrayList<>();
        Reellist.add(Reel1);
        Reellist.add(Reel2);
        Reellist.add(Reel3);
        Reellist.add(Reel4);
        Reellist.add(Reel5);

        int num1 = random.nextInt(Reel1.size());
        int num2 = random.nextInt(Reel2.size());
        int num3 = random.nextInt(Reel3.size());
        int num4 = random.nextInt(Reel4.size());
        int num5 = random.nextInt(Reel5.size());

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);

//        System.out.println("Base:- ");
//        System.out.println(Reel1.get(num1)+" , "+Reel2.get(num2)+" , "+Reel3.get(num3)+" , "+Reel4.get(num4)+" , "+Reel5.get(num5));

        for (int j = 0; j < 5; j++) {
            int rnd = numbers.get(j);
            ArrayList innerList = Reellist.get(j);
        
            for (int i =0 ; i < 5; i++) {
                if(i == 3 && (j == 0 || j == 4)) break;
                if(i == 4 && (j == 1 || j == 3)) break;
                matrix[i][j] = innerList.get((rnd + i) % innerList.size()).toString();
            }
            // System.out.println(rnd);
        }

        return matrix;
    }
    public static String[][] freeMatrixCreation() {
        String[][] matrix = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = "  ";
            }
        }
        ArrayList<String> Reel1 = new ArrayList<>();
        ArrayList<String> Reel2 = new ArrayList<>();
        ArrayList<String> Reel3 = new ArrayList<>();
        ArrayList<String> Reel4 = new ArrayList<>();
        ArrayList<String> Reel5 = new ArrayList<>();

        Reel1.addAll(Arrays.asList("H5","H5","H5","H5","H6","H4","H3","H5","H4","H6","H4","H4","H4","H5","H4","H5","H4","H5","H6","H4","H5","H3","H5","H6","H6","H6","H6","H5","H6","H5","H6","H5"));
        Reel2.addAll(Arrays.asList("H4","H3","H2","H4","H3","H2","H1","H2","H3","H5","H3","H3","H2","H2","H4","H6","H3","H2","H3","H3","H3","H2","H2","H1","H4","H1","H4","WC","H2","H2","H1","H1","H2"));
        Reel3.addAll(Arrays.asList("H5","H4","WC","H6","H5","H4","H2","H2","H2","H6","H1","H5","H2","H5","H3","H5","H2","H5","H6","H6","H5","H6","H2","H5","H6","H5","H6","H2","H6","H2","H6"));
        Reel4.addAll(Arrays.asList("H6","H2","H4","H3","H4","H2","H2","H3","H2","H4","H2","H2","H3","H2","H5","H2","H4","H1","H1","H2","H3","H2","H1","H4","H2","H4","H3","H2","H4","H2","H2","H3","H2","H2","H1","H2","H4","H4"));
        Reel5.addAll(Arrays.asList("H5","H4","H3","H2","WC","H4","H5","H4","H2","H2","H5","H3","H5","H4","H3","H2","H3","H5","H3","H4","H3","H3","H2","H2","H4","H3","H2","H1","H1","H2","H2","H1","H3","H2","H2","H6","H6","H6","H6","H5","H6"));

        
        System.out.println(Reel1.size()+" "+Reel2.size()+" "+Reel3.size()+" "+Reel4.size()+" "+Reel5.size());
       
       

        ArrayList<ArrayList> Reellist = new ArrayList<>();
        Reellist.add(Reel1);
        Reellist.add(Reel2);
        Reellist.add(Reel3);
        Reellist.add(Reel4);
        Reellist.add(Reel5);

        int num1 = random.nextInt(Reel1.size());
        int num2 = random.nextInt(Reel2.size());
        int num3 = random.nextInt(Reel3.size());
        int num4 = random.nextInt(Reel4.size());
        int num5 = random.nextInt(Reel5.size());

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);

//        System.out.println("Base:- ");
//        System.out.println(Reel1.get(num1)+" , "+Reel2.get(num2)+" , "+Reel3.get(num3)+" , "+Reel4.get(num4)+" , "+Reel5.get(num5));

        for (int j = 0; j < 5; j++) {
            int rnd = numbers.get(j);
            ArrayList innerList = Reellist.get(j);

            for (int i =0 ; i < 5; i++) {
                if(i == 3 && (j == 0 || j == 4)) break;
                if(i == 4 && (j == 1 || j == 3)) break;
                matrix[i][j] = innerList.get((rnd + i) % innerList.size()).toString();
            }
            // System.out.println(rnd);
        }

        return matrix;
    }
    public static String[][] reSpinMatrixCreation() {

        String[][] matrix = new String[3][5];
        

        String Reel1[] = {"L1","L4","H2","L3","L1","L1","L2","L4","L2","L3","H4","L2","H3","L6","L4","L3","H1","L2","L3","L3","L4","L3","L3","H4","L2","L4","L2","L3","L5","L4","L5","L5","L1","L1","L5","L5","L2","L6","L1","L1","L5","L5","L3","L3","L3","L3","L3","L3","L3"};
        String Reel2[] = {"H2","L3","L1","H4","L2","WC","H4","L1","L2","L3","L2","L1","L3","H1","L1","L3","L3","H3","H4","L1","H3","L3","H3","H1","L1","L2","L3","H2","H4","L2","L3","H3","L2","L6","L5","WC","L6","L5","L2","L5","L6","L1","L1","L2","L2","L2","L2"};
        String Reel3[] = {"L4","L1","H1","H3","L4","L6","L3","L2","L1","H4","L4","L1","L6","H1","L3","L4","L6","L1","H3","L4","H4","H3","L4","L1","H3","L1","H3","H2","H4","H4","L2","L1","H3","H4","H2","L6","L5","L6","L5","L5","L5","L5","L5","H1","L1","L4","L4","L4","L4"};
        String Reel4[] = {"L3","L4","H3","H4","H1","L3","L1","H2","H4","L3","L2","H3","L1","L4","H1","H3","L1","L1","H2","L2","L4","H4","L3","L2","H4","H3","L2","L4","L2","L1","H4","H1","L1","H2","H3","L1","H4","H3","L2","L3","H4","L3","L3","WC"};
        String Reel5[] = {"L2","H3","L1","L3","L2","H4","H2","L1","L2","L4","H2","L1","H1","L3","H3","H2","L1","L4","L3","H1","H2","L4","L3","L1","L2","H3","H4","L4","L2","H3","L3","H1","H2","H3","L2","H4","L3","L4","H1","H4","L1","H1","H2","H4","L4","H1","L3","L2","L4","H2","H4"};

        int num1 = random.nextInt(Reel1.length);
        int num2 = random.nextInt(Reel2.length);
        int num3 = random.nextInt(Reel3.length);
        int num4 = random.nextInt(Reel4.length);
        int num5 = random.nextInt(Reel5.length);
        System.out.println(Reel1.length+" "+Reel2.length+" "+Reel3.length+" "+Reel4.length+" "+Reel5.length);

        matrix[0][0] = Reel1[num1];
        matrix[0][1] = Reel2[num2];
        matrix[0][2] = Reel3[num3];
        matrix[0][3] = Reel4[num4];
        matrix[0][4] = Reel5[num5];

        matrix[1][0] = Reel1[(num1 + 1) % Reel1.length];
        matrix[1][1] = Reel2[(num2 + 1) % Reel2.length];
        matrix[1][2] = Reel3[(num3 + 1) % Reel3.length];
        matrix[1][3] = Reel4[(num4 + 1) % Reel4.length];
        matrix[1][4] = Reel5[(num5 + 1) % Reel5.length];

        matrix[2][0] = Reel1[(num1 + 2) % Reel1.length];
        matrix[2][1] = Reel2[(num2 + 2) % Reel2.length];
        matrix[2][2] = Reel3[(num3 + 2) % Reel3.length];
        matrix[2][3] = Reel4[(num4 + 2) % Reel4.length];
        matrix[2][4] = Reel5[(num5 + 2) % Reel5.length];

        return matrix;
    }

    public static void printMatrix (String[][] matrix){

        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static int win_fun(String[][] matrix) {

        int final_win = 0;

        String all_symbol[] = { "WC", "H1", "H2", "H3", "H4", "L1", "L2", "L3", "L4", "L5", "L6", "SC", "BO" };
        int[] pay_5         = {  0,   200,  170,  140,  100,   90,   80,   70,   60,   30,   25,   0,    0   };
        int[] pay_4         = {  0,   180,  150,  120,  90,    75,   60,   65,   35,   25,   20,   0,    0   };
        int[] pay_3         = {  0,   160,  135,  100,  75,    40,   30,   35,   20,   20,   15,   0,    0   };

//        System.out.println("base matrix is :- ");
//        printMatrix(matrix);


        String FirstSymbol = matrix[0][0];
        String SecondSymbol = matrix[1][0];
        String ThirdSymbol = matrix[2][0];

//        System.out.println("FirstSymbol:- "+ FirstSymbol+ " , SecondSymbol:- "+SecondSymbol+ " , ThirdSymbol:- "+ThirdSymbol);

        int[] ColumnCount_1 = new int[5];
        int[] ColumnCount_2 = new int[5];
        int[] ColumnCount_3 = new int[5];

        for (int i = 0; i < 5; i++) {
            int FirstSymbolCount = 0;
            int SecondSymbolCount = 0;
            int ThirdSymbolCount = 0;

            for (int j = 0; j < 5; j++) {
                if (Objects.equals(matrix[j][i], FirstSymbol) || matrix[j][i] == "WC") {
                    FirstSymbolCount++;
                    ColumnCount_1[i] = FirstSymbolCount;
                }
                if (Objects.equals(matrix[j][i], SecondSymbol) || matrix[j][i] == "WC") {
                    SecondSymbolCount++;
                    ColumnCount_2[i] = SecondSymbolCount;
                }
                if (Objects.equals(matrix[j][i], ThirdSymbol) || matrix[j][i] == "WC") {
                    ThirdSymbolCount++;
                    ColumnCount_3[i] = ThirdSymbolCount;
                }
            }
        }
        int product1 = 1; int product2 = 1; int product3 = 1;
        int count_1 = 0; int count_2 = 0; int count_3 = 0;

        for (int i = 0; i < 5; i++) {
            if (ColumnCount_1[i] != 0) {
                product1 *= ColumnCount_1[i];
                count_1++;
            } else
                break;
        }
        for (int i = 0; i < 5; i++) {
            if (ColumnCount_2[i] != 0) {
                product2 *= ColumnCount_2[i];
                count_2++;
            } else
                break;
        }
        for (int i = 0; i < 5; i++) {
            if (ColumnCount_3[i] != 0) {
                product3 *= ColumnCount_3[i];
                count_3++;
            } else
                break;
        }
        if (FirstSymbol == SecondSymbol || FirstSymbol == ThirdSymbol)
            product1 = 0;
        if (SecondSymbol == ThirdSymbol)
            product2 = 0;

        if (count_1 >= 3 || count_2 >= 3 || count_3 >= 3) {
            for (int i = 0; i < all_symbol.length; i++) {
                if (all_symbol[i] == FirstSymbol) {
                    if (count_1 == 3) {
                        final_win += (pay_3[i] * product1);
                    }
                    if (count_1 == 4) {
                        final_win += (pay_4[i] * product1);
                    }
                    if (count_1 == 5) {
                        final_win += (pay_5[i] * product1);
                    }
                }
                if (all_symbol[i] == SecondSymbol) {
                    if (count_2 == 3) {
                        final_win += (pay_3[i] * product2);
                    }
                    if (count_2 == 4) {
                        final_win += (pay_4[i] * product2);
                    }
                    if (count_2 == 5) {
                        final_win += (pay_5[i] * product2);
                    }
                }
                if (all_symbol[i] == ThirdSymbol) {
                    if (count_3 == 3) {
                        final_win += (pay_3[i] * product3);
                    }
                    if (count_3 == 4) {
                        final_win += (pay_4[i] * product3);
                    }
                    if (count_3 == 5) {
                        final_win += (pay_5[i] * product3);
                    }
                }
            }
        }

//        System.out.println("Count1:- "+ count_1+ ", Count2:- "+ count_2 + ", Count3:- "+ count_3);
        return final_win;
    }
    public static int win_fun_free(String[][] matrix) {

        int final_win = 0;

        String all_symbol[] = { "WC", "H1", "H2", "H3", "H4", "H5", "H6" };
        int[] pay_5         = {  0,   200,  170,  140,  100,   90,   80  };
        int[] pay_4         = {  0,   180,  150,  120,  90,    75,   60  };
        int[] pay_3         = {  0,   160,  135,  100,  75,    40,   30  };

//        System.out.println("base matrix is :- ");
//        printMatrix(matrix);


        String FirstSymbol = matrix[0][0];
        String SecondSymbol = matrix[1][0];
        String ThirdSymbol = matrix[2][0];

//        System.out.println("FirstSymbol:- "+ FirstSymbol+ " , SecondSymbol:- "+SecondSymbol+ " , ThirdSymbol:- "+ThirdSymbol);

        int[] ColumnCount_1 = new int[5];
        int[] ColumnCount_2 = new int[5];
        int[] ColumnCount_3 = new int[5];

        for (int i = 0; i < 5; i++) {
            int FirstSymbolCount = 0;
            int SecondSymbolCount = 0;
            int ThirdSymbolCount = 0;

            for (int j = 0; j < 5; j++) {
                if (Objects.equals(matrix[j][i], FirstSymbol) || matrix[j][i] == "WC") {
                    FirstSymbolCount++;
                    ColumnCount_1[i] = FirstSymbolCount;
                }
                if (Objects.equals(matrix[j][i], SecondSymbol) || matrix[j][i] == "WC") {
                    SecondSymbolCount++;
                    ColumnCount_2[i] = SecondSymbolCount;
                }
                if (Objects.equals(matrix[j][i], ThirdSymbol) || matrix[j][i] == "WC") {
                    ThirdSymbolCount++;
                    ColumnCount_3[i] = ThirdSymbolCount;
                }
            }
        }
        int product1 = 1; int product2 = 1; int product3 = 1;
        int count_1 = 0; int count_2 = 0; int count_3 = 0;

        for (int i = 0; i < 5; i++) {
            if (ColumnCount_1[i] != 0) {
                product1 *= ColumnCount_1[i];
                count_1++;
            } else
                break;
        }
        for (int i = 0; i < 5; i++) {
            if (ColumnCount_2[i] != 0) {
                product2 *= ColumnCount_2[i];
                count_2++;
            } else
                break;
        }
        for (int i = 0; i < 5; i++) {
            if (ColumnCount_3[i] != 0) {
                product3 *= ColumnCount_3[i];
                count_3++;
            } else
                break;
        }
        if (FirstSymbol == SecondSymbol || FirstSymbol == ThirdSymbol)
            product1 = 0;
        if (SecondSymbol == ThirdSymbol)
            product2 = 0;

        if (count_1 >= 3 || count_2 >= 3 || count_3 >= 3) {
            for (int i = 0; i < all_symbol.length; i++) {
                if (all_symbol[i] == FirstSymbol) {
                    if (count_1 == 3) {
                        final_win += (pay_3[i] * product1);
                    }
                    if (count_1 == 4) {
                        final_win += (pay_4[i] * product1);
                    }
                    if (count_1 == 5) {
                        final_win += (pay_5[i] * product1);
                    }
                }
                if (all_symbol[i] == SecondSymbol) {
                    if (count_2 == 3) {
                        final_win += (pay_3[i] * product2);
                    }
                    if (count_2 == 4) {
                        final_win += (pay_4[i] * product2);
                    }
                    if (count_2 == 5) {
                        final_win += (pay_5[i] * product2);
                    }
                }
                if (all_symbol[i] == ThirdSymbol) {
                    if (count_3 == 3) {
                        final_win += (pay_3[i] * product3);
                    }
                    if (count_3 == 4) {
                        final_win += (pay_4[i] * product3);
                    }
                    if (count_3 == 5) {
                        final_win += (pay_5[i] * product3);
                    }
                }
            }
        }

//        System.out.println("Count1:- "+ count_1+ ", Count2:- "+ count_2 + ", Count3:- "+ count_3);
        return final_win;
    }
    public static int win_fun_respin(String[][] matrix) {

        int final_win = 0;

        String all_symbol[] = { "WC", "H1", "H2", "H3", "H4", "L1", "L2", "L3", "L4", "L5", "L6", "SC", "BO" };
        int[] pay_5         = {  0,   200,  170,  140,  100,   90,   80,   70,   60,   30,   25,   0,    0   };
        int[] pay_4         = {  0,   180,  150,  120,  90,    75,   60,   65,   35,   25,   20,   0,    0   };
        int[] pay_3         = {  0,   160,  135,  100,  75,    40,   30,   35,   20,   20,   15,   0,    0   };

        String FirstSymbol  = matrix[0][0];
        String SecondSymbol = matrix[1][0];
        String ThirdSymbol  = matrix[2][0];

        int[] ColumnCount_1= new int[6];
        int[] ColumnCount_2= new int[6];
        int[] ColumnCount_3= new int[6];



        for(int i=0; i<5; i++){
            int FirstSymbolCount=0; int SecondSymbolCount=0;  int ThirdSymbolCount=0; int FourthSymbolCount=0; int FifthSymbolCount=0; int SixthSymbolCount=0;

            for(int j=0; j<3; j++){
                if(matrix[j][i]==FirstSymbol  || matrix[j][i]=="WC") {FirstSymbolCount++  ;  ColumnCount_1[i]= FirstSymbolCount  ;  };
                if(matrix[j][i]==SecondSymbol || matrix[j][i]=="WC") {SecondSymbolCount++ ;  ColumnCount_2[i]= SecondSymbolCount ;  };
                if(matrix[j][i]==ThirdSymbol  || matrix[j][i]=="WC") {ThirdSymbolCount++  ;  ColumnCount_3[i]= ThirdSymbolCount  ;  };

            }
        }

        int product1=1; int product2=1; int product3=1; int product4=1;
        int count_1=0;  int count_2=0;  int count_3=0;  int count_4=0;
        for( int i=0; i<5;i++){
            if(ColumnCount_1[i]!=0) {
                product1*=ColumnCount_1[i];
                count_1++; }
            else break;
        }

        for( int i=0; i<5;i++){
            if(ColumnCount_2[i]!=0) {
                product2*=ColumnCount_2[i];
                count_2++; }
            else break;
        }

        for( int i=0; i<5;i++){
            if(ColumnCount_3[i]!=0) {
                product3*=ColumnCount_3[i];
                count_3++; }
            else break;
        }


        if(FirstSymbol  == SecondSymbol || FirstSymbol  == ThirdSymbol ) product1=0;
        if(SecondSymbol == ThirdSymbol) product2=0;



        if(count_1>=3 || count_2>=3 || count_3>=3 || count_4>=3 ){

            for(int i=0; i<all_symbol.length; i++){

                if(all_symbol[i]==FirstSymbol){
                    if(count_1==3){ final_win+= (pay_3[i]*product1); }
                    if(count_1==4){ final_win+= (pay_4[i]*product1); }
                    if(count_1==5){ final_win+= (pay_5[i]*product1); }

                }
                if(all_symbol[i]==SecondSymbol){
                    if(count_2==3){ final_win += (pay_3[i]*product2); }
                    if(count_2==4){ final_win += (pay_4[i]*product2); }
                    if(count_2==5){ final_win += (pay_5[i]*product2); }

                }
                if(all_symbol[i]==ThirdSymbol){
                    if(count_3==3){ final_win += (pay_3[i]*product3); }
                    if(count_3==4){ final_win += (pay_4[i]*product3); }
                    if(count_3==5){ final_win += (pay_5[i]*product3); }

                }
            }

        }

        return final_win;

    }
    public static int symbolCount(String[][] matrix, String symbol){

        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(Objects.equals(matrix[i][j], symbol)) count ++;
            }
        }
        return count;
    }
//    public static String[][] modifyColumn(String[][] matrix) {
//        String[] highSymbols = {"H1", "H2", "H3", "H4", "H5", "H6"};
//        Random random = new Random();
//
//        // Randomly select a column index (0 to 4)
//        int column = random.nextInt(5);
//        // Randomly select a high symbol
//        String symbol = highSymbols[random.nextInt(highSymbols.length)];
//
//        // Fill the selected column with the chosen symbol
//        for (int row = 0; row < matrix.length; row++) {
//            matrix[row][column] = symbol;
//        }
//
//        return matrix;
//    }
    public static String[][] modifyColumn(String[][] matrix) {
        Random random = new Random();

        // Randomly select a column index based on the given weights
        int columnRandom = random.nextInt(26);
        int column;
        if (columnRandom < 1) {
            column = 0;
        } else if (columnRandom < 2) {
            column = 1;
        } else if (columnRandom < 8) {
            column = 2;
        } else if (columnRandom < 16) {
            column = 3;
        } else {
            column = 4;
        }

        // Randomly select a high symbol based on the given weights
        int symbolRandom = random.nextInt(82);
        String symbol;
        if (symbolRandom < 18) {
            symbol = "H1";
        } else if (symbolRandom < 26) {
            symbol = "H2";
        } else if (symbolRandom < 36) {
            symbol = "H3";
        } else if (symbolRandom < 48) {
            symbol = "H4";
        } else if (symbolRandom < 66) {
            symbol = "H5";
        } else {
            symbol = "H6";
        }

        // Fill the selected column with the chosen symbol
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][column] = symbol;
        }

        return matrix;
    }

    public static void ReSpinFeature(String[][] matrix, int spin){

        if     (spin == 1) matrix[0][2]="WC";
        else if(spin == 2) matrix[1][2]="WC";
        else               matrix[2][2]="WC";
    }

    public static void main(String[] args) {

        int bet = 30;
        BigDecimal total_bet = BigDecimal.ZERO;
        BigDecimal base_win = BigDecimal.ZERO;
        BigDecimal reSpin_win = BigDecimal.ZERO;
        BigDecimal freeWin = BigDecimal.ZERO;
        BigDecimal free_fea = BigDecimal.ZERO;
        BigDecimal total_baseWin = BigDecimal.ZERO;
        BigDecimal total_reSpinWin = BigDecimal.ZERO;
        BigDecimal total_freeWin = BigDecimal.ZERO;
        System.out.println("free matrix");
        freeMatrixCreation();


        System.out.println("Spin matrix");
        reSpinMatrixCreation();
        for(int x =0; x< 1; x++){
            total_bet = total_bet.add(BigDecimal.valueOf(bet));
            String[][] base_matrix = baseMatrixCreation();
            base_win = BigDecimal.valueOf(win_fun(base_matrix));
            total_baseWin = total_baseWin.add(base_win);

            //======================================= Re Spin ==========================================================
            int bonusCount = symbolCount(base_matrix, "BO");
            if(bonusCount >= 3)bnshits++;
            int respin =0;
            if      (bonusCount == 3) respin = 3;
            else if (bonusCount == 4) respin = 3;
            else if (bonusCount == 5) respin = 3;
            for (int i = 0; i <respin ; i++) {
                String[][] reSpin_matrix = reSpinMatrixCreation();
                ReSpinFeature(reSpin_matrix, i);
                reSpin_win = BigDecimal.valueOf(win_fun_respin(reSpin_matrix));
                total_reSpinWin = total_reSpinWin.add(reSpin_win);
            }

            //======================================= Free Spin ========================================================
            int scatterCount = symbolCount(base_matrix, "SC");
            if (scatterCount >= 3) sc3hits++;
            int freeSpin = 0;
            if      (scatterCount == 3) freeSpin = 5;
            else if (scatterCount == 4) freeSpin = 8;
            else if (scatterCount == 5) freeSpin = 12;

            for (int q = 0; q < freeSpin; q++) {
                String[][] freeMatrix = freeMatrixCreation();
                modifyColumn(freeMatrix);
                freeWin = BigDecimal.valueOf(win_fun_free(freeMatrix));
                total_freeWin = total_freeWin.add(freeWin);
            }

            if (x % 1000000 == 0) {
                Base_rtp = total_baseWin.divide(total_bet, 8, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
                reSpin_rtp = total_reSpinWin.divide(total_bet, 8, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
                Free_rtp = total_freeWin.divide(total_bet, 8, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
                total_rtp = Base_rtp.add(reSpin_rtp).add(Free_rtp);

                System.out.println("SRLK_SCRTS95 Cycle: " + x + " total rtp: " + total_rtp + " Base rtp: " + Base_rtp + " Free rtp: " + Free_rtp + " ReSpin rtp: " + reSpin_rtp);
                if (sc3hits != 0) System.out.println("scatter hits    " + x / sc3hits);
                if (bnshits != 0) System.out.println("bnshits     " + x / bnshits);
            }
        }
    }
}


// SRLK_SCRTS95 Cycle: 999000000 total rtp: 95.51665300 Base rtp: 45.42394600 Free rtp: 40.00420400 ReSpin rtp: 10.08850300
// scatter hits    55.16596395867865
// bnshits     97.4496480887383
// SRLK_SCRTS95 Cycle: 1000000000 total rtp: 95.51684800 Base rtp: 45.42396200 Free rtp: 40.00426800 ReSpin rtp: 10.08861800
// scatter hits    55.16562347553247
// bnshits     97.44946490011576
