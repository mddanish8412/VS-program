#include <iostream>
#include <vector>

void bubbleSort(std::vector<int>& arr) {
    int n = arr.size();
    bool swapped;

    for (int i = 0; i < n - 1; i++) {
        swapped = false;

        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                std::swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }

        if (!swapped) {
            // If no two elements were swapped in inner loop, the array is already sorted.
            break;
        }
    }
}

int main() {
    std::vector<int> arr = {12, 11, 13, 5, 9, 7};

    std::cout << "Original array: ";
    for (int num : arr) {
        std::cout << num << " ";
    }

    bubbleSort(arr);

    std::cout << "\nSorted array: ";
    for (int num : arr) {
        std::cout << num << " ";
    }

    return 0;
}
