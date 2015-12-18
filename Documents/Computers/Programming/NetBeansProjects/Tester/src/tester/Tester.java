/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.io.*;
import java.util.Scanner;

/**
 * These are answers to a series of questions available at https://projecteuler.net/archives
 * @author Ari
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //prob1(1000);
        //prob2(4000000);
        //prob3(600851475143L);
        //prob4(3);
        //prob5(20);
        //prob6(100);
        //prob7(10001);//Slow
        //prob8(13);
        //prob9(1000);
        //prob10(2000000);
        //prob11(4);
        //prob12(500);
        //prob13(10);
        //prob14(1000000);//inefficient
        //prob15(20);//no formula
        //prob16(2, 100000);//takes a long time
        //prob17(1000);
        //prob18();
        //prob19(1901, 2000);
        //prob20(100);
        //prob21(10000);
        //prob22("names.txt");//need to know how to import files 
        //prob23(28123);//slow
        //prob24("0123456789", 1000000);
        //prob25(1000);
        //prob26(1000);
        //prob27(1000);
        //prob28(1001);
        //prob29(100);
        //prob30();
       // prob31(200);
        //hello_world(); 
    }
    public static void prob1(int z)/*15-02-16*/ {
        int E = 0;
        for (int i = 0; i < z; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                E += i;
            }
        }
        System.out.println("001: " + E);
    }

    public static void prob2(int z) /*15-02-16*/ {
        int E = 0, fib1 = 1, fib2 = 1, fibR = fib1 + fib2;

        do {
            
            if (fibR % 2 == 0) {
                E += fibR;
            }
            fib1 = fib2;
            fib2 = fibR;
            fibR = fib1 + fib2;
        } while (fibR < z);

        System.out.println("002: " + E);
    }

    public static void prob3(long z)/*15-02-16*/ {
        long counter = 2;
        while (counter != z) {
            if (z % counter == 0) {
                z = z / counter;
            } else {
                counter++;
            }
        }
        System.out.println("003: " + counter);
    }

    public static void prob4(int z) /*15-02-16*/ {
        int num, holder = 0;
        boolean palindrome;
        for (int i = (int) Math.pow(10, z) - 1; i > 1; i--) {
            for (int j = (int) Math.pow(10, z) - 1; j > 1; j--) {
                if (i * j > holder) {
                    num = (int) (Math.log10(i) + Math.log10(j)) + 1;
                    palindrome = true;
                    for (int k = 1; k <= num / 2; k++) {
                        if ((int) (i * j / Math.pow(10, k - 1) % 10) != (int) (i * j / Math.pow(10, num - k) % 10)) {
                            palindrome = false;
                        }
                    }
                    if (palindrome == true) {
                        holder = i * j;
                    }
                }
            }
        }
        System.out.println("004: " + holder);
    }

    public static void prob5(int z)/*15-02-16*/ {
        long num = 1;
        int[] factor = new int[z];
        int counter = 0;
        boolean prime;
        for (int i = 2; i <= z; i++) {
            if (num % i != 0) {
                prime = false;
                for (int j = 0; j < counter; j++) {
                    if (i % factor[j] == 0) {
                        num = num * factor[j];
                        prime = true;
                        break;
                    }
                }
                if (prime == true) {
                } else {
                    factor[counter] = i;
                    counter++;
                    num = num * i;
                }
            }
        }
        System.out.println("005: " + num);
    }

    public static void prob6(int z)/*15-02-16*/ {
        long sumOfInts = z * (z + 1) / 2;
        long sumOfIntSquares = z * (2 * z + 1) * (z + 1) / 6;
        System.out.println("006: " + (sumOfIntSquares - sumOfInts));
    }

    public static void prob7(int z)/*15-02-17*/ {

        long[] primes = new long[z];
        long number = 1;
        int counter = 0;
        boolean isPrime;
        while (counter < z) {
            number++;
            isPrime = true;
            for (int i = 0; i < counter; i++) {
                if (number % primes[i] == 0) {
                    isPrime = false;
                    //number is not
                }
            }
            if (isPrime == true) {
                primes[counter] = number;
                counter++;
            }
        }
        counter--;
        System.out.println("007: " + primes[counter]);
    }

    public static void prob8(int z)/*15-02-17*/ {
        String number = "731671765313306249192251196744265747423553491949349698"
                + "352031277450632623957831801698480186947885184385861560789112"
                + "949495459501737958331952853208805511125406987471585238630507"
                + "156932909632952274430435576689664895044524452316173185640309"
                + "871112172238311362229893423380308135336276614282806444486645"
                + "238749303589072962904915604407723907138105158593079608667017"
                + "242712188399879790879227492190169972088809377665727333001053"
                + "367881220235421809751254540594752243525849077116705560136048"
                + "395864467063244157221553975369781797784617406495514929086256"
                + "932197846862248283972241375657056057490261407972968652414535"
                + "100474821663704844031998900088952434506585412275886668811642"
                + "717147992444292823086346567481391912316282458617866458359124"
                + "566529476545682848912883142607690042242190226710556263211111"
                + "093705442175069416589604080719840385096245544436298123098787"
                + "992724428490918884580156166097919133875499200524063689912560"
                + "717606058861164671094050775410022569831552000559357297257163"
                + "6269561882670428252483600823257530420752963450";
        int[] adjacent = new int[z], higher = new int[z];
        long testRunner, highRunner = 1;
        for (int i = 0; i < z; i++) {
            higher[i] = Character.getNumericValue(number.charAt(i));
            highRunner *= higher[i];
        }
        for (int i = 1; i <= number.length() - z; i++) {
            testRunner = 1;
            for (int j = 0; j < z; j++) {
                adjacent[j] = Character.getNumericValue(number.charAt(i + j));
                testRunner *= adjacent[j];
            }
            if (testRunner > highRunner) {
                highRunner = testRunner;
                for (int j = 0; j < z; j++) {
                    higher[j] = Character.getNumericValue(number.charAt((i + j)));
                }
            }
        }
        System.out.println("008: " + highRunner);
    }

    public static void prob9(int z)/*15-02-17*/ {
        for (int i = 3; i <= z - 2; i++) {
            for (int j = 2; j < i; j++) {
                for (int k = 1; k < i; k++) {
                    if (i + j + k == 1000 && Math.pow(k, 2) + Math.pow(j, 2)
                            == Math.pow(i, 2) && i > j && j > k) {
                        System.out.println("009: " + i * j * k);
                    }
                }
            }
        }
    }

    public static void prob10(int z)/*15-02-17*/ {

        //updated with sieve 15-03-02
        long sum = 0;
        boolean[] isPrime = new boolean[z + 1];
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= z; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= z; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                sum += i;
                for (int j = 2; j * i <= z; j++) {
                    isPrime[j * i] = false;
                }
            }
        }

        /*long[] primes = new long[z];
         long number = 1, sum = 0;
         int counter = 0;
         boolean isPrime;
         while (number < z) {
         number++;
         isPrime = true;
         for (int i = 0; i < counter; i++) {
         if (number % primes[i] == 0) {
         isPrime = false;
         break;
         //number is not
         }
         }
         if (isPrime == true) {
         primes[counter] = number;
         sum += number;
         counter++;
         }

         }*/
        System.out.println("010: " + sum);
    }

    public static void prob11(int z) /*15-02-17*/ {
        String grid = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91"
                + " 08 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62"
                + " 00 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36"
                + " 65 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36"
                + " 91 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13"
                + " 80 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12"
                + " 50 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64"
                + " 70 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94"
                + " 21 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63"
                + " 72 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33"
                + " 95 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56"
                + " 92 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85"
                + " 57 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17"
                + " 58 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55"
                + " 40 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98"
                + " 66 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53"
                + " 69 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76"
                + " 36 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36"
                + " 16 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05"
                + " 54 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
        int[][] element = new int[20][20];
        int counter = 0, temp, max = 0;
        for (int i = 0; i <= 19; i++) {
            for (int j = 0; j <= 19; j++) {
                element[i][j] = Integer.parseInt(grid.substring(counter,
                        counter + 2));
                counter = counter + 3;
            }
        }
        for (int i = 0; i <= 20 - z; i++) {
            for (int j = 0; j <= 20 - z; j++) {
                temp = element[i + 0][j + 0] * element[i + 1][j + 0]
                        * element[i + 2][j + 0] * element[i + 3][j + 0];
                if (temp > max) {
                    max = temp;
                }
                temp = element[i + 0][j + 0] * element[i + 0][j + 1]
                        * element[i + 0][j + 2] * element[i + 0][j + 3];
                if (temp > max) {
                    max = temp;
                }
                temp = element[i + 0][j + 0] * element[i + 1][j + 1]
                        * element[i + 2][j + 2] * element[i + 3][j + 3];
                if (temp > max) {
                    max = temp;
                }
                temp = element[i + 0][j + 3] * element[i + 1][j + 2]
                        * element[i + 2][j + 1] * element[i + 3][j + 0];
                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println("011: " + max);
    }

    public static void prob12(int z)/*15-02-17*/ {
        long triangleNumber = 0, factorCounter, loopCounter = 0, secondCounter = 0;
        do {
            loopCounter++;
            triangleNumber = loopCounter * (loopCounter + 1) / 2;
            factorCounter = 2;
            for (int i = 2; i <= Math.sqrt(triangleNumber); i++) {
                if (triangleNumber % i == 0) {
                    factorCounter += 2;
                }
            }
        } while (factorCounter < z);
        System.out.println("012: " + triangleNumber);
    }

    public static void prob13(int z)/*15-02-18*/ {
        String line = "37107287533902102798797998220837590246510135740250463769"
                + "376774900097126481248969700780504170182605387432498619952474"
                + "105947423330951305812372661730962991942213363574161572522430"
                + "563301811072406154908250230675882075393461711719803104210475"
                + "137780632466768926167069662363382013637841838368417873436172"
                + "675728112879812849979408065481931592621691275889832738442742"
                + "289174325203219235894228767964876702721893184745144573600130"
                + "643909116721685684458871160315327670386486105843025439939619"
                + "828917593665686757934951621764571418565606295021572231965867"
                + "550793241933316490635246274190492910143244581382266334794475"
                + "817892575867718337217661963751590579239728245598838407582035"
                + "653253593990084026335689488301894586282278288018119938482628"
                + "201427819413994056758715117009439035398664372827112653829987"
                + "240784473053190104293586865155060062958648615320752733719591"
                + "914205172558297169388870771546649911559348760353292171497005"
                + "693854370070576826684624621495650076471787294438377604532826"
                + "541087568284431911906346940378552177792951453612327252500029"
                + "607107508256381565671088525835072145876576172410976447339110"
                + "607218265236877223636045174237069058518606604482076212098132"
                + "878607339694128114266041808683061932846081119106155694051268"
                + "969251934325451728388641918047049293215058642563049483624672"
                + "216484350762017279180399446930047329563406911573244438690812"
                + "579451408905770622942919710792820955037687525678773091862540"
                + "744969844508330393682126183363848253301546861961243487676812"
                + "975343759465158038628759287849020152168555482871720121925776"
                + "695478182833757993103614740356856449095527097864797581167263"
                + "201004368978425535399209318374414978068609844840309812907779"
                + "179908821879532736447567559084803087086987551392711854517078"
                + "544161852424320693150332599594068957565367821070749269665376"
                + "763262354472106979395067965269474259770973916669376304263398"
                + "708541052684708299085211399427365734116182760315001271653786"
                + "073615010808570091499395125570281987460043753582903531743471"
                + "732693212357815498262974255273730794953759765105305946966067"
                + "683156574377167401875275889028025717332296191766687138199318"
                + "110487701902712526768027607800301367868099252546340106163286"
                + "652636270218540497705585629946580636237993140746255962240744"
                + "869082311749777923654662572469233228109171419143028819710328"
                + "859780666976089293863828502533340334413065578016127815921815"
                + "005561868836468420090470230530811728164304876237919698424872"
                + "550366387845831148769693215490281042402013833512446218144177"
                + "347063783299490636259666498587618221225225512486764533677201"
                + "869716985443124195724099139590089523100588229554825530026352"
                + "078153229679624948164195386821877476085327132285723110424803"
                + "456124867697064507995236377742425354112916842768655389262050"
                + "249103265729672370191327572567528565324825826546309220705859"
                + "652229798860272258331913126375147341994889534765745501184957"
                + "014548792889848568277260777137214037988797153829820378303147"
                + "352772158034814451349137322665138134829543829199918180278916"
                + "522431027392251122869539409579530664052326325380441000596549"
                + "391598795936352974615218550237130764225512118369380358038858"
                + "490341698116222072977186158236678424689157993532961922624679"
                + "571944012690438771072750481023908955235974572318970677254791"
                + "506150550495392297953090112996751986188088225875314529584099"
                + "251203829009407770775672113067397083047244838165338735023408"
                + "456470580773088295917476714036319800818712901187549131054712"
                + "658197623331044818386269515456334926366572897563400500428462"
                + "801835170705278318394258821455212272512503275512160354698120"
                + "058176216521282765275169129689778932238195734329339946437501"
                + "907836945765883352399886755061649651847751807381688378610915"
                + "273579297013376217784275219262340194239963916804498399317331"
                + "273132924185707147349566916674687634660915035914677504995186"
                + "714302352196288948901024233251169136196266227326746080059154"
                + "747183079839286853520694694454072476841822524674417161514036"
                + "427982273348055556214818971426179103425986472045168939894221"
                + "798260880768528778364618279934631376775430780936333301898264"
                + "209010848802521674670883215120185883543223812876952786713296"
                + "124747824645386369930090493103636197638780396218407357239979"
                + "422340623539380833965132740801111666627891981488087797941876"
                + "876144230030984490851411606618262936828367647447792391803351"
                + "109890697907148578694408955299065364044742557608365997664579"
                + "509666024396409905389607120198219976047599490197230297649139"
                + "826800329731560371200413779037855660850892521673093931987275"
                + "027546890690370753941304265231501194809377245048795150954100"
                + "921645863754710598436791786391670211874924319957006419179697"
                + "775990283006991536871371193661495281130587638027841075444973"
                + "307840789923115535562561142322423255033685442488917353448899"
                + "115014406480203690680639606723221932041495354150312888033953"
                + "605329934036800697771065056663195481234880673210146739058568"
                + "557934581403627822703280826165707739483275922328459417065250"
                + "945123252306082291880205877731971983945018088807242966198081"
                + "119777158542502016545090413245809786882778948721859617721078"
                + "384350691861554356628840622574736922845095162084960398013400"
                + "172393067166682355524525280460972253503534226472524250874054"
                + "075591789781264330331690";
        String[] numbers = new String[100], start = new String[z];
        int runner = 0;
        for (int i = 0; i < z; i++) {
            start[i] = "0";
        }
        for (int i = 0; i < 100; i++) {
            numbers[i] = line.substring(i * 50, i * 50 + 50);
        }
        for (int i = 49; i >= 0; i--) {
            runner = runner / 10;
            for (int j = 0; j < 100; j++) {
                runner += Character.getNumericValue(numbers[j].charAt(i));
            }
            if (49 - i < z) {
                start[i - 49 + z - 1] = Integer.toString(runner % 10);
            } else {
                for (int k = z - 1; k > 0; k--) {
                    start[k] = start[k - 1];
                }
                start[0] = Integer.toString(runner % 10);
            }
        }
        do {
            runner = runner / 10;
            for (int k = z - 1; k > 0; k--) {
                start[k] = start[k - 1];
            }
            start[0] = Integer.toString(runner % 10);
        } while (runner > 10);
        System.out.print("013: ");
        for (int k = 0; k < z; k++) {
            System.out.print(start[k]);
        }
        System.out.println();
    }

    public static void prob14(int z)/*15-02-18*/ {
        int number, counter, maxCounter = 0, maxNumber = 0;
        for (int i = 1; i <= z; i++) {
            number = i;
            counter = 0;
            while (number > 1) {
                counter++;
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = 3 * number + 1;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                maxNumber = i;
            }
        }
        System.out.println("014: " + maxNumber);
    }

    public static void prob15(int z)/*15-02-18*/ {
        long adder[][] = new long[z][z];
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z; j++) {
                if (i == 0 && j == 0) {
                    adder[0][0] = 1;
                } else if (i == 0 && j > 0) {
                    adder[i][j] = adder[i][j - 1];
                } else if (j == 0 && i > 0) {
                    adder[i][j] = adder[i - 1][j];
                } else {
                    adder[i][j] = adder[i][j - 1] + adder[i - 1][j];
                }
            }
        }
        System.out.println("015: " + adder[z - 1][z - 1]);
    }

    public static void prob16(int y, int z) /*15-02-18*/ {
        int zTransfer = (int) (1 + Math.floor(z * Math.log10(2)));
        int[] largeNumber = new int[zTransfer];
        int sum = 0;
        for (int i = 0; i < zTransfer; i++) {
            largeNumber[i] = 0;
        }
        largeNumber[0] = y;
        for (int j = 2; j <= z; j++) {
            for (int i = 0; i < zTransfer; i++) {
                largeNumber[i] *= 2;
            }
            for (int i = 0; i < zTransfer; i++) {
                if (largeNumber[i] >= 10) {
                    largeNumber[i + 1] = largeNumber[i + 1] + largeNumber[i] / 10;
                    largeNumber[i] %= 10;
                }
            }

        }
        for (int k = zTransfer - 1; k >= 0; k--) {
            sum += largeNumber[k];
        }
        System.out.println("016: " + sum);
    }

    public static void prob17(int z) /*15-02-19*/ {
        int numberDigits, groupHolder, englishNumberLetterCount, totalLetterCount = 0;
        String number, englishNumber;
        for (int h = 1; h <= z; h++) {
            englishNumber = "";
            numberDigits = (int) (1 + Math.floor(Math.log10(h)));
            number = "" + h;
            if (numberDigits % 3 != 0) {
                for (int i = 0; i < numberDigits % 3; number = "0" + number, numberDigits++, i++);
            }
            for (int i = 0; i < numberDigits; i += 3) {//for every group of 3
                groupHolder = Character.getNumericValue(number.charAt(i)) * 100
                        + Character.getNumericValue(number.charAt(i + 1)) * 10
                        + Character.getNumericValue(number.charAt(i + 2));//creates three digit number
                if (groupHolder >= 100) {//100's
                    CHECK:
                    {
                        englishNumber = englishNumber + ((groupHolder / 100 == 1) ? "one " : "");
                        englishNumber = englishNumber + ((groupHolder / 100 == 2) ? "two " : "");
                        englishNumber = englishNumber + ((groupHolder / 100 == 3) ? "three " : "");
                        englishNumber = englishNumber + ((groupHolder / 100 == 4) ? "four " : "");
                        englishNumber = englishNumber + ((groupHolder / 100 == 5) ? "five " : "");
                        englishNumber = englishNumber + ((groupHolder / 100 == 6) ? "six " : "");
                        englishNumber = englishNumber + ((groupHolder / 100 == 7) ? "seven " : "");
                        englishNumber = englishNumber + ((groupHolder / 100 == 8) ? "eight " : "");
                        englishNumber = englishNumber + ((groupHolder / 100 == 9) ? "nine " : "");
                    }
                    englishNumber = englishNumber + ("hundred ");
                }
                englishNumber = englishNumber + ((numberDigits - i == 3 && groupHolder % 100 > 0 && Long.parseLong(number, 10) > 100) ? "and " : ""); //and if its needed
                if (groupHolder % 100 >= 10) {//99-10
                    englishNumber = englishNumber + ((groupHolder % 100 >= 90 && groupHolder % 100 < 100) ? "ninety " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 >= 80 && groupHolder % 100 < 90) ? "eighty " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 >= 70 && groupHolder % 100 < 80) ? "seventy " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 >= 60 && groupHolder % 100 < 70) ? "sixty " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 >= 50 && groupHolder % 100 < 60) ? "fifty " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 >= 40 && groupHolder % 100 < 50) ? "forty " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 >= 30 && groupHolder % 100 < 40) ? "thirty " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 >= 20 && groupHolder % 100 < 30) ? "twenty " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 19) ? "nineteen " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 18) ? "eighteen " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 17) ? "seventeen " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 16) ? "sixteen " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 15) ? "fifteen " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 14) ? "fourteen " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 13) ? "thirteen " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 12) ? "twelve " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 11) ? "eleven " : "");
                    englishNumber = englishNumber + ((groupHolder % 100 == 10) ? "ten " : "");
                }
                if (groupHolder % 100 >= 20 || groupHolder % 100 < 10) {//units if needed
                    englishNumber = englishNumber + ((groupHolder % 10 == 1) ? "one " : "");
                    englishNumber = englishNumber + ((groupHolder % 10 == 2) ? "two " : "");
                    englishNumber = englishNumber + ((groupHolder % 10 == 3) ? "three " : "");
                    englishNumber = englishNumber + ((groupHolder % 10 == 4) ? "four " : "");
                    englishNumber = englishNumber + ((groupHolder % 10 == 5) ? "five " : "");
                    englishNumber = englishNumber + ((groupHolder % 10 == 6) ? "six " : "");
                    englishNumber = englishNumber + ((groupHolder % 10 == 7) ? "seven " : "");
                    englishNumber = englishNumber + ((groupHolder % 10 == 8) ? "eight " : "");
                    englishNumber = englishNumber + ((groupHolder % 10 == 9) ? "nine " : "");
                }
                if (numberDigits > 3) {
                    englishNumber = englishNumber + ((numberDigits - i == 12 && groupHolder > 0) ? "billion " : "");
                    englishNumber = englishNumber + ((numberDigits - i == 9 && groupHolder > 0) ? "million " : "");
                    englishNumber = englishNumber + ((numberDigits - i == 6 && groupHolder > 0) ? "thousand " : "");
                }
            }
            englishNumberLetterCount = 0;
            for (int j = 0; j < englishNumber.length(); j++) {
                englishNumberLetterCount += ((englishNumber.charAt(j) != ' ') ? 1 : 0);
            }
            totalLetterCount += englishNumberLetterCount;
        }
        System.out.println("017: " + totalLetterCount);
    }

    public static void prob18() /*15-02-20*/ {
        String input = "75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 7"
                + "5 03 34 88 02 77 73 07 63 67 99 65 04 28 06 16 70 92 41 41 2"
                + "6 56 83 40 80 70 33 41 48 72 33 47 32 37 16 94 29 53 71 44 6"
                + "5 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57 9"
                + "1 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 3"
                + "0 73 16 69 87 40 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23 ";
        int numberOfNumbers = 0, numberOfRows, positionCounter = 0, largest = 0,
                positionStart = 0, numberCounter = 0;
        for (int i = 0; i < input.length(); numberOfNumbers
                += ((input.charAt(i) == ' ') ? 1 : 0), i++);
        int[] numbers = new int[numberOfNumbers];
        numberOfRows = (1 + (int) Math.sqrt(8 * numberOfNumbers + 1)) / 2 + 1;
        int[][] numberTriangle = new int[numberOfRows][numberOfRows];
        while (positionStart + positionCounter <= input.length()) {
            positionCounter = 0;
            while (input.charAt(positionStart + positionCounter) != ' ') {
                positionCounter++;
            }
            numbers[numberCounter] = Integer.parseInt(input.substring(
                    positionStart, positionStart + positionCounter));
            positionCounter++;
            numberCounter++;
            positionStart += positionCounter;
        }
        numberCounter = 0;
        for (int i = 0; i < numberOfRows - 1; i++) {
            numberTriangle[i][0] = 0;
            numberTriangle[i][i + 1] = 0;
        }
        for (int i = 0; i < numberOfRows - 1; i++) {
            for (int s = 0; s < (numberOfRows - 2 - i) * 2; s++);
            for (int j = 0; j <= i + 1; j++) {
                if (i > 0 && j > 0 && j < i + 1) {
                    numberTriangle[i][j] = numbers[numberCounter];
                    numberCounter++;
                }
            }
        }
        for (int i = 1; i < numberOfRows - 1; i++) {
            for (int j = 1; j <= i; j++) {
                numberTriangle[i][j] += Math.max(numberTriangle[i - 1][j - 1], numberTriangle[i - 1][j]);
                if (i == numberOfRows - 2 && numberTriangle[i][j] > largest) {
                    largest = numberTriangle[i][j];
                }
            }
        }
        System.out.println("018: " + largest);
        /* for (int c = 0; c < positionCounter; c++) {
         System.out.println(input.charAt(positionStart+c));
         }*/

    }

    public static void prob19(int y, int z) /*15-02-22*/ {
        int leapDay, dayOfWeek, numSundays = 0;
        for (int test = y; test <= z; test++) {
            leapDay = ((test % 400 == 0 || test % 4 == 0 && test % 100 != 0) ? 1 : 0);
            for (int i = 1; i <= 365 + leapDay; i++) {
                dayOfWeek = (i + 3 + (test * 365 - 1853 * 365) + ((test - 1)
                        / 4 - 1583 / 4) - ((test - 1) / 100 - 1583 / 100)
                        + ((test - 1) / 400 - 1583 / 400)) % 7;
                if (i == 1 && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 32 && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 60 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 91 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 121 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 152 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 182 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 213 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 244 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 274 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 305 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                } else if (i == 335 + leapDay && dayOfWeek == 0) {
                    numSundays += 1;
                }
            }
        }
        //for (int i = y; i <= z; numberOfDays += ((i % 400 == 0 || i % 4 == 0
        //       && i % 100 != 0) ? 366 : 365), i++) ;
        /*
         if (i == 1 && dayOfWeek == 0) {
         System.out.print(" January" + " " + i);
         } else if (i == 32 && dayOfWeek == 0) {
         System.out.print(" February" + " " + (i - (31)));
         } else if (i == 60 + leapDay && dayOfWeek == 0) {
         System.out.print(" March" + " " + (i - (59 + leapDay)));
         } else if (i == 91 + leapDay && dayOfWeek == 0) {
         System.out.print(" April" + " " + (i - (90 + leapDay)));
         } else if (i == 121 + leapDay && dayOfWeek == 0) {
         System.out.print(" May" + " " + (i - (120 + leapDay)));
         } else if (i == 152 + leapDay && dayOfWeek == 0) {
         System.out.print(" June" + " " + (i - (151 + leapDay)));
         } else if (i == 182 + leapDay && dayOfWeek == 0) {
         System.out.print(" July" + " " + (i - (181 + leapDay)));
         } else if (i == 213 + leapDay && dayOfWeek == 0) {
         System.out.print(" August" + " " + (i - (212 + leapDay)));
         } else if (i == 244 + leapDay && dayOfWeek == 0) {
         System.out.print(" September" + " " + (i - (243 + leapDay)));
         } else if (i == 274 + leapDay && dayOfWeek == 0) {
         System.out.print(" October" + " " + (i - (273 + leapDay)));
         } else if (i == 305 + leapDay && dayOfWeek == 0) {
         System.out.print(" November" + " " + (i - (304 + leapDay)));
         } else if (i == 335 + leapDay && dayOfWeek == 0) {
         System.out.print(" December" + " " + (i - (334 + leapDay)));
         }*/
        /*/first day of year
         switch ((3 + (test * 365 - 1853 * 365) + ((test - 1) / 4 - 1583 / 4)
         - ((test - 1) / 100 - 1583 / 100) + ((test - 1) / 400 - 1583 / 400)) % 7) { //prints day of week
         case 0:
         System.out.print(" Sunday");
         break;
         case 1:
         System.out.print(" Monday");
         break;
         case 2:
         System.out.print(" Tuesday");
         break;
         case 3:
         System.out.print(" Wednesday");
         break;
         case 4:
         System.out.print(" Thursday");
         break;
         case 5:
         System.out.print(" Friday");
         break;
         case 6:
         System.out.print(" Saturday");
         break;
         }*/
//System.out.println((365 * test - test / 1/*00 + (1 + test / 400) + test / 4)%7);

        /*for (int h = 1901; h <= 1905; h++) {
         leapDay = ((h % 400 == 0 || h % 4 == 0 && h % 100 != 0) ? 1 : 0);
         for (int i = 1; i <= 365; i++) {
         System.out.print(i);
         switch (i % 7) { //prints day of week
         case 0:
         System.out.print(" Sunday");
         break;
         case 1:
         System.out.print(" Monday");
         break;
         case 2:
         System.out.print(" Tuesday");
         break;
         case 3:
         System.out.print(" Wednesday");
         break;
         case 4:
         System.out.print(" Thursday");
         break;
         case 5:
         System.out.print(" Friday");
         break;
         case 6:
         System.out.print(" Saturday");
         break;
         }
         //print month//print day
         if (i >= 1 && i <= 31) {
         System.out.print(" January" + " " + i);
         } else if (i >= 32 && i <= 59 + leapDay) {
         System.out.print(" February" + " " + (i - 31));
         } else if (i >= 60 + leapDay && i <= 90 + leapDay) {
         System.out.print(" March" + " " + (i - 59));
         } else if (i >= 91 + leapDay && i <= 120 + leapDay) {
         System.out.print(" April" + " " + (i - 90));
         } else if (i >= 121 + leapDay && i <= 151 + leapDay) {
         System.out.print(" May" + " " + (i - 120));
         } else if (i >= 152 + leapDay && i <= 181 + leapDay) {
         System.out.print(" June" + " " + (i - 151));
         } else if (i >= 182 + leapDay && i <= 212 + leapDay) {
         System.out.print(" July" + " " + (i - 181));
         } else if (i >= 213 + leapDay && i <= 243 + leapDay) {
         System.out.print(" August" + " " + (i - 212));
         } else if (i >= 244 + leapDay && i <= 273 + leapDay) {
         System.out.print(" September" + " " + (i - 243));
         } else if (i >= 274 + leapDay && i <= 304 + leapDay) {
         System.out.print(" October" + " " + (i - 273));
         } else if (i >= 305 + leapDay && i <= 334 + leapDay) {
         System.out.print(" November" + " " + (i - 304));
         } else if (i >= 335 + leapDay && i <= 365 + leapDay) {
         System.out.print(" December" + " " + (i - 334));
         }
         System.out.println(" " + h);
         print year/
         }
         }*/
        System.out.println("019: " + numSundays);
    }

    public static void prob20(int z) /*15-02-23*/ {
        //code to solve problem
        int temp = (int) Math.ceil(Math.log10(Math.floor(Math.sqrt(2 * Math.PI * z) * Math.pow((z / Math.E), z) * (1 + 1 / (12 * (double) z - 1)))));
        int sum = 0;
        boolean check = false;
        int[] digits = new int[temp];
        digits[0] = 1;
        for (int i = 2; i <= z; i++) {
            for (int j = temp - 1; j >= 0; j--) {
                digits[j] *= i;
            }
            check = true;
            while (check == true) {
                check = false;
                for (int j = temp - 1; j >= 0; j--) {
                    if (digits[j] >= 10) {
                        for (int k = (int) Math.log10(digits[j]); k >= 1; k--) {
                            check = true;
                            digits[j + k] += digits[j] / Math.pow(10, k) % 10;
                        }
                    }
                    digits[j] %= 10;
                }
            }
        }
        for (int j = temp - 1; j >= 0; j--) {
            sum += digits[j];
        }
        System.out.println("020: " + sum);
        /*/Tester code below
         for (int i = 1; i <= 170; i++) {
         System.out.println(Math.ceil(Math.log10(Math.floor(Math.sqrt(2 * Math.PI * i) * Math.pow((i / Math.E), i) * (1 + 1 / (12 * (double) i - 1)))) + 1));
         }
         //+" "+Math.log10(Math.sqrt(2 * Math.PI * i) * Math.pow(i / Math.E, i) * (1 - 1 / (12 * i - 1))));
         /*i       + " " + Math.ceil(Math.log10(Math.ceil(Math.sqrt(2 * Math.PI * i) * Math.pow((i / Math.E), i))) + 1)
         + " " +*/

    }

    public static void prob21(int z) /*15-02-26*/ {
        int[] numbers = new int[z + 1];
        int sum = 0;
        for (int i = 1; i <= z; i++) {
            numbers[i] = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    numbers[i] += j;
                }
            }
        }
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j < i; j++) {
                if (numbers[i] == j && numbers[j] == i) {
                    sum += j + i;
                }
            }
        }
        System.out.println("021: " + sum);

        /*boolean checkPrime;
         int[] nonPrimes;
         int counter = 0;
         for (int i = 4; i <= z; i++) {//counts all non prime numbers
         checkPrime = true;
         for (int j = 2; j <= Math.sqrt(i); j++) {
         if (i % j == 0) {
         checkPrime = false;
         break;
         }
         }
         if (checkPrime == false) {
         counter += 1;
         }

         }
         nonPrimes = new int[counter];
         for (int i = 0; i < counter; i++) {
         nonPrimes[i] = 0;
         }
         counter = 0;
         for (int i = 4; i <= z; i++) {
         checkPrime = true;
         for (int j = 2; j <= Math.sqrt(i); j++) {
         if (i % j == 0) {
         checkPrime = false;
         break;
         }
         }
         if (checkPrime == false) {
         for (int j = 1; j < i; j++) {
         if (i % j == 0) {
         nonPrimes[counter] += j;
         }
         }
         counter += 1;
         }

         }
         for (int i = 0; i < counter; i++) {
         for (int j = 0; j < counter; j++) {
         if (nonPrimes[i] == j ) {
         System.out.printf("%6d %6d %6d %6d%n", i, nonPrimes[j], j, nonPrimes[i]);
         }
         }
         }

         {

         }*/
    }

    public static void prob22(String fileName) /*15-03-02*/ {
        int count = 0;
        Scanner inputStream = null;
        String[] names;
        String temp;
        long tempSum;
        long runningSum = 0;

        try {//count number of lines
            inputStream = new Scanner(new BufferedReader(new FileReader(fileName)));
            inputStream.useDelimiter(",");
            while (inputStream.hasNext()) {
                inputStream.next();
                count++;
            }
            inputStream.close();//Close the buffer reader
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e.getMessage());
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        //build the array and reset counter 
        names = new String[count];
        count = 0;
        try {
            inputStream = new Scanner(new BufferedReader(new FileReader(fileName)));
            inputStream.useDelimiter(",");
            while (inputStream.hasNext()) {
                names[count] = inputStream.next();
                count++;
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e.getMessage());
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

        //remove "
        for (int i = 0; i < count; i++) {
            names[i] = names[i].replace("\"", "");
        }

        //sort
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (names[j].compareTo(names[i]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            tempSum = 0;
            for (int j = 0; j <= names[i].length() - 1; j++) {
                tempSum += Character.getNumericValue(names[i].charAt(j)) - 9;
            }
            runningSum += (tempSum * (i + 1));
        }
        System.out.println("022: " + runningSum);

    }

    public static void prob23(int z)/*15-02-26*/ {
        //boolean isAbundant;
        int tempSum;
        int numberCounter = 0, counter;
        for (int i = 1; i <= z; i++) {//counter numbers for storage
            //isAbundant = false;
            tempSum = 0;
            counter = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    tempSum += j;
                    counter += 1;
                }
            }
            if (counter < i && tempSum > i) {
                //System.out.printf("%7d %7d %7d%n",i,tempSum,counter);
                numberCounter += 1;
            }
        }
        //System.out.printf("%7d%n", numberCounter);
        int[] abundantNumbers = new int[numberCounter];
        numberCounter = 0;
        for (int i = 1; i <= z; i++) {//assigns numbers
            tempSum = 0;
            counter = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    tempSum += j;
                    counter += 1;
                }
            }
            if (counter < i && tempSum > i) {
                abundantNumbers[numberCounter] = i;
                numberCounter += 1;
            }
        }
        int sum = 0;
        boolean sigmaAbundant;
        for (int i = 1; i <= z; i++) {//checks numbers
            sigmaAbundant = false;
            for (int j = 0; j < numberCounter; j++) {
                if (abundantNumbers[j] > i || sigmaAbundant == true) {
                    break; //exit if abundant is greater than check
                }
                for (int k = 0; k <= j; k++) {
                    if (abundantNumbers[j] + abundantNumbers[k] == i) {
                        sigmaAbundant = true;
                        break;//exit if check is a sum of abundant numbers
                    }
                }
            }
            if (sigmaAbundant == false) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("023: %d%n", sum);
    }

    public static void prob24(String numbers, int z)/*15-02-26*/ {
        long possible = 1;
        long carrier = 0;
        String temp;
        String answer = "";
        for (int i = 1; i < numbers.length(); i++) {
            possible *= i;
        }
        do {
            for (int i = 1; i <= numbers.length(); i++) {
                if (z <= carrier + possible * i) {
                    carrier += possible * (i - 1);
                    answer += numbers.charAt(i - 1);
                    temp = numbers.substring(0, i - 1) + numbers.substring(i, numbers.length());
                    numbers = temp;
                    if (numbers.length() != 0) {
                        possible /= numbers.length();
                    }
                    break;
                }
            }
        } while (numbers.length() > 0);
        answer += numbers;
        System.out.println(answer);
    }

    public static void prob25(int z) /*15-02-26*/ {
        int counter = 2;
        int[] num1 = new int[z], num2 = new int[z], sum = new int[z];
        num1[z - 1] = 1;
        num2[z - 1] = 1;
        do {
            for (int i = 0; i < z; i++) {
                sum[i] = num1[i] + num2[i];
                if (sum[i] >= 10) {
                    sum[i - 1] += 1;
                    sum[i] %= 10;
                }
            }
            for (int i = 0; i < z; i++) {
                num1[i] = num2[i];
                num2[i] = sum[i];
            }
            counter++;
        } while (num2[0] == 0);

        System.out.println(counter - 2);

    }

    public static void prob26(int z) /*15-03-02*/ {

        int denominator;
        int numerator;
        int quotient;
        int counter;
        int greatestRepeater = 0;
        int greatestReapeterLength = 0;
        int[] numeratorCheck;
        int numeratorCounter;
        boolean repeating;
        int carrier;

        for (int i = 2; i <= z; i++) {
            repeating = false;
            numerator = 1;
            denominator = i;
            carrier = 0;

            //System.out.println((int) Math.pow(10, Math.floor(Math.log10(i)) + 1));
            // System.out.print(denominator + " ");
            numeratorCheck = new int[(int) Math.pow(10, Math.floor(Math.log10(i)) + 1)];
            numeratorCounter = 0;
            //System.out.print(" 0.");
            while (numerator % denominator != 0) {
                counter = 0;
                while (numerator < denominator) {
                    counter++;
                    numerator *= 10;
                }
                if (counter > 1) {
                    carrier += counter - 1;
                }
                numeratorCheck[numeratorCounter] = numerator;
                quotient = (int) (numerator / denominator);
                //System.out.print(quotient);
                numerator -= denominator * quotient;
                numeratorCounter++;
                for (int j = 0; j <= numeratorCounter; j++) {
                    for (int k = numeratorCounter; k > j; k--) {
                        if (numeratorCheck[j] == numeratorCheck[k]) {
                            carrier -= Math.floor(Math.log10(i));
                            numeratorCounter = k - j + carrier;
                            if (numeratorCounter > greatestReapeterLength) {
                                greatestRepeater = i;
                                greatestReapeterLength = numeratorCounter;
                            }
                            repeating = true;
                            //System.out.println("\nBANG");
                            break;
                        }
                    }
                    if (repeating == true) {
                        // System.out.println("Getting out of comparison");
                        break;
                    }
                }
                if (repeating == true) {
                    //System.out.print("Getting out of denominator");
                    break;
                }
            }
            //System.out.println(" " + numeratorCounter);

        }
        System.out.println("026: d=1/" + greatestRepeater + ", containing " + greatestReapeterLength + " repeating digits");

        //int temp = 9;

        /*while (denominator % 2 == 0 && denominator / 2 > 0) {
         denominator /= 2;
         }
         while (denominator % 5 == 0 && denominator / 5 > 0) {
         denominator /= 5;
         }
        
         if (denominator > 1) {
         System.out.println("1 / " + denominator);
         while (temp % denominator != 0) {
         temp *= 10;
         temp += 9;
         counter += 1;
         }
         System.out.print("Number of repeating digits: " + counter);
         }*/
    }

    public static void prob27(int z) /*15-03-02*/ {
        int primeCeiling = 20000000;
        int consecutivePrimes = 0;
        int productAB = 0;
        boolean[] isPrime = new boolean[primeCeiling + 1];
        isPrime[0] = false;
        isPrime[1] = false;
        int counter;
        for (int i = 2; i <= primeCeiling; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= primeCeiling; i++) {
            if (isPrime[i]) {
                for (int j = 2; i * j <= primeCeiling; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        for (int b = 2; b <= z; b++) {
            if (isPrime[b]) {
                //System.out.println(b);
                for (int a = -999; a < 1000; a++) {
                    counter = 0;

                    while (true) {
                        if (counter * counter + a * counter + b > 0 && isPrime[counter * counter + a * counter + b]) {
                            counter++;
                        } else {
                            break;
                        }
                    }
                    if (counter > consecutivePrimes) {
                        consecutivePrimes = counter;
                        productAB = a * b;

                    }

                }
            }
        }
        System.out.printf("027: %d, %d%n", productAB, consecutivePrimes);

    }

    public static void prob28(int z) /*15-03-02*/ {
        long sum = 1;
        long holder = 1;
        int incrementer = 2;
        for (int h = 3; h <= z; h += 2) {
            for (int i = 1; i <= 4; i++) {
                holder += incrementer;
                sum += holder;
            }
            incrementer += 2;
        }
        System.out.println(sum);
    }

    public static void prob29(int z) /*15-03-02*/ {
        double[] numbers = new double[(z - 1) * (z - 1)];
        boolean[] test = new boolean[(z - 1) * (z - 1)];
        int counter = 0;
        for (int a = 2; a <= z; a++) {
            for (int b = 2; b <= z; b++) {
                test[counter] = true;
                numbers[counter] = Math.pow(a, b);
                counter++;
            }
        }
        counter = 0;
        for (int i = 0; i < (z - 1) * (z - 1); i++) {
            for (int j = i + 1; j < (z - 1) * (z - 1); j++) {
                if (numbers[i] == numbers[j]) {
                    test[i] = false;
                }
            }
        }
        for (int i = 0; i < (z - 1) * (z - 1); i++) {
            if (test[i]) {
                counter++;
            }
        }
        System.out.printf("029: %d%n", counter);
    }

    public static void prob30() /*15-03-02*/ {
        int sum = 0;
        int holder;
        int checkSum;
        for (int i = 2; i <= 354300; i++) {
            checkSum = 0;
            holder = i;
            while (holder > 0) {
                checkSum += Math.pow(holder % 10, 5);
                holder /= 10;
            }
            if (checkSum == i) {
                sum += i;
            }

        }
        System.out.format("030: %d%n", sum);
    }

    public static void prob31(int z)/*15-03-02*/ {
        int ways = 0;
        int counter = 0;
        System.out.format("I will give you all the coin combinations of %dp.%n", z);
        System.out.format("I get to use %dp, %dp, %dp, %dp, %dp, %dp, %dp, %dp.%n", 200, 100, 50, 20, 10, 5, 2, 1);

        int[] coinValues = {200, 100, 50, 20, 10, 5, 2, 1};
        int coinChoice = coinValues.length;
        for (int i = 0; i < coinChoice; i++) {
            if (z % coinValues[i] == 0) {
                ways++;
            }
        }
        for (int i = 0; i < coinChoice - 1; i++) {
            if (z - coinValues[i] > 0) {

                for (int j = i; j < coinChoice - 1; j++) {
                    if (z - coinValues[i] - coinValues[j] > 0) {
                        System.out.format("%d %d%n", (z - coinValues[i] - coinValues[j]) / coinValues[j]);
                        ways += (z - coinValues[i] - coinValues[j]) / coinValues[j];
                    }
                }
            }
        }

        System.out.format("031: %d%n", ways);

    }
    public static void hello_world() {
        System.out.format("%s%n","Hello World!");
    }


}
