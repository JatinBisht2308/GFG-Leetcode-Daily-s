The Bit Game
EasyAccuracy: 48.12%Submissions: 1787Points: 2
Two players, Player 1 and Player 2, are given an integer N to play a game. The rules of the game are as follows :
1. In one turn, a player can swap any 2 bits of N in its binary representation to make a new N.
2. In one turn, a player has to make a number strictly less than N.
3. Player 1 always takes first turn.
4. If a player cannot make a move, he loses.
Assume that both the players play optimally.

 

Example 1:

Input:
N = 8
Output:
1
Explanation:
N = 8
N = 1000 (binary)
Player 1 swaps the 1st 
and 4th bit.
1000
N = 0001
Player 2 cannot make a move, 
so Player 1 wins.
 

 

Example 2:

Input:
N = 1
Output:
2
Explanation:
N = 1
Player 1 cannot make 
a move, so Player 2 wins.
 

Your Task:

You don't need to read input or print anything. Your task is to complete the function swapBitGame() which takes an integer N and returns "1" if Player 1 wins, else return "2".