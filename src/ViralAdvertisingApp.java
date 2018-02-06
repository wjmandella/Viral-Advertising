// My solution to the HackerRank.com problem "Viral Advertising."
// https://www.hackerrank.com/challenges/strange-advertising/problem

import java.util.Scanner;

public class ViralAdvertisingApp {
    static int viralAdvertising(int n) {
        // Complete this function
    	int totNbrPeopleLikeAd = 0;
    	int nbrPeopleDay = 5;
    	for(int day = 1; day <= n; day++) {
        	int nbrPeopleDayLikeAd = nbrPeopleDay/2;
           	totNbrPeopleLikeAd += nbrPeopleDayLikeAd;
         	nbrPeopleDay = nbrPeopleDayLikeAd*3;
    	}   		
    	return totNbrPeopleLikeAd;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of days, n (integer 1-50): ");
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
