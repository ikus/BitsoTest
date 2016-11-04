# BitsoTest
Bitso Archipelago Prompt


Problem


Approximately 23 light-years from planet Earth there exists planet Bitso. Planet
Bitso’s surface is covered by a great ocean dotted by many small islands.
For this question, Bitso’s surface will be modeled as a 2D plane. There exist N islands
scattered on this 2D plane. The ith island is located at at (Xi, Yi).

On this plane, line segments are defined in terms of islands. A line segment is
bounded by two islands.

A Bitso archipelago consists of two distinct but equal-length line segments which have
one shared island endpoint and two distinct island endpoints. Bitso archipelagos are
considered distinct if they're not made up of the same three islands.
Your goal is to find out how many distinct Bitso archipelagos exist.

Input

Input begins with an integer T, the number of test cases in the file.
For each test case there is an integer N. The following N lines contain the spaceseparated
integers Xi and Yi.



Output
Print a line containing the number of Bitso archipelagos in the ocean.
Constraints

1 ≤ T ≤ 50            1 ≤ N ≤ 2,000           -10,000 ≤ Xi, Yi ≤ 10,000  


Sample Input and Outputs



Sample Input: 			Sample Output:
1 						0
3
0 0
0 1
0 3




Sample Input: 			Sample Output:
2 						4
5 						4
0 0
0 1
0 2
0 3
0 4
4
0 0
1 0
0 1
-1 0