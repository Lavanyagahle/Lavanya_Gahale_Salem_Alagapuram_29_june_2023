package com.assignment;

import java.util.Scanner;

public class AttendanceScoreCalculation {
	public static int calculateWays(int n) {
        int MOD = (int) (1e9 + 7);
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 3;
        dp[2] = 9;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % MOD;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = calculateWays(n);
        System.out.println(answer);
    }
    }

