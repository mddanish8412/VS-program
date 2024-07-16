#include <iostream>
#include <vector>
#include <limits>

const int INF = std::numeric_limits<int>::max();

// Function to find the vertex with the minimum key value from the set of vertices
int minKey(const std::vector<int>& key, const std::vector<bool>& mstSet) {
    int min = INF, min_index;

    for (int v = 0; v < key.size(); v++) {
        if (!mstSet[v] && key[v] < min) {
            min = key[v];
            min_index = v;
        }
    }

    return min_index;
}

// Function to print the MST
void printMST(const std::vector<int>& parent, const std::vector<std::vector<int>>& graph) {
    std::cout << "Edge \t Weight\n";
    for (int i = 1; i < parent.size(); i++) {
        std::cout << parent[i] << " - " << i << "\t" << graph[i][parent[i]] << std::endl;
    }
}

void primMST(const std::vector<std::vector<int>>& graph) {
    int V = graph.size();
    std::vector<int> parent(V);   // Array to store the MST
    std::vector<int> key(V);      // Key values used to pick the minimum weight edge
    std::vector<bool> mstSet(V);  // To represent the set of vertices not yet included in MST

    // Initialize all keys as INFINITE and mstSet as false
    for (int i = 0; i < V; i++) {
        key[i] = INF;
        mstSet[i] = false;
    }

    // The first vertex is always included in MST
    key[0] = 0;
    parent[0] = -1;  // No parent for the first vertex

    // Construct the MST with V-1 vertices
    for (int count = 0; count < V - 1; count++) {
        int u = minKey(key, mstSet);
        mstSet[u] = true;

        for (int v = 0; v < V; v++) {
            if (graph[u][v] && !mstSet[v] && graph[u][v] < key[v]) {
                parent[v] = u;
                key[v] = graph[u][v];
            }
        }
    }

    // Print the MST
    printMST(parent, graph);
}

int main() {
    std::vector<std::vector<int>> graph = {
        {2, 1, 6, 4},
        {0, 3, 8, 5},
        {3, 0, 0, 7},
        {8, 0, 0, 9},
        {5, 7, 9, 0}
    };

    primMST(graph);

    return 0;
}
