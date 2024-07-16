#include <iostream>
#include <vector>

using namespace std;

// Function to add two matrices
vector<vector<int>> matrixAddition(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();
    vector<vector<int>> C(n, vector<int>(n, 0));

    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }

    return C;
}

// Function to subtract two matrices
vector<vector<int>> matrixSubtraction(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();
    vector<vector<int>> C(n, vector<int>(n, 0));

    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            C[i][j] = A[i][j] - B[i][j];
        }
    }

    return C;
}

// Function to perform Strassen's matrix multiplication
vector<vector<int>> strassenMatrixMultiplication(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();

    // Base case: if the matrix size is 1x1
    if (n == 1) {
        return {{A[0][0] * B[0][0]}};
    }

    // Split matrices into quadrants
    int newSize = n / 2;

    vector<vector<int>> A11(newSize, vector<int>(newSize));
    vector<vector<int>> A12(newSize, vector<int>(newSize));
    vector<vector<int>> A21(newSize, vector<int>(newSize));
    vector<vector<int>> A22(newSize, vector<int>(newSize));

    vector<vector<int>> B11(newSize, vector<int>(newSize));
    vector<vector<int>> B12(newSize, vector<int>(newSize));
    vector<vector<int>> B21(newSize, vector<int>(newSize));
    vector<vector<int>> B22(newSize, vector<int>(newSize));

    for (int i = 0; i < newSize; ++i) {
        for (int j = 0; j < newSize; ++j) {
            A11[i][j] = A[i][j];
            A12[i][j] = A[i][j + newSize];
            A21[i][j] = A[i + newSize][j];
            A22[i][j] = A[i + newSize][j + newSize];

            B11[i][j] = B[i][j];
            B12[i][j] = B[i][j + newSize];
            B21[i][j] = B[i + newSize][j];
            B22[i][j] = B[i + newSize][j + newSize];
        }
    }

    // Calculate products
    vector<vector<int>> P1 = strassenMatrixMultiplication(matrixAddition(A11, A22), matrixAddition(B11, B22));
    vector<vector<int>> P2 = strassenMatrixMultiplication(matrixAddition(A21, A22), B11);
    vector<vector<int>> P3 = strassenMatrixMultiplication(A11, matrixSubtraction(B12, B22));
    vector<vector<int>> P4 = strassenMatrixMultiplication(A22, matrixSubtraction(B21, B11));
    vector<vector<int>> P5 = strassenMatrixMultiplication(matrixAddition(A11, A12), B22);
    vector<vector<int>> P6 = strassenMatrixMultiplication(matrixSubtraction(A21, A11), matrixAddition(B11, B12));
    vector<vector<int>> P7 = strassenMatrixMultiplication(matrixSubtraction(A12, A22), matrixAddition(B21, B22));

    // Calculate result matrices
    vector<vector<int>> C11 = matrixAddition(matrixSubtraction(matrixAddition(P1, P4), P5), P7);
    vector<vector<int>> C12 = matrixAddition(P3, P5);
    vector<vector<int>> C21 = matrixAddition(P2, P4);
    vector<vector<int>> C22 = matrixAddition(matrixAddition(matrixSubtraction(P1, P2), P3), P6);

    // Combine result matrices
    vector<vector<int>> C(n, vector<int>(n, 0));

    for (int i = 0; i < newSize; ++i) {
        for (int j = 0; j < newSize; ++j) {
            C[i][j] = C11[i][j];
            C[i][j + newSize] = C12[i][j];
            C[i + newSize][j] = C21[i][j];
            C[i + newSize][j + newSize] = C22[i][j];
        }
    }

    return C;
}

int main() {
    // Example matrices
    vector<vector<int>> A = {{1, 2}, {3, 4}};
    vector<vector<int>> B = {{5, 6}, {7, 8}};

    // Perform Strassen's matrix multiplication
    vector<vector<int>> result = strassenMatrixMultiplication(A, B);

    // Display the result matrix
    for (const auto& row : result) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}
