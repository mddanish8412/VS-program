#include <iostream>
#include <vector>
#include <limits>

using namespace std;

struct Edge {
    int source, destination, weight;
};

void bellmanFord(vector<Edge>& edges, int V, int E, int source) {
    vector<int> distance(V, numeric_limits<int>::max());
    distance[source] = 0;

    for (int i = 0; i < V - 1; ++i) {
        for (int j = 0; j < E; ++j) {
            int u = edges[j].source;
            int v = edges[j].destination;
            int w = edges[j].weight;

            if (distance[u] != numeric_limits<int>::max() && distance[u] + w < distance[v]) {
                distance[v] = distance[u] + w;
            }
        }
    }

    for (int i = 0; i < E; ++i) {
        int u = edges[i].source;
        int v = edges[i].destination;
        int w = edges[i].weight;

        if (distance[u] != numeric_limits<int>::max() && distance[u] + w < distance[v]) {
            cout << "Graph contains a negative weight cycle\n";
            return;
        }
    }

    cout << "Shortest distances from the source (" << source << "):\n";
    for (int i = 0; i < V; ++i) {
        cout << "Vertex " << i << ": " << distance[i] << "\n";
    }
}

int main() {
    int V = 5; // Number of vertices
    int E = 8; // Number of edges

    vector<Edge> edges = {
        {0, 1, -1},
        {0, 2, 4},
        {1, 2, 3},
        {1, 3, 2},
        {1, 4, 2},
        {3, 2, 5},
        {3, 1, 1},
        {4, 3, -3}
    };

    int source = 0;

    bellmanFord(edges, V, E, source);

    return 0;
}
