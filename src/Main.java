public class Main {
    public static void main(String[] args) {
        int[][][] cards = {
                {   // Card 1 and its rotations
                        {5, 6, 8, 7}, {6, 8, 7, 5}, {7, 5, 6, 8}, {8, 7, 5, 6}
                },
                {   // Card 2 and its rotations
                        {2, 7, 6, 4}, {7, 6, 4, 2}, {4, 2, 7, 6}, {6, 4, 2, 7}
                },
                {   // Card 3 and its rotations
                        {1, 6, 8, 2}, {6, 8, 2, 1}, {2, 1, 6, 8}, {8, 2, 1, 6}
                },
                {   // Card 4 and its rotations
                        {2, 8, 4, 3}, {8, 4, 3, 2}, {3, 2, 8, 4}, {4, 3, 2, 8}
                },
                {   // Card 5 and its rotations
                        {7, 3, 4, 8}, {3, 4, 8, 7}, {8, 7, 3, 4}, {4, 8, 7, 3}
                },
                {   // Card 6 and its rotations
                        {3, 1, 4, 5}, {1, 4, 5, 3}, {5, 3, 1, 4}, {4, 5, 3, 1}
                },
                {   // Card 7 and its rotations
                        {6, 2, 1, 5}, {2, 1, 5, 6}, {5, 6, 2, 1}, {1, 5, 6, 2}
                },
                {   // Card 8 and its rotations
                        {1, 4, 6, 2}, {4, 6, 2, 1}, {2, 1, 4, 6}, {6, 2, 1, 4}
                },
                {   // Card 9 and its rotations
                        {1, 2, 6, 5}, {2, 6, 5, 1}, {5, 1, 2, 6}, {6, 5, 1, 2}
                }
        };

        long startTime = System.currentTimeMillis();

        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                if (b == a) continue;
                for (int c = 0; c < 9; c++) {
                    if (c == a || c == b) continue;
                    for (int d = 0; d < 9; d++) {
                        if (d == a || d == b || d == c) continue;
                        for (int e = 0; e < 9; e++) {
                            if (e == a || e == b || e == c || e == d) continue;
                            for (int f = 0; f < 9; f++) {
                                if (f == a || f == b || f == c || f == d || f == e) continue;
                                for (int g = 0; g < 9; g++) {
                                    if (g == a || g == b || g == c || g == d || g == e || g == f) continue;
                                    for (int h = 0; h < 9; h++) {
                                        if (h == a || h == b || h == c || h == d || h == e || h == f || h == g) continue;
                                        for (int i = 0; i < 9; i++) {
                                            if (i == a || i == b || i == c || i == d || i == e || i == f || i == g || i == h) continue;
                                            for (int j = 0; j < 4; j++) {
                                                int a1 = cards[a][j][1];
                                                int a2 = cards[a][j][2];
                                                for (int k = 0; k < 4; k++) {
                                                    int b1 = cards[b][k][1];
                                                    int b2 = cards[b][k][2];
                                                    int b3 = cards[b][k][3];
                                                    if(a1+b3!=9) continue;
                                                    for (int l = 0; l < 4; l++) {
                                                        int c2 = cards[c][l][2];
                                                        int c3 = cards[c][l][3];
                                                        if(b1+c3!=9) continue;
                                                        for (int m = 0; m < 4; m++) {
                                                            int d0 = cards[d][m][0];
                                                            int d1 = cards[d][m][1];
                                                            int d2 = cards[d][m][2];
                                                            if(a2+d0!=9) continue;
                                                            for (int n = 0; n < 4; n++) {
                                                                int e0 = cards[e][n][0];
                                                                int e1 = cards[e][n][1];
                                                                int e2 = cards[e][n][2];
                                                                int e3 = cards[e][n][3];
                                                                if(b2+e0!=9 || d1+e3!=9) continue;
                                                                for (int o = 0; o < 4; o++) {
                                                                    int f0 = cards[f][o][0];
                                                                    int f2 = cards[f][o][2];
                                                                    int f3 = cards[f][o][3];
                                                                    if(c2+f0!=9 || e1+f3!=9) continue;
                                                                    for (int p = 0; p < 4; p++) {
                                                                        int g0 = cards[g][p][0];
                                                                        int g1 = cards[g][p][1];
                                                                        if(d2+g0!=9) continue;
                                                                        for (int q = 0; q < 4; q++) {
                                                                            int h0 = cards[h][q][0];
                                                                            int h1 = cards[h][q][1];
                                                                            int h3 = cards[h][q][3];
                                                                            if(e2+h0!=9 || g1+h3!=9) continue;
                                                                            for (int r = 0; r < 4; r++) {
                                                                                int i0 = cards[i][r][0];
                                                                                int i3 = cards[i][r][3];
                                                                                if(f2+i0!=9 || h1+i3!=9) continue;
                                                                                if(a1+b3==9 && b1+c3==9 && a2+d0==9 && b2+e0==9 && c2+f0==9 && d1+e3==9 && e1+f3==9 && d2+g0==9 && e2+h0==9 && f2+i0==9 && g1+h3==9 && h1+i3==9){
                                                                                    long endTime = System.currentTimeMillis();
                                                                                    long duration = endTime - startTime;
                                                                                    System.out.println("Time: " + duration + " milliseconds");
                                                                                    System.out.println("card placement:");
                                                                                    System.out.println("a: " + (a + 1) + ", b: " + (b + 1) + ", c: " + (c + 1) + ", d: " + (d + 1) + ", e: " + (e + 1) + ", f: " + (f + 1) + ", g: " + (g + 1) + ", h: " + (h + 1) + ", i: " + (i + 1));
//                                                                                    System.out.println("card rotation:");
//                                                                                    System.out.println("j: " + (j + 1) + ", k: " + (k + 1) + ", l: " + (l + 1) + ", m: " + (m + 1) + ", n: " + (n + 1) + ", o: " + (o + 1) + ", p: " + (p + 1) + ", q: " + (q + 1) + ", r: " + (r + 1));
                                                                                    System.out.println("north number for each card:");
                                                                                    System.out.print("a: "+cards[a][j][0]);
                                                                                    System.out.print(", b: "+cards[b][k][0]);
                                                                                    System.out.print(", c: "+cards[c][l][0]);
                                                                                    System.out.print(", d: "+cards[d][m][0]);
                                                                                    System.out.print(", e: "+cards[e][n][0]);
                                                                                    System.out.print(", f: "+cards[f][o][0]);
                                                                                    System.out.print(", g: "+cards[g][p][0]);
                                                                                    System.out.print(", h: "+cards[h][q][0]);
                                                                                    System.out.print(", i: "+cards[i][r][0]);
                                                                                    System.out.println();
                                                                                    System.out.println("--------------------------------");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Total time: " + duration + " milliseconds");
        System.out.println("END");
    }
}

