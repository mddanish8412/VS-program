#include <iostream>
#include <queue>
#include <unordered_map>
#include <vector>
#include <string>

using namespace std;

// Huffman Tree Node
struct HuffmanNode {
    char data;
    unsigned frequency;
    HuffmanNode* left;
    HuffmanNode* right;

    HuffmanNode(char data, unsigned frequency) : data(data), frequency(frequency), left(nullptr), right(nullptr) {}
};

// Comparison function for priority queue
struct CompareNodes {
    bool operator()(HuffmanNode* lhs, HuffmanNode* rhs) {
        return lhs->frequency > rhs->frequency;
    }
};

// Function to build the Huffman Tree
HuffmanNode* buildHuffmanTree(const unordered_map<char, unsigned>& frequencyMap) {
    priority_queue<HuffmanNode*, vector<HuffmanNode*>, CompareNodes> minHeap;

    // Create a leaf node for each character and add it to the priority queue
    for (const auto& pair : frequencyMap) {
        minHeap.push(new HuffmanNode(pair.first, pair.second));
    }

    // Build the Huffman Tree by repeatedly extracting the two nodes with the lowest frequency
    while (minHeap.size() > 1) {
        HuffmanNode* left = minHeap.top();
        minHeap.pop();

        HuffmanNode* right = minHeap.top();
        minHeap.pop();

        HuffmanNode* internalNode = new HuffmanNode('$', left->frequency + right->frequency);
        internalNode->left = left;
        internalNode->right = right;

        minHeap.push(internalNode);
    }

    // The remaining node in the priority queue is the root of the Huffman Tree
    return minHeap.top();
}

// Function to traverse the Huffman Tree and generate Huffman Codes
void generateHuffmanCodes(HuffmanNode* root, const string& code, unordered_map<char, string>& huffmanCodes) {
    if (root == nullptr) {
        return;
    }

    if (root->data != '$') {
        // Leaf node, store the Huffman Code for the character
        huffmanCodes[root->data] = code;
    }

    generateHuffmanCodes(root->left, code + "0", huffmanCodes);
    generateHuffmanCodes(root->right, code + "1", huffmanCodes);
}

// Function to encode a string using Huffman Codes
string encodeString(const string& input, const unordered_map<char, string>& huffmanCodes) {
    string encodedString;
    for (char c : input) {
        encodedString += huffmanCodes.at(c);
    }
    return encodedString;
}

// Function to decode a string using Huffman Tree
string decodeString(HuffmanNode* root, const string& encodedString) {
    string decodedString;
    HuffmanNode* current = root;

    for (char bit : encodedString) {
        if (bit == '0') {
            current = current->left;
        } else {
            current = current->right;
        }

        if (current->left == nullptr && current->right == nullptr) {
            decodedString += current->data;
            current = root; // Reset to the root for the next character
        }
    }

    return decodedString;
}

// Function to free memory used by the Huffman Tree
void deleteHuffmanTree(HuffmanNode* root) {
    if (root != nullptr) {
        deleteHuffmanTree(root->left);
        deleteHuffmanTree(root->right);
        delete root;
    }
}

int main() {
    // Input string
    string input = "hello world";

    // Calculate frequency of each character in the input
    unordered_map<char, unsigned> frequencyMap;
    for (char c : input) {
        frequencyMap[c]++;
    }

    // Build the Huffman Tree
    HuffmanNode* root = buildHuffmanTree(frequencyMap);

    // Generate Huffman Codes
    unordered_map<char, string> huffmanCodes;
    generateHuffmanCodes(root, "", huffmanCodes);

    // Display Huffman Codes
    cout << "Huffman Codes:\n";
    for (const auto& pair : huffmanCodes) {
        cout << pair.first << ": " << pair.second << endl;
    }

    // Encode the input string
    string encodedString = encodeString(input, huffmanCodes);
    cout << "\nEncoded String: " << encodedString << endl;

    // Decode the encoded string
    string decodedString = decodeString(root, encodedString);
    cout << "Decoded String: " << decodedString << endl;

    // Free memory used by the Huffman Tree
    deleteHuffmanTree(root);

    return 0;
}
