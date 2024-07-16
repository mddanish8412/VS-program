#include <iostream>
#include <vector>

using namespace std;

// Function to check if placing a queen at (row, col) is safe
bool isSafe(vector<vector<int>>& board, int row, int col, int N) {
    // Check in the same row on the left side
    for (int i = 0; i < col; ++i) {
        if (board[row][i] == 1) {
            return false;
        }
    }

    // Check upper diagonal on the left side
    for (int i = row, j = col; i >= 0 && j >= 0; --i, --j) {
        if (board[i][j] == 1) {
            return false;
        }
    }

    // Check lower diagonal on the left side
    for (int i = row, j = col; i < N && j >= 0; ++i, --j) {
        if (board[i][j] == 1) {
            return false;
        }
    }

    return true;
}

// Function to solve the N-Queens problem using backtracking
bool solveNQueensUtil(vector<vector<int>>& board, int col, int N) {
    if (col == N) {
        // All queens are placed successfully
        // Print the solution
        cout << "Solution:\n";
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                cout << board[i][j] << " ";
            }
            cout << endl;
        }
        cout << endl;

        // Uncomment the line below if you want to find all possible solutions
        // return false;

        // Uncomment the line below if you want to find only one solution
        exit(0);
    }

    bool res = false;
    for (int i = 0; i < N; ++i) {
        if (isSafe(board, i, col, N)) {
            board[i][col] = 1;

            res = solveNQueensUtil(board, col + 1, N) || res;

            board[i][col] = 0; // Backtrack
        }
    }

    return res;
}

// Function to solve the N-Queens problem and print solutions
void solveNQueens(int N) {
    vector<vector<int>> board(N, vector<int>(N, 0));

    if (!solveNQueensUtil(board, 0, N)) {
        cout << "Solution does not exist.\n";
    }
}

int main() {
    int N;
    cout << "Enter the size of the chessboard (N): ";
    cin >> N;

    solveNQueens(N);

    return 0;
}
